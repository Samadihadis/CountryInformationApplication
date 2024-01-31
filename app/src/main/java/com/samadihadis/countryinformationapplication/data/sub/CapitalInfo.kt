package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CapitalInfo(

    @SerializedName("latlng") val latlng: List<Double>
): Serializable
