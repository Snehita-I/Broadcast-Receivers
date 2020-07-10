package com.example.broadcastreceivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void custom(View view){
         Intent i1 = new Intent();
         i1.setAction("my.own.receiver");
         i1.addCategory("android.intent.category.DEFAULT");
         sendBroadcast(i1);
    }
}