package com.android.example_android_jetpack_fragment

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import com.android.example_android_jetpack_fragment.result.activity.ResultAPIActivity
import com.android.example_android_jetpack_fragment.usage.activity.UsageActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val rootView = findViewById<LinearLayout>(R.id.layout_main)
        rootView.addView(createButtonView("Fragment使用") { startActivity(Intent(this, UsageActivity::class.java)) })
        rootView.addView(createButtonView("Fragment通信") { startActivity(Intent(this, ResultAPIActivity::class.java)) })
    }

}