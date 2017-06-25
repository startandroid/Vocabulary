package ru.startandroid.vocabulary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {

    //@BindView(R.id.text2)
    //lateinit var textView2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)


    }

}
