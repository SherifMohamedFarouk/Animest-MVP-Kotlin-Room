package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class Producer(
    @SerializedName("mal_id")
    val malId: Int, // 23
    @SerializedName("name")
    val name: String, // Bandai Visual
    @SerializedName("type")
    val type: String, // anime
    @SerializedName("url")
    val url: String // https://myanimelist.net/anime/producer/23/Bandai_Visual
)