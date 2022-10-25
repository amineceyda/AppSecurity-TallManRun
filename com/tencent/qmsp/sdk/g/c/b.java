package com.tencent.qmsp.sdk.g.c;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.g.c.c;

public class b implements com.tencent.qmsp.sdk.base.b, c.b {
    private c a;
    private IVendorCallback b;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r2.a.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r2 = this;
            boolean r0 = r2.e()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.tencent.qmsp.sdk.g.c.c r0 = r2.a
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.c.b.a():java.lang.String");
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.b = iVendorCallback;
        this.a = new c(context, this);
    }

    public void a(c cVar) {
        try {
            IVendorCallback iVendorCallback = this.b;
            if (iVendorCallback != null) {
                iVendorCallback.onResult(e(), b(), a());
            }
        } catch (Exception unused) {
            IVendorCallback iVendorCallback2 = this.b;
            if (iVendorCallback2 != null) {
                iVendorCallback2.onResult(false, (String) null, (String) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r2.a.c();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b() {
        /*
            r2 = this;
            boolean r0 = r2.e()
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0009
            return r1
        L_0x0009:
            com.tencent.qmsp.sdk.g.c.c r0 = r2.a
            java.lang.String r0 = r0.c()
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.c.b.b():java.lang.String");
    }

    public void c() {
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        c cVar = this.a;
        if (cVar != null) {
            return cVar.b();
        }
        return false;
    }

    public void f() {
        c cVar = this.a;
        if (cVar != null) {
            cVar.d();
        }
    }
}
