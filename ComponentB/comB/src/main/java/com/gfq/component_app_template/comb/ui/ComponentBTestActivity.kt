package com.gfq.component_app_template.comb.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.gfq.component_app_template.comb.R

class ComponentBTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comb)
        title = "ComB_page"

    }

    companion object {
        @JvmStatic
        fun start(context: Context) {
            context.startActivity(Intent(context, ComponentBTestActivity::class.java))
        }
    }
}