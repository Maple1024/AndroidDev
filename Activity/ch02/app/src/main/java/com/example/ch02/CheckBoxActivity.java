package com.example.ch02;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.CheckBox;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox mCb5,mCb6;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
    }
}
