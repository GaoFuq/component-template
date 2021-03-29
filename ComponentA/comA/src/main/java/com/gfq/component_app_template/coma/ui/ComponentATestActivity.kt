package com.gfq.component_app_template.coma.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.gfq.component_app_template.coma.R
import com.gfq.component_app_template.comb.service.IComponentBService

class ComponentATestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coma)
        title = "ComA_page"

    }

    companion object {
        @JvmStatic
        fun start(context: Context) {
            context.startActivity(Intent(context, ComponentATestActivity::class.java))
        }
    }

    fun jump2ComponentBActivity(view: View) {
        IComponentBService.getInstance()?.startComponentBTestActivity(this)
    }
}