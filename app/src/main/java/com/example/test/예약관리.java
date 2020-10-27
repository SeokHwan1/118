package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class 예약관리 extends AppCompatActivity{

    @Override
    protected  void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_reservation);
    }
    public void ReturnClick(View R)
    {
        Intent intent = new Intent(this,메인화면.class);
        startActivity(intent);

        finish();
    }
}
