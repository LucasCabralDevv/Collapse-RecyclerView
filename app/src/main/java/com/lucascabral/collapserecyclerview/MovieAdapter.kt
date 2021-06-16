package com.lucascabral.collapserecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lucascabral.collapserecyclerview.databinding.ItemMovieBinding

class MovieAdapter(private val movieList: List<Movie>) :
    RecyclerView.Adapter<MovieAdapter.MovieVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieVH {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieVH(binding)
    }

    override fun onBindViewHolder(holder: MovieVH, position: Int) {
        val movie = movieList[position]
        holder.binding.apply {
            movieTitleTextView.text = movie.title
            movieReleaseYearTextView.text = movie.year
            movieRatingTextView.text = movie.rating
            moviePlotTextView.text = movie.plot

            val isExpanded = movieList[position].expanded
            expandableLayout.visibility = if (isExpanded) View.VISIBLE else View.GONE

            movieTitleTextView.setOnClickListener {
                movie.expanded = !isExpanded
                notifyItemChanged(position)
            }
        }
    }

    override fun getItemCount(): Int = movieList.size

    inner class MovieVH(
        val binding: ItemMovieBinding
    ) : RecyclerView.ViewHolder(binding.root)
}