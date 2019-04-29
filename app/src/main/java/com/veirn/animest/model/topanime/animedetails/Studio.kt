package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class Studio(
    @SerializedName("mal_id")
    val malId: Int, // 14
    @SerializedName("name")
    val name: String, // Sunrise
    @SerializedName("type")
    val type: String, // anime
    @SerializedName("url")
    val url: String // https://myanimelist.net/anime/producer/14/Sunrise
)