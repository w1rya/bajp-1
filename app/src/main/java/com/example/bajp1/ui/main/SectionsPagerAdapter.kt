package com.example.bajp1.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bajp1.R
import com.example.bajp1.ui.movies.MovieFragment
import com.example.bajp1.ui.series.SeriesFragment

private val TAB_TITLES = arrayOf(
        R.string.movies,
        R.string.tv_series
)

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager)
    : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment =
       when(position) {
           0 -> MovieFragment()
           1 -> SeriesFragment()
           else -> Fragment()
       }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int = 2
}