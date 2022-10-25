package f.a.a.a;

import e.e.f.b;
import f.a.a.a.l.e;
import f.a.a.a.l.f;
import f.a.a.a.l.k;
import f.a.a.a.m.a;
import f.a.a.b.d;
import f.a.a.b.w.h;
import f.a.a.b.w.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.Marker;

public class c extends d implements ILoggerFactory, i {

    /* renamed from: l  reason: collision with root package name */
    public final b f1621l;

    /* renamed from: m  reason: collision with root package name */
    public int f1622m;
    public int n = 0;
    public final List<e> o = new ArrayList();
    public Map<String, b> p = new ConcurrentHashMap();
    public f q = new f(this);
    public final k r = new k();
    public boolean s = false;
    public int t = 8;
    public int u = 0;
    public List<String> v;

    public c() {
        b bVar = new b(Logger.ROOT_LOGGER_NAME, (b) null, this);
        this.f1621l = bVar;
        bVar.l(a.f1612f);
        this.p.put(Logger.ROOT_LOGGER_NAME, bVar);
        this.f1687f.put("EVALUATOR_MAP", new HashMap());
        this.f1622m = 1;
        this.v = new ArrayList();
    }

    public void e(String str) {
        super.e(str);
        o();
    }

    public void h(String str, String str2) {
        this.f1686e.put(str, str2);
        o();
    }

    /* renamed from: i */
    public b getLogger(String str) {
        b i2;
        if (str == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        } else if (Logger.ROOT_LOGGER_NAME.equalsIgnoreCase(str)) {
            return this.f1621l;
        } else {
            b bVar = this.f1621l;
            b bVar2 = this.p.get(str);
            if (bVar2 != null) {
                return bVar2;
            }
            int i3 = 0;
            while (true) {
                int o2 = b.o(str, i3);
                String substring = o2 == -1 ? str : str.substring(0, o2);
                int i4 = o2 + 1;
                synchronized (bVar) {
                    i2 = bVar.i(substring);
                    if (i2 == null) {
                        i2 = bVar.d(substring);
                        this.p.put(substring, i2);
                        this.f1622m++;
                    }
                }
                if (o2 == -1) {
                    return i2;
                }
                i3 = i4;
                bVar = i2;
            }
        }
    }

    public final h m(Marker marker, b bVar, a aVar, String str, Object[] objArr, Throwable th) {
        return this.r.size() == 0 ? h.NEUTRAL : this.r.c(marker, bVar, aVar, str, objArr, th);
    }

    public void n() {
        ArrayList arrayList;
        this.u++;
        Thread thread = (Thread) this.f1687f.get("SHUTDOWN_HOOK");
        if (thread != null) {
            this.f1687f.remove("SHUTDOWN_HOOK");
            try {
                Runtime.getRuntime().removeShutdownHook(thread);
            } catch (IllegalStateException unused) {
            }
        }
        f.a.a.b.h c = c();
        for (i next : c.a) {
            if (next.k()) {
                next.stop();
            }
        }
        c.a.clear();
        this.f1686e.clear();
        this.f1687f.clear();
        this.f1687f.put("EVALUATOR_MAP", new HashMap());
        g();
        this.f1621l.k();
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f1674e = false;
        }
        this.r.clear();
        for (ScheduledFuture<?> cancel : this.f1690i) {
            cancel.cancel(false);
        }
        this.f1690i.clear();
        for (e d2 : this.o) {
            d2.d(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (e next2 : this.o) {
            if (next2.a()) {
                arrayList2.add(next2);
            }
        }
        this.o.retainAll(arrayList2);
        f.a.a.b.c cVar = this.f1685d;
        synchronized (cVar.f1684g) {
            arrayList = new ArrayList(cVar.f1683f);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            f.a.a.b.x.f fVar = (f.a.a.b.x.f) it2.next();
            synchronized (cVar.f1684g) {
                cVar.f1683f.remove(fVar);
            }
        }
    }

    public final void o() {
        this.q = new f(this);
    }

    public void start() {
        this.f1692k = true;
        for (e c : this.o) {
            c.c(this);
        }
    }

    public void stop() {
        n();
        for (e b : this.o) {
            b.b(this);
        }
        this.o.clear();
        super.stop();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(c.class.getName());
        sb.append("[");
        return g.a.a.a.a.f(sb, this.c, "]");
    }
}
