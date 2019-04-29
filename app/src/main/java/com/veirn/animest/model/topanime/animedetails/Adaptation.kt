package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class Adaptation(
    @SerializedName("mal_id")
    val malId: Int, // 174
    @SerializedName("name")
    val name: String, // Shooting Star Bebop: Cowboy Bebop
    @SerializedName("type")
    val type: String, // manga
    @SerializedName("url")
    val url: String // https://myanimelist.net/manga/174/Shooting_Star_Bebop__Cowboy_Bebop
)