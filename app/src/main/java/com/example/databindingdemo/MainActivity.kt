package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this,
            R.layout.activity_main)

        var student = Student("Ali", "RIT", 20)

        binding.btnSetValue.setOnClickListener(){
            student.age = 28

            binding.apply {
                invalidateAll()
            }

        }

        binding.btnGetValue.setOnClickListener(){
           binding.myData = student
        }

    }
}