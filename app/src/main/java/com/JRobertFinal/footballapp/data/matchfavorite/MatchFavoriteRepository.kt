package com.JRobertFinal.footballapp.data.matchfavorite

import com.JRobertFinal.footballapp.data.FavoriteDao
import com.JRobertFinal.footballapp.data.matchfavorite.local.response.MatchFavorite
import io.reactivex.Completable
import io.reactivex.Single

class MatchFavoriteRepository(
    private val matchFavoriteDao: FavoriteDao
) : MatchFavoriteDataSource {

    // Function to add a match to favorites
    override fun addMatchFavorite(matchFavorite: MatchFavorite): Completable {
        return Completable.fromAction {
            matchFavoriteDao.addFavoriteMatch(matchFavorite)
        }
    }

    // Function to retrieve all favorite matches
    override fun getMatchFavorite(): Single<List<MatchFavorite>> {
        return matchFavoriteDao.getListFavoriteMatch()
    }

    // Function to retrieve a favorite match by its ID
    override fun getMatchFavoriteById(id: Int): Single<List<MatchFavorite>> {
        return matchFavoriteDao.getFavoriteMatchById(id)
    }

    // Function to delete a favorite match by its ID
    override fun deleteMatchFavorite(id: Int): Completable {
        return Completable.fromAction {
            matchFavoriteDao.deleteFavoriteMatch(id)
        }
    }
}
