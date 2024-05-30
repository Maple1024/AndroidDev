package com.example.ch03;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextview;
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextview=(Button) findViewById(R.id.btn_textview);
        mBtnTextview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳转到TextView点击事件
                /*
                * 当某个视图被点击时，创建一个Intent对象，该对象指定了要启动的Activity(在这里是TextViewActivity)
                * 通过调用startActivity()方法启动这个Activity
                * */
                Intent intent=new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }

        });
    }
}