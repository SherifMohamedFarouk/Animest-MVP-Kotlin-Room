package com.veirn.animest.repo

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.veirn.animest.Presenter.main.MainPresenter
import com.veirn.animest.model.db.AnimeDatabase
import com.veirn.animest.model.topanime.TopAnimedata
import com.veirn.animest.model.topmanga.TopAnimeResponseModel
import com.veirn.animest.utils.Base_url
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread



class MainRepostairy () {
    lateinit var mainPresnter: MainPresenter
    lateinit var db: AnimeDatabase

    //    https://api.jikan.moe/v3/top/anime/1
    fun getTopAnime(context: Context, page: Int) {
        val queue = Volley.newRequestQueue(context)
        val url = "$Base_url/top/anime/$page"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                var gson = Gson()
                var grespon = gson.fromJson(response, TopAnimedata::class.java)
                db = AnimeDatabase.invoke(context)
//                Log.v("Cool","grespon.top.size-> " +grespon.top.size)
//                Log.v("Cool1", grespon.top.size.toString())

                for(i in grespon.top){
                    doAsync {
                        // Put the student in database
                        AnimeDatabase.invoke(context).topDaoanime().upsert(i)
                        uiThread {
                        }
                    }
                }

//




             mainPresnter.onFetcheda(grespon.top)
//              InsertTask(context,grespon.top[1]).execute()
    },
            Response.ErrorListener { error -> Log.d("Testing" ,error.message ) })

        queue.add(stringRequest)
    }

    fun getTopManga(context: Context, page: Int) {
        val queue = Volley.newRequestQueue(context)
        val url = "$Base_url/top/manga/$page"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                var gson = Gson()
                var grespon = gson.fromJson(response, TopAnimeResponseModel::class.java)
                db = AnimeDatabase.invoke(context)
//                Log.v("Cool","grespon.top.size-> " +grespon.top.size)
//                Log.v("Cool1", grespon.top.size.toString())

                for(i in grespon.top){
                    doAsync {
                        // Put the student in database
                        AnimeDatabase.invoke(context).topDao().upsert(i)
                        uiThread {
                        }
                    }
                }

//




                mainPresnter.onFetched(grespon.top)
//              InsertTask(context,grespon.top[1]).execute()
            },
            Response.ErrorListener { error -> Log.d("Testing" ,error.message ) })

        queue.add(stringRequest)
    }
    fun getSearchAnime(query:String,context: Context, page: Int) {
        val queue = Volley.newRequestQueue(context)
        val url = "$Base_url/search/anime?q=${query}&page=${page}"
//        "$Base_url/search/anime?q=$query&$page"

        val stringRequest = StringRequest(Request.Method.GET, url,
            Response.Listener<String> { response ->
                var gson = Gson()
                var grespon = gson.fromJson(response, TopAnimedata::class.java)
                Log.v("searchh",grespon.toString())
                mainPresnter.onresult(grespon.results)

            },
            Response.ErrorListener { error -> Log.d("Testing" ,error.message ) })

        queue.add(stringRequest)
    }


}
