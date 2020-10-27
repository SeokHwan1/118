package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class 매장관리 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle SaveInstaceState)
    {
        super.onCreate(SaveInstaceState);
        setContentView(R.layout.manage_store);

    }


    public void ReturnClick(View R){

        Intent intent = new Intent(this,메인화면.class);
        startActivity(intent);

        finish();
    }

    public void CallCustomerClick(View C)
    {
            Intent intent1 = new Intent(this,손님부르기.class);
            startActivity(intent1);

            finish();
    }


}
