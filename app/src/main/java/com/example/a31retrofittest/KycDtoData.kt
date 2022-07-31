package com.example.a31retrofittest

import com.google.gson.annotations.SerializedName

data class KycDtoData(
    @SerializedName("result")
    val result: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("birthday")
    val birthday: String,
    @SerializedName("phone_number")
    val phoneNumber: String,
    @SerializedName("verified")
    val verified : Boolean,
    @SerializedName("original_ocr_data")
    val originalOcrData : String
)
