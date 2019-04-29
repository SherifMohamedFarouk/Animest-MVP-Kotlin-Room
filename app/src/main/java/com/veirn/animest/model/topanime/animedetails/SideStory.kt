package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class SideStory(
    @SerializedName("mal_id")
    val malId: Int, // 17205
    @SerializedName("name")
    val name: String, // Cowboy Bebop: Ein no Natsuyasumi
    @SerializedName("type")
    val type: String, // anime
    @SerializedName("url")
    val url: String // https://myanimelist.net/anime/17205/Cowboy_Bebop__Ein_no_Natsuyasumi
)