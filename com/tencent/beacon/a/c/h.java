package com.tencent.beacon.a.c;

import android.text.TextUtils;

public class h {
    private String a = "";
    private String b = "";

    public String a() {
        return this.a;
    }

    public void a(String str) {
        this.a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public boolean c() {
        return TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b);
    }
}
