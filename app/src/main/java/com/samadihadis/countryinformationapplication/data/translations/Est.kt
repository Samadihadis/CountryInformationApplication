package com.samadihadis.countryinformationapplication.data.translations

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Est(

    @SerializedName("official") val official: String,
    @SerializedName("common") val common: String
): Serializable
