package ru.startandroid.vocabulary.common

import android.support.v4.app.Fragment
import ru.startandroid.vocabulary.app.App
import ru.startandroid.vocabulary.base.dagger.BaseComponent

fun Fragment.getComponent() : BaseComponent<Fragment>? {
    return App.getApp(context).componentHolder.getComponent(javaClass)
}

