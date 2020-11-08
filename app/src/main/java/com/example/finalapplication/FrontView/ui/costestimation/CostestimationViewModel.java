package com.example.finalapplication.FrontView.ui.costestimation;

import android.content.Intent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.finalapplication.FrontView.CostEstimationActivity1;
import com.example.finalapplication.FrontView.CostEstimationActivity4;

import static androidx.core.content.ContextCompat.startActivity;

public class CostestimationViewModel extends ViewModel{
    private MutableLiveData<String> mText;
    public CostestimationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cost estimation fragment");
    }



    public LiveData<String> getText() {
        return mText;
    }

}
