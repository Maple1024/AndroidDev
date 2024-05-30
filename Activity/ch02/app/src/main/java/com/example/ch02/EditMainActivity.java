package com.example.ch02;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditMainActivity extends AppCompatActivity {
    private Button mbtnTextView;
    private Button mbtnButton;
    private Button mbtnEditText;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_activity_main);
        mbtnTextView=findViewById(R.id.btn_textview);
        mbtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至TextView演示界面
                Intent intent=new Intent(EditMainActivity.this,TestViewActivity.class);
                startActivity(intent);
            }
        });
        mbtnTextView=findViewById(R.id.btn_button);
        mbtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button演示界面
                Intent intent=new Intent(EditMainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }


        });
        mbtnEditText=findViewById(R.id.btn_edittext);
        mbtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button演示界面
                Intent intent=new Intent(EditMainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
    }
}
