package g.d.a.l.t.b0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import org.slf4j.helpers.MessageFormatter;

public final class i implements b {
    public final g<a, Object> a = new g<>();
    public final b b = new b();
    public final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, a<?>> f2436d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f2437e;

    /* renamed from: f  reason: collision with root package name */
    public int f2438f;

    public static final class a implements l {
        public final b a;
        public int b;
        public Class<?> c;

        public a(b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            int i2 = this.b * 31;
            Class<?> cls = this.c;
            return i2 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("Key{size=");
            i2.append(this.b);
            i2.append("array=");
            i2.append(this.c);
            i2.append(MessageFormatter.DELIM_STOP);
            return i2.toString();
        }
    }

    public static final class b extends c<a> {
        public l a() {
            return new a(this);
        }

        public a d(int i2, Class<?> cls) {
            a aVar = (a) b();
            aVar.b = i2;
            aVar.c = cls;
            return aVar;
        }
    }

    public i(int i2) {
        this.f2437e = i2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x000f
            monitor-enter(r1)     // Catch:{ all -> 0x0020 }
            r2 = 0
            r1.f(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            goto L_0x001e
        L_0x000c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r2     // Catch:{ all -> 0x0020 }
        L_0x000f:
            r0 = 20
            if (r2 >= r0) goto L_0x0017
            r0 = 15
            if (r2 != r0) goto L_0x001e
        L_0x0017:
            int r2 = r1.f2437e     // Catch:{ all -> 0x0020 }
            int r2 = r2 / 2
            r1.f(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.t.b0.i.a(int):void");
    }

    public synchronized void b() {
        f(0);
    }

    public synchronized <T> T c(int i2, Class<T> cls) {
        a aVar;
        aVar = (a) this.b.b();
        aVar.b = i2;
        aVar.c = cls;
        return h(aVar, cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T> T d(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.i(r7)     // Catch:{ all -> 0x004d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x004d }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x004d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x004d }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f2438f     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f2437e     // Catch:{ all -> 0x004d }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = 0
            goto L_0x0021
        L_0x0020:
            r3 = 1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x004d }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x003a
            g.d.a.l.t.b0.i$b r6 = r5.b     // Catch:{ all -> 0x004d }
            int r0 = r0.intValue()     // Catch:{ all -> 0x004d }
            g.d.a.l.t.b0.i$a r6 = r6.d(r0, r7)     // Catch:{ all -> 0x004d }
            goto L_0x0047
        L_0x003a:
            g.d.a.l.t.b0.i$b r0 = r5.b     // Catch:{ all -> 0x004d }
            g.d.a.l.t.b0.l r0 = r0.b()     // Catch:{ all -> 0x004d }
            g.d.a.l.t.b0.i$a r0 = (g.d.a.l.t.b0.i.a) r0     // Catch:{ all -> 0x004d }
            r0.b = r6     // Catch:{ all -> 0x004d }
            r0.c = r7     // Catch:{ all -> 0x004d }
            r6 = r0
        L_0x0047:
            java.lang.Object r6 = r5.h(r6, r7)     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return r6
        L_0x004d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.t.b0.i.d(int, java.lang.Class):java.lang.Object");
    }

    public final void e(int i2, Class<?> cls) {
        NavigableMap<Integer, Integer> i3 = i(cls);
        Integer num = (Integer) i3.get(Integer.valueOf(i2));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i2);
            if (intValue == 1) {
                i3.remove(valueOf);
            } else {
                i3.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
        }
    }

    public final void f(int i2) {
        while (this.f2438f > i2) {
            Object c2 = this.a.c();
            Objects.requireNonNull(c2, "Argument must not be null");
            a<?> g2 = g(c2.getClass());
            this.f2438f -= g2.c() * g2.b(c2);
            e(g2.b(c2), c2.getClass());
            if (Log.isLoggable(g2.a(), 2)) {
                String a2 = g2.a();
                StringBuilder i3 = g.a.a.a.a.i("evicted: ");
                i3.append(g2.b(c2));
                Log.v(a2, i3.toString());
            }
        }
    }

    public final <T> a<T> g(Class<T> cls) {
        a<T> aVar = this.f2436d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new h();
            } else if (cls.equals(byte[].class)) {
                aVar = new f();
            } else {
                StringBuilder i2 = g.a.a.a.a.i("No array pool found for: ");
                i2.append(cls.getSimpleName());
                throw new IllegalArgumentException(i2.toString());
            }
            this.f2436d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        a<T> g2 = g(cls);
        T a2 = this.a.a(aVar);
        if (a2 != null) {
            this.f2438f -= g2.c() * g2.b(a2);
            e(g2.b(a2), cls);
        }
        if (a2 != null) {
            return a2;
        }
        if (Log.isLoggable(g2.a(), 2)) {
            String a3 = g2.a();
            StringBuilder i2 = g.a.a.a.a.i("Allocated ");
            i2.append(aVar.b);
            i2.append(" bytes");
            Log.v(a3, i2.toString());
        }
        return g2.newArray(aVar.b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    public synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        a<?> g2 = g(cls);
        int b2 = g2.b(t);
        int c2 = g2.c() * b2;
        int i2 = 1;
        if (c2 <= this.f2437e / 2) {
            a d2 = this.b.d(b2, cls);
            this.a.b(d2, t);
            NavigableMap<Integer, Integer> i3 = i(cls);
            Integer num = (Integer) i3.get(Integer.valueOf(d2.b));
            Integer valueOf = Integer.valueOf(d2.b);
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            i3.put(valueOf, Integer.valueOf(i2));
            this.f2438f += c2;
            f(this.f2437e);
        }
    }
}
