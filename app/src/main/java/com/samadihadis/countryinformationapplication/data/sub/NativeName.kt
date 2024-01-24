package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import com.samadihadis.countryinformationapplication.data.translations.Eng
import java.io.Serializable

data class NativeName(

    @SerializedName("eng") val eng: Eng
): Serializable
