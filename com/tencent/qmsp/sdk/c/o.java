package com.tencent.qmsp.sdk.c;

import java.util.concurrent.atomic.AtomicInteger;

public class o {
    private AtomicInteger a = new AtomicInteger(0);

    public boolean a() {
        int i2;
        do {
            i2 = this.a.get();
            if ((i2 & 1) != 0) {
                return false;
            }
        } while (!this.a.compareAndSet(i2, i2 + 2));
        return true;
    }

    public void b() {
        int i2;
        do {
            i2 = this.a.get();
            if ((i2 & -2) != 0) {
                if ((i2 & 1) == 0) {
                } else if ((this.a.addAndGet(-2) & -2) == 0) {
                    synchronized (this.a) {
                        this.a.notifyAll();
                    }
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.a.compareAndSet(i2, i2 - 2));
    }

    public void c() {
        int i2;
        if (!this.a.compareAndSet(0, 1) && !this.a.compareAndSet(1, 1)) {
            do {
                i2 = this.a.get();
            } while (!this.a.compareAndSet(i2, i2 | 1));
            synchronized (this.a) {
                try {
                    this.a.wait();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
