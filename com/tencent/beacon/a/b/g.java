package com.tencent.beacon.a.b;

public class g extends e {

    /* renamed from: d  reason: collision with root package name */
    private static volatile g f573d;

    private g() {
    }

    public static g e() {
        if (f573d == null) {
            synchronized (g.class) {
                if (f573d == null) {
                    f573d = new g();
                }
            }
        }
        return f573d;
    }

    public String b() {
        return "00400014144";
    }

    public String c() {
        return "6478159937";
    }
}
