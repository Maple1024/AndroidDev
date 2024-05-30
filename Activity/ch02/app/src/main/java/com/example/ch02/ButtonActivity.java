package com.example.ch02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {
        private Button mbtn3;
        private TextView tv1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_button);
            mbtn3=findViewById(R.id.btn_3);
            mbtn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(ButtonActivity.this,"button3被点击了",Toast.LENGTH_LONG).show();
                }
            });
            tv1=findViewById(R.id.tv_1);
            tv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(ButtonActivity.this,"tv1被点击了",Toast.LENGTH_LONG).show();
                }
            });
        }
        public void showToast(View view){
            Toast.makeText(this,"button4被点击了",Toast.LENGTH_LONG).show();
        }
    }
