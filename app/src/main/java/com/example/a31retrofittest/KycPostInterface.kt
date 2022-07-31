package com.example.a31retrofittest

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface KycPostInterface {

    @POST("kyc/insert")
    fun getResultData(@Body dataBody: RequestBody) : Call<KycDtoData>
}