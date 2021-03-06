package com.yc.waterfalldemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yc.waterfalldemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.tv_001).setOnClickListener(this);
        findViewById(R.id.tv_002).setOnClickListener(this);
        findViewById(R.id.tv_003).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_001:
                Intent intent1 = new Intent(this, WaterfallActivity.class);
                startActivity(intent1);
                break;
            case R.id.tv_002:
                Intent intent2 = new Intent(this, WaterfallImageActivity.class);
                startActivity(intent2);
                break;
            case R.id.tv_003:
                Intent intent3 = new Intent(this, LoadMoreWaterfallActivity.class);
                startActivity(intent3);
                break;
        }
    }
}