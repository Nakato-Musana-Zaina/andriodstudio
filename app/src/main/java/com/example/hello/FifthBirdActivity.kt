package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBinding
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBinding
//    lateinit var binding: ActivityFifthBirdBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding = ActivityFifthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prevbtn4.setOnClickListener {
            finish()
        }
        Picasso
            .get()
            .load(" https://images.unsplash.com/photo-1553736277-055142d018f0?q=80&w=1958&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .into(binding.imageView14)

    }
}