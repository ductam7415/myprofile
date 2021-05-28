package com.example.myprofile

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.name.text= "android"
        binding.address.text= "tuyen quang . vn"
        binding.workplace.text= "chu ro"
        binding.follower.text="325"
        binding.follows.text="54223"
        binding.photos.text="4431"
        }

}