package com.JRobertFinal.footballapp.data.league

import com.JRobertFinal.footballapp.data.league.remote.response.DetailLeague
import io.reactivex.Observable

interface LeagueDataSource {
    fun getDetailLeague(id : String): Observable<List<DetailLeague>>
}