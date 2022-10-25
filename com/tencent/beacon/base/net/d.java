package com.tencent.beacon.base.net;

import g.a.a.a.a;
import org.slf4j.helpers.MessageFormatter;

public final class d {
    public String a;
    public String b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public String f647d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f648e;

    public d(String str, String str2, int i2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.f647d = str3;
    }

    public d(String str, String str2, int i2, String str3, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.f647d = str3;
        this.f648e = th;
    }

    public String toString() {
        StringBuilder i2 = a.i("NetFailure{requestType='");
        a.p(i2, this.a, '\'', ", attaCode='");
        a.p(i2, this.b, '\'', ", responseCode=");
        i2.append(this.c);
        i2.append(", msg='");
        a.p(i2, this.f647d, '\'', ", exception=");
        i2.append(this.f648e);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
