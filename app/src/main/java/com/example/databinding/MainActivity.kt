package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.models.Employee
import com.example.databinding.models.MyHandler
import com.example.databinding.models.User
/*databinding->*/
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val employee =
            Employee(1, ObservableField("jasur"), "Qoqon", 100.0,"shu yerga urlini qoy imageni")
        val list = arrayListOf("code", "compyter", "book")
        binding.employee = employee
        var user = User("jasur", "jahongir")
        binding.user = user
        binding.handler = MyHandler()

        binding.btnSave.setOnClickListener {
            binding.invalidateAll() //yangila beradi
        }
    }
}