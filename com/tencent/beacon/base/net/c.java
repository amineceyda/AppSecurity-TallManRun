package com.tencent.beacon.base.net;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.base.net.a.a;
import com.tencent.beacon.base.net.a.b;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import com.tencent.beacon.base.net.adapter.f;
import com.tencent.beacon.base.net.b.e;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.net.call.j;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements e, e.a, Closeable {
    private static volatile c a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final AtomicInteger c = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    public a f624d;

    /* renamed from: e  reason: collision with root package name */
    public b f625e;

    /* renamed from: f  reason: collision with root package name */
    private Context f626f;

    /* renamed from: g  reason: collision with root package name */
    private AbstractNetAdapter f627g;

    /* renamed from: h  reason: collision with root package name */
    private AbstractNetAdapter f628h;

    private c() {
    }

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            if (a == null) {
                a = new c();
            }
            cVar = a;
        }
        return cVar;
    }

    /* access modifiers changed from: private */
    public void f() {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "current net connected num: %d", Integer.valueOf(this.c.decrementAndGet()));
    }

    private void g() {
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "current net connected num: %d", Integer.valueOf(this.c.incrementAndGet()));
    }

    public AbstractNetAdapter a(JceRequestEntity jceRequestEntity) {
        return jceRequestEntity.getType() == RequestType.EVENT ? com.tencent.beacon.e.b.a().j() ? this.f627g : this.f628h : this.f627g;
    }

    public com.tencent.beacon.base.net.call.c a(com.tencent.beacon.base.net.call.e eVar) {
        return new com.tencent.beacon.base.net.call.c(eVar);
    }

    public void a() {
        this.b.set(false);
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "network recovery. open BeaconNet.", new Object[0]);
    }

    public void a(Context context, AbstractNetAdapter abstractNetAdapter) {
        this.f626f = context;
        if (abstractNetAdapter == null) {
            abstractNetAdapter = new com.tencent.beacon.base.net.adapter.b();
        }
        this.f627g = f.a();
        this.f628h = abstractNetAdapter;
        this.f624d = a.a();
        this.f625e = b.a();
        e.a(context, this);
    }

    public void a(JceRequestEntity jceRequestEntity, Callback<byte[]> callback) {
        boolean z = false;
        if (this.b.get()) {
            callback.onFailure(new d(jceRequestEntity.getType().name(), (String) null, 0, "BeaconNet close."));
            return;
        }
        AbstractNetAdapter a2 = a(jceRequestEntity);
        g();
        if (a2 == this.f627g) {
            z = true;
        }
        a2.request(jceRequestEntity, (Callback<byte[]>) new a(this, jceRequestEntity, z, callback));
    }

    public void a(com.tencent.beacon.base.net.call.e eVar, Callback<BResponse> callback) {
        if (this.b.get()) {
            callback.onFailure(new d(eVar.h(), (String) null, 0, "BeaconNet close."));
            return;
        }
        g();
        this.f628h.request(eVar, (Callback<BResponse>) new b(this, eVar, callback));
    }

    public void a(d dVar) {
        if (!dVar.a.equals("atta") && !TextUtils.isEmpty(dVar.b)) {
            g.e().a(dVar.b, dVar.toString(), dVar.f648e);
        }
    }

    public j b(JceRequestEntity jceRequestEntity) {
        return new j(jceRequestEntity);
    }

    public void b() {
        this.b.set(true);
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "network can't use. close BeaconNet.", new Object[0]);
    }

    public void close() {
        this.b.set(true);
        com.tencent.beacon.base.util.c.a("[BeaconNet]", "network can't use. close BeaconNet.", new Object[0]);
    }

    public boolean d() {
        return this.c.get() >= 5;
    }

    public void e() {
        this.b.set(false);
    }
}
