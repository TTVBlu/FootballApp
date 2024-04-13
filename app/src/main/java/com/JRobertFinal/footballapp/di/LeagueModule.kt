package com.JRobertFinal.footballapp.di

import com.JRobertFinal.footballapp.data.league.LeagueDataSource
import com.JRobertFinal.footballapp.data.league.LeagueRepository
import com.JRobertFinal.footballapp.data.league.remote.LeagueApiInterface
import com.JRobertFinal.footballapp.ui.league.LeagueViewModel
import com.JRobertFinal.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val leagueModule = module {

    single<LeagueApiInterface> { Network.builder().create() }

    single<LeagueDataSource> { LeagueRepository(get()) }

    viewModel { LeagueViewModel(get()) }
}