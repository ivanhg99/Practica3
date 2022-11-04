package com.example.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practica3.databinding.ActivityNoticiasBinding

class NoticiasActivity : AppCompatActivity(){

    private lateinit var binding: ActivityNoticiasBinding

    private lateinit var userAdapter: UserAdapter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNoticiasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userAdapter = UserAdapter(getUsers())
        linearLayoutManager = LinearLayoutManager(this)

        binding.noticias.apply {
            layoutManager = linearLayoutManager
            adapter = userAdapter
        }
    }

    private fun getUsers(): MutableList<Noticia> {
        val noticias = mutableListOf<Noticia>()

        val antonio = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")
        val gloria = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")
        val diego = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")
        val patxi = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")
        val javier = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")
        val silvia = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")
        val david1 = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")
        val david2 = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")

        val david3 = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")

        val david4 = Noticia(1, "Titulo", "Calabuig", "24/20/2000", "frffdfd", "https://cdn.icon" +
                "-icons.com/icons2/2630/PNG/512/avatar_man_beard_brown_hair_boy_people_icon_" +
                "159121.png")

        noticias.add(antonio)
        noticias.add(gloria)
        noticias.add(diego)
        noticias.add(patxi)
        noticias.add(javier)
        noticias.add(silvia)
        noticias.add(david1)
        noticias.add(david2)
        noticias.add(david3)
        noticias.add(david4)

        return noticias
    }
}