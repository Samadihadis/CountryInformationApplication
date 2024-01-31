package com.samadihadis.countryinformationapplication.data

import java.io.Serializable

data class CountyListResponseModel(
    var data: List<CountryModel>
) : Serializable
