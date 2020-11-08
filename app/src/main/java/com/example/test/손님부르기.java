package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;

public class 손님부르기 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle SaveInstaceState)
    {
        super.onCreate(SaveInstaceState);
        setContentView(R.layout.call_customer);
    }

    public void ReturnClick(View R)
    {
        Intent intent = new Intent(this,매장관리.class);
        startActivity(intent);

        finish();
    }

    public void call1Click(View c)
    {
        Toast.makeText(getApplicationContext(),"알림 완료",Toast.LENGTH_LONG).show();
    }

    public void call2Click(View c2)
    {
        Toast.makeText(getApplicationContext(),"알림 완료",Toast.LENGTH_LONG).show();
    }

    public void call3Click(View c3)
    {
        Toast.makeText(getApplicationContext(),"알림" +
                " 완료",Toast.LENGTH_LONG).show();
    }


}
