package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zzcl;
import e.j.a.a;
import g.e.a.b.f.b.d3;
import g.e.a.b.f.b.f3;
import g.e.a.b.f.b.n4;
import g.e.a.b.f.b.x3;
import g.e.a.b.f.b.y3;
import java.util.Objects;

public final class AppMeasurementReceiver extends a implements x3 {

    /* renamed from: d  reason: collision with root package name */
    public y3 f377d;

    public void onReceive(Context context, Intent intent) {
        String str;
        d3 d3Var;
        if (this.f377d == null) {
            this.f377d = new y3(this);
        }
        y3 y3Var = this.f377d;
        Objects.requireNonNull(y3Var);
        f3 d2 = n4.u(context, (zzcl) null, (Long) null).d();
        if (intent == null) {
            d3Var = d2.f3139i;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            d2.n.b("Local receiver got", action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                d2.n.a("Starting wakeful intent.");
                Objects.requireNonNull((AppMeasurementReceiver) y3Var.a);
                SparseArray<PowerManager.WakeLock> sparseArray = a.b;
                synchronized (sparseArray) {
                    int i2 = a.c;
                    int i3 = i2 + 1;
                    a.c = i3;
                    if (i3 <= 0) {
                        a.c = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i2);
                    ComponentName startService = context.startService(className);
                    if (startService != null) {
                        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                        newWakeLock.setReferenceCounted(false);
                        newWakeLock.acquire(60000);
                        sparseArray.put(i2, newWakeLock);
                    }
                }
                return;
            } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                d3Var = d2.f3139i;
                str = "Install Referrer Broadcasts are deprecated";
            } else {
                return;
            }
        }
        d3Var.a(str);
    }
}
