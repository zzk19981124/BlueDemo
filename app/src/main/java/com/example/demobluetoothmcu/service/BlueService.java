package com.example.demobluetoothmcu.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class BlueService extends Service {
    private static final String TAG = "BlueService";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
