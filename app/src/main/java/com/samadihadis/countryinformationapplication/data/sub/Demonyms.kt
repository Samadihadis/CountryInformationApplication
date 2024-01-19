package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Demonyms(

    @SerializedName("eng") val eng: EngDataModel
): Serializable
