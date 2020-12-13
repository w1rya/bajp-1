package com.example.bajp1.ui.series

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bajp1.R
import kotlinx.android.synthetic.main.fragment_series.*

class SeriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_series, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()) [SeriesViewModel::class.java]
            val movies = viewModel.generateSeries()

            val seriesAdapter = SeriesAdapter()
            seriesAdapter.setSeries(movies)

            rv_series.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = seriesAdapter
                setHasFixedSize(true)
            }
        }
    }
}