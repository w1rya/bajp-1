package com.example.bajp1.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import coil.load
import coil.transform.RoundedCornersTransformation
import com.example.bajp1.R
import com.example.bajp1.data.MovieEntity
import com.example.bajp1.utils.Constants.Companion.CORNER_RADIUS
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()) [DetailViewModel::class.java]

        val extra = intent.extras

        extra?.let {
            val id = extra.getString(EXTRA_MOVIE)
            id?.let {
                viewModel.setSelectedItem(it)
                showDetail(viewModel.getMovie())
            }
        }
    }

    private fun showDetail(movieEntity: MovieEntity) {
        tv_detail_title.text = movieEntity.title
        tv_detail_year.text = movieEntity.year
        tv_detail_genre.text = movieEntity.genre
        tv_detail_duration.text = movieEntity.duration

        tv_detail_score.text = movieEntity.score
        iv_detail_poster.load(movieEntity.imageUrl) {
            transformations(RoundedCornersTransformation(CORNER_RADIUS))
        }

        tv_detail_overview.text = movieEntity.overview
    }
}