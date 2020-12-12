package com.example.bajp1.ui.series

import androidx.lifecycle.ViewModel
import com.example.bajp1.data.MovieEntity
import com.example.bajp1.utils.DummyData

class SeriesViewModel : ViewModel() {

    fun generateSeries() : List<MovieEntity> = DummyData.generateSeries()

}