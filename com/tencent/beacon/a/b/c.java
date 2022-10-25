package com.tencent.beacon.a.b;

import com.tencent.beacon.base.net.HttpMethod;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.call.e;
import com.tencent.beacon.base.util.b;
import java.util.LinkedHashMap;
import java.util.Map;

public class c implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f569d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Callback f570e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f571f;

    public c(e eVar, String str, String str2, Throwable th, boolean z, Callback callback) {
        this.f571f = eVar;
        this.a = str;
        this.b = str2;
        this.c = th;
        this.f569d = z;
        this.f570e = callback;
    }

    public void run() {
        synchronized (this.f571f) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(e.a);
            linkedHashMap.put("error_code", this.a);
            linkedHashMap.put("error_msg", this.b);
            linkedHashMap.put("error_stack_full", b.a(this.c));
            linkedHashMap.put("_dc", String.valueOf(Math.random()));
            com.tencent.beacon.base.net.c.c().a(e.b().b(this.f569d ? "https://htrace.wetvinfo.com/kv" : "https://h.trace.qq.com/kv").a("atta").a((Map<String, String>) linkedHashMap).a(HttpMethod.POST).a()).a(this.f570e);
            com.tencent.beacon.base.util.c.d("[atta] upload a new error, errorCode: %s, message: %s, stack: %s", this.a, this.b, b.a(this.c));
        }
    }
}
