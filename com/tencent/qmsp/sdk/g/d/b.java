package com.tencent.qmsp.sdk.g.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.IBinder;
import com.tencent.qmsp.sdk.g.d.a;
import java.util.Objects;

public class b {

    /* renamed from: e  reason: collision with root package name */
    private static String f896e = "com.mdid.msa";
    private c a;
    private ServiceConnection b;
    private Context c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public a f897d;

    public class a implements ServiceConnection {
        public c a;

        public a(b bVar, c cVar) {
            this.a = cVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (this) {
                a unused = b.this.f897d = a.C0023a.a(iBinder);
                new d(b.this.f897d, this.a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            a unused = b.this.f897d = null;
            a unused2 = b.this.f897d = null;
        }
    }

    public b(Context context, c cVar) {
        Objects.requireNonNull(context, "Context can not be null.");
        this.c = context;
        this.a = cVar;
        this.b = new a(this, cVar);
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(f896e, "com.mdid.msa.service.MsaKlService");
        intent.setAction("com.bun.msa.action.start.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        try {
            intent.putExtra("com.bun.msa.param.runinset", true);
            if (context.startService(intent) != null) {
            }
        } catch (Exception unused) {
        }
    }

    public static boolean a(Context context) {
        try {
            context.getPackageManager().getPackageInfo(f896e, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public String a() {
        try {
            a aVar = this.f897d;
            return aVar == null ? "" : aVar.b();
        } catch (Exception unused) {
            return "";
        }
    }

    public void a(String str) {
        c cVar;
        Intent intent = new Intent();
        intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
        intent.setAction("com.bun.msa.action.bindto.service");
        intent.putExtra("com.bun.msa.param.pkgname", str);
        if (!this.c.bindService(intent, this.b, 1) && (cVar = this.a) != null) {
            cVar.g();
        }
    }

    public String b() {
        try {
            a aVar = this.f897d;
            return aVar == null ? "" : aVar.a();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public boolean c() {
        try {
            a aVar = this.f897d;
            if (aVar == null) {
                return false;
            }
            return aVar.d();
        } catch (Exception unused) {
            return false;
        }
    }

    public void d() {
        a aVar = this.f897d;
        if (aVar != null) {
            try {
                aVar.e();
                ServiceConnection serviceConnection = this.b;
                if (serviceConnection != null) {
                    this.c.unbindService(serviceConnection);
                }
            } catch (Exception unused) {
            }
            this.b = null;
            this.f897d = null;
        }
    }
}
