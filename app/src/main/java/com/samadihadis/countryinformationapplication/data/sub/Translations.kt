package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import com.samadihadis.countryinformationapplication.data.translations.Ara
import com.samadihadis.countryinformationapplication.data.translations.Bre
import com.samadihadis.countryinformationapplication.data.translations.Ces
import com.samadihadis.countryinformationapplication.data.translations.Cym
import com.samadihadis.countryinformationapplication.data.translations.Deu
import com.samadihadis.countryinformationapplication.data.translations.Est
import com.samadihadis.countryinformationapplication.data.translations.Fin
import com.samadihadis.countryinformationapplication.data.translations.Fra
import com.samadihadis.countryinformationapplication.data.translations.Hrv
import com.samadihadis.countryinformationapplication.data.translations.Hun
import com.samadihadis.countryinformationapplication.data.translations.Ita
import com.samadihadis.countryinformationapplication.data.translations.Jpn
import com.samadihadis.countryinformationapplication.data.translations.Kor
import com.samadihadis.countryinformationapplication.data.translations.Nld
import com.samadihadis.countryinformationapplication.data.translations.Per
import com.samadihadis.countryinformationapplication.data.translations.Pol
import com.samadihadis.countryinformationapplication.data.translations.Por
import com.samadihadis.countryinformationapplication.data.translations.Rus
import com.samadihadis.countryinformationapplication.data.translations.Slk
import com.samadihadis.countryinformationapplication.data.translations.Spa
import com.samadihadis.countryinformationapplication.data.translations.Srp
import com.samadihadis.countryinformationapplication.data.translations.Swe
import com.samadihadis.countryinformationapplication.data.translations.Tur
import com.samadihadis.countryinformationapplication.data.translations.Urd
import com.samadihadis.countryinformationapplication.data.translations.Zho
import java.io.Serializable

data class Translations(

    @SerializedName("ara") val ara: Ara?,
    @SerializedName("bre") val bre: Bre?,
    @SerializedName("ces") val ces: Ces?,
    @SerializedName("cym") val cym: Cym?,
    @SerializedName("deu") val deu: Deu?,
    @SerializedName("est") val est: Est?,
    @SerializedName("fin") val fin: Fin?,
    @SerializedName("fra") val fra: Fra?,
    @SerializedName("hrv") val hrv: Hrv?,
    @SerializedName("hun") val hun: Hun?,
    @SerializedName("ita") val ita: Ita?,
    @SerializedName("jpn") val jpn: Jpn?,
    @SerializedName("kor") val kor: Kor?,
    @SerializedName("nld") val nld: Nld?,
    @SerializedName("per") val per: Per?,
    @SerializedName("pol") val pol: Pol?,
    @SerializedName("por") val por: Por?,
    @SerializedName("rus") val rus: Rus?,
    @SerializedName("slk") val slk: Slk?,
    @SerializedName("spa") val spa: Spa?,
    @SerializedName("srp") val srp: Srp?,
    @SerializedName("swe") val swe: Swe?,
    @SerializedName("tur") val tur: Tur?,
    @SerializedName("urd") val urd: Urd?,
    @SerializedName("zho") val zho: Zho?
): Serializable
