package com.ola.qsea.l;

import com.ola.qsea.m.a;

public class i {
    public final Object a;
    public int b;

    public i(Object obj, int i2) {
        this.a = obj;
        this.b = i2;
    }

    public void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    public void b() {
        try {
            synchronized (this.a) {
                this.a.wait((long) this.b);
            }
        } catch (InterruptedException e2) {
            a.a((Throwable) e2);
        }
    }
}
