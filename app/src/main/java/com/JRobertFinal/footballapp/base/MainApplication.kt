package com.JRobertFinal.footballapp.base

import com.JRobertFinal.footballapp.di.*
import org.koin.core.module.Module

// Main application class extending BaseApplication
class MainApplication : BaseApplication() {

    // Function to get the defined Koin modules
    override fun getDefinedModules(): List<Module> {
        return listOf(
            dbModule, // Database module
            leagueModule, // League module
            matchModule, // Match module
            standingModule, // Standing module
            teamModule, // Team module
            matchFavoriteModule, // Match favorite module
            teamFavoriteModule // Team favorite module
        )
    }
}
