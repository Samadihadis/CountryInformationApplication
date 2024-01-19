package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Name(

    @SerializedName("common") val common: String,
    @SerializedName("official") val official: String,
    @SerializedName("nativeName") val nativeName: NativeName
): Serializable
