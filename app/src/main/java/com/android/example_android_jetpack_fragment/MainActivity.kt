package com.android.example_android_jetpack_fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val rootView = findViewById<LinearLayout>(R.id.layout_main)
        rootView.addView(createButtonView("XML<fragment>标签") { startActivity(Intent(this, Example1Activity::class.java)) })
        rootView.addView(createButtonView("ViewGroup") { startActivity(Intent(this, Example2Activity::class.java)) })
        rootView.addView(createButtonView("ViewPager") { startActivity(Intent(this, Example3Activity::class.java)) })
    }

    private fun createButtonView(text: String, onClickListener: View.OnClickListener): Button {
        val button = Button(this)
        button.text = text
        button.setOnClickListener(onClickListener)
        return button
    }
}