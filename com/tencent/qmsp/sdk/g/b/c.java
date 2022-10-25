package com.tencent.qmsp.sdk.g.b;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;
import com.tencent.qmsp.sdk.base.f;
import com.tencent.qmsp.sdk.g.b.a;
import java.security.MessageDigest;

public class c implements b {
    /* access modifiers changed from: private */
    public Context a;
    /* access modifiers changed from: private */
    public IVendorCallback b;
    /* access modifiers changed from: private */
    public String c = null;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f893d = false;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                a.C0019a a2 = a.a(c.this.a);
                String unused = c.this.c = a2.a();
                a2.b();
                if (!TextUtils.isEmpty(c.this.c)) {
                    boolean unused2 = c.this.f893d = true;
                }
                if (c.this.b != null) {
                    IVendorCallback d2 = c.this.b;
                    boolean c = c.this.f893d;
                    c cVar = c.this;
                    d2.onResult(c, cVar.a(f.a(cVar.a)), c.this.c);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                if (TextUtils.isEmpty(c.this.c)) {
                    boolean unused3 = c.this.f893d = false;
                }
                if (c.this.b != null) {
                    IVendorCallback d3 = c.this.b;
                    boolean c2 = c.this.f893d;
                    c cVar2 = c.this;
                    d3.onResult(c2, cVar2.a(f.a(cVar2.a)), c.this.c);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("0x1008611");
            sb.append(str);
            sb.append("0xdzfdweiwu");
            return b(sb.toString());
        } catch (Exception unused) {
            return "";
        }
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b2 : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("0");
                    sb.append(hexString);
                    hexString = sb.toString();
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    public String a() {
        return this.c;
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = context;
        this.b = iVendorCallback;
    }

    public String b() {
        return a(f.a(this.a));
    }

    public void c() {
        new Thread(new a()).start();
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void f() {
    }
}
