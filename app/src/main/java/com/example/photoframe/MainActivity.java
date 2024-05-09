package com.example.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int n=1;
    public void funcNext(View view){
        n=n+1;
        if(n==6) {
            n = 1;
        }
        func1(view,n);
    }
    public void funcPrev(View view){
        n=n-1;
        if(n==0){
            n=5;
        }
        func2(view,n);
    }
    public void func1(View view,int  n){
        ImageView img= findViewById(R.id.imageView2);
        img.setTranslationX(-2000f);
        if(n==1){
            img.setImageResource(R.drawable.a);
        }
        else if(n==2){
            img.setImageResource(R.drawable.b);
        }
        else if(n==3){
            img.setImageResource(R.drawable.c);
        }
        else if(n==4){
            img.setImageResource(R.drawable.d);
        }
        else if(n==5){
            img.setImageResource(R.drawable.e);
        }
        img.animate().translationXBy(2000f).setDuration(500);
    }
    public void func2(View view,int  n){
        ImageView img= findViewById(R.id.imageView2);
        img.setTranslationX(2000f);
        if(n==1){
            img.setImageResource(R.drawable.a);
        }
        else if(n==2){
            img.setImageResource(R.drawable.b);
        }
        else if(n==3){
            img.setImageResource(R.drawable.c);
        }
        else if(n==4){
            img.setImageResource(R.drawable.d);
        }
        else if(n==5){
            img.setImageResource(R.drawable.e);
        }
        img.animate().translationXBy(-2000f).setDuration(500);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}