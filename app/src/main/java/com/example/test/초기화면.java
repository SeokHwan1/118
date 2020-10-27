package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;


public class 초기화면 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main);
    }

    public void LogInClick(View Z) {
        Intent intent1 = new Intent(this, 메인화면.class);
        startActivity(intent1);

        finish();
    }

    public void SignUpClick(View view)
    {
        Intent intent = new Intent(this, 회원가입.class);
        startActivity(intent);

        finish();
    }


}