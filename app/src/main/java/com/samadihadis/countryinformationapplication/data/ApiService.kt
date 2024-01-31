package com.samadihadis.countryinformationapplication.data

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("all")
    fun allCountries(): Call<List<CountryModel>>
}