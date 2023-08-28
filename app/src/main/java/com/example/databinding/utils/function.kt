package com.example.databinding.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:url")
fun loadImage(imageView: ImageView,url:String){
   /* Picasso.get().load(url).into(imageView)*/
}