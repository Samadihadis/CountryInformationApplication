package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Maps(

    @SerializedName("googleMaps") val googleMaps: String,
    @SerializedName("openStreetMaps") val openStreetMaps: String
): Serializable
