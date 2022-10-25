package com.tencent.beacon.base.net.adapter;

import com.tencent.beacon.base.net.call.Callback;
import java.io.IOException;
import k.c0;
import k.d;
import k.e;

public class c implements e {
    public final /* synthetic */ Callback a;
    public final /* synthetic */ String b;
    public final /* synthetic */ OkHttpAdapter c;

    public c(OkHttpAdapter okHttpAdapter, Callback callback, String str) {
        this.c = okHttpAdapter;
        this.a = callback;
        this.b = str;
    }

    public /* synthetic */ void onFailure(d dVar, IOException iOException) {
        throw null;
    }

    public /* synthetic */ void onResponse(d dVar, c0 c0Var) throws IOException {
        throw null;
    }
}
