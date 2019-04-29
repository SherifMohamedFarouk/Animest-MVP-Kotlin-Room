package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class Genre(
    @SerializedName("mal_id")
    val malId: Int, // 29
    @SerializedName("name")
    val name: String, // Space
    @SerializedName("type")
    val type: String, // anime
    @SerializedName("url")
    val url: String // https://myanimelist.net/anime/genre/29/Space
)