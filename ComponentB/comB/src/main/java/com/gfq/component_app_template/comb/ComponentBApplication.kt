package com.gfq.component_app_template.comb

import android.app.Application
import android.content.Context
import android.util.Log
import com.like.component.IModuleApplication

class ComponentBApplication : IModuleApplication {

    override fun attachBaseContext(base: Context) {
        Log.e(this.javaClass.name, "attachBaseContext")
    }

    override fun onCreate(application: Application) {
        Log.e(this.javaClass.name, "onCreate")

    }

    override fun onTerminate(application: Application) {
        Log.e(this.javaClass.name, "onTerminate")

    }

}