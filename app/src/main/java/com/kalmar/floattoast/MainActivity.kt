package com.kalmar.floattoast

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cityList: List<City> = listOf(
            City("New York City", "NY", 8622357),
            City("Los Angeles", "CA", 4085014),
            City("Chicago", "IL", 2670406),
            City("Houston", "TX", 2378146),
            City("Phoenix", "AZ", 1743469),
            City("Philadelphia", "PA", 1590402),
            City("San Antonio", "TX", 1579504),
            City("San Diego", "CA", 1469490),
            City("Dallas","TX", 1400337),
            City("San Jose", "CA", 1036242)
        )
        val citiesRecyclerView: RecyclerView = findViewById(R.id.city_recycler_view)
        citiesRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        citiesRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        citiesRecyclerView.adapter = CityAdapter(cityList)
    }
}