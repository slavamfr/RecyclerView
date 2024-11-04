package com.faiz.tugasrecycler

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val context: Context, private val movieList: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewMovie: ImageView = itemView.findViewById(R.id.img_id)
        val textViewTitle: TextView = itemView.findViewById(R.id.title)
        val textViewDuration: TextView = itemView.findViewById(R.id.duration)
        val textViewRating: TextView = itemView.findViewById(R.id.rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieList[position]
        holder.imageViewMovie.setImageResource(movie.img)
        holder.textViewTitle.text = movie.title
        holder.textViewDuration.text = movie.duration
        holder.textViewRating.text = movie.rating

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailMovieActivity::class.java)
            intent.putExtra("imageId", movie.img)
            intent.putExtra("title", movie.title)
            intent.putExtra("duration", movie.duration)
            intent.putExtra("rating", movie.rating)
            intent.putExtra("synopsis", movie.synopsis)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = movieList.size
}
