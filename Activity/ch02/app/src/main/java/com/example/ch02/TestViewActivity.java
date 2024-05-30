package com.example.ch02;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestViewActivity extends AppCompatActivity {
    private TextView mTv4,mTv5,mTv6,mTv7;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4=findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        //中划线
        mTv4.getPaint().setAntiAlias(true);
        //去除锯齿
        mTv5=findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);
        //下划线
        mTv6=findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>玛卡巴卡</u>"));
        //利用html语言实现下划线
        mTv7=findViewById(R.id.tv_7);
        mTv7.setSelected(true);

    }
}
