package com.ie.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.ie.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.login_btn_login)Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.login_btn_login)
    public void login(){
        startActivity(new Intent(this, MainActivity.class));
    }

    @OnClick(R.id.login_btn_signup)
    public void signup(){
        startActivity(new Intent(this, SignUpActivity.class));
    }
}
