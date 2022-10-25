package g.c.b.a;

import g.c.b.a.b;
import g.c.b.a.j.d;
import g.c.b.a.j.g;
import g.c.b.a.j.i;
import g.c.b.a.j.j;
import g.c.b.a.j.k;
import g.c.b.a.j.l;
import g.c.b.a.l.c;
import i.o.b.p;
import i.o.c.f;
import i.o.c.h;
import i.o.c.r;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2206e = new b((f) null);

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, d> f2207f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public static g.c.b.a.j.e f2208g;
    public final c a;
    public final l b;
    public final k c;

    /* renamed from: d  reason: collision with root package name */
    public final j f2209d;

    public static final class a {
        public String a;
        public String b;
        public Object c;

        /* renamed from: d  reason: collision with root package name */
        public Type f2210d;

        /* renamed from: e  reason: collision with root package name */
        public final Map<String, Object> f2211e = new LinkedHashMap();

        /* renamed from: f  reason: collision with root package name */
        public l f2212f;

        /* renamed from: g  reason: collision with root package name */
        public k f2213g;

        /* renamed from: h  reason: collision with root package name */
        public j f2214h;

        /* renamed from: g.c.b.a.e$a$a  reason: collision with other inner class name */
        public static final class C0071a implements j {
            public final /* synthetic */ p<Integer, String, i.j> a;

            public C0071a(p<? super Integer, ? super String, i.j> pVar) {
                this.a = pVar;
            }

            public void a(int i2, String str) {
                h.e(str, "message");
                this.a.d(Integer.valueOf(i2), str);
            }
        }

        public static final class b implements k {
            public final /* synthetic */ i.o.b.l<d<T>, i.j> a;

            public b(i.o.b.l<? super d<T>, i.j> lVar) {
                this.a = lVar;
            }

            public void onResponse(Object obj) {
                h.e(obj, "response");
                this.a.g((d) obj);
            }
        }

        public static final class c implements l {
            public final /* synthetic */ i.o.b.a<i.j> a;

            public c(i.o.b.a<i.j> aVar) {
                this.a = aVar;
            }

            public void a() {
                this.a.a();
            }
        }

        public final a a(String str, Object obj) {
            h.e(str, "key");
            Object obj2 = this.c;
            Map map = (obj2 instanceof Map) && !(obj2 instanceof i.o.c.s.a) ? (Map) obj2 : null;
            if (map != null) {
                map.put(str, obj);
            } else {
                Map map2 = obj2 instanceof HashMap ? (HashMap) obj2 : null;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.c = map2;
                    if (map2 instanceof i.o.c.s.a) {
                        r.c(map2, "kotlin.collections.MutableMap");
                        throw null;
                    }
                }
                map2.put(str, obj);
            }
            return this;
        }

        public final a b(p<? super Integer, ? super String, i.j> pVar) {
            h.e(pVar, "failure");
            this.f2214h = new C0071a(pVar);
            return this;
        }

        public final <T> a c(Class<T> cls, i.o.b.l<? super d<T>, i.j> lVar) {
            h.e(cls, "clazz");
            h.e(lVar, "resp");
            this.f2210d = cls;
            this.f2213g = new b(lVar);
            return this;
        }

        public final a d(i.o.b.a<i.j> aVar) {
            h.e(aVar, "start");
            this.f2212f = new c(aVar);
            return this;
        }

        public final int e() {
            ExecutorService executorService;
            g.c.b.a.j.e a2 = e.f2206e.a();
            h.e(this, "channelBuilder");
            h.e(a2, "config");
            e eVar = new e(new c(a2, (String) null, (Map<String, String>) null, this.f2211e, this.b, (String) null, (String) null, this.a, this.c, 0, (g.c.b.a.j.h) null, this.f2210d, (Integer) null, (String) null, (i) null, c.p.incrementAndGet()), this.f2212f, this.f2213g, this.f2214h, (f) null);
            g.c.b.a.h.e eVar2 = new g.c.b.a.h.e(eVar, eVar.a);
            b.C0070b bVar = b.c;
            h.e(eVar2, "runnable");
            b value = b.f2194e.getValue();
            synchronized (value) {
                if (value.b == null) {
                    value.b = value.a;
                }
                executorService = value.b;
            }
            executorService.execute(eVar2);
            return eVar.a.o;
        }

        public final a f(String str) {
            h.e(str, "command");
            this.b = str;
            return this;
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final g.c.b.a.j.e a() {
            g.c.b.a.j.e eVar = e.f2208g;
            if (eVar != null) {
                return eVar;
            }
            h.k("defaultConfig");
            throw null;
        }

        public final void b() {
            a();
            g e2 = a().e();
            h.e(e2, "log");
            if (!c.c) {
                c.c = true;
                c.b = e2;
                g.c.b.a.f.b bVar = g.c.b.a.f.b.b;
                g.c.b.a.j.e a = a();
                h.e(a, "config");
                g.c.b.a.f.b.c = a;
                return;
            }
            throw new Exception("LogUtil has been initialized, please do not repeat the initialization.");
        }

        public final b c(g.c.b.a.j.e eVar) {
            h.e(eVar, "defaultConfig");
            e.f2208g = eVar;
            e.f2207f.put("https://tapi.pureapk.com/v3", eVar);
            return this;
        }
    }

    public e(c cVar, l lVar, k kVar, j jVar, f fVar) {
        this.a = cVar;
        this.b = lVar;
        this.c = kVar;
        this.f2209d = jVar;
    }

    public final void a(int i2, String str) {
        h.e(str, "error");
        j jVar = this.f2209d;
        if (jVar != null) {
            jVar.a(i2, str);
        }
    }
}
