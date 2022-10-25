package com.tencent.qmsp.sdk.g.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.qmsp.sdk.g.c.a;
import java.util.Objects;

public class c {

    /* renamed from: e  reason: collision with root package name */
    private static String f894e = "LXOP";
    private Context a = null;
    public a b;
    private ServiceConnection c;

    /* renamed from: d  reason: collision with root package name */
    public b f895d = null;

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                c.this.b = a.C0021a.a(iBinder);
                c cVar = c.this;
                b bVar = cVar.f895d;
                if (bVar != null) {
                    bVar.a(cVar);
                }
                c.this.b("Service onServiceConnected");
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            c cVar = c.this;
            cVar.b = null;
            cVar.b("Service onServiceDisconnected");
        }
    }

    public interface b {
        void a(c cVar);
    }

    public c(Context context, b bVar) {
        String str;
        Objects.requireNonNull(context, "Context can not be null.");
        this.a = context;
        this.f895d = bVar;
        this.c = new a();
        Intent intent = new Intent();
        intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
        if (this.a.bindService(intent, this.c, 1)) {
            str = "bindService Successful!";
        } else {
            b bVar2 = this.f895d;
            if (bVar2 != null) {
                bVar2.a(this);
            }
            str = "bindService Failed!!!";
        }
        b(str);
    }

    private void a(String str) {
        com.tencent.qmsp.sdk.base.c.b(f894e + " " + str);
    }

    /* access modifiers changed from: private */
    public void b(String str) {
        com.tencent.qmsp.sdk.base.c.a(f894e + " " + str);
    }

    public String a() {
        if (this.a != null) {
            try {
                a aVar = this.b;
                if (aVar != null) {
                    return aVar.g();
                }
                return null;
            } catch (Exception e2) {
                a("getOAID error, RemoteException!");
                e2.printStackTrace();
                return null;
            }
        } else {
            a("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
    }

    public boolean b() {
        try {
            if (this.b == null) {
                return false;
            }
            b("Device support opendeviceid");
            return this.b.c();
        } catch (Exception unused) {
            a("isSupport error, RemoteException!");
            return false;
        }
    }

    public String c() {
        Context context = this.a;
        if (context != null) {
            String packageName = context.getPackageName();
            b(g.a.a.a.a.w("liufeng, getAAID package：", packageName));
            if (packageName == null || packageName.equals("")) {
                b("input package is null!");
                return null;
            }
            try {
                a aVar = this.b;
                if (aVar != null) {
                    return aVar.b(packageName);
                }
                return null;
            } catch (Exception unused) {
                a("getAAID error, RemoteException!");
                return null;
            }
        } else {
            b("Context is null.");
            throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
        }
    }

    public void d() {
        try {
            this.a.unbindService(this.c);
            b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            a("unBind Service exception");
        }
        this.b = null;
    }
}
