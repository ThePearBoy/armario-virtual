package com.example.armariovirtual.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.armariovirtual.ui.viewmodel.ClothingItemViewModel

@Composable
fun ClothingScreen(viewModel: ClothingItemViewModel = viewModel()) {
    val items by viewModel.items.collectAsState()

    LazyColumn {
        items(items) { item ->
            Text(item.name)
        }
    }
}