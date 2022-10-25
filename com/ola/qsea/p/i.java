package com.ola.qsea.p;

import com.ola.qsea.sdk.Qsea;

public class i implements Runnable {
    public final /* synthetic */ k a;

    public i(k kVar) {
        this.a = kVar;
    }

    public void run() {
        Qsea m2 = p.m(this.a.f491j);
        if (m2 != null && !m2.isEmpty()) {
            this.a.d();
        } else if (this.a.c.getAndIncrement() <= 30) {
            this.a.f();
        }
    }
}
