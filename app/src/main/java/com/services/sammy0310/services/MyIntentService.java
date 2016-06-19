package com.services.sammy0310.services;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by sammy on 19-06-2016.
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Toast.makeText(this,"Service Started",Toast.LENGTH_SHORT).show();
    }
}
