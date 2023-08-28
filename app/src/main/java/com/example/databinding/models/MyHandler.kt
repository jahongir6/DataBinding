package com.example.databinding.models

import android.view.View
import android.widget.Toast

class MyHandler {
    fun onDelete(view: View){
        Toast.makeText(view.context, "click", Toast.LENGTH_SHORT).show()
    }
}