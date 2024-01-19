package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Car(

    @SerializedName("signs") val signs: List<String>,
    @SerializedName("side") val side: String
): Serializable
