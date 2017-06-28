package ru.startandroid.vocabulary.base.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import ru.startandroid.vocabulary.common.getComponent

open class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getComponent()!!.inject(this)
    }

}