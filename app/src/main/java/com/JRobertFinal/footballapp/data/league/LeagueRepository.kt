package com.JRobertFinal.footballapp.data.league

import com.JRobertFinal.footballapp.data.league.remote.LeagueApiInterface
import com.JRobertFinal.footballapp.data.league.remote.response.DetailLeague
import io.reactivex.Observable

class LeagueRepository(private val services: LeagueApiInterface) :
    LeagueDataSource {
    // Function to retrieve details of a league by its ID
    override fun getDetailLeague(id : String): Observable<List<DetailLeague>> {
        // Use the LeagueApiInterface to fetch league details and map the response to list of DetailLeague objects
        return services.getDetailLeague(id).map { it.leagues }
    }
}
