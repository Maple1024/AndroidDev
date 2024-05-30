package com.example.ch02;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RadioMainActivity extends AppCompatActivity {
    private Button mbtnTextView;
    private Button mbtnButton;
    private Button mbtnEditText;
    private Button mbtnRadioButton;
    private Button mbtnCheckBox;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mbtnTextView=findViewById(R.id.btn_textview);
        mbtnButton=findViewById(R.id.btn_button);
        mbtnEditText=findViewById(R.id.btn_edittext);
        mbtnRadioButton=findViewById(R.id.btn_radiobutton);
        mbtnCheckBox=findViewById(R.id.btn_checkbox);
        setListeners();
    }

    private void setListeners() {
        Onclick onclick=new Onclick();
        mbtnRadioButton.setOnClickListener(onclick);
        mbtnEditText.setOnClickListener(onclick);
        mbtnButton.setOnClickListener(onclick);
        mbtnTextView.setOnClickListener(onclick);
        mbtnCheckBox.setOnClickListener(onclick);
    }
    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=null;
//            switch(v.getId()){
//                case R.id.btn_textview:
//                    intent=new Intent(RadioMainActivity.this,TestViewActivity.class);
//                    break;
//                case R.id.btn_button:
//                    intent=new Intent(RadioMainActivity.this,ButtonActivity.class);
//                    break;
//                case R.id.btn_edittext:
//                    intent=new Intent(RadioMainActivity.this,EditTextActivity.class);
//                    break;
//                case R.id.btn_radiobutton:
//                    intent=new Intent(RadioMainActivity.this,RadioActivity.class);
//                    break;
//                default:
//                    //log an error or do nothing
//                    break;
//            }
            if(v.getId()==R.id.btn_textview)
                intent=new Intent(RadioMainActivity.this,TestViewActivity.class);
            if(v.getId()==R.id.btn_button)
                intent=new Intent(RadioMainActivity.this,ButtonActivity.class);
            if(v.getId()==R.id.btn_edittext)
                intent=new Intent(RadioMainActivity.this,EditTextActivity.class);
            if(v.getId()==R.id.btn_radiobutton)
                intent=new Intent(RadioMainActivity.this,RadioActivity.class);
            if(v.getId()==R.id.btn_checkbox)
                intent=new Intent(RadioMainActivity.this,CheckBoxActivity.class);
            startActivity(intent);

        }
    }

}
