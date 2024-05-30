package com.example.ch02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonMainActivity extends AppCompatActivity {
    private Button mbtnTextView;
    private Button mbtnButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_activity_main);
        mbtnTextView=findViewById(R.id.btn_textview);
        mbtnTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳转到textView演示界面
                Intent intent=new Intent(ButtonMainActivity.this,TestViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnButton=findViewById(R.id.btn_button);
        mbtnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳转到Button演示界面
                Intent intent=new Intent(ButtonMainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });
    }
}
