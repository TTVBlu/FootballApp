package com.JRobertFinal.footballapp.base

import com.JRobertFinal.footballapp.data.league.remote.response.DetailLeague
import com.JRobertFinal.footballapp.data.match.remote.response.Match
import com.JRobertFinal.footballapp.data.standing.remote.response.Standing
import com.JRobertFinal.footballapp.data.team.remote.response.Team
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BaseResponse(
    @SerializedName("leagues")
    @Expose
    val leagues: List<DetailLeague>,

    @SerializedName("events")
    @Expose
    val events: List<Match>,

    @SerializedName("event")
    @Expose
    val event: List<Match>,

    @SerializedName("teams")
    @Expose
    val teams: List<Team>,

    @SerializedName("table")
    @Expose
    val table: List<Standing>
)