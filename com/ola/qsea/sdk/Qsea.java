package com.ola.qsea.sdk;

import android.text.TextUtils;
import com.ola.qsea.w.d;
import g.a.a.a.a;

public final class Qsea {
    public String a;
    public String b;
    public String c;

    public Qsea() {
        this("", "");
    }

    public Qsea(String str, String str2) {
        this.b = str == null ? "" : str;
        this.c = str2 == null ? "" : str2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String getQsea16() {
        return !d.a(this.a).v() ? "" : this.b;
    }

    public String getQsea36() {
        return !d.a(this.a).t() ? "" : this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEmpty() {
        /*
            r1 = this;
            java.lang.String r0 = r1.b
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0015
        L_0x000a:
            java.lang.String r0 = r1.c
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ola.qsea.sdk.Qsea.isEmpty():boolean");
    }

    public void setAppKey(String str) {
        this.a = str;
    }

    public String toString() {
        String str;
        StringBuilder i2 = a.i("Qsea:");
        i2.append(this.b);
        if (TextUtils.isEmpty(this.c)) {
            str = "";
        } else {
            StringBuilder i3 = a.i("\nQsea36:");
            i3.append(this.c);
            str = i3.toString();
        }
        i2.append(str);
        return i2.toString();
    }
}
