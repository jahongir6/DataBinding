package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.adapters.Developerdapter
import com.example.databinding.databinding.ActivityIncludeLayoutBinding

class Include_layout : AppCompatActivity() {
    lateinit var binding: ActivityIncludeLayoutBinding
    private var list = ArrayList<Developer>()
    private lateinit var developerdapter: Developerdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_include_layout)
        loadData()
        developerdapter = Developerdapter(list)
        binding.rv.adapter = developerdapter
    }

    private fun loadData() {
        list = ArrayList()
        for (i in 0..100) {
            list.add(
                Developer(
                    1, "jahongir", "hohlagan urlni qoy"
                )
            )
        }
    }
}