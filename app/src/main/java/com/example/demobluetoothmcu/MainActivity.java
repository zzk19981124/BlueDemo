package com.example.demobluetoothmcu;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.demobluetoothmcu.base.BaseActivity;

import java.util.List;

//参照 https://github.com/Jasonchenlijian/FastBle/wiki

/**
 * create ak by 2021/11/25
 */
public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    private TextView test;

    @Override
    protected int getlayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        test.setText("test");

    }
//已解密
    /*
    * 1111111111111111
    * 1
    * 111
    * 1
    * 1
    *
    * */


}
