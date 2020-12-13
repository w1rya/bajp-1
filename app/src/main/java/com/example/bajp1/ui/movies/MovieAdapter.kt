package com.example.bajp1.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.bajp1.R
import com.example.bajp1.data.MovieEntity
import com.example.bajp1.ui.detail.DetailActivity
import com.example.bajp1.utils.Constants
import kotlinx.android.synthetic.main.item_movie.view.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var movieList = ArrayList<MovieEntity>()

    fun setMovies(movies: List<MovieEntity>?) {
        if (movies.isNullOrEmpty()) return
        this.movieList.clear()
        this.movieList.addAll(movies)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: MovieEntity) {
            with(itemView) {
                tv_title.text = movie.title
                tv_year.text = movie.year
                tv_overview.text = movie.overview
                iv_poster.load(movie.imageUrl) {
                    placeholder(R.drawable.poster)
                    transformations(RoundedCornersTransformation(Constants.CORNER_RADIUS))
                }
                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, movie.title, Toast.LENGTH_SHORT).show()
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE, movie.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }

}