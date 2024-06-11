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
            .load(" https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtXUsGcR-D8II_jTo9lMgA7hEZvT0K8KR97x_z_hFs_Z14Mm3_Ojh6DyGAA-JN_zwVdGY&usqp=CAU")
            .into(binding.nextbtn4)
    }

}