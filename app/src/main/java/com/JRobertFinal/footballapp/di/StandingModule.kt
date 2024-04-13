package com.JRobertFinal.footballapp.di

import com.JRobertFinal.footballapp.data.standing.StandingDataSource
import com.JRobertFinal.footballapp.data.standing.StandingRepository
import com.JRobertFinal.footballapp.data.standing.remote.StandingApiInterface
import com.JRobertFinal.footballapp.ui.standing.StandingViewModel
import com.JRobertFinal.footballapp.utils.Network
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.create

val standingModule = module {

    single<StandingApiInterface> { Network.builder().create() }

    single<StandingDataSource> { StandingRepository(get()) }

    viewModel { StandingViewModel(get()) }
}