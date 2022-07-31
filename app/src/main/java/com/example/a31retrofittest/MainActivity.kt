package com.example.a31retrofittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitCall = KycRetrofitObject.api
        val jsonBody = KycJsonPost().body


        retrofitCall.getResultData(jsonBody).enqueue(object  : Callback<KycDtoData> {
            override fun onResponse(call: Call<KycDtoData>, response: Response<KycDtoData>) {
                if (response.isSuccessful) {
                    Log.e("응답 성공 Test", response.body().toString())
                }
            }

            override fun onFailure(call: Call<KycDtoData>, t: Throwable) {
                Log.e("실패 Test", t.message.toString())
            }

        })


    }
}