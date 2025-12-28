package com.example.armariovirtual.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class ClothingItem(val name: String)

class ClothingItemViewModel : ViewModel() {
    private val _items = MutableStateFlow(
        listOf(
            ClothingItem("Shirt"),
            ClothingItem("Pants"),
            ClothingItem("Jacket")
        )
    )
    val items: StateFlow<List<ClothingItem>> = _items

    // <-- Aquí agregamos la función
    fun addItem(name: String) {
        val current = _items.value.toMutableList()
        current.add(ClothingItem(name))
        _items.value = current
    }
}