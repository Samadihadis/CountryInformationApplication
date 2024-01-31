package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Idd(

    @SerializedName("root") val root: String,
    @SerializedName("suffixes") val suffixes: List<String>
): Serializable
