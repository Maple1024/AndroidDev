package com.example.ch01.jump;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ch01.R;
import com.example.ch01.utils.ToastUtil;

public class AActivity extends AppCompatActivity {
    private Button mBtnJump, mBtnJumpSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Log.d("AActivity", "----onCreate----");
        Log.d("AActivity", "----taskId:" + getTaskId() + "\nhash:" + hashCode());
        logTaskName();

        mBtnJump = findViewById(R.id.btn_jump);
        mBtnJumpSelf = findViewById(R.id.btn_jump_self);

        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 显式1
                Intent intent = new Intent(AActivity.this, BActivity.class);
//                intent.putExtra()
                Bundle bundle = new Bundle();
                bundle.putString("name", "测试");
                bundle.putInt("age", 100);
                intent.putExtras(bundle);
//                startActivity(intent);
                startActivityForResult(intent, 0);
                // 显式2
//                Intent intent = new Intent();
//                intent.setClass(AActivity.this, BActivity.class);
//                startActivity(intent);

                // 显式3
//                Intent intent = new Intent();
//                intent.setClassName(AActivity.this, "com.example.phone.jump.BActivity");
//                startActivity(intent);

                // 显式4
//                Intent intent = new Intent();
//                intent.setComponent(new ComponentName(AActivity.this, "com.example.phone.jump.BActivity"));
//                startActivity(intent);

                // 隐式
//                Intent intent = new Intent();
//                intent.setAction("android.intent.action.BActivity");
//                startActivity(intent);
            }
        });

        mBtnJumpSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AActivity.this, AActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK) {
            ToastUtil.showMessage(AActivity.this, data.getExtras().getString("title"));
        }
        Log.d("AActivity", "requestCode:" + requestCode + "\nresultCode:" + resultCode);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        Log.d("AActivity", "----onCreate----");
        Log.d("AActivity", "----taskId:" + getTaskId() + "\nhash:" + hashCode());
        logTaskName();
    }

    private void logTaskName() {
        try {
            ActivityInfo info = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.d("AActivity", info.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
