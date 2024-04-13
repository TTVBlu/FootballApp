package com.JRobertFinal.footballapp.data.standing

import com.JRobertFinal.footballapp.data.standing.remote.StandingApiInterface
import com.JRobertFinal.footballapp.data.standing.remote.response.Standing
import io.reactivex.Observable

// Repository class for standings data
class StandingRepository(private val services: StandingApiInterface) : StandingDataSource {
    // Function to retrieve standings for a specific league ID
    override fun getStanding(id: String): Observable<List<Standing>> {
        // Use the StandingApiInterface to fetch standings data and map the response to list of Standing objects
        return services.getStanding(id).map { it.table }
    }
}
