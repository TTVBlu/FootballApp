package com.JRobertFinal.footballapp.di

import com.JRobertFinal.footballapp.data.AppDatabase
import com.JRobertFinal.footballapp.data.matchfavorite.MatchFavoriteDataSource
import com.JRobertFinal.footballapp.data.matchfavorite.MatchFavoriteRepository
import com.JRobertFinal.footballapp.ui.favorite.match.MatchFavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val matchFavoriteModule = module {

    single {
        val appDatabase: AppDatabase = get()
        return@single appDatabase.favoriteDao()
    }

    single<MatchFavoriteDataSource> { MatchFavoriteRepository(get()) }

    viewModel { MatchFavoriteViewModel(get()) }
}