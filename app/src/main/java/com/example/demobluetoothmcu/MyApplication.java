package com.example.demobluetoothmcu;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.example.demobluetoothmcu.util.CrashHandler;
import com.example.demobluetoothmcu.util.Utils;

public class MyApplication extends Application {
    public static final String TAG = "MyApplication";
    private static Context mContext;
    public static  boolean isNew = false;
    public static String PATH;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
        mContext = this;
        CrashHandler.getInstance().init(mContext);//配置-抓取崩溃日志
        checkCurApi();//检查当前api的版本
    }

    private void checkCurApi() {
        isNew = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O;
        PATH = isNew?Utils.NEW_PATH:Utils.OLD_PATH;
    }

    public static Context getMyApplicationContext(){
        return mContext;
    }
}
