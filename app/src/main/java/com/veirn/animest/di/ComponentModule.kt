package com.veirn.animest.di

import com.veirn.animest.repo.MainRepostairy
import dagger.Module
import dagger.Provides

@Module
class ComponentModule {


@Provides
fun providerepostairy(): MainRepostairy {
    return MainRepostairy();

}

}