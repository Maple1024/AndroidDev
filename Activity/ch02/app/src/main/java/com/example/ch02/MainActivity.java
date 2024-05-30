package com.example.ch02;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private Button mBtnTextView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mBtnTextView=findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳转至TextView演示界面
                Intent intent=new Intent(MainActivity.this,TestViewActivity.class);
                startActivity(intent);
            }
        });
    }


}
