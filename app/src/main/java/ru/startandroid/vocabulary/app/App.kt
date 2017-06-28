package ru.startandroid.vocabulary.app

import android.app.Application
import android.content.Context

class App : Application() {

    public lateinit var componentHolder: ComponentHolder
        private set

    override fun onCreate() {
        super.onCreate()
        componentHolder = ComponentHolder(this)
        componentHolder.init()
    }

    companion object {
        fun getApp(context: Context) : App {
            return context.applicationContext as App
        }
    }


}