package com.example.wenscript.myapplication;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    /*
    本例讲的是ClipDrawable的使用
     */
    private ImageView imageView;
    private int level=0;
    private ClipDrawable cd;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0x1234){
                cd.setLevel(level);
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= (ImageView) findViewById(R.id.beauty);
        cd= (ClipDrawable) imageView.getDrawable();
        final Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                level=level+500;
                handler.sendEmptyMessage(0x1234);
                if (level>10000){
                    timer.cancel();
                }
            }
        },0,300);
    }}
