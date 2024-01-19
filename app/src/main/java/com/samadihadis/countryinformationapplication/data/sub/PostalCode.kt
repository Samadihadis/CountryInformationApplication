package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class PostalCode(

    @SerializedName("format") val format: String,
    @SerializedName("regex") val regex: String
): Serializable
