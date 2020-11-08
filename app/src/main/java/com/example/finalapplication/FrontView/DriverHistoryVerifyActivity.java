package com.example.finalapplication.FrontView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.finalapplication.R;

public class DriverHistoryVerifyActivity extends AppCompatActivity implements View.OnClickListener{
    Button Enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_history_verify);
        init();
    }
    private void init(){
        Enter =(Button) findViewById(R.id.button3);


        Enter.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button3:
                startActivity( new Intent(this,DriverHistoryActivity.class));
                break;

        }

    }
}