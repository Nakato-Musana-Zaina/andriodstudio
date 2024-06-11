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
            .load("https://media.istockphoto.com/id/518283050/photo/male-of-plumbeous-water-redstart-the-chu.jpg?s=612x612&w=0&k=20&c=GUTq7n03VwMWOTC0wKv6E3rhsJC0k_claP0Aa7_E2p4=")
            .into(binding.prevbtn4)

    }
}