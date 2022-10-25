package com.apkpure.aegon.app.event;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.aegon.components.models.AssetInfo;
import e.e.d.l.a;
import g.c.a.b.d.b;

public class SystemPackageEvent$Receiver extends BroadcastReceiver {
    public boolean a = true;
    public Context b;
    public b c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f260d = false;

    public SystemPackageEvent$Receiver() {
    }

    public SystemPackageEvent$Receiver(Context context, b bVar) {
        this.b = context;
        this.c = bVar;
    }

    public final void a(int i2) {
        if (!this.f260d) {
            IntentFilter intentFilter = new IntentFilter(RealApplicationLike.MAIN_PROCESS_NAME);
            intentFilter.setPriority(i2);
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            this.b.registerReceiver(this, intentFilter);
            this.f260d = true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            if (this.a) {
                a.O(context, "PACKAGE_ADDED", a.a(intent), (AssetInfo) null);
            } else {
                this.c.a(context, a.a(intent));
            }
        } else if (!"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
        } else {
            if (this.a) {
                a.O(context, "PACKAGE_REMOVED", a.a(intent), (AssetInfo) null);
            } else {
                this.c.b(context, a.a(intent));
            }
        }
    }
}
