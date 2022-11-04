package com.example.practica3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, NoticiasActivity::class.java)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadImage()

        val bot = findViewById<Button>(R.id.boton)

        bot.setOnClickListener {
            startActivity(intent)
        }

    }

    private fun loadImage(url: String ="https://photo620x400.mnstatic.com/a24b9d0658a13ecea5a" +
            "9fbb67c2387cd/centro-comercial-nuevo-centro.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .circleCrop()
            .into(binding.imagen23)
    }
}