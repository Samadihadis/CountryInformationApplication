package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class AUD(

    @SerializedName("name") val name: String,
    @SerializedName("symbol") val symbol: String
) : Serializable
