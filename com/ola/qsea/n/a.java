package com.ola.qsea.n;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.ola.qsea.h.b;
import com.ola.qsea.h.c;
import com.ola.qsea.w.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SuppressLint({"MissingPermission"})
public class a implements c {
    public static final Map<String, a> a = new ConcurrentHashMap();
    public final String b;
    public final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f445d = false;

    public a(String str) {
        this.b = str;
        b.a().a(str, (c) this);
    }

    public static synchronized a a(String str) {
        a aVar;
        synchronized (a.class) {
            Map<String, a> map = a;
            aVar = map.get(str);
            if (aVar == null) {
                aVar = new a(str);
                map.put(str, aVar);
            }
        }
        return aVar;
    }

    public void a() {
        com.ola.qsea.d.c.n().E();
    }

    public void b() {
        com.ola.qsea.d.c.n().E();
    }

    public String c() {
        String d2 = d.a(this.b).d();
        if (!TextUtils.isEmpty(d2)) {
            return d2;
        }
        if (d.a(this.b).w()) {
            return com.ola.qsea.d.c.n().d();
        }
        com.ola.qsea.m.a.a("[DeviceInfo] current collect androidId be refused! isAndroidId: %s", Boolean.FALSE);
        return "";
    }

    public String d() {
        return !d.a(this.b).i() ? "" : com.ola.qsea.d.c.n().e();
    }

    public String e() {
        String k2 = d.a(this.b).k();
        return !TextUtils.isEmpty(k2) ? k2 : !d.a(this.b).h() ? "" : com.ola.qsea.d.c.n().f();
    }

    public String f() {
        String e2 = d.a(this.b).e();
        if (!TextUtils.isEmpty(e2)) {
            return e2;
        }
        if (d.a(this.b).C()) {
            return com.ola.qsea.d.c.n().l();
        }
        com.ola.qsea.m.a.a("[DeviceInfo] current collect imei be refused! isCollect Imei: %s", Boolean.FALSE);
        return "";
    }

    public String g() {
        String a2 = d.a(this.b).a();
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        if (d.a(this.b).D()) {
            return com.ola.qsea.d.c.n().m();
        }
        com.ola.qsea.m.a.a("[DeviceInfo] current collect imei be refused! isCollectImei: %s", Boolean.FALSE);
        return "";
    }

    public String h() {
        String m2 = d.a(this.b).m();
        if (!TextUtils.isEmpty(m2)) {
            return m2;
        }
        if (d.a(this.b).o()) {
            return com.ola.qsea.d.c.n().q();
        }
        com.ola.qsea.m.a.a("[DeviceInfo] current collect mac be refused! isCollectMAC: %s", Boolean.FALSE);
        return "";
    }

    public String i() {
        String n = d.a(this.b).n();
        return !TextUtils.isEmpty(n) ? n : !d.a(this.b).l() ? "" : com.ola.qsea.d.c.n().g();
    }

    public String j() {
        String y = d.a(this.b).y();
        if (!TextUtils.isEmpty(y)) {
            return y;
        }
        String t = com.ola.qsea.d.c.n().t();
        return !t.equals("") ? t : "";
    }

    public String k() {
        return !d.a(this.b).u() ? "" : com.ola.qsea.d.c.n().u();
    }

    public String l() {
        return !d.a(this.b).f() ? "" : com.ola.qsea.d.c.n().w();
    }
}
