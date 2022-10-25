package com.tencent.beacon.event;

import com.tencent.beacon.a.b.g;
import com.tencent.beacon.base.net.call.Callback;
import com.tencent.beacon.base.net.d;

public class c implements Callback<byte[]> {
    public final /* synthetic */ EventBean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ d c;

    public c(d dVar, EventBean eventBean, String str) {
        this.c = dVar;
        this.a = eventBean;
        this.b = str;
    }

    /* renamed from: a */
    public void onResponse(byte[] bArr) {
        com.tencent.beacon.base.util.c.a("[EventManager]", "convert to report by beacon socket success, eventCode = %s, logId = %s", this.a.getEventCode(), this.b);
    }

    public void onFailure(d dVar) {
        com.tencent.beacon.base.util.c.e("convert to report by beacon socket also fail, failure = %s", dVar.toString());
        g.e().a("464", dVar.toString());
        this.c.b(this.b, this.a);
    }
}
