package com.tencent.qmsp.sdk.g.h;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.qmsp.sdk.base.c;
import com.tencent.qmsp.sdk.g.h.a;
import java.util.Objects;

public class b {

    /* renamed from: e  reason: collision with root package name */
    private static String f906e = "SDI";

    /* renamed from: f  reason: collision with root package name */
    public static String f907f = "SI";
    public C0028b a = null;
    private ServiceConnection b;
    private Context c = null;

    /* renamed from: d  reason: collision with root package name */
    public a f908d;

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                b.this.f908d = a.C0026a.a(iBinder);
                b bVar = b.this;
                C0028b bVar2 = bVar.a;
                if (bVar2 != null) {
                    bVar2.a(bVar);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(b.f907f);
                sb.append(" Service onServiceConnected");
                c.c(sb.toString());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            b.this.f908d = null;
            c.c(b.f907f + " Service onServiceDisconnected");
        }
    }

    /* renamed from: com.tencent.qmsp.sdk.g.h.b$b  reason: collision with other inner class name */
    public interface C0028b {
        void a(b bVar);
    }

    public b(Context context, C0028b bVar) {
        Objects.requireNonNull(context, "Context can not be null.");
        this.c = context;
        this.a = bVar;
        this.b = new a();
    }

    public String a() {
        String str;
        StringBuilder sb;
        Context context = this.c;
        if (context != null) {
            String packageName = context.getPackageName();
            c.a(f907f + "apackage：" + packageName);
            if (packageName == null || packageName.equals("")) {
                sb = new StringBuilder();
                sb.append(f907f);
                str = " input package is null!";
            } else {
                try {
                    a aVar = this.f908d;
                    if (aVar == null) {
                        return null;
                    }
                    String a2 = aVar.a(packageName);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f907f);
                    sb2.append(" getAAID Package: ");
                    sb2.append(packageName);
                    c.a(sb2.toString());
                    return a2;
                } catch (Exception unused) {
                    sb = new StringBuilder();
                    sb.append(f907f);
                    str = " geta error, RemoteException!";
                }
            }
            sb.append(str);
            c.c(sb.toString());
            return null;
        }
        c.c(f907f + " Context is null.");
        throw new IllegalArgumentException("Context is null, must be new SxCore first");
    }

    public String b() {
        if (this.c != null) {
            try {
                a aVar = this.f908d;
                if (aVar == null) {
                    return null;
                }
                String a2 = aVar.a();
                StringBuilder sb = new StringBuilder();
                sb.append(f906e);
                sb.append(" geto call");
                c.c(sb.toString());
                return a2;
            } catch (Exception e2) {
                c.c(f907f + " geto error, RemoteException!");
                e2.printStackTrace();
                return null;
            }
        } else {
            c.c(f907f + " Context is null.");
            throw new IllegalArgumentException("Context is null, must be new SxCore first");
        }
    }

    public void c() {
        StringBuilder sb;
        String str;
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (this.c.bindService(intent, this.b, 1)) {
            sb = new StringBuilder();
            sb.append(f907f);
            str = " bindService Successful!";
        } else {
            this.a.a(this);
            sb = new StringBuilder();
            sb.append(f907f);
            str = " bindService Failed!";
        }
        sb.append(str);
        c.c(sb.toString());
    }

    public boolean d() {
        try {
            if (this.f908d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(f907f);
                sb.append(" Device not support opendeviceid");
                c.c(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f907f);
            sb2.append(" Device support opendeviceid");
            c.c(sb2.toString());
            return true;
        } catch (Exception unused) {
            c.c(f907f + " isSupport error, RemoteException!");
            return false;
        }
    }

    public void e() {
        try {
            this.c.unbindService(this.b);
            StringBuilder sb = new StringBuilder();
            sb.append(f907f);
            sb.append(" unBind Service successful");
            c.c(sb.toString());
        } catch (IllegalArgumentException unused) {
            c.c(f907f + " unBind Service exception");
        }
        this.f908d = null;
    }
}
