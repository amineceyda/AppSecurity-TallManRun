package com.tencent.qmsp.sdk.g.f;

import android.content.Context;
import com.tencent.qmsp.sdk.base.IVendorCallback;
import com.tencent.qmsp.sdk.base.b;
import com.tencent.qmsp.sdk.base.f;

public class a implements b {
    private Context a;

    public String a() {
        return b.b(this.a);
    }

    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = context;
    }

    public String b() {
        Context context = this.a;
        return b.a(context, f.a(context));
    }

    public void c() {
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return b.a(this.a);
    }

    public void f() {
    }
}
