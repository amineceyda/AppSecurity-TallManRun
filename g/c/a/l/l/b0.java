package g.c.a.l.l;

import android.content.Context;
import com.apkpure.aegon.signstuff.apk.XApkDownloadTask;
import g.c.a.e.c.b;
import g.c.b.b.f;
import g.c.b.b.j.a;
import i.l.c;
import i.o.c.h;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class b0 extends d0 {
    public static final Logger p = LoggerFactory.getLogger("ApkManagerSeekableManagerLog");

    /* renamed from: m  reason: collision with root package name */
    public b.C0060b f2057m;
    public XApkDownloadTask.b n;
    public int o;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(g.c.a.l.l.o r16, g.c.a.e.h.b.a r17, g.c.a.l.l.e0 r18) {
        /*
            r15 = this;
            r8 = r15
            r0 = r17
            r1 = r18
            java.lang.String r2 = "apkDescription"
            r9 = r16
            i.o.c.h.e(r9, r2)
            java.lang.String r2 = "dtPageInfo"
            i.o.c.h.e(r0, r2)
            java.lang.String r10 = "listener"
            i.o.c.h.e(r1, r10)
            r8.f2064g = r1
            r15.l(r16)
            r8.f2065h = r0
            java.lang.String r1 = "fast_download_pop"
            r0.pop_type = r1
            java.lang.String r1 = r16.b()
            r0.fastDownloadId = r1
            g.c.a.e.h.b.a r0 = r8.f2065h
            if (r0 != 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            java.lang.String r1 = r16.c()
            r0.sourceRecommendId = r1
        L_0x0032:
            com.apkpure.aegon.components.models.Asset r0 = r15.b(r16)
            g.c.a.l.k r1 = g.c.a.l.k.a
            r11 = 0
            if (r0 != 0) goto L_0x003d
            r1 = r11
            goto L_0x0041
        L_0x003d:
            java.lang.String r1 = r0.a()
        L_0x0041:
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = r16.f()
        L_0x0047:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r12 = g.c.a.l.k.c(r1)
            org.slf4j.Logger r13 = p
            java.lang.String r1 = "ApkManagerSeekableManager init, "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            android.content.Context r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r3 = r16.a()
            r1.append(r3)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r13.info(r1)
            int r1 = r16.a()
            r3 = 93
            r14 = 0
            if (r1 > 0) goto L_0x009f
            java.lang.String r1 = "ApkManagerFileManager check, illegal app id["
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            int r2 = r16.a()
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r13.info(r1)
            r1 = 11
            r2 = 2025(0x7e9, float:2.838E-42)
            r2 = 11
            r3 = 2025(0x7e9, float:2.838E-42)
            goto L_0x0117
        L_0x009f:
            if (r12 == 0) goto L_0x00aa
            int r1 = r12.length()
            if (r1 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            r1 = 0
            goto L_0x00ab
        L_0x00aa:
            r1 = 1
        L_0x00ab:
            if (r1 == 0) goto L_0x00cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ApkManagerFileManager check, illegal storage path["
            r1.append(r2)
            r1.append(r12)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r13.info(r1)
            r1 = 62
            r2 = 2026(0x7ea, float:2.839E-42)
            r2 = 62
            r3 = 2026(0x7ea, float:2.839E-42)
            goto L_0x0117
        L_0x00cd:
            boolean r1 = r15.m(r16)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r1 = "init onSuccess: apk had installed"
            r13.info(r1)
            goto L_0x0121
        L_0x00d9:
            android.content.Context r1 = r8.a
            android.content.Context r3 = com.apkpure.aegon.application.AegonApplication.getContext()
            java.lang.String r3 = g.c.a.l.k.b(r3)
            java.lang.Boolean r1 = g.c.a.e.d.d.b(r1, r3)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0120
            java.lang.String r1 = "ApkManagerFileManager init, "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            android.content.Context r3 = r8.a
            r1.append(r3)
            r1.append(r2)
            int r3 = r16.a()
            r1.append(r3)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r13.info(r1)
            r1 = 62
            r2 = 2021(0x7e5, float:2.832E-42)
            r2 = 62
            r3 = 2021(0x7e5, float:2.832E-42)
        L_0x0117:
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r15
            g.c.a.l.l.d0.e(r1, r2, r3, r4, r6, r7)
            goto L_0x0121
        L_0x0120:
            r14 = 1
        L_0x0121:
            if (r14 != 0) goto L_0x0129
            java.lang.String r0 = "ApkManagerFileManager check fail."
            r13.info(r0)
            return
        L_0x0129:
            int r1 = r16.a()
            java.io.File r2 = new java.io.File
            android.content.Context r3 = r8.a
            java.lang.String r3 = g.c.a.l.k.b(r3)
            r2.<init>(r3)
            g.c.a.l.o.h r3 = g.c.a.l.o.h.c
            g.c.a.l.o.a r3 = g.c.a.l.o.h.c()
            g.c.a.l.l.a0 r4 = new g.c.a.l.l.a0
            r4.<init>(r15, r0, r12)
            g.c.a.l.o.h r3 = (g.c.a.l.o.h) r3
            r3.b(r2, r1, r12, r4)
            g.c.a.l.l.o r0 = r8.f2063f
            int r0 = r0.a()
            g.c.a.l.l.o r1 = r8.f2063f
            java.lang.String r1 = r1.g()
            java.io.File r2 = new java.io.File
            android.content.Context r3 = com.apkpure.aegon.application.AegonApplication.getContext()
            java.lang.String r3 = g.c.a.l.k.b(r3)
            r2.<init>(r3)
            g.c.a.l.o.a r3 = g.c.a.l.o.h.c()
            g.c.a.l.l.z r4 = new g.c.a.l.l.z
            r4.<init>(r1, r15, r12)
            g.c.a.l.o.h r3 = (g.c.a.l.o.h) r3
            java.lang.String r1 = "inFile"
            i.o.c.h.e(r2, r1)
            i.o.c.h.e(r4, r10)
            org.slf4j.Logger r1 = g.c.a.l.o.h.f2080d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = "getSeekableByteChannel ifFile:{} , chooseId:{} "
            r1.debug((java.lang.String) r6, (java.lang.Object) r2, (java.lang.Object) r5)
            r3.b = r4     // Catch:{ Exception -> 0x0187 }
            g.c.a.l.o.k r1 = g.c.a.l.o.k.SEEKABLE     // Catch:{ Exception -> 0x0187 }
            r3.d(r2, r0, r11, r1)     // Catch:{ Exception -> 0x0187 }
            goto L_0x018b
        L_0x0187:
            r0 = move-exception
            r4.d(r0)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.l.b0.c(g.c.a.l.l.o, g.c.a.e.h.b.a, g.c.a.l.l.e0):void");
    }

    public void f() {
        j();
        f.f(this.c, (CancellationException) null, 1);
        try {
            n();
            b.C0060b bVar = this.f2057m;
            if (bVar != null) {
                bVar.b();
            }
        } catch (Exception e2) {
            p.error(h.j("onDestroy e:", e2));
        }
    }

    public void g(Context context, String str) {
        a aVar;
        h.e(context, "context");
        h.e(str, "packageName");
        o oVar = this.f2063f;
        if (oVar == null) {
            aVar = null;
        } else {
            aVar = oVar.f2072f;
        }
        if (aVar != null) {
            a aVar2 = oVar == null ? null : oVar.f2072f;
            Map<String, Object> j2 = c.j(e.e.d.l.a.D(aVar2));
            o oVar2 = this.f2063f;
            if (oVar2 != null) {
                oVar2.f2072f = null;
            }
            j2.put("fail_desc", "4");
            e.e.d.l.a.r0("AppSuccInstall", aVar2, j2);
        }
        if (this.f2063f.c != 100) {
            d0.e(this, 100, 0, 0.0d, 4, (Object) null);
        }
    }

    public boolean i() {
        return false;
    }
}
