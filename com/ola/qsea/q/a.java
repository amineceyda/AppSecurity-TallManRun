package com.ola.qsea.q;

import android.annotation.SuppressLint;
import com.ola.qsea.l.b;
import com.ola.qsea.p.k;
import com.ola.qsea.sdk.debug.IDebugger;
import com.ola.qsea.w.f;

public class a implements IDebugger {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    @SuppressLint({"MissingPermission"})
    public void requestQsea() {
        if (b.a()) {
            com.ola.qsea.c.a.a().a(k.a(this.a, (k.b) null));
        }
    }

    public void requestStrategy() {
        if (b.a()) {
            f.a(this.a).c();
        }
    }

    public void setDebug(boolean z) {
        b.a(z);
    }
}
