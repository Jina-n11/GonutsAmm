package com.jinana11.gonutsamm.domain.entity

data class Food(
    val id: Int,
    val name: String,
    val description: String,
    val price: Int,
    val oldPrice: Int,
    val isOffers: Boolean,
    val isFavorite: Boolean,
)
