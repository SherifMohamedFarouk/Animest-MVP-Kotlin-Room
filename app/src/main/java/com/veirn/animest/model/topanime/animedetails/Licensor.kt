package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class Licensor(
    @SerializedName("mal_id")
    val malId: Int, // 233
    @SerializedName("name")
    val name: String, // Bandai Entertainment
    @SerializedName("type")
    val type: String, // anime
    @SerializedName("url")
    val url: String // https://myanimelist.net/anime/producer/233/Bandai_Entertainment
)