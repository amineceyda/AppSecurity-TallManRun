package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AnalyticsService extends Service {
    public IBinder onBind(Intent intent) {
        return null;
    }
}
