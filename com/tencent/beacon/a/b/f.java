package com.tencent.beacon.a.b;

public class f extends e {

    /* renamed from: d  reason: collision with root package name */
    private static volatile f f572d;

    private f() {
    }

    public static f e() {
        if (f572d == null) {
            synchronized (f.class) {
                if (f572d == null) {
                    f572d = new f();
                }
            }
        }
        return f572d;
    }

    public String b() {
        return "03300051017";
    }

    public String c() {
        return "9462881773";
    }
}
