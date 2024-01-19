package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Currencies(

    @SerializedName("AUD") val AUD: AUD
): Serializable
