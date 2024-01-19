package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Languages(

    @SerializedName("eng") val eng: String
): Serializable
