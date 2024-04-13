package com.JRobertFinal.footballapp.di

import com.JRobertFinal.footballapp.data.teamfavorite.TeamFavoriteDataSource
import com.JRobertFinal.footballapp.data.teamfavorite.TeamFavoriteRepository
import com.JRobertFinal.footballapp.ui.favorite.team.TeamFavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val teamFavoriteModule = module {

    single<TeamFavoriteDataSource> { TeamFavoriteRepository(get()) }

    viewModel { TeamFavoriteViewModel(get()) }
}