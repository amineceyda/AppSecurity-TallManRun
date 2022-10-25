package com.tencent.qmsp.sdk.g.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.tencent.qmsp.sdk.base.c;
import com.tencent.qmsp.sdk.g.b.d;

public class a {

    /* renamed from: com.tencent.qmsp.sdk.g.b.a$a  reason: collision with other inner class name */
    public static final class C0019a {
        private final String a;
        private final boolean b;

        public C0019a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    public static C0019a a(Context context) {
        String str;
        String str2;
        String a = a();
        StringBuilder i2 = g.a.a.a.a.i("getAdvertisingIdInfo ");
        i2.append(System.currentTimeMillis());
        Log.i(a, i2.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.huawei.hwid", 0);
                b bVar = new b();
                Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
                intent.setPackage("com.huawei.hwid");
                if (context.bindService(intent, bVar, 1)) {
                    Log.i(a(), "bind ok");
                    try {
                        if (!bVar.a) {
                            bVar.a = true;
                            d a2 = d.a.a(bVar.b.take());
                            C0019a aVar = new C0019a(a2.i(), a2.f());
                            context.unbindService(bVar);
                            return aVar;
                        }
                        throw new IllegalStateException();
                    } catch (RemoteException unused) {
                        str2 = "bind hms service RemoteException";
                        try {
                            c.b(str2);
                            return null;
                        } finally {
                            context.unbindService(bVar);
                        }
                    } catch (Throwable unused2) {
                        str2 = "bind hms service InterruptedException";
                        c.b(str2);
                        return null;
                    }
                } else {
                    str = "bind failed";
                    c.b(str);
                    return null;
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = "HMS not found";
            }
        } else {
            c.b("Cannot be called from the main thread");
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    private static String a() {
        return "AdId";
    }
}
