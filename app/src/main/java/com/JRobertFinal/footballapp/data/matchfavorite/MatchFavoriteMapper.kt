package com.JRobertFinal.footballapp.data.matchfavorite

import com.JRobertFinal.footballapp.data.match.remote.response.Match
import com.JRobertFinal.footballapp.data.matchfavorite.local.response.MatchFavorite

// Extension function to convert a Match object to a MatchFavorite object
fun Match.toFavorite() : MatchFavorite {
    return MatchFavorite(
        idEvent = idEvent?.toInt() ?: 0, // Convert ID to Int or default to 0
        nameLeague = nameLeague ?: "", // Set name of the league or default to empty string
        homeTeam = homeTeam ?: "", // Set name of the home team or default to empty string
        awayTeam = awayTeam ?: "", // Set name of the away team or default to empty string
        homeScore = homeScore ?: "", // Set score of the home team or default to empty string
        awayScore = awayScore ?: "", // Set score of the away team or default to empty string
        dateEvent = dateEvent ?: "", // Set date of the match or default to empty string
        idLeague = idLeague ?: "" // Set ID of the league or default to empty string
    )
}

// Extension function to convert a MatchFavorite object to a Match object
fun MatchFavorite.toMatch() : Match {
    return Match(
        idEvent = idEvent.toString(), // Convert ID to String
        nameLeague = nameLeague, // Set name of the league
        homeTeam = homeTeam, // Set name of the home team
        awayTeam = awayTeam, // Set name of the away team
        homeScore = homeScore, // Set score of the home team
        awayScore = awayScore, // Set score of the away team
        dateEvent = dateEvent, // Set date of the match
        idLeague = idLeague // Set ID of the league
    )
}
