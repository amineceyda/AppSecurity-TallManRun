package g.c.b.b.m;

import g.c.b.c.b.a;
import i.f;
import i.j;
import i.o.c.h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class f {
    public final File a;
    public final a b;
    public final g.c.b.b.i.a c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f2307d = new ArrayList();

    public f(File file, a aVar, g.c.b.b.i.a aVar2) {
        Object obj;
        h.e(file, "tempApksFile");
        h.e(aVar, "xapk");
        h.e(aVar2, "callback");
        this.a = file;
        this.b = aVar;
        this.c = aVar2;
        try {
            a();
            obj = j.a;
        } catch (Throwable th) {
            obj = g.c.b.b.f.v(th);
        }
        Throwable a2 = i.f.a(obj);
        if (a2 != null) {
            this.c.d(15, g.c.b.b.f.D(a2));
        }
        if (!(obj instanceof f.a)) {
            j jVar = (j) obj;
            this.c.b(this.f2307d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        g.c.b.b.f.s(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
        g.c.b.b.f.s(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cf, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r13 = this;
            java.lang.String r0 = "file.path"
            g.c.b.c.b.a r1 = r13.b
            java.util.List<g.c.b.c.b.a$a> r1 = r1.f2311g
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r4 = r2
        L_0x0010:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0020
            java.lang.Object r6 = r1.next()
            g.c.b.c.b.a$a r6 = (g.c.b.c.b.a.C0077a) r6
            long r6 = r6.b
            long r4 = r4 + r6
            goto L_0x0010
        L_0x0020:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0025
            return
        L_0x0025:
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r1 = new byte[r1]
            g.c.b.c.b.a r6 = r13.b
            java.util.List<g.c.b.c.b.a$a> r6 = r6.f2311g
            if (r6 != 0) goto L_0x0031
            goto L_0x00d0
        L_0x0031:
            java.util.Iterator r6 = r6.iterator()
        L_0x0035:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00d0
            java.lang.Object r7 = r6.next()
            g.c.b.c.b.a$a r7 = (g.c.b.c.b.a.C0077a) r7
            g.c.b.c.b.a r8 = r13.b
            java.lang.String r9 = r7.a
            if (r9 != 0) goto L_0x0048
            goto L_0x0035
        L_0x0048:
            i.o.b.l<java.lang.String, java.io.InputStream> r8 = r8.a
            java.lang.Object r8 = r8.g(r9)
            java.io.InputStream r8 = (java.io.InputStream) r8
            if (r8 != 0) goto L_0x0053
            goto L_0x0035
        L_0x0053:
            java.io.File r9 = r13.a
            java.lang.String r7 = r7.a
            if (r7 != 0) goto L_0x005a
            goto L_0x0035
        L_0x005a:
            java.io.File r10 = new java.io.File
            r10.<init>(r9, r7)
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream
            r7.<init>(r8)
            java.io.File r8 = r10.getParentFile()     // Catch:{ all -> 0x00c9 }
            if (r8 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r8.mkdirs()     // Catch:{ all -> 0x00c9 }
        L_0x006e:
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c9 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x00c9 }
            r9.<init>(r10)     // Catch:{ all -> 0x00c9 }
            r8.<init>(r9)     // Catch:{ all -> 0x00c9 }
        L_0x0078:
            int r9 = r7.read(r1)     // Catch:{ all -> 0x00c2 }
            if (r9 > 0) goto L_0x0097
            java.util.List<java.lang.String> r9 = r13.f2307d     // Catch:{ all -> 0x00c2 }
            java.lang.String r11 = r10.getPath()     // Catch:{ all -> 0x00c2 }
            i.o.c.h.d(r11, r0)     // Catch:{ all -> 0x00c2 }
            r9.add(r11)     // Catch:{ all -> 0x00c2 }
            g.c.b.b.i.a r9 = r13.c     // Catch:{ all -> 0x00c2 }
            java.lang.String r10 = r10.getPath()     // Catch:{ all -> 0x00c2 }
            i.o.c.h.d(r10, r0)     // Catch:{ all -> 0x00c2 }
            r9.a(r10)     // Catch:{ all -> 0x00c2 }
            goto L_0x00b9
        L_0x0097:
            r11 = 0
            r8.write(r1, r11, r9)     // Catch:{ all -> 0x00c2 }
            long r11 = (long) r9     // Catch:{ all -> 0x00c2 }
            long r2 = r2 + r11
            g.c.b.b.i.a r9 = r13.c     // Catch:{ all -> 0x00c2 }
            float r11 = (float) r2     // Catch:{ all -> 0x00c2 }
            float r12 = (float) r4     // Catch:{ all -> 0x00c2 }
            float r11 = r11 / r12
            r12 = 2
            boolean r9 = r9.c(r11, r12)     // Catch:{ all -> 0x00c2 }
            if (r9 == 0) goto L_0x0078
            g.c.b.b.i.a r9 = r13.c     // Catch:{ all -> 0x00c2 }
            r10 = 7
            java.lang.String r11 = g.c.b.b.f.C(r10)     // Catch:{ all -> 0x00c2 }
            java.lang.String r12 = "_splitApks"
            java.lang.String r11 = i.o.c.h.j(r11, r12)     // Catch:{ all -> 0x00c2 }
            r9.d(r10, r11)     // Catch:{ all -> 0x00c2 }
        L_0x00b9:
            r9 = 0
            g.c.b.b.f.s(r8, r9)     // Catch:{ all -> 0x00c9 }
            g.c.b.b.f.s(r7, r9)
            goto L_0x0035
        L_0x00c2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            g.c.b.b.f.s(r8, r0)     // Catch:{ all -> 0x00c9 }
            throw r1     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
            g.c.b.b.f.s(r7, r0)
            throw r1
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.m.f.a():void");
    }
}
