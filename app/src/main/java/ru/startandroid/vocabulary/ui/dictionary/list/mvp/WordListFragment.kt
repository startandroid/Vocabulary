package ru.startandroid.vocabulary.ui.dictionary.list.mvp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ru.startandroid.vocabulary.R
import ru.startandroid.vocabulary.base.ui.BaseFragment
import ru.startandroid.vocabulary.common.getComponent
import javax.inject.Inject

class WordListFragment : BaseFragment(), WordListContract.View {

    @Inject lateinit var s : String;

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        Log.d("kotlin!", "s " + s);
        return inflater!!.inflate(R.layout.fragment_word_list, container, false)
    }

}