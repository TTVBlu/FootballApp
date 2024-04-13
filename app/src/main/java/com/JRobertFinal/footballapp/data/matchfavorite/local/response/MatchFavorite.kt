package com.JRobertFinal.footballapp.data.matchfavorite.local.response

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "match_favorite")
// Data class representing a favorite match stored locally
data class MatchFavorite(
    @PrimaryKey(autoGenerate = true)
    val idEvent: Int, // Unique ID for the favorite match

    @ColumnInfo(name = "nameLeague")
    val nameLeague: String, // Name of the league

    @ColumnInfo(name = "homeTeam")
    val homeTeam: String, // Name of the home team

    @ColumnInfo(name = "awayTeam")
    val awayTeam: String, // Name of the away team

    @ColumnInfo(name = "homeScore")
    val homeScore: String, // Score of the home team

    @ColumnInfo(name = "awayScore")
    val awayScore: String, // Score of the away team

    @ColumnInfo(name = "dateEvent")
    val dateEvent: String, // Date of the match

    @ColumnInfo(name = "idLeague")
    val idLeague: String // ID of the league
) : Parcelable
