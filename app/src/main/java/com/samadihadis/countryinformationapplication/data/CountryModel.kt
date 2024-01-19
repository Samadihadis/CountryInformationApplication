package com.samadihadis.countryinformationapplication.data

import com.google.gson.annotations.SerializedName
import com.samadihadis.countryinformationapplication.data.sub.Idd
import com.samadihadis.countryinformationapplication.data.sub.CapitalInfo
import com.samadihadis.countryinformationapplication.data.sub.Car
import com.samadihadis.countryinformationapplication.data.sub.CoatOfArms
import com.samadihadis.countryinformationapplication.data.sub.Currencies
import com.samadihadis.countryinformationapplication.data.sub.Demonyms
import com.samadihadis.countryinformationapplication.data.sub.Flags
import com.samadihadis.countryinformationapplication.data.sub.Languages
import com.samadihadis.countryinformationapplication.data.sub.Maps
import com.samadihadis.countryinformationapplication.data.sub.Name
import com.samadihadis.countryinformationapplication.data.sub.PostalCode
import com.samadihadis.countryinformationapplication.data.sub.Translations
import java.io.Serializable

data class CountryModel(
    @SerializedName("name") val name: Name,
    @SerializedName("tld") val tld: List<String>,
    @SerializedName("cca2") val cca2: String,
    @SerializedName("ccn3") val ccn3: String,
    @SerializedName("cca3") val cca3: String,
    @SerializedName("independent") val independent: Boolean,
    @SerializedName("status") val status: String,
    @SerializedName("unMember") val unMember: Boolean,
    @SerializedName("currencies") val currencies: Currencies,
    @SerializedName("idd") val idd: Idd,
    @SerializedName("capital") val capital: List<String>,
    @SerializedName("altSpellings") val altSpellings: List<String>,
    @SerializedName("region") val region: String,
    @SerializedName("subregion") val subregion: String,
    @SerializedName("languages") val languages: Languages,
    @SerializedName("translations") val translations: Translations,
    @SerializedName("latlng") val latlng: List<Double>,
    @SerializedName("landlocked") val landlocked: Boolean,
    @SerializedName("area") val area: Double,
    @SerializedName("demonyms") val demonyms: Demonyms,
    @SerializedName("flag") val flag: String,
    @SerializedName("maps") val maps: Maps,
    @SerializedName("population") val population: Int,
    @SerializedName("car") val car: Car,
    @SerializedName("timezones") val timezones: List<String>,
    @SerializedName("continents") val continents: List<String>,
    @SerializedName("flags") val flags: Flags,
    @SerializedName("coatOfArms") val coatOfArms: CoatOfArms,
    @SerializedName("startOfWeek") val startOfWeek: String,
    @SerializedName("capitalInfo") val capitalInfo: CapitalInfo,
    @SerializedName("postalCode") val postalCode: PostalCode
) : Serializable
