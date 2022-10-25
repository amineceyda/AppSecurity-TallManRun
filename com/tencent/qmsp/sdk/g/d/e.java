package com.tencent.qmsp.sdk.g.d;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;
import com.tencent.qmsp.sdk.base.f;

public class e implements b, c {
    private b a;
    private Context b;
    private IVendorCallback c;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.a.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r2 = this;
            boolean r0 = r2.e()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0012
            com.tencent.qmsp.sdk.g.d.b r0 = r2.a
            java.lang.String r0 = r0.b()
            if (r0 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = r0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.d.e.a():java.lang.String");
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        if (b.a(context)) {
            String a2 = f.a(context);
            if (!TextUtils.isEmpty(a2)) {
                b.a(context, a2);
            }
            this.a = new b(context, this);
            this.c = iVendorCallback;
            this.b = context;
        }
    }

    public void a(boolean z) {
        IVendorCallback iVendorCallback = this.c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(e(), b(), a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.a.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b() {
        /*
            r2 = this;
            boolean r0 = r2.e()
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0012
            com.tencent.qmsp.sdk.g.d.b r0 = r2.a
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = r0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.g.d.e.b():java.lang.String");
    }

    public void c() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.a(f.a(this.b));
        } else {
            g();
        }
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        b bVar = this.a;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    public void f() {
        b bVar = this.a;
        if (bVar != null) {
            bVar.d();
        }
    }

    public void g() {
        IVendorCallback iVendorCallback = this.c;
        if (iVendorCallback != null) {
            iVendorCallback.onResult(false, "", "");
        }
    }
}
