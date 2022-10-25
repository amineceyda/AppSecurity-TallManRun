package com.tencent.beacon.base.net.call;

public class g implements Runnable {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ j b;

    public g(j jVar, Callback callback) {
        this.b = jVar;
        this.a = callback;
    }

    public void run() {
        this.b.b((Callback<byte[]>) this.a);
    }
}
