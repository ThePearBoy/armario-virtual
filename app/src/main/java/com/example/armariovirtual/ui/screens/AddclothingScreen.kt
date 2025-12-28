package com.example.armariovirtual.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.armariovirtual.ui.viewmodel.ClothingItemViewModel

@Composable
fun AddClothingScreen(viewModel: ClothingItemViewModel) {
    var name by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Add a new clothing item", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Clothing name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (name.isNotBlank()) {
                viewModel.addItem(name)
                name = ""
            }
        }) {
            Text("Add")
        }
    }
}