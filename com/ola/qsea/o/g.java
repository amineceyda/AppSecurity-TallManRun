package com.ola.qsea.o;

import java.util.Map;

public class g implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f457d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i f458e;

    public g(i iVar, String str, Map map, String str2, String str3) {
        this.f458e = iVar;
        this.a = str;
        this.b = map;
        this.c = str2;
        this.f457d = str3;
    }

    public void run() {
        synchronized (this.f458e) {
            this.f458e.a(this.a, this.b, this.c, this.f457d);
        }
    }
}
