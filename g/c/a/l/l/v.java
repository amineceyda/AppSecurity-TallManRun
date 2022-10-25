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

public final class v extends d0 {
    public static final Logger o = LoggerFactory.getLogger("ApkManagerFileManagerLog");

    /* renamed from: m  reason: collision with root package name */
    public b.C0060b f2077m;
    public XApkDownloadTask.b n;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(g.c.a.l.l.o r12, g.c.a.e.h.b.a r13, g.c.a.l.l.e0 r14) {
        /*
            r11 = this;
            java.lang.String r2 = "apkDescription"
            i.o.c.h.e(r12, r2)
            java.lang.String r2 = "dtPageInfo"
            i.o.c.h.e(r13, r2)
            java.lang.String r2 = "listener"
            i.o.c.h.e(r14, r2)
            android.content.Context r2 = r11.a
            java.lang.String r4 = "<set-?>"
            i.o.c.h.e(r2, r4)
            r11.a = r2
            r11.f2064g = r14
            r11.l(r12)
            r11.f2065h = r13
            java.lang.String r1 = "fast_download_pop"
            r13.pop_type = r1
            java.lang.String r1 = r12.b()
            r13.fastDownloadId = r1
            g.c.a.e.h.b.a r0 = r11.f2065h
            if (r0 != 0) goto L_0x002e
            goto L_0x0034
        L_0x002e:
            java.lang.String r1 = r12.c()
            r0.sourceRecommendId = r1
        L_0x0034:
            com.apkpure.aegon.components.models.Asset r7 = r11.b(r12)
            g.c.a.l.k r0 = g.c.a.l.k.a
            if (r7 != 0) goto L_0x003e
            r0 = 0
            goto L_0x0042
        L_0x003e:
            java.lang.String r0 = r7.a()
        L_0x0042:
            if (r0 != 0) goto L_0x0048
            java.lang.String r0 = r12.f()
        L_0x0048:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r8 = g.c.a.l.k.c(r0)
            org.slf4j.Logger r9 = o
            java.lang.String r0 = "ApkManagerFileManager init, "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r0)
            android.content.Context r2 = r11.a
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r4 = r12.a()
            r1.append(r4)
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r9.info(r1)
            int r1 = r12.a()
            r4 = 93
            r10 = 0
            if (r1 > 0) goto L_0x00a0
            java.lang.String r0 = "ApkManagerFileManager check, illegal app id["
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            int r1 = r12.a()
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r9.info(r0)
            r0 = 11
            r1 = 2025(0x7e9, float:2.838E-42)
            r1 = 11
            r2 = 2025(0x7e9, float:2.838E-42)
            goto L_0x0116
        L_0x00a0:
            if (r8 == 0) goto L_0x00ab
            int r1 = r8.length()
            if (r1 != 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            r1 = 0
            goto L_0x00ac
        L_0x00ab:
            r1 = 1
        L_0x00ac:
            if (r1 == 0) goto L_0x00ce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ApkManagerFileManager check, illegal storage path["
            r0.append(r1)
            r0.append(r8)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r9.info(r0)
            r0 = 62
            r1 = 2026(0x7ea, float:2.839E-42)
            r1 = 62
            r2 = 2026(0x7ea, float:2.839E-42)
            goto L_0x0116
        L_0x00ce:
            boolean r1 = r11.m(r12)
            if (r1 == 0) goto L_0x00da
            java.lang.String r0 = "init onSuccess: apk had installed"
            r9.info(r0)
            goto L_0x0120
        L_0x00da:
            android.content.Context r1 = r11.a
            android.content.Context r4 = com.apkpure.aegon.application.AegonApplication.getContext()
            java.lang.String r4 = g.c.a.l.k.b(r4)
            java.lang.Boolean r1 = g.c.a.e.d.d.b(r1, r4)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x011f
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            android.content.Context r1 = r11.a
            r0.append(r1)
            r0.append(r2)
            int r1 = r12.a()
            r0.append(r1)
            r0.append(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            r9.info(r0)
            r0 = 62
            r1 = 2021(0x7e5, float:2.832E-42)
            r1 = 62
            r2 = 2021(0x7e5, float:2.832E-42)
        L_0x0116:
            r3 = 0
            r5 = 4
            r6 = 0
            r0 = r11
            g.c.a.l.l.d0.e(r0, r1, r2, r3, r5, r6)
            goto L_0x0120
        L_0x011f:
            r10 = 1
        L_0x0120:
            if (r10 != 0) goto L_0x0128
            java.lang.String r0 = "ApkManagerFileManager check fail."
            r9.info(r0)
            return
        L_0x0128:
            g.c.a.l.l.o r0 = r11.f2063f
            int r0 = r0.a()
            g.c.a.l.l.o r1 = r11.f2063f
            java.lang.String r1 = r1.g()
            java.io.File r2 = new java.io.File
            android.content.Context r3 = com.apkpure.aegon.application.AegonApplication.getContext()
            java.lang.String r3 = g.c.a.l.k.b(r3)
            r2.<init>(r3)
            g.c.a.l.o.h r3 = g.c.a.l.o.h.c
            g.c.a.l.o.a r3 = g.c.a.l.o.h.c()
            g.c.a.l.l.u r4 = new g.c.a.l.l.u
            r4.<init>(r1, r11, r7, r8)
            g.c.a.l.o.h r3 = (g.c.a.l.o.h) r3
            r3.b(r2, r0, r8, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.l.v.c(g.c.a.l.l.o, g.c.a.e.h.b.a, g.c.a.l.l.e0):void");
    }

    public void f() {
        j();
        f.f(this.c, (CancellationException) null, 1);
        try {
            n();
            b.C0060b bVar = this.f2077m;
            if (bVar != null) {
                bVar.b();
            }
        } catch (Exception e2) {
            o.error(h.j("onDestroy e:", e2));
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
