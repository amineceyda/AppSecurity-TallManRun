package com.tencent.beacon.a.b;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.d;
import com.tencent.beacon.base.util.c;
import g.a.a.a.a;

public class b implements Callback<BResponse> {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f568d;

    public b(e eVar, String str, String str2, Throwable th) {
        this.f568d = eVar;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    /* renamed from: a */
    public void onResponse(BResponse bResponse) {
        StringBuilder i2 = a.i("net ret: ");
        i2.append(bResponse.toString());
        c.a("AttaReport", i2.toString(), new Object[0]);
    }

    public void onFailure(d dVar) {
        this.f568d.b(this.a, this.b, this.c);
    }
}
