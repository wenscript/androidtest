package com.example.wenscript.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.IOException;

/*
主要是探讨Bitmap的一些方法
 */
public class MainActivity extends AppCompatActivity {
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image= (ImageView) findViewById(R.id.image);
        /*
        得到Bitmap有两种方式：1、BitmapDrawable 2、BitmapFactory
         */
//        try {
//            BitmapDrawable drawable=new BitmapDrawable(getResources(),getAssets().open("beauty1.jpg"));
//            Bitmap b1=drawable.getBitmap();
//            image.setImageBitmap(b1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Bitmap bitmap=BitmapFactory.decodeResource(getResources(),R.mipmap.beauty1);
//        image.setImageBitmap(bitmap);
        Bitmap bitmap1=Bitmap.createBitmap(bitmap,100,100,300,300);
//        image.setImageBitmap(bitmap1);
        
    }
}
