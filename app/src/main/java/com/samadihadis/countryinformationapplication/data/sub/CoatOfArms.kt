package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CoatOfArms(

    @SerializedName("png") val png: String,
    @SerializedName("svg") val svg: String
): Serializable
