package com.example.finalapplication.FrontView;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.finalapplication.R;

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener {

    EditText Email, Password;
    Button Login;
    TextView PasswordReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init(){
        Email = (EditText) findViewById(R.id.email);
        Password =(EditText) findViewById(R.id.password);
        Login =(Button) findViewById(R.id.bLogin);
        PasswordReset = (TextView) findViewById( R.id.resetPassword);

        Login.setOnClickListener(this);
        PasswordReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bLogin:
                startActivity( new Intent(this,AgentProfileActivity.class));
                break;

            case R.id.resetPassword:
                startActivity( new Intent(this,ResetPassword.class));
                break;
        }

    }

    }

