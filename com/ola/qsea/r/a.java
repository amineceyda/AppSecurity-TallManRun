package com.ola.qsea.r;

import com.ola.qsea.o.c;
import com.ola.qsea.sdk.Qsea;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {
    public static final String a = "a";
    public static final Map<String, a> b = new ConcurrentHashMap();
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f504d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f505e = false;

    /* renamed from: f  reason: collision with root package name */
    public Qsea f506f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f507g;

    public a(String str) {
        this.c = str;
    }

    public static synchronized a a(String str) {
        a aVar;
        synchronized (a.class) {
            Map<String, a> map = b;
            aVar = map.get(str);
            if (aVar == null) {
                aVar = new a(str);
                map.put(str, aVar);
            }
        }
        return aVar;
    }

    public void a(Qsea qsea) {
        this.f506f = qsea;
    }

    public boolean a() {
        boolean b2 = b();
        this.f504d = b2;
        return b2 || this.f505e;
    }

    public final boolean b() {
        if (this.f507g) {
            return this.f504d;
        }
        long d2 = com.ola.qsea.k.a.c(this.c).d("q_s_t");
        if (d2 == 0) {
            return false;
        }
        long b2 = com.ola.qsea.d.a.b();
        this.f507g = true;
        return b2 > d2;
    }

    public final HashMap<String, String> c() {
        if (this.f506f == null) {
            this.f506f = new Qsea();
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("o16", this.f506f.getQsea16());
        hashMap.put("o36", this.f506f.getQsea36());
        com.ola.qsea.v.a aVar = new com.ola.qsea.v.a(this.c);
        hashMap.put("n16", aVar.G());
        hashMap.put("n36", aVar.J());
        return hashMap;
    }

    public void d() {
        this.f505e = true;
    }

    public void e() {
        if (a()) {
            int i2 = this.f505e ? 2 : this.f504d ? 1 : 0;
            com.ola.qsea.m.a.b(a, "clone status: ByTime %b, ByAID %b", Boolean.valueOf(this.f504d), Boolean.valueOf(this.f505e));
            c.a(this.c, c(), i2);
        }
    }
}
