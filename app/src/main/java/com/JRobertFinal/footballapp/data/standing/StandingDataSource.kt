package com.JRobertFinal.footballapp.data.standing

import com.JRobertFinal.footballapp.data.standing.remote.response.Standing
import io.reactivex.Observable

interface StandingDataSource {
    fun getStanding(id : String): Observable<List<Standing>>
}