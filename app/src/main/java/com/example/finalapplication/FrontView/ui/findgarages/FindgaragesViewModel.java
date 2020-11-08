package com.example.finalapplication.FrontView.ui.findgarages;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FindgaragesViewModel extends ViewModel {
    private MutableLiveData<String> mText;
    public FindgaragesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is find estimation fragment");
    }



    public LiveData<String> getText() {
        return mText;
    }
}
