package com.JRobertFinal.footballapp.base

import android.app.Application
import com.JRobertFinal.footballapp.utils.ContextProvider
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

// Base class for the Application
abstract class BaseApplication : Application(){

    // Function called when the application is created
    override fun onCreate() {
        super.onCreate()

        // Initialize ContextProvider with application context
        ContextProvider.initialize(applicationContext)

        // Start Koin dependency injection framework
        startKoin{
            androidContext(this@BaseApplication)
            modules(getDefinedModules()) // Load defined Koin modules
        }
    }

    // Abstract function to get the defined Koin modules
    abstract fun getDefinedModules(): List<Module>
}
