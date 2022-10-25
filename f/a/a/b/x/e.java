package f.a.a.b.x;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class e implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final List<d> f1849g = new ArrayList(0);
    public int a;
    public final String b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public List<d> f1850d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f1851e;

    /* renamed from: f  reason: collision with root package name */
    public long f1852f = System.currentTimeMillis();

    public e(int i2, String str, Object obj, Throwable th) {
        this.a = i2;
        this.b = str;
        this.c = obj;
        this.f1851e = th;
    }

    public synchronized int a() {
        int i2;
        i2 = this.a;
        Iterator<d> it = iterator();
        while (it.hasNext()) {
            int a2 = it.next().a();
            if (a2 > i2) {
                i2 = a2;
            }
        }
        return i2;
    }

    public Long b() {
        return Long.valueOf(this.f1852f);
    }

    public synchronized void c(d dVar) {
        if (this.f1850d == null) {
            this.f1850d = new ArrayList();
        }
        this.f1850d.add(dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.a != eVar.a) {
            return false;
        }
        String str = this.b;
        String str2 = eVar.b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int getLevel() {
        return this.a;
    }

    public String getMessage() {
        return this.b;
    }

    public Throwable getThrowable() {
        return this.f1851e;
    }

    public synchronized boolean hasChildren() {
        List<d> list;
        list = this.f1850d;
        return list != null && list.size() > 0;
    }

    public int hashCode() {
        int i2 = (this.a + 31) * 31;
        String str = this.b;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public synchronized Iterator<d> iterator() {
        List<d> list = this.f1850d;
        if (list != null) {
            return list.iterator();
        }
        return f1849g.iterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.a()
            if (r1 == 0) goto L_0x0018
            r2 = 1
            if (r1 == r2) goto L_0x0015
            r2 = 2
            if (r1 == r2) goto L_0x0012
            goto L_0x001d
        L_0x0012:
            java.lang.String r1 = "ERROR"
            goto L_0x001a
        L_0x0015:
            java.lang.String r1 = "WARN"
            goto L_0x001a
        L_0x0018:
            java.lang.String r1 = "INFO"
        L_0x001a:
            r0.append(r1)
        L_0x001d:
            java.lang.Object r1 = r3.c
            if (r1 == 0) goto L_0x0030
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = " -"
            r0.append(r1)
        L_0x0030:
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r2 = r3.b
            r0.append(r2)
            java.lang.Throwable r2 = r3.f1851e
            if (r2 == 0) goto L_0x0046
            r0.append(r1)
            java.lang.Throwable r1 = r3.f1851e
            r0.append(r1)
        L_0x0046:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.x.e.toString():java.lang.String");
    }
}
