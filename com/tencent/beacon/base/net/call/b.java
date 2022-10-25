package com.tencent.beacon.base.net.call;

import com.tencent.beacon.base.net.BResponse;
import com.tencent.beacon.base.net.NetException;
import com.tencent.beacon.base.net.d;

public class b implements Callback<BResponse> {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ c b;

    public b(c cVar, Callback callback) {
        this.b = cVar;
        this.a = callback;
    }

    /* renamed from: a */
    public void onResponse(BResponse bResponse) throws NetException {
        Callback callback = this.a;
        if (callback != null) {
            callback.onResponse(bResponse);
        }
    }

    public void onFailure(d dVar) {
        Callback callback = this.a;
        if (callback != null) {
            callback.onFailure(dVar);
        }
    }
}
