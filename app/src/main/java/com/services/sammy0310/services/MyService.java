package com.services.sammy0310.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }


    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service destroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    long time = System.currentTimeMillis() +4000;
                    while(System.currentTimeMillis()<time){
                        synchronized (this){
                            try{
                                wait(time-System.currentTimeMillis());

                                Log.i("sam","service in background");
                                Toast.makeText(getApplicationContext(),"Service doing something in background",Toast.LENGTH_SHORT).show();

                                  MainActivity.set("Service executing in background ");

                            }catch(Exception e){}
                        }
                    }
                }
            }
        };

        Thread serviceThread = new Thread(r);
        serviceThread.start();
        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
