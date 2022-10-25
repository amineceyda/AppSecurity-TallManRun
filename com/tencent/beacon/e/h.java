package com.tencent.beacon.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.beacon.a.b.a;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.g;
import com.tencent.beacon.a.c.i;
import com.tencent.beacon.a.d.a;
import com.tencent.beacon.base.net.RequestType;
import com.tencent.beacon.base.net.b.b;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.base.net.d;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.module.StrategyModule;
import com.tencent.beacon.pack.CommonStrategy;
import com.tencent.beacon.pack.ModuleStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class h implements Runnable, Callback<byte[]> {
    private final Context a;
    private final StrategyModule b;
    private volatile boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f679d;

    public h(StrategyModule strategyModule) {
        this.b = strategyModule;
        this.a = c.d().c();
    }

    private void a(d dVar, b bVar, ModuleStrategy moduleStrategy) {
        if (moduleStrategy.detail != null) {
            com.tencent.beacon.base.util.c.a("[strategy] mid: %d , detail changed...", Byte.valueOf(moduleStrategy.mId));
            dVar.a(moduleStrategy.detail);
            bVar.a(moduleStrategy.detail);
            this.f679d = true;
        }
    }

    private void a(d dVar, ModuleStrategy moduleStrategy) {
        boolean z = moduleStrategy.onOff == 1;
        if (dVar.c() != z) {
            com.tencent.beacon.base.util.c.a("[strategy] mid: %d , isUsable changed: %b ", Byte.valueOf(moduleStrategy.mId), Boolean.valueOf(z));
            dVar.a(z);
            this.f679d = true;
        }
    }

    private void a(ModuleStrategy moduleStrategy) {
        String a2 = b.a(moduleStrategy.url);
        if (!b.a(true).equals(a2)) {
            com.tencent.beacon.base.util.c.a("[strategy] mid: %d , url changed: %s", Byte.valueOf(moduleStrategy.mId), moduleStrategy.url);
            b.b(a2);
            this.f679d = true;
        }
    }

    private boolean a(Map<String, String> map, a aVar) {
        if (aVar == null || map == null) {
            return false;
        }
        aVar.a(map);
        return true;
    }

    private void b(d dVar, b bVar, ModuleStrategy moduleStrategy) {
        ArrayList<String> arrayList = moduleStrategy.preventEventCode;
        if (arrayList != null && !arrayList.isEmpty()) {
            com.tencent.beacon.base.util.c.a("[strategy] mid: %d , PreventEventCode changed...", Byte.valueOf(moduleStrategy.mId));
            this.f679d = true;
            dVar.a((Set<String>) com.tencent.beacon.base.util.b.a(moduleStrategy.preventEventCode));
            bVar.a((Set<String>) com.tencent.beacon.base.util.b.a(moduleStrategy.preventEventCode));
        }
    }

    private void c() {
        f();
        this.c = false;
    }

    private void c(d dVar, b bVar, ModuleStrategy moduleStrategy) {
        ArrayList<String> arrayList = moduleStrategy.sampleEvent;
        if (arrayList != null && !arrayList.isEmpty()) {
            com.tencent.beacon.base.util.c.a("[strategy] mid: %d , SampleEventSet changed...", Byte.valueOf(moduleStrategy.mId));
            this.f679d = true;
            dVar.b(com.tencent.beacon.base.util.b.a(moduleStrategy.sampleEvent));
            bVar.b((Set<String>) com.tencent.beacon.base.util.b.a(moduleStrategy.sampleEvent));
        }
    }

    private void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("s_e_e", Boolean.FALSE);
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(7, hashMap));
    }

    private void e() {
        com.tencent.beacon.base.util.c.a("local strategyQuery finish!", new Object[0]);
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(10));
    }

    private void f() {
        long b2 = ((long) this.b.a().b()) * 60000;
        a.a().a(b2, (Runnable) this);
        com.tencent.beacon.base.util.c.a("[strategy] next time: %d", Long.valueOf(b2));
    }

    private void g() {
        if (j.b() || j.c()) {
            com.tencent.beacon.base.util.c.e("[strategy] query times or query success times arrive max, return!", new Object[0]);
            this.b.a(true);
            return;
        }
        e l2 = e.l();
        g e2 = g.e();
        com.tencent.beacon.base.net.c.c().b(JceRequestEntity.builder().a(RequestType.STRATEGY).a(100).b((int) EventResult.ERROR_CODE_SAMPLE).a(c.d().f()).b(b.b(false)).a(b.b(true), 8081).b("A1", c.d().l()).b("A2", e2.b()).b("A4", e2.d()).b("A6", e2.f()).b("A7", e2.a()).b("A23", c.d().a()).b("A31", l2.p()).b("A19", l2.q()).b("A66", com.tencent.beacon.a.c.b.f(this.a) ? "F" : "B").b("A67", com.tencent.beacon.a.c.b.c(this.a)).b("A68", String.valueOf(com.tencent.beacon.a.c.b.b(this.a))).b("A85", com.tencent.beacon.a.c.b.f583d ? "Y" : "N").a(i.e()).a()).b((Callback<byte[]>) this);
    }

    /* renamed from: a */
    public void onResponse(byte[] bArr) {
        a(bArr, true);
        this.b.a(true);
        c();
    }

    public void a(byte[] bArr, boolean z) {
        try {
            CommonStrategy commonStrategy = new CommonStrategy();
            commonStrategy.readFrom(new com.tencent.beacon.pack.a(bArr));
            com.tencent.beacon.base.util.c.a("[strategy] -> common strategy: %s", commonStrategy);
            if (a(commonStrategy, a.a()) && z) {
                a.C0005a edit = com.tencent.beacon.a.d.a.a().edit();
                if (com.tencent.beacon.base.util.b.a((SharedPreferences.Editor) edit)) {
                    edit.putString("strategy_data", Base64.encodeToString(bArr, 0));
                }
            }
            if (z) {
                j.d();
            }
        } catch (Throwable th) {
            com.tencent.beacon.base.util.c.a(th);
            com.tencent.beacon.base.util.c.b("[strategy] error to common strategy!", new Object[0]);
        }
    }

    public boolean a() {
        return this.c;
    }

    public boolean a(CommonStrategy commonStrategy, a aVar) {
        if (commonStrategy == null || aVar == null) {
            return false;
        }
        String a2 = b.a(commonStrategy.url);
        if (!a2.equals(b.b(true))) {
            com.tencent.beacon.base.util.c.a("[strategy] url changed to: %s", commonStrategy.url);
            this.f679d = true;
            b.d(a2);
        }
        if (commonStrategy.queryInterval != aVar.b()) {
            com.tencent.beacon.base.util.c.a("[strategy] QueryPeriod changed to: %d", Integer.valueOf(commonStrategy.queryInterval));
            this.f679d = true;
            aVar.a(commonStrategy.queryInterval);
        }
        if (a(commonStrategy.moduleList)) {
            this.f679d = true;
        }
        if (a(commonStrategy.cloudParas, aVar)) {
            this.f679d = true;
        }
        return this.f679d;
    }

    public boolean a(ArrayList<ModuleStrategy> arrayList) {
        d d2 = this.b.a().d();
        if (arrayList == null) {
            d2.a(false);
            d();
            return false;
        }
        b b2 = this.b.b();
        Iterator<ModuleStrategy> it = arrayList.iterator();
        while (it.hasNext()) {
            ModuleStrategy next = it.next();
            if (next.mId == d2.b()) {
                a(d2, next);
                a(next);
                a(d2, b2, next);
                b(d2, b2, next);
                c(d2, b2, next);
            }
        }
        return this.f679d;
    }

    public void b() {
        byte[] bArr;
        try {
            String string = com.tencent.beacon.a.d.a.a().getString("strategy_data", "");
            if (!TextUtils.isEmpty(string)) {
                bArr = Base64.decode(string, 0);
            } else {
                i a2 = j.a(this.a, EventResult.ERROR_CODE_SAMPLE);
                bArr = a2 != null ? a2.c : null;
            }
            if (bArr != null) {
                a(bArr, false);
            } else {
                com.tencent.beacon.base.util.c.a("[strategy] local strategy is null!", new Object[0]);
            }
        } catch (Exception e2) {
            com.tencent.beacon.base.util.c.a((Throwable) e2);
        } catch (Throwable th) {
            e();
            throw th;
        }
        e();
    }

    public void onFailure(d dVar) {
        c();
    }

    public void run() {
        this.c = true;
        if (!this.b.a().e()) {
            g();
        }
    }
}
