package com.JRobertFinal.footballapp.data.teamfavorite

import com.JRobertFinal.footballapp.data.teamfavorite.local.response.TeamFavorite
import io.reactivex.Completable
import io.reactivex.Single

interface TeamFavoriteDataSource {
    fun addTeamFavorite(teamFavorite: TeamFavorite): Completable
    fun getTeamFavorite(): Single<List<TeamFavorite>>
    fun getTeamFavoriteById(id: Int): Single<List<TeamFavorite>>
    fun deleteTeamFavorite(id: Int): Completable

}