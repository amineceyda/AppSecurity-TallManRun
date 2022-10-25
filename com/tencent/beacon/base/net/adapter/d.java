package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.call.Callback;
import java.io.IOException;
import k.c0;
import k.e;

public class d implements e {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ String b;
    public final /* synthetic */ OkHttpAdapter c;

    public d(OkHttpAdapter okHttpAdapter, Callback callback, String str) {
        this.c = okHttpAdapter;
        this.a = callback;
        this.b = str;
    }

    public /* synthetic */ void onFailure(k.d dVar, IOException iOException) {
        throw null;
    }

    public /* synthetic */ void onResponse(k.d dVar, c0 c0Var) throws IOException {
        throw null;
    }
}
