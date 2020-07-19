package ru.alextroy.roommvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.alextroy.roommvvm.model.Word
import ru.alextroy.roommvvm.model.WordDao

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}