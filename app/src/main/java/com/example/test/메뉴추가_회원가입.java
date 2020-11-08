package com.example.test;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

public class 메뉴추가_회원가입 extends  AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle SaveInstaceState)
    {
        super.onCreate(SaveInstaceState);
        setContentView(R.layout.add_menu_signin);
    }

    public void ReturnClick(View R)
    {
        Intent intent = new Intent(this,회원가입2.class);
        startActivity(intent);

        finish();
    }

    public void CompleteClick(View R)
    {
        Intent intent1 = new Intent(this,회원가입2.class);
        //다시 이전 화면으로 가거나
        //Intent intent1 = new Intent(this,메인화면.class);
        //Toast.makeText(getApplicationContext(),"가입 완료",Toast.LENGTH_LONG).show();
        // 가입 완료 시켜버리기
        startActivity(intent1);

        finish();
    }
}
