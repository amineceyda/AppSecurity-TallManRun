package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.BodyType;
import com.tencent.beacon.base.net.b.d;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.net.call.e;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k.b0;
import k.q;
import k.t;
import k.u;
import k.w;
import k.x;

public class OkHttpAdapter extends AbstractNetAdapter {
    private u client;
    /* access modifiers changed from: private */
    public int failCount;

    private OkHttpAdapter() {
        u.b bVar = new u.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.b(30000, timeUnit);
        bVar.c(10000, timeUnit);
        this.client = new u(bVar);
    }

    private OkHttpAdapter(u uVar) {
        this.client = uVar;
    }

    public static /* synthetic */ int access$008(OkHttpAdapter okHttpAdapter) {
        int i2 = okHttpAdapter.failCount;
        okHttpAdapter.failCount = i2 + 1;
        return i2;
    }

    private b0 buildBody(e eVar) {
        String str;
        t tVar;
        BodyType a = eVar.a();
        int i2 = e.a[a.ordinal()];
        if (i2 == 1) {
            tVar = t.b(a.httpType);
            str = d.b(eVar.d());
        } else if (i2 == 2) {
            tVar = t.b(a.httpType);
            str = eVar.f();
        } else if (i2 != 3) {
            return null;
        } else {
            return b0.d(t.b("multipart/form-data"), eVar.c());
        }
        return b0.c(tVar, str);
    }

    public static AbstractNetAdapter create(u uVar) {
        return uVar != null ? new OkHttpAdapter(uVar) : new OkHttpAdapter();
    }

    private q mapToHeaders(Map<String, String> map) {
        q.a aVar = new q.a();
        for (Map.Entry next : map.entrySet()) {
            if (next.getValue() != null) {
                aVar.a((String) next.getKey(), (String) next.getValue());
            }
        }
        return new q(aVar);
    }

    public void request(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        b0 d2 = b0.d(t.b("jce"), jceRequestEntity.getContent());
        q mapToHeaders = mapToHeaders(jceRequestEntity.getHeader());
        String name = jceRequestEntity.getType().name();
        String url = jceRequestEntity.getUrl();
        x.a aVar = new x.a();
        aVar.g(url);
        aVar.f(name);
        aVar.e("POST", d2);
        aVar.d(mapToHeaders);
        ((w) this.client.a(aVar.a())).x(new c(this, callback, name));
    }

    public void request(e eVar, Callback<BResponse> callback) {
        String h2 = eVar.h();
        b0 buildBody = buildBody(eVar);
        x.a aVar = new x.a();
        aVar.g(eVar.i());
        aVar.e(eVar.g().name(), buildBody);
        aVar.d(mapToHeaders(eVar.e()));
        aVar.f(h2 == null ? "beacon" : h2);
        ((w) this.client.a(aVar.a())).x(new d(this, callback, h2));
    }
}
