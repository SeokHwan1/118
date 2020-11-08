package com.example.test;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class 회원가입2 extends AppCompatActivity{
    @Override
    protected  void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin2);
    }

    public void FinishClick(View r)
    {

        Toast.makeText(getApplicationContext(),"가입 완료",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, 초기화면.class);
        startActivity(intent);

        finish();
    }

    public void ReturnClick(View R)
    {
        Intent intent2 = new Intent(this, 회원가입.class);
        startActivity(intent2);

        finish();
    }

    public void MenuClick(View V)
    {
        Intent intent3 = new Intent(this, 메뉴추가_회원가입.class);
        startActivity(intent3);

        finish();
    }




}
