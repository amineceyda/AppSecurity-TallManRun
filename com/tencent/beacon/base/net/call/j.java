package com.tencent.beacon.base.net.call;

import com.tencent.beacon.a.b.a;
import com.tencent.beacon.base.net.c;
import java.util.Date;

public class j implements a<byte[]> {
    /* access modifiers changed from: private */
    public final JceRequestEntity a;
    /* access modifiers changed from: private */
    public long b;

    public j(JceRequestEntity jceRequestEntity) {
        this.a = jceRequestEntity;
    }

    public void a(Callback<byte[]> callback) {
        a.a().a((Runnable) new g(this, callback));
    }

    public void a(Callback<byte[]> callback, a aVar) {
        aVar.a((Runnable) new h(this, callback));
    }

    public void b(Callback<byte[]> callback) {
        this.b = new Date().getTime();
        c.c().a(this.a, (Callback<byte[]>) new i(this, callback));
    }
}
