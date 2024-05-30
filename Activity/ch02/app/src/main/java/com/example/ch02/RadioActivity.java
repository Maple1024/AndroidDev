package com.example.ch02;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RadioActivity extends AppCompatActivity {
    private RadioGroup mRg1;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_radio_button);
        mRg1=findViewById(R.id.rg_1);


    }
}
