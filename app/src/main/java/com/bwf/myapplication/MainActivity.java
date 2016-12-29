package com.bwf.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.jpush.android.api.JPushInterface;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JPushInterface.init(this);
    }
}
