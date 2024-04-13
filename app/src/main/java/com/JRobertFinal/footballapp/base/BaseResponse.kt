package com.JRobertFinal.footballapp.base

import com.JRobertFinal.footballapp.data.league.remote.response.DetailLeague
import com.JRobertFinal.footballapp.data.match.remote.response.Match
import com.JRobertFinal.footballapp.data.standing.remote.response.Standing
import com.JRobertFinal.footballapp.data.team.remote.response.Team
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Base response class representing common fields in different API responses
data class BaseResponse(
    @SerializedName("leagues")
    @Expose
    val leagues: List<DetailLeague>, // List of DetailLeague objects

    @SerializedName("events")
    @Expose
    val events: List<Match>, // List of Match objects

    @SerializedName("event")
    @Expose
    val event: List<Match>, // List of Match objects

    @SerializedName("teams")
    @Expose
    val teams: List<Team>, // List of Team objects

    @SerializedName("table")
    @Expose
    val table: List<Standing> // List of Standing objects
)
