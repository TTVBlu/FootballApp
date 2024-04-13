package com.JRobertFinal.footballapp.di

import com.JRobertFinal.footballapp.data.match.MatchDataSource
import com.JRobertFinal.footballapp.data.match.MatchRepository
import com.JRobertFinal.footballapp.data.match.remote.MatchApiInterface
import com.JRobertFinal.footballapp.ui.match.MatchViewModel
import com.JRobertFinal.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val matchModule = module {

    single<MatchApiInterface> { Network.builder().create() }

    single<MatchDataSource> { MatchRepository(get()) }

    viewModel { MatchViewModel(get()) }
}