package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class Summary(
    @SerializedName("mal_id")
    val malId: Int, // 4037
    @SerializedName("name")
    val name: String, // Cowboy Bebop: Yose Atsume Blues
    @SerializedName("type")
    val type: String, // anime
    @SerializedName("url")
    val url: String // https://myanimelist.net/anime/4037/Cowboy_Bebop__Yose_Atsume_Blues
)