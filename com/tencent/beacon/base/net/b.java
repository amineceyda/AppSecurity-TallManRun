package com.tencent.beacon.base.net;

import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.e;
import com.tencent.beacon.base.util.c;
import g.a.a.a.a;

public class b implements Callback<BResponse> {
    public final /* synthetic */ e a;
    public final /* synthetic */ Callback b;
    public final /* synthetic */ c c;

    public b(c cVar, e eVar, Callback callback) {
        this.c = cVar;
        this.a = eVar;
        this.b = callback;
    }

    /* renamed from: a */
    public void onResponse(BResponse bResponse) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("httpRequest: ");
            sb.append(this.a.h());
            sb.append(" request success!");
            c.a("[BeaconNet]", sb.toString(), new Object[0]);
            this.b.onResponse(bResponse);
            this.c.f();
        } catch (Exception e2) {
            Exception exc = e2;
            onFailure(new d(this.a.h(), "453", 200, exc.getMessage(), exc));
        }
    }

    public void onFailure(d dVar) {
        StringBuilder i2 = a.i("httpRequest: ");
        i2.append(dVar.toString());
        c.a("[BeaconNet]", i2.toString(), new Object[0]);
        this.c.a(dVar);
        this.b.onFailure(dVar);
        this.c.f();
    }
}
