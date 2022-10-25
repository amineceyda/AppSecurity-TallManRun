package com.tencent.beacon.module;

import android.content.Context;
import com.tencent.beacon.base.net.b.e;
import com.tencent.beacon.e.a;
import com.tencent.beacon.e.b;
import com.tencent.beacon.e.c;
import com.tencent.beacon.e.g;
import com.tencent.beacon.e.h;

public class StrategyModule implements BeaconModule {
    private static final Object a = new Object();
    private a b = a.a();
    /* access modifiers changed from: private */
    public h c;

    /* renamed from: d  reason: collision with root package name */
    private b f760d = b.a();

    /* renamed from: e  reason: collision with root package name */
    private boolean f761e = false;

    public StrategyModule() {
        g.b().a((c) this.b);
        this.c = new h(this);
    }

    /* access modifiers changed from: private */
    public synchronized void d() {
        if (!this.c.a()) {
            com.tencent.beacon.a.b.a.a().a((Runnable) this.c);
        }
    }

    public a a() {
        return this.b;
    }

    public void a(Context context) {
        com.tencent.beacon.base.util.c.a("[module] strategy module > TRUE", new Object[0]);
        this.c.b();
        d();
        e.a(context, new e.a() {
            public void a() {
                synchronized (StrategyModule.this) {
                    if (!StrategyModule.this.c() && !StrategyModule.this.c.a()) {
                        StrategyModule.this.d();
                    }
                }
            }

            public void b() {
            }
        });
    }

    public void a(boolean z) {
        synchronized (a) {
            this.f761e = z;
        }
    }

    public b b() {
        return this.f760d;
    }

    public boolean c() {
        boolean z;
        synchronized (a) {
            z = this.f761e;
        }
        return z;
    }
}
