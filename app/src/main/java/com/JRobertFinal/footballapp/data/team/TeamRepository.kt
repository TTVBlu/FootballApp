package com.JRobertFinal.footballapp.data.team

import com.JRobertFinal.footballapp.data.team.remote.TeamApiInterface
import com.JRobertFinal.footballapp.data.team.remote.response.Team
import io.reactivex.Observable

// Repository class for team data
class TeamRepository(private val services: TeamApiInterface) :
    TeamDataSource {

    // Function to retrieve a list of teams for a specific league ID
    override fun getTeamList(id : String): Observable<List<Team>> {
        // Use the TeamApiInterface to fetch the list of teams for the given league ID and map the response to a list of Team objects
        return services.getTeamList(id).map { it.teams }
    }

    // Function to retrieve details of a team by its ID
    override fun getTeamDetail(id: String): Observable<List<Team>> {
        // Use the TeamApiInterface to fetch team details by ID and map the response to a list of Team objects
        return services.getTeamDetail(id).map { it.teams }
    }

    // Function to search for teams based on a query string
    override fun getSearchTeam(query: String): Observable<List<Team>> {
        // Use the TeamApiInterface to search for teams using the provided query and map the response to a list of Team objects
        return services.getSearchTeam(query).map { it.teams }
    }
}
