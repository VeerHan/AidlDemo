package com.leohan.aidldemo2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MyService extends Service {


    @Override
    public IBinder onBind(Intent intent) {
        return new IMyAidlInterface.Stub() {
            @Override
            public int add(int a, int b) throws RemoteException {
                int result = a + b;
                Log.d("test", "Service result = " + result);
                return result;
            }
        };
    }
}
