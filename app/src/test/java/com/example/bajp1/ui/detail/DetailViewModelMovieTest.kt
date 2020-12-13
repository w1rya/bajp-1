package com.example.bajp1.ui.detail

import com.example.bajp1.utils.DummyData
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class DetailViewModelMovieTest {

    private lateinit var viewModel: DetailViewModel

    private val dummyMovie = DummyData.generateMovies()[0]
    private val selectedMovie = dummyMovie.id

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.setSelectedItem(selectedMovie)
    }

    @Test
    fun setSelectedItem() {
        assertNotNull(selectedMovie)
    }

    @Test
    fun getMovie() {
        val movieEntity = viewModel.getMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.id, movieEntity.id)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.year, movieEntity.year)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.score, movieEntity.score)
        assertEquals(dummyMovie.duration, movieEntity.duration)
        assertEquals(dummyMovie.overview, movieEntity.overview)
        assertEquals(dummyMovie.imageUrl, movieEntity.imageUrl)
    }
}