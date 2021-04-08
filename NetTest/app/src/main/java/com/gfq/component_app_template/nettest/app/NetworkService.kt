package com.gfq.component_app_template.nettest.app

import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val clientBuilder: OkHttpClient.Builder =
    OkHttpClient.Builder().addInterceptor(MyHttpLogInterceptor())

var client: OkHttpClient = clientBuilder.build()
var mBaseUrl = ""
val retrofit: Retrofit = Retrofit.Builder()
    .baseUrl("")
    .client(client)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

object NetworkService {
    fun clientAddInterceptor(vararg arr: Interceptor): NetworkService {
        arr.forEach { clientBuilder.addInterceptor(it) }
        return this
    }

    fun baseUrl(baseUrl: String): NetworkService {
        mBaseUrl = baseUrl
        return this
    }

    fun <T> api(clazz: Class<T>): T {
        return retrofit.create(clazz)
    }

    private fun build() {
        client = clientBuilder.build()

    }
}














