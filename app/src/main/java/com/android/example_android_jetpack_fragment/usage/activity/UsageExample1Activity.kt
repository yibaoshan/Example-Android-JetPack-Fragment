package com.android.example_android_jetpack_fragment.usage.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.example_android_jetpack_fragment.R

/**
 * Created by yibaoshan@foxmail.com on 2021/11/22
 * Description : 在xml中使用<fragment>标签创建Fragment
 * 关于fragment标签加载过程分析，请查看：https://github.com/RTFSC-Android/RTFSC/blob/master/LayoutInflater-3.md
 */
class UsageExample1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "使用方式-XML"
        setContentView(R.layout.activity_usage_example1)
    }

}