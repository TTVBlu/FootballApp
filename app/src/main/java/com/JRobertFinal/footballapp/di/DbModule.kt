package com.JRobertFinal.footballapp.di

import com.JRobertFinal.footballapp.data.AppDatabase
import org.koin.dsl.module

val dbModule = module {

    single { AppDatabase.getAppDatabase(get()) }

}