package com.example.bajp1.ui.detail

import androidx.lifecycle.ViewModel
import com.example.bajp1.data.MovieEntity
import com.example.bajp1.utils.DummyData

class DetailViewModel : ViewModel() {

    private lateinit var id: String

    fun setSelectedItem(id: String) {
        this.id = id
    }

    fun getMovie(): MovieEntity {
        val cropped = id.chunked(2)
        val idMovie = "mv"
        val idSeries = "tv"

        lateinit var movieEntity: MovieEntity

        val items = when {
            cropped[0] == idMovie -> {
                DummyData.generateMovies()
            }
            cropped[0] == idSeries -> {
                DummyData.generateSeries()
            }
            else -> {
                emptyList()
            }
        }

        if (!items.isNullOrEmpty()) {
            for (item in items) {
                if (item.id == id) {
                    movieEntity = item
                    break
                }
            }
        }

        return movieEntity
    }
}