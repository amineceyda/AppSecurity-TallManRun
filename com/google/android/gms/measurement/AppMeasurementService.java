package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zzcl;
import e.j.a.a;
import g.e.a.b.f.b.f3;
import g.e.a.b.f.b.g5;
import g.e.a.b.f.b.i8;
import g.e.a.b.f.b.k8;
import g.e.a.b.f.b.k9;
import g.e.a.b.f.b.l8;
import g.e.a.b.f.b.m8;
import g.e.a.b.f.b.n4;
import java.util.Objects;

public final class AppMeasurementService extends Service implements l8 {
    public m8 b;

    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a.b;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0) {
            SparseArray<PowerManager.WakeLock> sparseArray2 = a.b;
            synchronized (sparseArray2) {
                PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            }
        }
    }

    public final boolean b(int i2) {
        return stopSelfResult(i2);
    }

    public final void c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final m8 d() {
        if (this.b == null) {
            this.b = new m8(this);
        }
        return this.b;
    }

    public IBinder onBind(Intent intent) {
        m8 d2 = d();
        Objects.requireNonNull(d2);
        if (intent == null) {
            d2.c().f3136f.a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new g5(k9.O(d2.a));
        }
        d2.c().f3139i.b("onBind received unknown action", action);
        return null;
    }

    public void onCreate() {
        super.onCreate();
        n4.u(d().a, (zzcl) null, (Long) null).d().n.a("Local AppMeasurementService is starting up");
    }

    public void onDestroy() {
        n4.u(d().a, (zzcl) null, (Long) null).d().n.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        d().a(intent);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        m8 d2 = d();
        f3 d3 = n4.u(d2.a, (zzcl) null, (Long) null).d();
        if (intent == null) {
            d3.f3139i.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        d3.n.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        i8 i8Var = new i8(d2, i3, d3, intent);
        k9 O = k9.O(d2.a);
        O.b().r(new k8(O, i8Var));
        return 2;
    }

    public boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
