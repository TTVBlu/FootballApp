package com.JRobertFinal.footballapp.di

import com.JRobertFinal.footballapp.data.team.TeamDataSource
import com.JRobertFinal.footballapp.data.team.TeamRepository
import com.JRobertFinal.footballapp.data.team.remote.TeamApiInterface
import com.JRobertFinal.footballapp.ui.team.TeamViewModel
import com.JRobertFinal.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val teamModule = module {

    single<TeamApiInterface> { Network.builder().create() }

    single<TeamDataSource> { TeamRepository(get()) }

    viewModel { TeamViewModel(get()) }
}