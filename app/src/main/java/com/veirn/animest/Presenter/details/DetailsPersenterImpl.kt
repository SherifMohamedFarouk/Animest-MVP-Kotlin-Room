package com.veirn.animest.Presenter.details

import android.app.Activity
import android.content.Context
import com.veirn.animest.model.topanime.animedetails.TopAnimeDetails
import com.veirn.animest.repo.DetailsRepostairy
import javax.inject.Inject

class DetailsPersenterImpl @Inject constructor(var detailsRepostairy: DetailsRepostairy) : DetailsPersenter {
   lateinit var detailsView: DetailsView
    lateinit var context : Context

    override fun ongetdata(grespon: TopAnimeDetails) {
        detailsView.getondata(grespon)


    }
    init {
        detailsRepostairy.detailsPersenter = this
    }

    fun getDetailsAnime(context: Activity, id:Int ) {
        this.context = context!!

        detailsRepostairy.getTopAnimeDetails(context,id)

//        doAsync {
//            // Get the student list from database
//
//            val list = AnimeDatabase.invoke(context).topDaoanime().getanimetop()
//
//            Log.v("Cool1", "" + list.size)
//            uiThread {
//                Log.v("Cool1", list.toString())
//                if (list.size > 0) {
//                    onFetcheda(list)
//                } else
//                    mainRepostairy.getTopAnime(context, page)
//
////                        Toast.makeText(context,list.size,Toast.LENGTH_LONG).show()
//
//
//            }
//        }
    }
}