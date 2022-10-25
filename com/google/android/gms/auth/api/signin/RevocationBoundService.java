package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RevocationBoundService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }
}
