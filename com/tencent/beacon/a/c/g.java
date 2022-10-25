package com.tencent.beacon.a.c;

public class g {
    private static volatile g a;
    private String b = "";
    private String c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f605d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f606e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f607f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f608g = "unset";

    /* renamed from: h  reason: collision with root package name */
    private String f609h = "";

    /* renamed from: i  reason: collision with root package name */
    private String f610i = "";

    /* renamed from: j  reason: collision with root package name */
    private String f611j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f612k = "";

    private g() {
    }

    public static g e() {
        if (a == null) {
            synchronized (g.class) {
                if (a == null) {
                    a = new g();
                }
            }
        }
        return a;
    }

    public String a() {
        return this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.c;
    }

    public void b(String str) {
        this.c = str;
    }

    public String c() {
        return this.f605d;
    }

    public void c(String str) {
        this.f605d = str;
    }

    public String d() {
        return this.f606e;
    }

    public void d(String str) {
        this.f606e = str;
    }

    public void e(String str) {
        this.f609h = str;
    }

    public String f() {
        return this.f609h;
    }

    public void f(String str) {
        this.f607f = str;
    }

    public String g() {
        return this.f607f;
    }

    public void g(String str) {
        this.f608g = str;
    }

    public String h() {
        return this.f608g;
    }

    public void h(String str) {
        this.f612k = str;
    }

    public String i() {
        return this.f612k;
    }

    public void i(String str) {
        this.f610i = str;
    }

    public String j() {
        return this.f610i;
    }

    public void j(String str) {
        this.f611j = str;
    }

    public String k() {
        return this.f611j;
    }
}
