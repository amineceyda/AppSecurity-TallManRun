package com.tencent.qmsp.sdk.g.e;

public class b {
    public int a;
    public long b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f898d;

    public b(String str) {
        this.c = str;
    }

    public void a(int i2) {
        this.a = i2;
    }

    public void a(long j2) {
        this.b = j2;
    }

    public void a(String str) {
        this.f898d = str;
    }

    public boolean a() {
        return this.b > System.currentTimeMillis();
    }

    public void b() {
        this.b = 0;
    }
}
