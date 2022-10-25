package com.tencent.qmsp.sdk.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.qmsp.sdk.f.h;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f766d = {20, 96, -116, 77, 47, 50, 121};

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f767e = {20, 96, -116, 100, 33, 44, 121, -15, 42, 113, -73};

    /* renamed from: f  reason: collision with root package name */
    private static b f768f;
    private List<HandlerThread> a;
    private Handler b;
    private Handler c;

    private b() {
        this.b = null;
        this.c = null;
        this.a = new ArrayList();
        this.b = a(h.a(f766d));
        this.c = a(h.a(f767e));
    }

    private Handler a(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.a.add(handlerThread);
        return handler;
    }

    public static b e() {
        if (f768f == null) {
            synchronized (b.class) {
                if (f768f == null) {
                    f768f = new b();
                }
            }
        }
        return f768f;
    }

    public void a(Runnable runnable) {
        this.b.post(runnable);
    }

    public boolean a() {
        for (HandlerThread next : this.a) {
            if (next.getName().equalsIgnoreCase(h.a(f766d))) {
                return next.isAlive();
            }
        }
        return false;
    }

    public Looper b() {
        return this.c.getLooper();
    }

    public Looper c() {
        return this.b.getLooper();
    }

    public void d() {
        Handler handler = this.b;
        if (handler != null) {
            handler.getLooper().quit();
            this.b = null;
        }
        Handler handler2 = this.c;
        if (handler2 != null) {
            handler2.getLooper().quit();
            this.c = null;
        }
        if (f768f != null) {
            f768f = null;
        }
    }
}
