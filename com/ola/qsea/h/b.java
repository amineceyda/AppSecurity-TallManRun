package com.ola.qsea.h;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import com.ola.qsea.j.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b extends BroadcastReceiver implements Runnable {
    public static b a;
    public final Map<c, String> b = new ConcurrentHashMap();
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f440d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f441e = true;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f442f = false;

    /* renamed from: g  reason: collision with root package name */
    public ConnectivityManager f443g;

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void a(Context context) {
        if (this.b.isEmpty()) {
            this.c = a.b();
            if (Build.VERSION.SDK_INT >= 21) {
                b();
                this.f443g = (ConnectivityManager) context.getSystemService("connectivity");
                e();
            } else {
                b(context);
            }
        }
    }

    public synchronized void a(String str) {
        for (Map.Entry next : this.b.entrySet()) {
            if (str.equals(next.getValue())) {
                this.b.remove(next.getKey());
            }
        }
    }

    public synchronized void a(String str, c cVar) {
        this.b.put(cVar, str);
    }

    public final void b() {
        this.f440d = new a(this);
    }

    public final void b(Context context) {
        if (context == null) {
            com.ola.qsea.m.a.b("[net] context == null!", new Object[0]);
            return;
        }
        try {
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            com.ola.qsea.m.a.d("Broadcast register!", new Object[0]);
        } catch (Exception e2) {
            com.ola.qsea.m.a.a((Throwable) e2);
        }
    }

    public final void c() {
        for (c a2 : this.b.keySet()) {
            a2.a();
        }
    }

    public synchronized void c(Context context) {
        if (this.b.isEmpty()) {
            d(context);
        }
    }

    public final void d() {
        for (c b2 : this.b.keySet()) {
            b2.b();
        }
    }

    public final void d(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            ConnectivityManager connectivityManager = this.f443g;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.f440d);
            }
        } else if (context == null) {
            com.ola.qsea.m.a.b("[net] context == null!", new Object[0]);
        } else {
            try {
                context.unregisterReceiver(this);
                com.ola.qsea.m.a.d("Broadcast unregister!", new Object[0]);
            } catch (Exception e2) {
                com.ola.qsea.m.a.a((Throwable) e2);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void e() {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(1);
        builder.addTransportType(0);
        builder.addTransportType(3);
        ConnectivityManager connectivityManager = this.f443g;
        if (connectivityManager != null) {
            try {
                connectivityManager.registerNetworkCallback(builder.build(), this.f440d);
            } catch (SecurityException e2) {
                com.ola.qsea.m.a.a((Throwable) e2);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f441e) {
            this.f441e = false;
        } else if (!this.f442f) {
            com.ola.qsea.c.a.a().a(this);
        }
    }

    @SuppressLint({"MissingPermission"})
    public void run() {
        this.f442f = true;
        if (a.b()) {
            com.ola.qsea.m.a.d("[net] current network available!", new Object[0]);
            c();
        } else {
            com.ola.qsea.m.a.d("[net] current network unavailable!", new Object[0]);
            d();
        }
        this.f442f = false;
    }
}
