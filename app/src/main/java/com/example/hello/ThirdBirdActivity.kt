package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityThirdBird2Binding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
//lateinit var binding: ActivityThirdBirdBinding
lateinit var binding: ActivityThirdBird2Binding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBird2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prevbtn3.setOnClickListener{
            finish()
        }
        binding.nextbtn4.setOnClickListener{
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1518992028580-6d57bd80f2dd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGJpcmR8ZW58MHx8MHx8fDA%3D ")
            .into(binding.imageView6)
    }

}