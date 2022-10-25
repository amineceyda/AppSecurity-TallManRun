package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FirebaseMessagingService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }
}
