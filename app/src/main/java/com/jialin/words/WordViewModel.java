package com.jialin.words;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    WordDao wordDao;
    WordRepository wordRepository;

    public WordViewModel(@NonNull Application application) {
        super(application);
        wordRepository = new WordRepository(application);
    }
    public LiveData<List<Word>> getAllWordsLive() {
        return wordRepository.getAllWordsLive();
    }
    public LiveData<List<Word>> findWordsWithPatten(String patten) {
        return wordRepository.findWordsWithPatten(patten);
    }
    void insertWords(Word... words){
        wordRepository.insertWords(words);
    }
    void updateWord(Word... words){
        wordRepository.updateWord(words);
    }
    void deleteWords(Word... words){
        wordRepository.deleteWords(words);
    }
    void deleteAllWords(){
        wordRepository.deleteAllWords();
    }
}
