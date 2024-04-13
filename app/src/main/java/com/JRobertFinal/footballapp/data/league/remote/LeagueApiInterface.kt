package com.JRobertFinal.footballapp.data.league.remote

import com.JRobertFinal.footballapp.base.BaseResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface LeagueApiInterface {

    @GET("lookupleague.php")
    fun getDetailLeague(@Query("id") id : String): Observable<BaseResponse>

}