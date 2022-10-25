package com.tencent.beacon.base.net.call;

import com.tencent.beacon.base.net.BResponse;

public class c implements a<BResponse> {
    private e a;

    public c(e eVar) {
        this.a = eVar;
    }

    public void a(Callback<BResponse> callback) {
        com.tencent.beacon.base.net.c.c().a(this.a, (Callback<BResponse>) new b(this, callback));
    }
}
