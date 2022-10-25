package com.google.firebase.auth.api.fallback.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FirebaseAuthFallbackService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }
}
