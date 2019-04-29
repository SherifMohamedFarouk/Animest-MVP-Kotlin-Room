package com.veirn.animest.di

import com.veirn.animest.navigation.SearchFragment
import com.veirn.animest.navigation.TopAnimeFragment
import com.veirn.animest.navigation.TopMangaFragment
import com.veirn.animest.ui.details.AnimeDetails
import dagger.Component

@Component(modules = arrayOf(ComponentModule::class) )
interface MainComponent {

//    fun inject(mainActivity: MainActivity)
    fun inject(mainActivity:TopAnimeFragment )
    fun inject(mainActivity: TopMangaFragment)
    fun inject(mainActivity: SearchFragment)
    fun inject(mainActivity: AnimeDetails)
}