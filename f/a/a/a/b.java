package f.a.a.a;

import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import f.a.a.a.l.c;
import f.a.a.a.l.e;
import f.a.a.a.l.g;
import f.a.a.b.w.a;
import f.a.a.b.x.h;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.spi.LocationAwareLogger;

public final class b implements Logger, LocationAwareLogger, a<c>, Serializable {

    /* renamed from: i  reason: collision with root package name */
    public static final String f1615i = b.class.getName();
    private static final long serialVersionUID = 5454405123156820674L;
    public transient a b;
    public transient int c;

    /* renamed from: d  reason: collision with root package name */
    public transient b f1616d;

    /* renamed from: e  reason: collision with root package name */
    public transient List<b> f1617e;

    /* renamed from: f  reason: collision with root package name */
    public transient f.a.a.b.w.b<c> f1618f;

    /* renamed from: g  reason: collision with root package name */
    public transient boolean f1619g = true;

    /* renamed from: h  reason: collision with root package name */
    public final transient c f1620h;
    private String name;

    public b(String str, b bVar, c cVar) {
        this.name = str;
        this.f1616d = bVar;
        this.f1620h = cVar;
    }

    public synchronized void a(f.a.a.b.a<c> aVar) {
        if (this.f1618f == null) {
            this.f1618f = new f.a.a.b.w.b<>();
        }
        f.a.a.b.w.b<c> bVar = this.f1618f;
        Objects.requireNonNull(bVar);
        f.a.a.b.z.b<f.a.a.b.a<E>> bVar2 = bVar.b;
        bVar2.c.addIfAbsent(aVar);
        bVar2.c();
    }

    public final void b(String str, Marker marker, a aVar, String str2, Object[] objArr, Throwable th) {
        int i2;
        g gVar = new g(str, this, aVar, str2, th, objArr);
        if (gVar.f1663l == null) {
            gVar.f1663l = marker;
            int i3 = 0;
            for (b bVar = this; bVar != null; bVar = bVar.f1616d) {
                f.a.a.b.w.b<c> bVar2 = bVar.f1618f;
                if (bVar2 != null) {
                    f.a.a.b.z.b<f.a.a.b.a<E>> bVar3 = bVar2.b;
                    bVar3.e();
                    i2 = 0;
                    for (f.a.a.b.a a : (f.a.a.b.a[]) bVar3.f1869d) {
                        a.a(gVar);
                        i2++;
                    }
                } else {
                    i2 = 0;
                }
                i3 += i2;
                if (!bVar.f1619g) {
                    break;
                }
            }
            if (i3 == 0) {
                c cVar = this.f1620h;
                int i4 = cVar.n;
                cVar.n = i4 + 1;
                if (i4 == 0) {
                    f.a.a.b.c cVar2 = cVar.f1685d;
                    StringBuilder i5 = g.a.a.a.a.i("No appenders present in context [");
                    i5.append(cVar.c);
                    i5.append("] for logger [");
                    i5.append(getName());
                    i5.append("].");
                    cVar2.a(new h(i5.toString(), this));
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("The marker has been already set for this event.");
    }

    public final f.a.a.b.w.h c(Marker marker, a aVar) {
        return this.f1620h.m(marker, this, aVar, (String) null, (Object[]) null, (Throwable) null);
    }

    public b d(String str) {
        if (e.e.f.b.o(str, this.name.length() + 1) == -1) {
            if (this.f1617e == null) {
                this.f1617e = new CopyOnWriteArrayList();
            }
            b bVar = new b(str, this, this.f1620h);
            this.f1617e.add(bVar);
            bVar.c = this.c;
            return bVar;
        }
        StringBuilder i2 = g.a.a.a.a.i("For logger [");
        i2.append(this.name);
        i2.append("] child name [");
        i2.append(str);
        i2.append(" passed as parameter, may not include '.' after index");
        i2.append(this.name.length() + 1);
        throw new IllegalArgumentException(i2.toString());
    }

    public void debug(String str) {
        e(f1615i, (Marker) null, a.f1612f, str, (Object[]) null, (Throwable) null);
    }

    public void debug(String str, Object obj) {
        g(f1615i, (Marker) null, a.f1612f, str, obj, (Throwable) null);
    }

    public void debug(String str, Object obj, Object obj2) {
        h(f1615i, (Marker) null, a.f1612f, str, obj, obj2, (Throwable) null);
    }

    public void debug(String str, Throwable th) {
        e(f1615i, (Marker) null, a.f1612f, str, (Object[]) null, th);
    }

    public void debug(String str, Object... objArr) {
        e(f1615i, (Marker) null, a.f1612f, str, objArr, (Throwable) null);
    }

    public void debug(Marker marker, String str) {
        e(f1615i, marker, a.f1612f, str, (Object[]) null, (Throwable) null);
    }

    public void debug(Marker marker, String str, Object obj) {
        g(f1615i, marker, a.f1612f, str, obj, (Throwable) null);
    }

    public void debug(Marker marker, String str, Object obj, Object obj2) {
        h(f1615i, marker, a.f1612f, str, obj, obj2, (Throwable) null);
    }

    public void debug(Marker marker, String str, Throwable th) {
        e(f1615i, marker, a.f1612f, str, (Object[]) null, th);
    }

    public void debug(Marker marker, String str, Object... objArr) {
        e(f1615i, marker, a.f1612f, str, objArr, (Throwable) null);
    }

    public final void e(String str, Marker marker, a aVar, String str2, Object[] objArr, Throwable th) {
        f.a.a.b.w.h m2 = this.f1620h.m(marker, this, aVar, str2, objArr, th);
        if (m2 == f.a.a.b.w.h.NEUTRAL) {
            if (this.c > aVar.levelInt) {
                return;
            }
        } else if (m2 == f.a.a.b.w.h.DENY) {
            return;
        }
        b(str, marker, aVar, str2, objArr, th);
    }

    public void error(String str) {
        e(f1615i, (Marker) null, a.c, str, (Object[]) null, (Throwable) null);
    }

    public void error(String str, Object obj) {
        g(f1615i, (Marker) null, a.c, str, obj, (Throwable) null);
    }

    public void error(String str, Object obj, Object obj2) {
        h(f1615i, (Marker) null, a.c, str, obj, obj2, (Throwable) null);
    }

    public void error(String str, Throwable th) {
        e(f1615i, (Marker) null, a.c, str, (Object[]) null, th);
    }

    public void error(String str, Object... objArr) {
        e(f1615i, (Marker) null, a.c, str, objArr, (Throwable) null);
    }

    public void error(Marker marker, String str) {
        e(f1615i, marker, a.c, str, (Object[]) null, (Throwable) null);
    }

    public void error(Marker marker, String str, Object obj) {
        g(f1615i, marker, a.c, str, obj, (Throwable) null);
    }

    public void error(Marker marker, String str, Object obj, Object obj2) {
        h(f1615i, marker, a.c, str, obj, obj2, (Throwable) null);
    }

    public void error(Marker marker, String str, Throwable th) {
        e(f1615i, marker, a.c, str, (Object[]) null, th);
    }

    public void error(Marker marker, String str, Object... objArr) {
        e(f1615i, marker, a.c, str, objArr, (Throwable) null);
    }

    public final void g(String str, Marker marker, a aVar, String str2, Object obj, Throwable th) {
        f.a.a.b.w.h hVar;
        f.a.a.b.w.h hVar2 = f.a.a.b.w.h.NEUTRAL;
        c cVar = this.f1620h;
        if (cVar.r.size() == 0) {
            hVar = hVar2;
        } else {
            hVar = cVar.r.c(marker, this, aVar, str2, new Object[]{obj}, (Throwable) null);
        }
        if (hVar != hVar2) {
            a aVar2 = aVar;
            if (hVar == f.a.a.b.w.h.DENY) {
                return;
            }
        } else if (this.c > aVar.levelInt) {
            return;
        }
        b(str, marker, aVar, str2, new Object[]{obj}, (Throwable) null);
    }

    public String getName() {
        return this.name;
    }

    public final void h(String str, Marker marker, a aVar, String str2, Object obj, Object obj2, Throwable th) {
        f.a.a.b.w.h hVar;
        f.a.a.b.w.h hVar2 = f.a.a.b.w.h.NEUTRAL;
        c cVar = this.f1620h;
        if (cVar.r.size() == 0) {
            hVar = hVar2;
        } else {
            hVar = cVar.r.c(marker, this, aVar, str2, new Object[]{obj, obj2}, (Throwable) null);
        }
        if (hVar != hVar2) {
            a aVar2 = aVar;
            if (hVar == f.a.a.b.w.h.DENY) {
                return;
            }
        } else if (this.c > aVar.levelInt) {
            return;
        }
        b(str, marker, aVar, str2, new Object[]{obj, obj2}, (Throwable) null);
    }

    public b i(String str) {
        List<b> list = this.f1617e;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1617e.get(i2);
            if (str.equals(bVar.name)) {
                return bVar;
            }
        }
        return null;
    }

    public void info(String str) {
        e(f1615i, (Marker) null, a.f1611e, str, (Object[]) null, (Throwable) null);
    }

    public void info(String str, Object obj) {
        g(f1615i, (Marker) null, a.f1611e, str, obj, (Throwable) null);
    }

    public void info(String str, Object obj, Object obj2) {
        h(f1615i, (Marker) null, a.f1611e, str, obj, obj2, (Throwable) null);
    }

    public void info(String str, Throwable th) {
        e(f1615i, (Marker) null, a.f1611e, str, (Object[]) null, th);
    }

    public void info(String str, Object... objArr) {
        e(f1615i, (Marker) null, a.f1611e, str, objArr, (Throwable) null);
    }

    public void info(Marker marker, String str) {
        e(f1615i, marker, a.f1611e, str, (Object[]) null, (Throwable) null);
    }

    public void info(Marker marker, String str, Object obj) {
        g(f1615i, marker, a.f1611e, str, obj, (Throwable) null);
    }

    public void info(Marker marker, String str, Object obj, Object obj2) {
        h(f1615i, marker, a.f1611e, str, obj, obj2, (Throwable) null);
    }

    public void info(Marker marker, String str, Throwable th) {
        e(f1615i, marker, a.f1611e, str, (Object[]) null, th);
    }

    public void info(Marker marker, String str, Object... objArr) {
        e(f1615i, marker, a.f1611e, str, objArr, (Throwable) null);
    }

    public boolean isDebugEnabled() {
        return isDebugEnabled((Marker) null);
    }

    public boolean isDebugEnabled(Marker marker) {
        f.a.a.b.w.h c2 = c(marker, a.f1612f);
        if (c2 == f.a.a.b.w.h.NEUTRAL) {
            return this.c <= 10000;
        }
        if (c2 == f.a.a.b.w.h.DENY) {
            return false;
        }
        if (c2 == f.a.a.b.w.h.ACCEPT) {
            return true;
        }
        throw new IllegalStateException("Unknown FilterReply value: " + c2);
    }

    public boolean isErrorEnabled() {
        return isErrorEnabled((Marker) null);
    }

    public boolean isErrorEnabled(Marker marker) {
        f.a.a.b.w.h c2 = c(marker, a.c);
        if (c2 == f.a.a.b.w.h.NEUTRAL) {
            return this.c <= 40000;
        }
        if (c2 == f.a.a.b.w.h.DENY) {
            return false;
        }
        if (c2 == f.a.a.b.w.h.ACCEPT) {
            return true;
        }
        throw new IllegalStateException("Unknown FilterReply value: " + c2);
    }

    public boolean isInfoEnabled() {
        return isInfoEnabled((Marker) null);
    }

    public boolean isInfoEnabled(Marker marker) {
        f.a.a.b.w.h c2 = c(marker, a.f1611e);
        if (c2 == f.a.a.b.w.h.NEUTRAL) {
            return this.c <= 20000;
        }
        if (c2 == f.a.a.b.w.h.DENY) {
            return false;
        }
        if (c2 == f.a.a.b.w.h.ACCEPT) {
            return true;
        }
        throw new IllegalStateException("Unknown FilterReply value: " + c2);
    }

    public boolean isTraceEnabled() {
        return isTraceEnabled((Marker) null);
    }

    public boolean isTraceEnabled(Marker marker) {
        f.a.a.b.w.h c2 = c(marker, a.f1613g);
        if (c2 == f.a.a.b.w.h.NEUTRAL) {
            return this.c <= 5000;
        }
        if (c2 == f.a.a.b.w.h.DENY) {
            return false;
        }
        if (c2 == f.a.a.b.w.h.ACCEPT) {
            return true;
        }
        throw new IllegalStateException("Unknown FilterReply value: " + c2);
    }

    public boolean isWarnEnabled() {
        return isWarnEnabled((Marker) null);
    }

    public boolean isWarnEnabled(Marker marker) {
        f.a.a.b.w.h c2 = c(marker, a.f1610d);
        if (c2 == f.a.a.b.w.h.NEUTRAL) {
            return this.c <= 30000;
        }
        if (c2 == f.a.a.b.w.h.DENY) {
            return false;
        }
        if (c2 == f.a.a.b.w.h.ACCEPT) {
            return true;
        }
        throw new IllegalStateException("Unknown FilterReply value: " + c2);
    }

    public final synchronized void j(int i2) {
        if (this.b == null) {
            this.c = i2;
            List<b> list = this.f1617e;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    this.f1617e.get(i3).j(i2);
                }
            }
        }
    }

    public void k() {
        f.a.a.b.w.b<c> bVar = this.f1618f;
        if (bVar != null) {
            Iterator<f.a.a.b.a<E>> it = bVar.b.iterator();
            while (it.hasNext()) {
                it.next().stop();
            }
            bVar.b.clear();
        }
        this.c = AbstractNetAdapter.READ_TIMEOUT;
        this.b = this.f1616d == null ? a.f1612f : null;
        this.f1619g = true;
        if (this.f1617e != null) {
            Iterator it2 = new CopyOnWriteArrayList(this.f1617e).iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).k();
            }
        }
    }

    public synchronized void l(a aVar) {
        if (this.b != aVar) {
            if (aVar == null) {
                if (this.f1616d == null) {
                    throw new IllegalArgumentException("The level of the root logger cannot be set to null");
                }
            }
            this.b = aVar;
            if (aVar == null) {
                b bVar = this.f1616d;
                this.c = bVar.c;
                aVar = a.a(bVar.c);
            } else {
                this.c = aVar.levelInt;
            }
            List<b> list = this.f1617e;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f1617e.get(i2).j(this.c);
                }
            }
            for (e e2 : this.f1620h.o) {
                e2.e(this, aVar);
            }
        }
    }

    public void log(Marker marker, String str, int i2, String str2, Object[] objArr, Throwable th) {
        a aVar;
        if (i2 == 0) {
            aVar = a.f1613g;
        } else if (i2 == 10) {
            aVar = a.f1612f;
        } else if (i2 == 20) {
            aVar = a.f1611e;
        } else if (i2 == 30) {
            aVar = a.f1610d;
        } else if (i2 == 40) {
            aVar = a.c;
        } else {
            throw new IllegalArgumentException(i2 + " not a valid level value");
        }
        e(str, marker, aVar, str2, objArr, th);
    }

    public Object readResolve() throws ObjectStreamException {
        return LoggerFactory.getLogger(this.name);
    }

    public String toString() {
        return g.a.a.a.a.f(g.a.a.a.a.i("Logger["), this.name, "]");
    }

    public void trace(String str) {
        e(f1615i, (Marker) null, a.f1613g, str, (Object[]) null, (Throwable) null);
    }

    public void trace(String str, Object obj) {
        g(f1615i, (Marker) null, a.f1613g, str, obj, (Throwable) null);
    }

    public void trace(String str, Object obj, Object obj2) {
        h(f1615i, (Marker) null, a.f1613g, str, obj, obj2, (Throwable) null);
    }

    public void trace(String str, Throwable th) {
        e(f1615i, (Marker) null, a.f1613g, str, (Object[]) null, th);
    }

    public void trace(String str, Object... objArr) {
        e(f1615i, (Marker) null, a.f1613g, str, objArr, (Throwable) null);
    }

    public void trace(Marker marker, String str) {
        e(f1615i, marker, a.f1613g, str, (Object[]) null, (Throwable) null);
    }

    public void trace(Marker marker, String str, Object obj) {
        g(f1615i, marker, a.f1613g, str, obj, (Throwable) null);
    }

    public void trace(Marker marker, String str, Object obj, Object obj2) {
        h(f1615i, marker, a.f1613g, str, obj, obj2, (Throwable) null);
    }

    public void trace(Marker marker, String str, Throwable th) {
        e(f1615i, marker, a.f1613g, str, (Object[]) null, th);
    }

    public void trace(Marker marker, String str, Object... objArr) {
        e(f1615i, marker, a.f1613g, str, objArr, (Throwable) null);
    }

    public void warn(String str) {
        e(f1615i, (Marker) null, a.f1610d, str, (Object[]) null, (Throwable) null);
    }

    public void warn(String str, Object obj) {
        g(f1615i, (Marker) null, a.f1610d, str, obj, (Throwable) null);
    }

    public void warn(String str, Object obj, Object obj2) {
        h(f1615i, (Marker) null, a.f1610d, str, obj, obj2, (Throwable) null);
    }

    public void warn(String str, Throwable th) {
        e(f1615i, (Marker) null, a.f1610d, str, (Object[]) null, th);
    }

    public void warn(String str, Object... objArr) {
        e(f1615i, (Marker) null, a.f1610d, str, objArr, (Throwable) null);
    }

    public void warn(Marker marker, String str) {
        e(f1615i, marker, a.f1610d, str, (Object[]) null, (Throwable) null);
    }

    public void warn(Marker marker, String str, Object obj) {
        g(f1615i, marker, a.f1610d, str, obj, (Throwable) null);
    }

    public void warn(Marker marker, String str, Object obj, Object obj2) {
        h(f1615i, marker, a.f1610d, str, obj, obj2, (Throwable) null);
    }

    public void warn(Marker marker, String str, Throwable th) {
        e(f1615i, marker, a.f1610d, str, (Object[]) null, th);
    }

    public void warn(Marker marker, String str, Object... objArr) {
        e(f1615i, marker, a.f1610d, str, objArr, (Throwable) null);
    }
}
