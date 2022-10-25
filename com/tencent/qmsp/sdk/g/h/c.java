package com.tencent.qmsp.sdk.g.h;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;
import com.tencent.qmsp.sdk.g.h.b;

public class c implements b, b.C0028b {
    public IVendorCallback a;
    private b b;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r2.b.b();
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
            com.tencent.qmsp.sdk.g.h.b r0 = r2.b
            java.lang.String r0 = r0.b()
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.h.c.a():java.lang.String");
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = iVendorCallback;
        b bVar = new b(context, this);
        this.b = bVar;
        bVar.c();
    }

    public void a(b bVar) {
        IVendorCallback iVendorCallback = this.a;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), b(), a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0 = r2.b.a();
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
            com.tencent.qmsp.sdk.g.h.b r0 = r2.b
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.h.c.b():java.lang.String");
    }

    public void c() {
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        b bVar = this.b;
        if (bVar != null) {
            return bVar.d();
        }
        return false;
    }

    public void f() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.e();
        }
    }
}
