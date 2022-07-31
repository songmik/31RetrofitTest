package com.example.a31retrofittest

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject

class KycJsonPost {

    val jsonObject = JSONObject()

    var body = jsonObject.toString().toRequestBody("application/json; charset=utf-8".toMediaTypeOrNull())

    private fun getJsonData(jsonObject: JSONObject) : RequestBody {

        val result = jsonObject.getString("result")
        val resultReview = jsonObject.getJSONObject("result_review")
        val idCard = jsonObject.getJSONObject("id_card")

        val name = resultReview.getString("name")
        val birthDay = resultReview.getString("birthday")
        val phoneNumber = resultReview.getString("phone_number")
        val verified = idCard.getBoolean("verified")
        val originalOcrData = idCard.getString("original_ocr_data")

        return putJsonData(result, name, birthDay, phoneNumber, verified, originalOcrData)
    }

    private fun putJsonData(result : String, name : String, birthDay : String, phoneNumber : String, verified : Boolean, originalOcrData : String) : RequestBody {

        val jsonObject = JSONObject()
        jsonObject.put(result, "success")
        jsonObject.put(name, "songmi")
        jsonObject.put(birthDay, "0727")
        jsonObject.put(phoneNumber, "01022334455")

        val mediaType = "application/json; charset=utf-8".toMediaTypeOrNull()
        val body = jsonObject.toString().toRequestBody(mediaType)

        return body
    }



}