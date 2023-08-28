package com.example.databinding.models

import android.location.Address
import androidx.databinding.ObservableField

data class Employee(
    val id: Int,
    val name: ObservableField<String>,//name dagi qiymatni eshitib turadi
    val address: String,
    val money: Double,
    val avatar: String
)