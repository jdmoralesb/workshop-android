package com.example.workshopandroid.entity

import com.example.workshopandroid.R

data class Product(
    val id: Int,
    val name: String,
    val description: String,
    val platform: ProductPlatform,
    val image: Int,
    val price: Double
)

fun Product.platformIcon() = when (platform) {
    ProductPlatform.Playstation -> R.mipmap.ic_playstation
    ProductPlatform.Xbox -> R.mipmap.ic_xbox
    ProductPlatform.Nintendo -> R.mipmap.ic_nintendo
}