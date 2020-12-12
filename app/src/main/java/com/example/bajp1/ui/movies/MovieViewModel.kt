package com.example.bajp1.ui.movies

import androidx.lifecycle.ViewModel
import com.example.bajp1.data.MovieEntity
import com.example.bajp1.utils.DummyData

class MovieViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DummyData.generateMovies()

}