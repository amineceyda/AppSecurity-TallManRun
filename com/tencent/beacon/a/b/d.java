package com.tencent.beacon.a.b;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.util.c;
import g.a.a.a.a;

public class d implements Callback<BResponse> {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    /* renamed from: a */
    public void onResponse(BResponse bResponse) {
        if (bResponse != null) {
            StringBuilder i2 = a.i("oversea net ret: ");
            i2.append(bResponse.toString());
            c.a("AttaReport", i2.toString(), new Object[0]);
        }
    }

    public void onFailure(com.tencent.beacon.base.net.d dVar) {
    }
}
