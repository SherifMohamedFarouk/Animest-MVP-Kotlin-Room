package com.veirn.animest.Presenter.main

import android.content.Context
import android.util.Log
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import com.veirn.animest.model.db.AnimeDatabase
import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.model.topmanga.Top
import com.veirn.animest.repo.MainRepostairy
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import javax.inject.Inject

class MainPresenterImp @Inject constructor(var mainRepostairy: MainRepostairy) : MainPresenter, ViewModel() {

    lateinit var mainView : MainView
    lateinit var db : AnimeDatabase
    lateinit var context : Context

    override fun onFetcheda(grespon: List<TopAnime>) {
        mainView.getFetcheda(grespon)
    }

    override fun onFetched(grespon: List<Top>) {
        mainView.getFectched(grespon)

    }
    override fun onresult(grespon: List<TopAnime>) {
    mainView.getsearchresult(grespon)
    }


    init {
        mainRepostairy.mainPresnter = this

    }

    fun getTopAnime(context: FragmentActivity? , page:Int ){
        this.context = context!!
        doAsync {
            // Get the student list from database

            val list =   AnimeDatabase.invoke(context).topDaoanime().getanimetop()

            Log.v("Cool1",   ""+list.size)

            uiThread {
                if(page == 1) {
                    Log.v("Cool1", list.toString())
                    if (list.size > 0) {
                        onFetcheda(list)
                        mainRepostairy.getTopAnime(context, page +1)
                    } else
                        mainRepostairy.getTopAnime(context, page)

//                        Toast.makeText(context,list.size,Toast.LENGTH_LONG).show()
                }else{
                    mainRepostairy.getTopAnime(context, page)
                }

            }
        }



    }
    fun getTopManga(context: FragmentActivity? , page:Int ){
        this.context = context!!
        doAsync {
            // Get the student list from database

            val list =   AnimeDatabase.invoke(context).topDao().getmangatop()

            Log.v("Cool1",   ""+list.size)
            uiThread {
                Log.v("Cool1",list.toString())

                if(list .size > 0){
                    onFetched(list )
                }else
                    mainRepostairy.getTopManga(context,page)

//                        Toast.makeText(context,list.size,Toast.LENGTH_LONG).show()


            }
        }


    }

    fun getSearch(query:String ,context: FragmentActivity? , page:Int ){
        this.context = context!!
        mainRepostairy.getSearchAnime(query,context,page)



            }





}







