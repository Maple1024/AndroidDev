package com.example.ch02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RecyclerViewActivity extends AppCompatActivity {
    private Button mBtnLiner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        mBtnLiner=findViewById(R.id.btn_linear);
        mBtnLiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(RecyclerViewActivity.this, LinearRecyclerViewActivity.class);
                startActivity(intent);

            }
        });
    }
}
