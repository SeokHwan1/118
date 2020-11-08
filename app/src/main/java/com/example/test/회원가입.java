package com.example.test;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.content.Intent;
import android.view.Display;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class 회원가입 extends AppCompatActivity{

    @Override
    protected  void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin1);
    }

    public void ReturnClick(View R)
    {
        Intent intent = new Intent(this, 초기화면.class);
        startActivity(intent);

        finish();
    }

    public void NextClick(View N)
    {
        Intent intent1 = new Intent(this,회원가입2.class);
        startActivity(intent1);

        finish();
    }





}
