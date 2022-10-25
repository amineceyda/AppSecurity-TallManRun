package com.tencent.beacon.base.net;

import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.util.c;

public class a implements Callback<byte[]> {
    public final /* synthetic */ JceRequestEntity a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Callback c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f620d;

    public a(c cVar, JceRequestEntity jceRequestEntity, boolean z, Callback callback) {
        this.f620d = cVar;
        this.a = jceRequestEntity;
        this.b = z;
        this.c = callback;
    }

    /* renamed from: a */
    public void onResponse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            onFailure(new d(this.a.getType().name(), this.b ? "402" : "452", 200, "raw response == null", (Throwable) null));
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("jceRequest: ");
            sb.append(this.a.getType());
            sb.append(" request success!");
            c.a("[BeaconNet]", sb.toString(), new Object[0]);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mode: ");
            sb2.append(this.b ? "socket" : "http");
            c.a("[BeaconNet]", sb2.toString(), new Object[0]);
            this.c.onResponse(bArr);
            this.f620d.f();
        } catch (Exception e2) {
            Exception exc = e2;
            onFailure(new d(this.a.getType().name(), this.b ? "403" : "453", 200, exc.getMessage(), exc));
        }
    }

    public void onFailure(d dVar) {
        StringBuilder i2 = g.a.a.a.a.i("jceRequest: ");
        i2.append(dVar.toString());
        c.a("[BeaconNet]", i2.toString(), new Object[0]);
        this.f620d.a(dVar);
        this.c.onFailure(dVar);
        this.f620d.f();
    }
}
