package com.example.armariovirtual.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.example.armariovirtual.domain.ClothingItem

class ClothingItemViewModel : ViewModel() {
    private val _items = MutableStateFlow<List<ClothingItem>>(emptyList())
    val items = _items.asStateFlow()

    fun addItem(item: ClothingItem) {
        _items.value = _items.value + item
    }
}