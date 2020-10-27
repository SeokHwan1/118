package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.annotation.Nullable;

public class 메뉴수정및등록 extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle SaveInstaceState)
    {
        super.onCreate(SaveInstaceState);
        setContentView(R.layout.add_change_menu);
    }

    public void ReturnClick(View R)
    {
        Intent intent1 = new Intent(this,메뉴판관리.class);
        startActivity(intent1);

        finish();
    }

    public void FinishClick(View F)
    {
        Intent intent2 = new Intent(this,메인화면.class);
        startActivity(intent2);

        finish();
    }
}
