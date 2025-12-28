package com.example.armariovirtual

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.armariovirtual.ui.screens.ClothingScreen
import com.example.armariovirtual.ui.screens.AddClothingScreen
import com.example.armariovirtual.ui.viewmodel.ClothingItemViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // ✅ Aquí usamos la instancia correcta del ViewModel
                val viewModel: ClothingItemViewModel = viewModel()

                // Variable que controla qué pantalla mostrar
                var currentScreen by remember { mutableStateOf("view") }

                Column {
                    // Menú de botones
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Button(onClick = { currentScreen = "view" }) { Text("View Wardrobe") }
                        Button(onClick = { currentScreen = "add" }) { Text("Add Clothing") }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    // Mostramos la pantalla según el botón
                    when (currentScreen) {
                        "view" -> ClothingScreen(viewModel)
                        "add" -> AddClothingScreen(viewModel)
                    }
                }
            }
        }
    }
}