package com.example.armariovirtual.domain

data class ClothingItem(
    val id: Long = 0,
    val name: String,
    val type: String,
    val color: String,
    val size: String,
    val condition: String
)