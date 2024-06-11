package com.example.hello

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.prevbtn2.setOnClickListener {
            finish()
        }
        binding.nextbtn3.setOnClickListener{
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load(" https://media.istockphoto.com/id/490888740/photo/chaffinch.jpg?s=612x612&w=0&k=20&c=Dv_tLXSo3DoHW3blPO0bXCAASfX4DTSt_HrtDw0q4hE=")
            .into(binding.imageView)
    }
}