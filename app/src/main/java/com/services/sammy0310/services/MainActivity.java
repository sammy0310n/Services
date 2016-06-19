package com.services.sammy0310.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  static TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      t =  (TextView) findViewById(R.id.textView);
        Intent i = new Intent(this,MyService.class);
        startService(i);

    }
    public static void set(String s){
        t.setText(s);
    }
}

