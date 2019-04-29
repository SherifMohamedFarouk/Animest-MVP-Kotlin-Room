package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class TopAnimeDetails(
    @SerializedName("aired")
    val aired: Aired,
    @SerializedName("airing")
    val airing: Boolean, // false
    @SerializedName("background")
    val background: String, // When Cowboy Bebop first aired in spring of 1998 on TV Tokyo, only episodes 2, 3, 7-15, and 18 were broadcast, it was concluded with a recap special known as Yose Atsume Blues. This was due to anime censorship having increased following the big controversies over Evangelion, as a result most of the series was pulled from the air due to violent content. Satellite channel WOWOW picked up the series in the fall of that year and aired it in its entirety uncensored. Cowboy Bebop was not a ratings hit in Japan, but sold over 19,000 DVD units in the initial release run, and 81,000 overall. Protagonist Spike Spiegel won Best Male Character, and Megumi Hayashibara won Best Voice Actor for her role as Faye Valentine in the 1999 and 2000 Anime Grand Prix, respectively.Cowboy Bebop's biggest influence has been in the United States, where it premiered on Adult Swim in 2001 with many reruns since. The show's heavy Western influence struck a chord with American viewers, where it became a "gateway drug" to anime aimed at adult audiences.
    @SerializedName("broadcast")
    val broadcast: String, // Saturdays at 01:00 (JST)
    @SerializedName("duration")
    val duration: String, // 24 min per ep
    @SerializedName("ending_themes")
    val endingThemes: List<String>,
    @SerializedName("episodes")
    val episodes: Int, // 26
    @SerializedName("favorites")
    val favorites: Int, // 45180
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("image_url")
    val imageUrl: String, // https://cdn.myanimelist.net/images/anime/4/19644.jpg
    @SerializedName("licensors")
    val licensors: List<Licensor>,
    @SerializedName("mal_id")
    val malId: Int, // 1
    @SerializedName("members")
    val members: Int, // 833372
    @SerializedName("opening_themes")
    val openingThemes: List<String>,
    @SerializedName("popularity")
    val popularity: Int, // 38
    @SerializedName("premiered")
    val premiered: String, // Spring 1998
    @SerializedName("producers")
    val producers: List<Producer>,
    @SerializedName("rank")
    val rank: Int?, // 28
    @SerializedName("rating")
    val rating: String, // R - 17+ (violence & profanity)
    @SerializedName("related")
    val related: Related,
    @SerializedName("request_cache_expiry")
    val requestCacheExpiry: Int, // 35969
    @SerializedName("request_cached")
    val requestCached: Boolean, // true
    @SerializedName("request_hash")
    val requestHash: String, // request:anime:d6092f2422f084452c84555f17c7ba047e6998d3
    @SerializedName("score")
    val score: Double, // 8.81
    @SerializedName("scored_by")
    val scoredBy: Int, // 421752
    @SerializedName("source")
    val source: String, // Original
    @SerializedName("status")
    val status: String, // Finished Airing
    @SerializedName("studios")
    val studios: List<Studio>,
    @SerializedName("synopsis")
    val synopsis: String?, // In the year 2071, humanity has colonized several of the planets and moons of the solar system leaving the now uninhabitable surface of planet Earth behind. The Inter Solar System Police attempts to keep peace in the galaxy, aided in part by outlaw bounty hunters, referred to as "Cowboys." The ragtag team aboard the spaceship Bebop are two such individuals. Mellow and carefree Spike Spiegel is balanced by his boisterous, pragmatic partner Jet Black as the pair makes a living chasing bounties and collecting rewards. Thrown off course by the addition of new members that they meet in their travels—Ein, a genetically engineered, highly intelligent Welsh Corgi; femme fatale Faye Valentine, an enigmatic trickster with memory loss; and the strange computer whiz kid Edward Wong—the crew embarks on thrilling adventures that unravel each member's dark and mysterious past little by little. Well-balanced with high density action and light-hearted comedy, Cowboy Bebop is a space Western classic and an homage to the smooth and improvised music it is named after. [Written by MAL Rewrite]
    @SerializedName("title")
    val title: String?, // Cowboy Bebop
    @SerializedName("title_english")
    val titleEnglish: String, // Cowboy Bebop
    @SerializedName("title_japanese")
    val titleJapanese: String, // カウボーイビバップ
    @SerializedName("title_synonyms")
    val titleSynonyms: List<Any>,
    @SerializedName("trailer_url")
    val trailerUrl: String, // https://www.youtube.com/embed/qig4KOK2R2g?enablejsapi=1&wmode=opaque&autoplay=1
    @SerializedName("type")
    val type: String, // TV
    @SerializedName("url")
    val url: String // https://myanimelist.net/anime/1/Cowboy_Bebop
)