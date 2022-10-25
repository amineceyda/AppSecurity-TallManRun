package com.tencent.qmsp.sdk.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class f {
    public static NetworkInfo a(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            g.b("Qp.NU", 0, th.toString());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = a(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.net.NetworkInfo r2 = a(r2)
            r1 = 1
            if (r2 == 0) goto L_0x0012
            int r2 = r2.getType()
            if (r2 != r1) goto L_0x0012
            r0 = 1
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.f.f.b(android.content.Context):boolean");
    }
}
