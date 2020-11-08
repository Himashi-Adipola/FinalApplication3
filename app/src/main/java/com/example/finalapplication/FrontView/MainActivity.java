package com.example.finalapplication.FrontView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.finalapplication.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Login;
    TextView CreateAccountLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        Login =(Button) findViewById(R.id.bLogin);
        CreateAccountLink = (TextView) findViewById(R.id.tRegisterLink);

        Login.setOnClickListener(this);
        CreateAccountLink.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bLogin:
                startActivity( new Intent(this,LoginActivity.class));
                break;
            case R.id.tRegisterLink:
                startActivity( new Intent(this,RegisterActivity.class));
                break;
        }

    }
}
