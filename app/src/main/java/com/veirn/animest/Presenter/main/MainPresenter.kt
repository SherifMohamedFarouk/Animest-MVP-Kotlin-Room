package com.veirn.animest.Presenter.main

import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.model.topmanga.Top

interface MainPresenter {
    fun onFetched(grespon: List<Top>)
    fun onFetcheda(grespon: List<TopAnime>)
    fun onresult(grespon: List<TopAnime>)
}