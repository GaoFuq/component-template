package com.gfq.component_app_template.common

import android.app.Application
import android.content.Context
import android.util.Log
import com.like.component.IModuleApplication

/**
 * 通用模块的 Application
 * @author like
 * Date: 2021-01-21
 */
class CommonApplication : IModuleApplication {
    companion object{
        lateinit var sInstance :Context
    }

    override fun attachBaseContext(base: Context) {
        Log.e(this::javaClass.name,"attachBaseContext")
        sInstance = base
    }

    override fun onCreate(application: Application) {
        Log.e(this::javaClass.name,"onCreate")

    }

    override fun onTerminate(application: Application) {
        Log.e(this::javaClass.name,"onTerminate")

    }

}