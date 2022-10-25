package com.tencent.beacon.base.net.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.beacon.base.util.c;
import java.util.ArrayList;
import java.util.List;

public final class e extends BroadcastReceiver implements Runnable {
    private static final List<a> a = new ArrayList();
    private static volatile boolean b = false;
    private boolean c = true;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f623d = false;

    public interface a {
        void a();

        void b();
    }

    private void a() {
        List<a> list = a;
        synchronized (list) {
            for (a a2 : list) {
                a2.a();
            }
        }
    }

    public static void a(Context context, a aVar) {
        if (context == null) {
            c.b("[net] context == null!", new Object[0]);
            return;
        }
        List<a> list = a;
        synchronized (list) {
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
        }
        if (!b) {
            context.registerReceiver(new e(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            b = true;
        }
    }

    private void b() {
        List<a> list = a;
        synchronized (list) {
            for (a b2 : list) {
                b2.b();
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (this.c) {
            this.c = false;
        } else if (!this.f623d) {
            com.tencent.beacon.a.b.a.a().a((Runnable) this);
        }
    }

    public void run() {
        this.f623d = true;
        if (d.d()) {
            c.d("[net] current network available!", new Object[0]);
            a();
        } else {
            c.d("[net] current network unavailable!", new Object[0]);
            b();
        }
        this.f623d = false;
    }
}
