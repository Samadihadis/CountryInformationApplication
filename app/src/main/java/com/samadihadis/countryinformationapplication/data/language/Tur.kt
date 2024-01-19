package com.samadihadis.countryinformationapplication.data.language

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Tur(

    @SerializedName("official") val official: String,
    @SerializedName("common") val common: String
): Serializable
