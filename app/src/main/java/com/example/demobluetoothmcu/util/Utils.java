package com.example.demobluetoothmcu.util;

import android.app.Application;
import android.os.Environment;

import com.example.demobluetoothmcu.MyApplication;

import java.io.File;

public class Utils {
    public static final int FILES_PERMISSIONS = 100;
    public static final String OLD_PATH = Environment.getExternalStorageDirectory() + File.separator+"errorLog"+File.separator;
    public static final String NEW_PATH = MyApplication.getMyApplicationContext().getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getPath()+File.separator;
    
}
