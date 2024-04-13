package com.JRobertFinal.footballapp.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

// Base class for ViewModels in the application
abstract class BaseViewModel : ViewModel() {

    // CompositeDisposable to manage subscriptions
    private val compositeDisposable = CompositeDisposable()

    // Function to subscribe to a disposable
    fun subscribe(it: Disposable) {
        compositeDisposable.add(it)
    }

    // Function called when the ViewModel is cleared
    override fun onCleared() {
        super.onCleared()
        // Clear all disposables
        compositeDisposable.clear()
    }

}
