package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class EngDataModel(

    @SerializedName("f") val f: String,
    @SerializedName("m") var m: String
): Serializable
