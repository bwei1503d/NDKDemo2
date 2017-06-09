package com.bwei.ndkdemo;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.getkeepsafe.relinker.ReLinker;

import java.lang.reflect.Field;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ReLinker.loadLibrary(this, "str", new ReLinker.LoadListener() {
            @Override
            public void success() {
                System.out.println("success = ");


                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, ""+ getKey(1), Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void failure(Throwable t) {
                System.out.println("failure = ");

            }
        });

//        System.out.println("savedInstanceState = " + getApplicationInfo().sourceDir);

//        Field [] fields =  Build.class.getFields() ;
//
//        for (int i=0;i<fields.length;i++){
//
//
//            try {
//                fields[i].setAccessible(true);
//
//                System.out.println("fields = " + fields[i].getName() + "   " + fields[i].get(null).toString());
//            } catch (IllegalAccessException e) {
//                e.printStackTrace();
//            }
//
//        }




    }











    public native String getKey(int type);


}
