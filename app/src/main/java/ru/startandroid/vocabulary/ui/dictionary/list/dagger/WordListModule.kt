package ru.startandroid.vocabulary.ui.dictionary.list.dagger

import dagger.Module
import dagger.Provides
import ru.startandroid.vocabulary.base.dagger.BaseModule

@Module
class WordListModule: BaseModule {

    @Provides
    fun provideStr() : String {
        return "123444"
    }

}