package com.hasanaydin.cryptocurrencyapp.service

import com.hasanaydin.cryptocurrencyapp.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    // GET, POST, UPDATE, DELETE
    // https://api.nomics.com/v1/
    // prices?key=68fb62f53f85ef132e77234a5d2dc957d7285984

    @GET("prices?key=68fb62f53f85ef132e77234a5d2dc957d7285984")

    fun getData() : Call<List<CryptoModel>>

}