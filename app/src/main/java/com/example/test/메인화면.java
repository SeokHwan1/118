package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class 메인화면 extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle SaveInstaceState)
    {
        super.onCreate(SaveInstaceState);
        setContentView(R.layout.activity_realmain);

    }

    public void LogOutClick(View L)
    {
        Intent intent = new Intent(this, 초기화면.class);
        startActivity(intent);

        finish();
    }

    public void ReservationClick(View R)
    {
        Intent intent1 = new Intent(this, 예약관리.class);
        startActivity(intent1);

        finish();
    }

    public void ManageStoreClick(View R)
    {
        Intent intent2 = new Intent(this, 매장관리.class);
        startActivity(intent2);

        finish();
    }

    public void MenuChangeClick(View M)
    {
        Intent intent3 = new Intent(this, 메뉴판관리.class);
        startActivity(intent3);

        finish();

    }

    public void NoticeClick(View N)
    {
        Intent intent4 = new Intent(this, 공지사항.class);
        startActivity(intent4);

        finish();
    }




}
