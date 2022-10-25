package com.tencent.beacon.base.net.call;

public class h implements Runnable {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ j b;

    public h(j jVar, Callback callback) {
        this.b = jVar;
        this.a = callback;
    }

    public void run() {
        this.b.b((Callback<byte[]>) this.a);
    }
}
