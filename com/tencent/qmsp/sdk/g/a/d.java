package com.tencent.qmsp.sdk.g.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.qmsp.sdk.base.c;
import com.tencent.qmsp.sdk.g.a.a;

public class d {
    public boolean a = false;
    public Context b;
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public b f891d;

    /* renamed from: e  reason: collision with root package name */
    public ServiceConnection f892e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.a("HSDID did service binded");
            d.this.c = a.C0017a.a(iBinder);
            d.this.a(true);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            d.this.a(false);
        }
    }

    public d(Context context) {
        this.b = context;
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            try {
                this.f891d.a(this.c);
            } catch (Exception e2) {
                StringBuilder i2 = g.a.a.a.a.i("HSDID notify did bind status error :");
                i2.append(e2.getMessage());
                c.b(i2.toString());
            }
        } else {
            this.f891d.g();
        }
    }

    public void a() {
        try {
            if (this.a && this.f892e != null && this.b != null) {
                c.a("HSDID start to unbind did service");
                this.a = false;
                this.b.unbindService(this.f892e);
            }
        } catch (Exception e2) {
            StringBuilder i2 = g.a.a.a.a.i("HSDID error:");
            i2.append(e2.getMessage());
            c.b(i2.toString());
        }
    }

    public void a(b bVar) {
        try {
            this.f891d = bVar;
            Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
            ComponentName componentName = new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService");
            Intent intent2 = new Intent(intent);
            intent2.setComponent(componentName);
            c.a("HSDID start to bind did service");
            boolean bindService = this.b.bindService(intent2, this.f892e, 1);
            this.a = bindService;
            if (!bindService) {
                this.f891d.g();
            }
        } catch (Exception unused) {
            a(false);
        }
    }
}
