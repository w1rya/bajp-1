package com.example.bajp1.ui.detail

import com.example.bajp1.utils.DummyData
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DetailViewModelSeriesTest {
    
    private lateinit var viewModel: DetailViewModel

    private val dummySeries = DummyData.generateSeries()[0]
    private val selectedSeries = dummySeries.id

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.setSelectedItem(selectedSeries)
    }

    @Test
    fun setSelectedItem() {
        Assert.assertNotNull(selectedSeries)
    }

    @Test
    fun getMovie() {
        val seriesEntity = viewModel.getMovie()
        Assert.assertNotNull(seriesEntity)
        Assert.assertEquals(dummySeries.id, seriesEntity.id)
        Assert.assertEquals(dummySeries.title, seriesEntity.title)
        Assert.assertEquals(dummySeries.year, seriesEntity.year)
        Assert.assertEquals(dummySeries.genre, seriesEntity.genre)
        Assert.assertEquals(dummySeries.score, seriesEntity.score)
        Assert.assertEquals(dummySeries.duration, seriesEntity.duration)
        Assert.assertEquals(dummySeries.overview, seriesEntity.overview)
        Assert.assertEquals(dummySeries.imageUrl, seriesEntity.imageUrl)
    }
    
}