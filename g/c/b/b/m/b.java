package g.c.b.b.m;

import android.content.pm.PackageInstaller;
import g.c.b.c.b.a;
import i.j;
import i.m.d;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import j.a.x;
import java.util.List;

@e(c = "com.apkpure.components.installer.xapk.SeekSessionPackageInstaller$addApkFileToInstallSession$2", f = "SeekableSessionPackageInstaller.kt", l = {}, m = "invokeSuspend")
public final class b extends h implements p<x, d<? super Object>, Object> {
    public final /* synthetic */ List<a.C0077a> $apkFiles;
    public final /* synthetic */ g.c.b.b.i.a $listener;
    public final /* synthetic */ PackageInstaller.Session $session;
    public final /* synthetic */ a $xApk;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, List<a.C0077a> list, a aVar, PackageInstaller.Session session, g.c.b.b.i.a aVar2, d<? super b> dVar2) {
        super(2, dVar2);
        this.this$0 = dVar;
        this.$apkFiles = list;
        this.$xApk = aVar;
        this.$session = session;
        this.$listener = aVar2;
    }

    public final d<j> a(Object obj, d<?> dVar) {
        b bVar = new b(this.this$0, this.$apkFiles, this.$xApk, this.$session, this.$listener, dVar);
        bVar.L$0 = obj;
        return bVar;
    }

    public Object d(Object obj, Object obj2) {
        return ((b) a((x) obj, (d) obj2)).l(j.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        r11.abandon();
        r11.close();
        g.c.b.b.f.f(r0.c, (java.util.concurrent.CancellationException) null, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        g.c.b.b.f.s(r6, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        g.c.b.b.f.s(r5, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        g.c.b.b.f.s(r13, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r11.fsync(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        g.c.b.b.f.s(r6, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        g.c.b.b.f.s(r5, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        g.c.b.b.f.s(r13, (java.lang.Throwable) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.label
            if (r0 != 0) goto L_0x0105
            g.c.b.b.f.q0(r22)
            java.lang.Object r0 = r1.L$0
            j.a.x r0 = (j.a.x) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            g.c.b.b.m.d r0 = r1.this$0
            java.util.List<g.c.b.c.b.a$a> r3 = r1.$apkFiles
            g.c.b.c.b.a r4 = r1.$xApk
            android.content.pm.PackageInstaller$Session r11 = r1.$session
            g.c.b.b.i.a r12 = r1.$listener
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r14 = new byte[r5]     // Catch:{ all -> 0x00ea }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x00ea }
            java.util.Iterator r5 = r3.iterator()     // Catch:{ all -> 0x00ea }
            r9 = 0
        L_0x0029:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x00ea }
            if (r8 == 0) goto L_0x0039
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x00ea }
            g.c.b.c.b.a$a r8 = (g.c.b.c.b.a.C0077a) r8     // Catch:{ all -> 0x00ea }
            long r6 = r8.b     // Catch:{ all -> 0x00ea }
            long r9 = r9 + r6
            goto L_0x0029
        L_0x0039:
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ea }
            r15 = 0
        L_0x003f:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00ea }
            if (r5 == 0) goto L_0x00e7
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00ea }
            g.c.b.c.b.a$a r5 = (g.c.b.c.b.a.C0077a) r5     // Catch:{ all -> 0x00ea }
            java.lang.String r6 = r5.a     // Catch:{ all -> 0x00ea }
            if (r6 != 0) goto L_0x0051
            goto L_0x00e7
        L_0x0051:
            r2.add(r6)     // Catch:{ all -> 0x00ea }
            i.o.b.l<java.lang.String, java.io.InputStream> r5 = r4.a     // Catch:{ all -> 0x00ea }
            java.lang.Object r5 = r5.g(r6)     // Catch:{ all -> 0x00ea }
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch:{ all -> 0x00ea }
            if (r5 != 0) goto L_0x0060
            goto L_0x00e7
        L_0x0060:
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ea }
            r7.<init>(r5)     // Catch:{ all -> 0x00ea }
            r17 = 0
            r19 = -1
            r5 = r11
            r13 = r7
            r7 = r17
            r18 = r3
            r17 = r4
            r3 = r9
            r9 = r19
            java.io.OutputStream r5 = r5.openWrite(r6, r7, r9)     // Catch:{ all -> 0x00de }
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00d5 }
            r6.<init>(r13)     // Catch:{ all -> 0x00d5 }
        L_0x007d:
            int r7 = r6.read(r14)     // Catch:{ all -> 0x00cc }
            java.lang.Integer r8 = new java.lang.Integer     // Catch:{ all -> 0x00cc }
            r8.<init>(r7)     // Catch:{ all -> 0x00cc }
            int r7 = r8.intValue()     // Catch:{ all -> 0x00cc }
            int r8 = r8.intValue()     // Catch:{ all -> 0x00cc }
            r9 = 0
            if (r8 < 0) goto L_0x00b9
            r8 = 0
            r5.write(r14, r8, r7)     // Catch:{ all -> 0x00cc }
            long r7 = (long) r7     // Catch:{ all -> 0x00cc }
            long r7 = r7 + r15
            float r10 = (float) r7     // Catch:{ all -> 0x00cc }
            float r15 = (float) r3     // Catch:{ all -> 0x00cc }
            float r10 = r10 / r15
            r15 = 2
            boolean r10 = r12.c(r10, r15)     // Catch:{ all -> 0x00cc }
            if (r10 == 0) goto L_0x00b7
            r11.abandon()     // Catch:{ all -> 0x00cc }
            r11.close()     // Catch:{ all -> 0x00cc }
            j.a.x r0 = r0.c     // Catch:{ all -> 0x00cc }
            r3 = 1
            g.c.b.b.f.f(r0, r9, r3)     // Catch:{ all -> 0x00cc }
            g.c.b.b.f.s(r6, r9)     // Catch:{ all -> 0x00d5 }
            g.c.b.b.f.s(r5, r9)     // Catch:{ all -> 0x00de }
            g.c.b.b.f.s(r13, r9)     // Catch:{ all -> 0x00ea }
            goto L_0x00e7
        L_0x00b7:
            r15 = r7
            goto L_0x007d
        L_0x00b9:
            r11.fsync(r5)     // Catch:{ all -> 0x00cc }
            g.c.b.b.f.s(r6, r9)     // Catch:{ all -> 0x00d5 }
            g.c.b.b.f.s(r5, r9)     // Catch:{ all -> 0x00de }
            g.c.b.b.f.s(r13, r9)     // Catch:{ all -> 0x00ea }
            r9 = r3
            r4 = r17
            r3 = r18
            goto L_0x003f
        L_0x00cc:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            r4 = r0
            g.c.b.b.f.s(r6, r3)     // Catch:{ all -> 0x00d5 }
            throw r4     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            r4 = r0
            g.c.b.b.f.s(r5, r3)     // Catch:{ all -> 0x00de }
            throw r4     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            r4 = r0
            g.c.b.b.f.s(r13, r3)     // Catch:{ all -> 0x00ea }
            throw r4     // Catch:{ all -> 0x00ea }
        L_0x00e7:
            i.j r0 = i.j.a     // Catch:{ all -> 0x00ea }
            goto L_0x00ef
        L_0x00ea:
            r0 = move-exception
            java.lang.Object r0 = g.c.b.b.f.v(r0)
        L_0x00ef:
            java.lang.Throwable r3 = i.f.a(r0)
            if (r3 == 0) goto L_0x00f6
            return r3
        L_0x00f6:
            boolean r3 = r0 instanceof i.f.a
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x00ff
            i.j r0 = (i.j) r0
            return r2
        L_0x00ff:
            i.f r2 = new i.f
            r2.<init>(r0)
            return r2
        L_0x0105:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            goto L_0x010e
        L_0x010d:
            throw r0
        L_0x010e:
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.m.b.l(java.lang.Object):java.lang.Object");
    }
}
