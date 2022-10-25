package com.tencent.beacon.event;

import com.tencent.beacon.a.c.c;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.d;
import com.tencent.beacon.event.a.a;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public final class f implements Callback<byte[]> {
    /* access modifiers changed from: private */
    public final Set<Long> a;
    /* access modifiers changed from: private */
    public final String b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private long f704d = new Date().getTime();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public g f705e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f706f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public a f707g;

    public f(g gVar, String str, a aVar, Set<Long> set, String str2) {
        this.f705e = gVar;
        this.f706f = str;
        this.f707g = aVar;
        this.a = new HashSet(set);
        this.b = g.a.a.a.a.c("[EventReport(", str, ")]");
        this.c = str2;
    }

    /* renamed from: a */
    public void onResponse(byte[] bArr) {
        boolean a2 = ((EventModule) c.d().a(ModuleName.EVENT)).c().a((Runnable) new e(this, new Date().getTime() - this.f704d));
        com.tencent.beacon.base.util.c.a(this.b, 3, "report success! sendingID will delete this time's IDs. offer task: %s! ", Boolean.valueOf(a2));
        if (this.a.size() >= this.f705e.a()) {
            com.tencent.beacon.a.b.a.a().a((Runnable) this.f705e);
        }
    }

    public void onFailure(d dVar) {
        com.tencent.beacon.base.util.c.a(this.b, 3, "send failure reason: %s. LogID: %s.", dVar.toString(), this.c);
        this.f705e.a(this.a);
    }
}
