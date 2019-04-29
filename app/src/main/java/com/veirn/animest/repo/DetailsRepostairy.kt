package com.veirn.animest.repo

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.veirn.animest.Presenter.details.DetailsPersenter
import com.veirn.animest.model.db.AnimeDatabase
import com.veirn.animest.model.topanime.animedetails.TopAnimeDetails
import com.veirn.animest.utils.Base_url
import javax.inject.Inject

class DetailsRepostairy @Inject constructor(){
    lateinit var detailsPersenter: DetailsPersenter
    lateinit var db: AnimeDatabase

    //    https://api.jikan.moe/v3/top/anime/1
    fun getTopAnimeDetails(context: Context, id: Int) {
        val queue = Volley.newRequestQueue(context)
        val url = "$Base_url/anime/${id}"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                var gson = Gson()
                var grespon = gson.fromJson(response, TopAnimeDetails::class.java)
                db = AnimeDatabase.invoke(context)
//                for(i in grespon.){
//                    doAsync {
//                        // Put the student in database
//                        AnimeDatabase.invoke(context).topDaoanime().upsert(i)
//                        uiThread {
//                        }
//                    }
//                }

//
                detailsPersenter.ongetdata(grespon)

//              InsertTask(context,grespon.top[1]).execute()
            },
            Response.ErrorListener { error -> Log.d("Testing" ,error.message ) })

        queue.add(stringRequest)
    }
}