package com.ola.qsea.g;

import com.ola.qsea.i.c;
import com.ola.qsea.i.e;

public enum b implements a<String> {
    KEY_CODE("code"),
    KEY_DATA("data");
    
    public static final c<String> c = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f438e;

    /* renamed from: f  reason: collision with root package name */
    public String f439f;

    /* access modifiers changed from: public */
    static {
        c = new e(new a[0]);
    }

    /* access modifiers changed from: public */
    b(String str) {
        this.f438e = str;
    }

    public b a(String str) {
        this.f439f = str;
        return this;
    }

    public String a() {
        return "0";
    }

    public String b() {
        return this.f438e;
    }

    public String b(@Deprecated String str) {
        String str2 = this.f439f;
        if (str2 != null) {
            return c.a(this, str2);
        }
        throw new RuntimeException("Please set json first: KEY_CODE.json(json).value()");
    }
}
