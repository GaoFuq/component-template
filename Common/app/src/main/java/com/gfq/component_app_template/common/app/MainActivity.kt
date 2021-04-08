package com.gfq.component_app_template.common.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.toColorInt
import com.gfq.component_app_template.common.dp
import com.gfq.component_app_template.common.dp2px
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.adapter = Ada()
        rv.addItemDecoration(Dec())
        
    }
}