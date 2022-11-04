package com.example.practica3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica3.databinding.ActivityVistaBinding

class UserAdapter(
    private val users: List<Noticia>,
):
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {


    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context

        val view = LayoutInflater.from(context).inflate(R.layout.activity_vista, parent, false)

        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users.get(position)

        with(holder) {
            binding.tvOrder.text = user.fecha
            binding.tvName.text = user.titulo
            binding.res.text = user.resumen
            Glide.with(context)
                .load(user.url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .circleCrop()
                .into(binding.imgPhoto)
        }
    }

    override fun getItemCount(): Int = users.size


    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val binding = ActivityVistaBinding.bind(view)

    }
}