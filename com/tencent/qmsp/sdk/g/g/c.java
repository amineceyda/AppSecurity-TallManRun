package com.tencent.qmsp.sdk.g.g;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;

public class c implements b {
    /* access modifiers changed from: private */
    public Context a = null;
    /* access modifiers changed from: private */
    public IVendorCallback b = null;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Thread.sleep(1000);
                if (c.this.b != null) {
                    c.this.b.onResult(b.a(), b.a(c.this.a), b.b(c.this.a));
                }
            } catch (Exception e2) {
                if (c.this.b != null) {
                    c.this.b.onResult(false, (String) null, (String) null);
                }
                e2.printStackTrace();
            }
        }
    }

    public String a() {
        return "";
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = context;
        this.b = iVendorCallback;
        b.c(context);
    }

    public String b() {
        return "";
    }

    public void c() {
        new Thread(new a()).start();
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return b.a();
    }

    public void f() {
    }
}
