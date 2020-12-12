package com.example.bajp1.ui.series

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class SeriesViewModelTest {

    private lateinit var viewModel: SeriesViewModel

    @Before
    fun setUp() {
        viewModel = SeriesViewModel()
    }

    @Test
    fun generateSeries() {
        val seriesEntities = viewModel.generateSeries()
        assertNotNull(seriesEntities)
        assertEquals(10, seriesEntities.size)
    }
}