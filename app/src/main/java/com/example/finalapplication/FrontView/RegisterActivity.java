package com.example.finalapplication.FrontView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.finalapplication.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    EditText FirstName, LastName, Email,Password, VerifyPassword;
    Button Register;
    TextView DirectToLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    private  void  init(){
        FirstName =(EditText) findViewById(R.id.FirstName);
        LastName =(EditText) findViewById(R.id.lastName);
        Email =(EditText) findViewById(R.id.email);
        Password =(EditText)findViewById(R.id.password);
        VerifyPassword =(EditText) findViewById(R.id.verifypassword);
        Register =(Button) findViewById(R.id.register);
        DirectToLogin =(TextView) findViewById(R.id.directToLogin);

        Register.setOnClickListener(this);
        DirectToLogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.register:
//                startActivity( new Intent(this,LoginActivity.class));
                break;
            case R.id.directToLogin:
                startActivity( new Intent(this,LoginActivity.class));
                break;
        }

    }

    }

