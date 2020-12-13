package com.example.bajp1.ui.series

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

class SeriesAdapter : RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder>() {

    private var seriesList = ArrayList<MovieEntity>()

    fun setSeries(series: List<MovieEntity>?) {
        if (series.isNullOrEmpty()) return
        this.seriesList.clear()
        this.seriesList.addAll(series)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SeriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return SeriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        holder.bind(seriesList[position])
    }

    override fun getItemCount(): Int {
        return seriesList.size
    }

    class SeriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(series: MovieEntity) {
            with(itemView) {
                tv_title.text = series.title
                tv_year.text = series.year
                tv_overview.text = series.overview
                iv_poster.load(series.imageUrl) {
                    placeholder(R.drawable.placeholder)
                    transformations(RoundedCornersTransformation(Constants.CORNER_RADIUS))
                }
                itemView.setOnClickListener {
                    Toast.makeText(itemView.context, series.title, Toast.LENGTH_SHORT).show()
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_MOVIE, series.id)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}