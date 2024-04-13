package com.JRobertFinal.footballapp.data.standing.remote

import com.JRobertFinal.footballapp.base.BaseResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface StandingApiInterface {
    @GET("lookuptable.php")
    fun getStanding(@Query("l") id : String): Observable<BaseResponse>
}