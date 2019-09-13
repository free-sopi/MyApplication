package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickButton(View v){
        Toast.makeText(getApplicationContext(),"버튼이 눌렸음",Toast.LENGTH_LONG).show();

    }

    public void onclickButton2(View v){
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com");
        startActivity(intent);
        /*주석 추가*/
    }
}
