package g.c.b.a;

import g.a.a.a.a;
import g.c.b.a.j.d;
import g.c.b.a.j.h;
import g.c.b.a.j.i;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {
    public static final AtomicInteger p = new AtomicInteger();
    public final d a;
    public final String b;
    public final Map<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Object> f2195d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2196e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2197f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2198g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2199h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f2200i;

    /* renamed from: j  reason: collision with root package name */
    public final h f2201j;

    /* renamed from: k  reason: collision with root package name */
    public final Type f2202k;

    /* renamed from: l  reason: collision with root package name */
    public final Integer f2203l;

    /* renamed from: m  reason: collision with root package name */
    public final String f2204m;
    public final i n;
    public final int o;

    public c(d dVar, String str, Map<String, String> map, Map<String, Object> map2, String str2, String str3, String str4, String str5, Object obj, Integer num, h hVar, Type type, Integer num2, String str6, i iVar, int i2) {
        i.o.c.h.e(dVar, "config");
        this.a = dVar;
        this.b = str;
        this.c = map;
        this.f2195d = map2;
        this.f2196e = str2;
        this.f2197f = str3;
        this.f2198g = str4;
        this.f2199h = str5;
        this.f2200i = obj;
        this.f2201j = hVar;
        this.f2202k = type;
        this.f2203l = num2;
        this.f2204m = str6;
        this.n = iVar;
        this.o = i2;
    }

    public final Object a() {
        return this.f2200i;
    }

    public final Type b() {
        return this.f2202k;
    }

    public final Map<String, String> c() {
        return this.c;
    }

    public final String d() {
        return this.f2204m;
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2196e);
        sb.append('|');
        return a.e(sb, this.o, "  ");
    }
}
