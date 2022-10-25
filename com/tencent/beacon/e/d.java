package com.tencent.beacon.e;

import java.util.Map;
import java.util.Set;

public class d {
    private final int a;
    public String b = "";
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f670d = null;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f671e = null;

    /* renamed from: f  reason: collision with root package name */
    private Set<String> f672f = null;

    public d(int i2) {
        this.a = i2;
    }

    public Map<String, String> a() {
        return this.f670d;
    }

    public void a(Map<String, String> map) {
        this.f670d = map;
    }

    public void a(Set<String> set) {
        this.f671e = set;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public int b() {
        return this.a;
    }

    public void b(Set<String> set) {
        this.f672f = set;
    }

    public boolean c() {
        return this.c;
    }
}
