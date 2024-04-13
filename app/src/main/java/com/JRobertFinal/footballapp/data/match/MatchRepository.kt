package com.JRobertFinal.footballapp.data.match

import com.JRobertFinal.footballapp.data.league.remote.response.DetailLeague
import com.JRobertFinal.footballapp.data.match.remote.MatchApiInterface
import com.JRobertFinal.footballapp.data.match.remote.response.Match
import com.JRobertFinal.footballapp.data.team.remote.response.Team
import io.reactivex.Observable

class MatchRepository(private val services: MatchApiInterface) :
    MatchDataSource {
    // Function to retrieve a list of matches for a specific league ID
    override fun getMatchList(id : String): Observable<List<Match>> {
        // Use the MatchApiInterface to fetch match list for the given league ID and map the response to list of Match objects
        return services.getMatchList(id).map { it.events }
    }

    // Function to retrieve details of a match by its ID
    override fun getDetailMatch(id: String): Observable<List<Match>> {
        // Use the MatchApiInterface to fetch match details by ID and map the response to list of Match objects
        return services.getDetailMatch(id).map { it.events }
    }

    // Function to retrieve details of a league by its ID
    override fun getDetailLeague(id : String): Observable<List<DetailLeague>> {
        // Use the MatchApiInterface to fetch league details by ID and map the response to list of DetailLeague objects
        return services.getDetailLeague(id).map { it.leagues }
    }

    // Function to retrieve details of a team by its ID
    override fun getTeamDetail(id: String): Observable<List<Team>> {
        // Use the MatchApiInterface to fetch team details by ID and map the response to list of Team objects
        return services.getTeamDetail(id).map { it.teams }
    }

    // Function to search for matches based on a query string
    override fun getSearchMatch(query: String): Observable<List<Match>> {
        // Use the MatchApiInterface to search for matches using the provided query and map the response to list of Match objects
        return services.getSearchMatch(query).map { it.event }
    }
}
