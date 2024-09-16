package com.yashvant.loginscreenapp.services

import com.yashvant.loginscreenapp.model.Store
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface StoreApi{

     // Header Name : XApiKey
     //Header Value :1
     //http://mapi.grataeshop.com:8091/api/Category/InsertStoreItem

     @GET("store")
     suspend fun getStore(): Response<List<Store>>

     @POST("InsertStoreItem")
     suspend fun addStore(@Body store: Store): Response<Store>

    // @PUT("store/{id}")
    // suspend fun updateStore(@Path("id") id: Int, @Body store: Store): Response<Store>

    // @DELETE("store/{id}")
    // suspend fun deleteStore(@Path("id") id: Int): Response<Unit>
}