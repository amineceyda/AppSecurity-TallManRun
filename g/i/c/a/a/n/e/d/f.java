package g.i.c.a.a.n.e.d;

import g.h.a.a;
import java.util.HashSet;
import java.util.Set;

public class f {
    public static final Set<String> a;
    public static final Set<String> b;
    public static final Set<String> c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<String> f4467d;

    /* renamed from: e  reason: collision with root package name */
    public static int f4468e = 1;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        HashSet hashSet2 = new HashSet();
        b = hashSet2;
        HashSet hashSet3 = new HashSet();
        c = hashSet3;
        HashSet hashSet4 = new HashSet();
        f4467d = hashSet4;
        hashSet.add("imp");
        hashSet.add("clck");
        hashSet.add("imp_end");
        hashSet.add("dt_submit");
        hashSet2.add("appout");
        hashSet2.add("appin");
        hashSet2.add("origin_vst");
        hashSet2.add("vst");
        hashSet2.add("act");
        hashSet2.add("dt_app_heartbeat");
        hashSet3.add("pgin");
        hashSet3.add("pgout");
        hashSet4.add("dt_audio_start");
        hashSet4.add("dt_audio_end");
        hashSet4.add("dt_audio_heartbeat");
    }

    public static o a(String str) {
        Class<e> cls = e.class;
        if (a.contains(str)) {
            if (a.b == null) {
                synchronized (d.class) {
                    if (a.b == null) {
                        a.b = f4468e != 2 ? new n() : new j();
                    }
                }
            }
            return a.b;
        } else if (b.contains(str)) {
            if (a.c == null) {
                synchronized (b.class) {
                    if (a.c == null) {
                        a.c = f4468e != 2 ? new b() : new h();
                    }
                }
            }
            return a.c;
        } else if (c.contains(str)) {
            if (a.f4024d == null) {
                synchronized (m.class) {
                    if (a.f4024d == null) {
                        a.f4024d = f4468e != 2 ? new m() : new k();
                    }
                }
            }
            return a.f4024d;
        } else if (f4467d.contains(str)) {
            if (a.f4025e == null) {
                synchronized (cls) {
                    if (a.f4025e == null) {
                        a.f4025e = f4468e != 2 ? new e() : new i();
                    }
                }
            }
            return a.f4025e;
        } else {
            if (a.f4026f == null) {
                synchronized (cls) {
                    if (a.f4026f == null) {
                        a.f4026f = f4468e != 2 ? new c() : new g();
                    }
                }
            }
            return a.f4026f;
        }
    }
}
