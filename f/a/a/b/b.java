package f.a.a.b;

import f.a.a.b.w.d;
import f.a.a.b.w.g;
import g.a.a.a.a;

public abstract class b<E> extends d implements a<E> {

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f1675e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1676f = false;

    /* renamed from: g  reason: collision with root package name */
    public String f1677g;

    /* renamed from: h  reason: collision with root package name */
    public g<E> f1678h = new g<>();

    /* renamed from: i  reason: collision with root package name */
    public int f1679i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f1680j = 0;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0038=Splitter:B:13:0x0038, B:26:0x004d=Splitter:B:26:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(E r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1676f     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r0 = 5
            r1 = 1
            r2 = 0
            r4.f1676f = r1     // Catch:{ Exception -> 0x0052 }
            boolean r1 = r4.f1675e     // Catch:{ Exception -> 0x0052 }
            if (r1 != 0) goto L_0x003c
            int r5 = r4.f1679i     // Catch:{ Exception -> 0x0052 }
            int r1 = r5 + 1
            r4.f1679i = r1     // Catch:{ Exception -> 0x0052 }
            if (r5 >= r0) goto L_0x0038
            f.a.a.b.x.h r5 = new f.a.a.b.x.h     // Catch:{ Exception -> 0x0052 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052 }
            r1.<init>()     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "Attempted to append to non started appender ["
            r1.append(r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = r4.f1677g     // Catch:{ Exception -> 0x0052 }
            r1.append(r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r3 = "]."
            r1.append(r3)     // Catch:{ Exception -> 0x0052 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0052 }
            r5.<init>(r1, r4)     // Catch:{ Exception -> 0x0052 }
            r4.o(r5)     // Catch:{ Exception -> 0x0052 }
        L_0x0038:
            r4.f1676f = r2     // Catch:{ all -> 0x007c }
            monitor-exit(r4)
            return
        L_0x003c:
            f.a.a.b.w.g<E> r1 = r4.f1678h     // Catch:{ Exception -> 0x0052 }
            f.a.a.b.w.h r1 = r1.a(r5)     // Catch:{ Exception -> 0x0052 }
            f.a.a.b.w.h r3 = f.a.a.b.w.h.DENY     // Catch:{ Exception -> 0x0052 }
            if (r1 != r3) goto L_0x004a
            r4.f1676f = r2     // Catch:{ all -> 0x007c }
            monitor-exit(r4)
            return
        L_0x004a:
            r4.s(r5)     // Catch:{ Exception -> 0x0052 }
        L_0x004d:
            r4.f1676f = r2     // Catch:{ all -> 0x007c }
            goto L_0x0077
        L_0x0050:
            r5 = move-exception
            goto L_0x0079
        L_0x0052:
            r5 = move-exception
            int r1 = r4.f1680j     // Catch:{ all -> 0x0050 }
            int r3 = r1 + 1
            r4.f1680j = r3     // Catch:{ all -> 0x0050 }
            if (r1 >= r0) goto L_0x004d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r0.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "Appender ["
            r0.append(r1)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = r4.f1677g     // Catch:{ all -> 0x0050 }
            r0.append(r1)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "] failed to append."
            r0.append(r1)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0050 }
            r4.c(r0, r5)     // Catch:{ all -> 0x0050 }
            goto L_0x004d
        L_0x0077:
            monitor-exit(r4)
            return
        L_0x0079:
            r4.f1676f = r2     // Catch:{ all -> 0x007c }
            throw r5     // Catch:{ all -> 0x007c }
        L_0x007c:
            r5 = move-exception
            monitor-exit(r4)
            goto L_0x0080
        L_0x007f:
            throw r5
        L_0x0080:
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.b.a(java.lang.Object):void");
    }

    public void e(String str) {
        this.f1677g = str;
    }

    public String getName() {
        return this.f1677g;
    }

    public boolean k() {
        return this.f1675e;
    }

    public abstract void s(E e2);

    public void start() {
        this.f1675e = true;
    }

    public void stop() {
        this.f1675e = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        return a.f(sb, this.f1677g, "]");
    }
}
