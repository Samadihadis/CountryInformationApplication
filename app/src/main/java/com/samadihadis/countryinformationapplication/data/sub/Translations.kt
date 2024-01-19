package com.samadihadis.countryinformationapplication.data.sub

import com.google.gson.annotations.SerializedName
import com.samadihadis.countryinformationapplication.data.language.Ara
import com.samadihadis.countryinformationapplication.data.language.Bre
import com.samadihadis.countryinformationapplication.data.language.Ces
import com.samadihadis.countryinformationapplication.data.language.Cym
import com.samadihadis.countryinformationapplication.data.language.Deu
import com.samadihadis.countryinformationapplication.data.language.Est
import com.samadihadis.countryinformationapplication.data.language.Fin
import com.samadihadis.countryinformationapplication.data.language.Fra
import com.samadihadis.countryinformationapplication.data.language.Hrv
import com.samadihadis.countryinformationapplication.data.language.Hun
import com.samadihadis.countryinformationapplication.data.language.Ita
import com.samadihadis.countryinformationapplication.data.language.Jpn
import com.samadihadis.countryinformationapplication.data.language.Kor
import com.samadihadis.countryinformationapplication.data.language.Nld
import com.samadihadis.countryinformationapplication.data.language.Per
import com.samadihadis.countryinformationapplication.data.language.Pol
import com.samadihadis.countryinformationapplication.data.language.Por
import com.samadihadis.countryinformationapplication.data.language.Rus
import com.samadihadis.countryinformationapplication.data.language.Slk
import com.samadihadis.countryinformationapplication.data.language.Spa
import com.samadihadis.countryinformationapplication.data.language.Srp
import com.samadihadis.countryinformationapplication.data.language.Swe
import com.samadihadis.countryinformationapplication.data.language.Tur
import com.samadihadis.countryinformationapplication.data.language.Urd
import com.samadihadis.countryinformationapplication.data.language.Zho
import java.io.Serializable

data class Translations(

    @SerializedName("ara") val ara: Ara,
    @SerializedName("bre") val bre: Bre,
    @SerializedName("ces") val ces: Ces,
    @SerializedName("cym") val cym: Cym,
    @SerializedName("deu") val deu: Deu,
    @SerializedName("est") val est: Est,
    @SerializedName("fin") val fin: Fin,
    @SerializedName("fra") val fra: Fra,
    @SerializedName("hrv") val hrv: Hrv,
    @SerializedName("hun") val hun: Hun,
    @SerializedName("ita") val ita: Ita,
    @SerializedName("jpn") val jpn: Jpn,
    @SerializedName("kor") val kor: Kor,
    @SerializedName("nld") val nld: Nld,
    @SerializedName("per") val per: Per,
    @SerializedName("pol") val pol: Pol,
    @SerializedName("por") val por: Por,
    @SerializedName("rus") val rus: Rus,
    @SerializedName("slk") val slk: Slk,
    @SerializedName("spa") val spa: Spa,
    @SerializedName("srp") val srp: Srp,
    @SerializedName("swe") val swe: Swe,
    @SerializedName("tur") val tur: Tur,
    @SerializedName("urd") val urd: Urd,
    @SerializedName("zho") val zho: Zho
): Serializable
