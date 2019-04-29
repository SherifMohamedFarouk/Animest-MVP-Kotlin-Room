package com.veirn.animest.Presenter.main

import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.model.topmanga.Top

interface MainView {
    fun getFectched(grespon: List<Top>)
    fun getFetcheda(grespon: List<TopAnime>)
    fun getsearchresult(grespon: List<TopAnime>)
}