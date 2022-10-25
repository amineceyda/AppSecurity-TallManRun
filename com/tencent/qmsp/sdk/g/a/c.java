package com.tencent.qmsp.sdk.g.a;

import android.content.Context;
import android.os.IBinder;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;

public class c implements b, b {
    private IVendorCallback a;
    private String b = "";
    private String c = "";

    /* renamed from: d  reason: collision with root package name */
    private d f888d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f889e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f890f = false;

    public String a() {
        return this.b;
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = iVendorCallback;
        d dVar = new d(context);
        this.f888d = dVar;
        dVar.a((b) this);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(1:4)|5|6|(1:8)|9|10|12|(2:14|15)(1:16)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014 A[Catch:{ Exception -> 0x0016 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.tencent.qmsp.sdk.g.a.a r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r4.c()     // Catch:{ Exception -> 0x000c }
            r3.b = r1     // Catch:{ Exception -> 0x000c }
            if (r1 != 0) goto L_0x000c
            r3.b = r0     // Catch:{ Exception -> 0x000c }
        L_0x000c:
            java.lang.String r1 = r4.h()     // Catch:{ Exception -> 0x0016 }
            r3.c = r1     // Catch:{ Exception -> 0x0016 }
            if (r1 != 0) goto L_0x0016
            r3.c = r0     // Catch:{ Exception -> 0x0016 }
        L_0x0016:
            boolean r4 = r4.g()     // Catch:{ Exception -> 0x001d }
            r3.f890f = r4     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
        L_0x001e:
            r4 = 1
            r3.f889e = r4
            com.tencent.qmsp.sdk.base.IVendorCallback r4 = r3.a
            if (r4 == 0) goto L_0x002e
            boolean r0 = r3.f890f
            java.lang.String r1 = r3.c
            java.lang.String r2 = r3.b
            r4.onResult(r0, r1, r2)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.a.c.a(com.tencent.qmsp.sdk.g.a.a):void");
    }

    public IBinder asBinder() {
        return null;
    }

    public String b() {
        return this.c;
    }

    public void c() {
        this.f888d.a((b) this);
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return this.f890f;
    }

    public void f() {
        d dVar;
        if (this.f889e && (dVar = this.f888d) != null) {
            dVar.a();
        }
    }

    public void g() {
        IVendorCallback iVendorCallback = this.a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, (String) null, (String) null);
        }
    }
}
