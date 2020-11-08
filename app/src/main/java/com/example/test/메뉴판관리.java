package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import android.view.View;

public class 메뉴판관리 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle SaveInstaceState)
    {
        super.onCreate(SaveInstaceState);
        setContentView(R.layout.manage_menu);
    }

    public void CompletClick(View C)
    {
        Intent intent = new Intent(this,메인화면.class);
        startActivity(intent);

        finish();
    }

    public void add_change_Click(View a)
    {
        Intent intent1 = new Intent(this,메뉴수정및등록.class);
        startActivity(intent1);

        finish();
    }

}
