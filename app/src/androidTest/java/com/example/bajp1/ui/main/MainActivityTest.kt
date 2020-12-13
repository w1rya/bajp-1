package com.example.bajp1.ui.main

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.pressBack
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.bajp1.R
import com.example.bajp1.utils.DummyData
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    private val dummyMovies = DummyData.generateMovies()
    private val dummyMovieSize = dummyMovies.size

    private val dummySeries = DummyData.generateSeries()

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovies() {
        Thread.sleep(3000)
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovieSize))
    }

    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(dummyMovieSize-1, click()))
        Thread.sleep(500)
        onView(withId(R.id.tv_detail_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_title)).check(matches(withText(dummyMovies[dummyMovieSize-1].title)))
        onView(withId(R.id.tv_detail_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_year)).check(matches(withText(dummyMovies[dummyMovieSize-1].year)))
        onView(withId(R.id.iv_detail_poster)).check(matches(isDisplayed()))
        Thread.sleep(500)
    }

    @Test
    fun loadSeries() {
        pressBack()
        onView(withText("TV Series")).perform(click())
        onView(withId(R.id.rv_series)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_series)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovieSize))
    }

    @Test
    fun loadDetailSeries() {
        onView(withText("TV Series")).perform(click())
        onView(withId(R.id.rv_series)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        Thread.sleep(500)
        onView(withId(R.id.tv_detail_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_title)).check(matches(withText(dummySeries[0].title)))
        onView(withId(R.id.tv_detail_year)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_detail_year)).check(matches(withText(dummySeries[0].year)))
        onView(withId(R.id.iv_detail_poster)).check(matches(isDisplayed()))
        Thread.sleep(500)
        pressBack()
    }
}