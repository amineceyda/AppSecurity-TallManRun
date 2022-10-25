package g.c.a.l.l;

import e.e.d.l.a;
import g.c.a.l.i;
import g.c.a.l.o.b;
import g.d.a.j.e;
import i.o.c.h;
import java.io.File;

public final class z implements b {
    public final /* synthetic */ String a;
    public final /* synthetic */ b0 b;
    public final /* synthetic */ String c;

    public z(String str, b0 b0Var, String str2) {
        this.a = str;
        this.b = b0Var;
        this.c = str2;
    }

    public void a() {
        b0.p.info("OnWalleListener onStart");
        i.a.a(this.a, 207);
        this.b.f2061d = System.currentTimeMillis();
        b0 b0Var = this.b;
        o oVar = b0Var.f2063f;
        oVar.c = 20;
        oVar.f2071e = 2009;
        e0 e0Var = b0Var.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar);
        }
    }

    public void b(File file) {
        a.h0(this, file);
    }

    public void c(double d2) {
        h.e(this, "this");
    }

    public void d(Throwable th) {
        h.e(th, e.u);
        b0.p.info(h.j("OnWalleListener onFailed", th));
        i.a.a(this.a, 209);
        b0 b0Var = this.b;
        o oVar = b0Var.f2063f;
        oVar.c = 22;
        oVar.f2071e = 2010;
        e0 e0Var = b0Var.f2064g;
        if (e0Var != null) {
            e0Var.a(oVar);
        }
    }

    public void e(String str) {
        a.i0(this, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.RuntimeException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.io.IOException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(g.c.a.l.o.i r30) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            java.lang.String r2 = "seekableByteChannel"
            i.o.c.h.e(r0, r2)
            org.slf4j.Logger r3 = g.c.a.l.l.b0.p
            java.lang.String r4 = "OnWalleListener onSuccess"
            r3.debug(r4)
            g.c.a.l.i r4 = g.c.a.l.i.a
            java.lang.String r5 = r1.a
            r6 = 208(0xd0, float:2.91E-43)
            r4.a(r5, r6)
            g.c.a.l.k r5 = g.c.a.l.k.a
            java.lang.String r5 = r1.c
            g.c.a.l.c r6 = g.c.a.l.c.UN_KNOW
            java.lang.String r7 = "name"
            i.o.c.h.e(r5, r7)
            int r7 = r5.length()
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L_0x002e
            r7 = 1
            goto L_0x002f
        L_0x002e:
            r7 = 0
        L_0x002f:
            if (r7 == 0) goto L_0x0032
            goto L_0x005a
        L_0x0032:
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r10 = ".apk"
            java.lang.String r10 = r10.toUpperCase(r7)
            java.lang.String r11 = "(this as java.lang.Strin….toUpperCase(Locale.ROOT)"
            i.o.c.h.d(r10, r11)
            r12 = 2
            boolean r10 = i.t.e.b(r5, r10, r8, r12)
            if (r10 == 0) goto L_0x0049
            g.c.a.l.c r6 = g.c.a.l.c.b
            goto L_0x005a
        L_0x0049:
            java.lang.String r10 = ".xapk"
            java.lang.String r7 = r10.toUpperCase(r7)
            i.o.c.h.d(r7, r11)
            boolean r5 = i.t.e.b(r5, r7, r8, r12)
            if (r5 == 0) goto L_0x005a
            g.c.a.l.c r6 = g.c.a.l.c.c
        L_0x005a:
            g.c.a.l.l.b0 r5 = r1.b
            g.c.a.l.l.o r5 = r5.f2063f
            r4.c(r5)
            g.c.a.l.l.b0 r4 = r1.b
            java.util.Objects.requireNonNull(r4)
            java.lang.String r5 = "Start install"
            r3.info(r5)
            g.c.b.b.j.b$a r3 = new g.c.b.b.j.b$a
            r3.<init>()
            r5 = 4
            r3.a = r5
            int r5 = r6.a()
            r3.b = r5
            r3.f2288e = r8
            g.c.a.l.l.y r5 = new g.c.a.l.l.y
            r5.<init>(r4)
            r3.b(r5)
            g.c.b.b.j.b r14 = r3.a()
            r4.a()
            r4.h()
            g.c.b.b.c$b r3 = g.c.b.b.c.f2226m
            g.c.b.b.c r12 = r3.a()
            android.content.Context r13 = r4.a
            g.c.a.l.l.x r11 = new g.c.a.l.l.x
            r11.<init>(r4)
            g.c.b.b.l.f r10 = g.c.b.b.l.f.FAST_DOWNLOAD
            java.util.Objects.requireNonNull(r12)
            java.lang.String r3 = "context"
            i.o.c.h.e(r13, r3)
            i.o.c.h.e(r0, r2)
            java.lang.String r2 = "apksListener"
            i.o.c.h.e(r11, r2)
            java.lang.String r2 = "installSource"
            i.o.c.h.e(r10, r2)
            org.slf4j.Logger r2 = g.c.b.b.c.n
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "origin installer, context:"
            r4.append(r5)
            r4.append(r13)
            java.lang.String r5 = ", seekableByteChannel:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = ", source: "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            r2.info(r4)
            java.util.List<java.lang.String> r4 = r12.f2234k
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r9
            if (r4 == 0) goto L_0x0124
            java.util.List<java.lang.String> r0 = r12.f2234k
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r3 = "seekableByteChannel installer, isNotEmpty 存在安装任务: installs: "
            java.lang.String r0 = i.o.c.h.j(r3, r0)
            r2.info(r0)
            g.c.b.b.i.c r0 = r14.f2285j
            if (r0 != 0) goto L_0x00f9
            goto L_0x0254
        L_0x00f9:
            g.c.b.b.j.a r2 = new g.c.b.b.j.a
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            java.util.Map<java.lang.String, java.lang.String> r3 = r14.f2286k
            r28 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r21 = "seekable install error,is installing"
            r15 = r2
            r27 = r3
            r15.<init>(r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = 22
            java.lang.String r4 = g.c.b.b.f.C(r3)
            r0.j(r2, r3, r4)
            goto L_0x0254
        L_0x0124:
            g.c.b.c.b.b r15 = g.c.b.c.b.b.a
            i.o.c.h.e(r13, r3)
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x013f }
            r3 = 26
            if (r2 < r3) goto L_0x013f
            m.a.b.a.a.a.b.h0 r16 = new m.a.b.a.a.a.b.h0     // Catch:{ Exception -> 0x013f }
            r7 = 0
            java.lang.String r4 = "unknown archive"
            java.lang.String r5 = "UTF8"
            r6 = 1
            r2 = r16
            r3 = r30
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x013f }
            goto L_0x0141
        L_0x013f:
            r16 = 0
        L_0x0141:
            r0 = r16
            g.c.b.c.b.a r0 = r15.d(r13, r0)
            r12.f2229f = r0
            r12.f2230g = r10
            g.c.b.b.l.e.e(r13)
            g.c.b.b.j.b r0 = r12.e(r14)
            r12.f2228e = r0
            g.c.b.b.i.e.k r2 = new g.c.b.b.i.e.k
            g.c.b.b.i.c r0 = r0.f2285j
            if (r0 != 0) goto L_0x015c
            goto L_0x0254
        L_0x015c:
            r2.<init>(r13, r0)
            r12.f2227d = r2
            g.c.b.c.b.a r0 = r12.f2229f
            if (r0 != 0) goto L_0x01a3
            g.c.b.b.j.b r0 = r12.f2228e
            if (r0 == 0) goto L_0x01a3
            org.slf4j.Logger r0 = g.c.b.b.c.n
            java.lang.String r2 = "seekable 安装的时提取 xapk 失败."
            r0.info(r2)
            g.c.b.b.i.e.k r0 = r12.f2227d
            i.o.c.h.c(r0)
            g.c.b.b.j.a r2 = new g.c.b.b.j.a
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            g.c.b.b.j.b r3 = r12.f2228e
            i.o.c.h.c(r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f2286k
            r26 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r19 = "seekable installer"
            r13 = r2
            r25 = r3
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3 = 21
            java.lang.String r4 = g.c.b.b.f.C(r3)
            r0.c(r2, r3, r4)
            goto L_0x0254
        L_0x01a3:
            g.c.b.b.m.d r2 = new g.c.b.b.m.d
            r2.<init>(r13)
            r12.f2233j = r2
            g.c.b.c.b.a r7 = r12.f2229f
            i.o.c.h.c(r7)
            g.c.b.b.e r3 = new g.c.b.b.e
            r15 = 0
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String r0 = "xApk"
            i.o.c.h.e(r7, r0)
            java.lang.String r0 = "listener"
            i.o.c.h.e(r3, r0)
            org.slf4j.Logger r0 = r2.b
            java.lang.String r4 = "SeekSessionPackageInstaller, installer"
            r0.info(r4)
            android.content.Context r0 = r2.a     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            android.content.pm.PackageInstaller$SessionParams r4 = new android.content.pm.PackageInstaller$SessionParams     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            r4.<init>(r9)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            r4.setInstallLocation(r8)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            int r4 = r0.createSession(r4)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            android.content.pm.PackageInstaller$Session r0 = r0.openSession(r4)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            r2.f2302d = r0     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            java.util.List<g.c.b.c.b.a$a> r0 = r7.f2311g     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            if (r0 != 0) goto L_0x01e9
            goto L_0x0254
        L_0x01e9:
            boolean r4 = r0.isEmpty()     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            if (r4 == 0) goto L_0x01f2
            r4 = 10
            goto L_0x01f3
        L_0x01f2:
            r4 = 1
        L_0x01f3:
            if (r4 == r9) goto L_0x01ff
            r4 = 14
            java.lang.String r5 = g.c.b.b.f.C(r4)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            r3.d(r4, r5)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            r8 = 1
        L_0x01ff:
            if (r8 == 0) goto L_0x0202
            goto L_0x0254
        L_0x0202:
            android.content.pm.PackageInstaller$Session r9 = r2.f2302d     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            if (r9 != 0) goto L_0x0207
            goto L_0x0254
        L_0x0207:
            j.a.x r4 = r2.c     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            g.c.b.b.m.c r13 = new g.c.b.b.m.c     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            r11 = 0
            r5 = r13
            r6 = r2
            r8 = r0
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            r11 = 0
            r12 = 0
            r14 = 3
            r15 = 0
            r10 = r4
            g.c.b.b.f.S(r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0239, RuntimeException -> 0x021c }
            goto L_0x0254
        L_0x021c:
            r0 = move-exception
            java.lang.String r4 = g.c.b.b.f.D(r0)
            android.content.pm.PackageInstaller$Session r5 = r2.f2302d
            if (r5 != 0) goto L_0x0226
            goto L_0x0229
        L_0x0226:
            r5.abandon()
        L_0x0229:
            android.content.pm.PackageInstaller$Session r5 = r2.f2302d
            if (r5 != 0) goto L_0x022e
            goto L_0x0231
        L_0x022e:
            r5.close()
        L_0x0231:
            r5 = 6
            r3.d(r5, r4)
            r0.printStackTrace()
            goto L_0x024d
        L_0x0239:
            r0 = move-exception
            java.lang.String r4 = g.c.b.b.f.D(r0)
            android.content.pm.PackageInstaller$Session r5 = r2.f2302d
            if (r5 != 0) goto L_0x0243
            goto L_0x0246
        L_0x0243:
            r5.close()
        L_0x0246:
            r5 = 5
            r3.d(r5, r4)
            r0.printStackTrace()
        L_0x024d:
            org.slf4j.Logger r2 = r2.b
            java.lang.String r3 = "SeekSessionPackageInstaller, installer exception"
            r2.error((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x0254:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.l.z.f(g.c.a.l.o.i):void");
    }

    public void g() {
        h.e(this, "this");
    }
}
