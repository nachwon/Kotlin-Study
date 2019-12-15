package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat01"),
        Product("Devslopes Hat Black", "$20", "hat02"),
        Product("Devslopes Hat White", "$18", "hat03"),
        Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie01"),
        Product("Devslopes Hoodie Black", "$32", "hoodie02"),
        Product("Devslopes Hoodie Red", "$30", "hoodie03"),
        Product("Devslopes Hoodie Yellow", "$34", "hoodie04")
    )

    val shirt = listOf(
        Product("Devslopes Shirt Gray", "$28", "shirt01"),
        Product("Devslopes Shirt Black", "$32", "shirt02"),
        Product("Devslopes Shirt Red", "$30", "shirt03"),
        Product("Devslopes Shirt Yellow", "$34", "shirt04")
    )
}