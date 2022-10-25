package g.c.b.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.FileProvider;
import com.apkpure.components.installer.ui.InstallApksActivity;
import com.tencent.raft.raftframework.remote.RemoteProxyUtil;
import g.c.b.b.i.e.k;
import g.c.b.b.j.b;
import g.c.b.b.k.q;
import g.c.b.b.k.r;
import g.c.b.c.b.a;
import i.j;
import i.o.c.h;
import i.o.c.i;
import i.o.c.l;
import i.o.c.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class c {

    /* renamed from: m  reason: collision with root package name */
    public static final b f2226m = new b((i.o.c.f) null);
    public static final Logger n = LoggerFactory.getLogger("InstallerLog");
    public static final i.c<c> o = f.U(a.b);
    public final String a = "Installer";
    public final String b = "installer_time";
    public g.c.b.b.i.c c;

    /* renamed from: d  reason: collision with root package name */
    public k f2227d;

    /* renamed from: e  reason: collision with root package name */
    public g.c.b.b.j.b f2228e;

    /* renamed from: f  reason: collision with root package name */
    public g.c.b.c.b.a f2229f;

    /* renamed from: g  reason: collision with root package name */
    public g.c.b.b.l.f f2230g = g.c.b.b.l.f.DEFAULT;

    /* renamed from: h  reason: collision with root package name */
    public String f2231h = "";

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f2232i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public g.c.b.b.m.d f2233j;

    /* renamed from: k  reason: collision with root package name */
    public final List<String> f2234k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public i.o.b.a<j> f2235l;

    public static final class a extends i implements i.o.b.a<c> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            return new c((i.o.c.f) null);
        }
    }

    public static final class b {
        public static final /* synthetic */ i.r.e<Object>[] a;

        static {
            l lVar = new l(p.a(b.class), "instance", "getInstance()Lcom/apkpure/components/installer/Installer;");
            Objects.requireNonNull(p.a);
            a = new i.r.e[]{lVar};
        }

        public b() {
        }

        public b(i.o.c.f fVar) {
        }

        public final c a() {
            return c.o.getValue();
        }
    }

    /* renamed from: g.c.b.b.c$c  reason: collision with other inner class name */
    public static final class C0075c implements g.c.b.b.i.a {
        public final /* synthetic */ c a;
        public final /* synthetic */ g.c.b.b.j.b b;
        public final /* synthetic */ g.c.b.b.j.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f2236d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f2237e;

        public C0075c(c cVar, g.c.b.b.j.b bVar, g.c.b.b.j.a aVar, Context context, boolean z) {
            this.a = cVar;
            this.b = bVar;
            this.c = aVar;
            this.f2236d = context;
            this.f2237e = z;
        }

        public void a(String str) {
            h.e(str, RemoteProxyUtil.KEY_RESULT);
            this.a.i(this.f2236d, str, this.b, this.f2237e);
        }

        public void b(List<String> list) {
            f.b0(this, list);
        }

        public boolean c(float f2, int i2) {
            c cVar = this.a;
            int i3 = this.b.a;
            return cVar.p(i2, (int) (f2 * ((float) 100)), this.c);
        }

        public void d(int i2, String str) {
            h.e(str, "msg");
            r rVar = r.a;
            r.a(this.f2236d, this.b.a, i2);
            g.c.b.b.i.c cVar = this.a.c;
            if (cVar != null) {
                cVar.j(this.c, i2, str);
            } else {
                h.k("installListener");
                throw null;
            }
        }
    }

    public static final class d extends i implements i.o.b.a<j> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $filePath;
        public final /* synthetic */ boolean $haveInstallUi;
        public final /* synthetic */ c this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(boolean z, Context context, String str, c cVar) {
            super(0);
            this.$haveInstallUi = z;
            this.$context = context;
            this.$filePath = str;
            this.this$0 = cVar;
        }

        public Object a() {
            if (this.$haveInstallUi) {
                InstallApksActivity.a aVar = InstallApksActivity.r;
                Context context = this.$context;
                String str = this.$filePath;
                g.c.b.b.j.b bVar = this.this$0.f2228e;
                h.c(bVar);
                h.e(context, "ctx");
                h.e(str, "filePath");
                h.e(bVar, "options");
                aVar.c(context, -1, str, bVar);
            } else {
                q.c(this.$context, -1, this.$filePath);
            }
            return j.a;
        }
    }

    public static final class e implements g.c.b.b.i.a {
        public final /* synthetic */ c a;
        public final /* synthetic */ g.c.b.b.j.b b;
        public final /* synthetic */ g.c.b.b.j.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f2238d;

        public e(c cVar, g.c.b.b.j.b bVar, g.c.b.b.j.a aVar, Context context) {
            this.a = cVar;
            this.b = bVar;
            this.c = aVar;
            this.f2238d = context;
        }

        public void a(String str) {
            h.e(this, "this");
            h.e(str, RemoteProxyUtil.KEY_RESULT);
        }

        public void b(List<String> list) {
            h.e(list, "results");
            f.b0(this, list);
        }

        public boolean c(float f2, int i2) {
            c cVar = this.a;
            int i3 = this.b.a;
            return cVar.p(i2, (int) (f2 * ((float) 100)), this.c);
        }

        public void d(int i2, String str) {
            h.e(str, "msg");
            r rVar = r.a;
            r.a(this.f2238d, this.b.a, i2);
            g.c.b.b.i.c cVar = this.a.c;
            if (cVar != null) {
                cVar.j(this.c, i2, str);
            } else {
                h.k("installListener");
                throw null;
            }
        }
    }

    public static final class f implements g.c.b.b.i.a {
        public final /* synthetic */ c a;
        public final /* synthetic */ int b;
        public final /* synthetic */ g.c.b.b.j.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f2239d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g.c.b.b.j.b f2240e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g.c.b.c.b.a f2241f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ boolean f2242g;

        public f(c cVar, int i2, g.c.b.b.j.a aVar, Context context, g.c.b.b.j.b bVar, g.c.b.c.b.a aVar2, boolean z) {
            this.a = cVar;
            this.b = i2;
            this.c = aVar;
            this.f2239d = context;
            this.f2240e = bVar;
            this.f2241f = aVar2;
            this.f2242g = z;
        }

        public void a(String str) {
            h.e(str, RemoteProxyUtil.KEY_RESULT);
            g.c.b.b.j.b bVar = this.f2240e;
            if (bVar.b == 1) {
                new Handler(Looper.getMainLooper()).post(new a(this.f2239d, this.a, this.c));
            } else {
                this.a.k(this.f2239d, bVar, this.f2241f, this.c, this.f2242g);
            }
        }

        public void b(List<String> list) {
            f.b0(this, list);
        }

        public boolean c(float f2, int i2) {
            return this.a.p(i2, (int) (f2 * ((float) 100)), this.c);
        }

        public void d(int i2, String str) {
            h.e(str, "msg");
            r rVar = r.a;
            r.a(this.f2239d, this.b, i2);
            if (this.f2240e.b != 1) {
                g.c.b.b.i.c cVar = this.a.c;
                if (cVar != null) {
                    cVar.j(this.c, i2, str);
                } else {
                    h.k("installListener");
                    throw null;
                }
            }
        }
    }

    public static final class g implements g.c.b.b.i.a {
        public final /* synthetic */ c a;
        public final /* synthetic */ g.c.b.b.j.b b;
        public final /* synthetic */ g.c.b.b.j.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f2243d;

        public g(c cVar, g.c.b.b.j.b bVar, g.c.b.b.j.a aVar, Context context) {
            this.a = cVar;
            this.b = bVar;
            this.c = aVar;
            this.f2243d = context;
        }

        public void a(String str) {
            h.e(str, RemoteProxyUtil.KEY_RESULT);
        }

        public void b(List<String> list) {
            f.b0(this, list);
        }

        public boolean c(float f2, int i2) {
            c cVar = this.a;
            int i3 = this.b.a;
            return cVar.p(i2, (int) (f2 * ((float) 100)), this.c);
        }

        public void d(int i2, String str) {
            h.e(str, "msg");
            r rVar = r.a;
            r.a(this.f2243d, this.b.a, i2);
            g.c.b.b.i.c cVar = this.a.c;
            if (cVar != null) {
                cVar.j(this.c, i2, str);
            } else {
                h.k("installListener");
                throw null;
            }
        }
    }

    public c() {
    }

    public c(i.o.c.f fVar) {
    }

    public static final void a(c cVar, Context context, List list, g.c.b.b.j.b bVar, boolean z) {
        Logger logger = n;
        logger.info(h.j("seekableInstall, filepath: ", cVar.f2231h));
        String str = cVar.f2231h;
        logger.info(h.j("写入防重入标志: ", str));
        cVar.f2234k.add(str);
        g.c.b.b.j.b e2 = cVar.e(bVar);
        cVar.f2228e = e2;
        if (z) {
            InstallApksActivity.r.c(context, 3, list.toString(), e2);
        } else {
            q.c(context, 3, list.toString());
        }
    }

    public static final c d() {
        return f2226m.a();
    }

    public final void b(g.c.b.c.b.a aVar, Context context, g.c.b.b.j.b bVar, g.c.b.b.j.a aVar2, boolean z) {
        File e2;
        String str = aVar.b;
        if (str != null && (e2 = g.c.b.b.l.d.e(context, str)) != null) {
            new g.c.b.b.m.f(e2, aVar, new C0075c(this, bVar, aVar2, context, z));
        }
    }

    public final g.c.b.b.j.a c(g.c.b.c.b.a aVar, g.c.b.b.j.b bVar) {
        long j2;
        g.c.b.c.b.a aVar2 = aVar;
        g.c.b.b.j.b bVar2 = bVar;
        String str = aVar2.b;
        String str2 = aVar2.f2310f;
        if (str2 == null) {
            j2 = -1;
        } else {
            j2 = Long.parseLong(str2);
        }
        return new g.c.b.b.j.a(str, (String) null, j2, aVar2.c, this.f2231h, bVar2.b != 1 ? ".xapk" : "OBB", (String) null, 0, w(aVar), x(aVar), bVar2.f2286k, 194);
    }

    public final g.c.b.b.j.b e(g.c.b.b.j.b bVar) {
        if (bVar == null) {
            b.a aVar = new b.a();
            aVar.a = 4;
            aVar.b(new d());
            return aVar.a();
        } else if (bVar.f2285j != null) {
            return bVar;
        } else {
            b.a aVar2 = new b.a();
            aVar2.a = bVar.a;
            aVar2.f2289f = bVar.f2281f;
            aVar2.f2288e = bVar.f2280e;
            aVar2.f2287d = bVar.f2279d;
            aVar2.c(bVar.c);
            aVar2.b = bVar.b;
            aVar2.f2290g = bVar.f2282g;
            aVar2.f2291h = bVar.f2283h;
            aVar2.f2293j = bVar.f2284i;
            g.c.b.b.i.c cVar = bVar.f2285j;
            if (cVar == null) {
                cVar = new d();
            }
            aVar2.b(cVar);
            aVar2.f2294k = bVar.f2286k;
            return aVar2.a();
        }
    }

    public final long f(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
    }

    public final void g(Context context, g.c.b.b.j.a aVar, boolean z) {
        if (!z || !(context instanceof InstallApksActivity)) {
            s();
            n.debug("无界面调用系统安装, 抛出失败,关闭页面.");
            g.c.b.b.i.c cVar = this.c;
            if (cVar != null) {
                cVar.j(aVar, 20, f.C(20));
            } else {
                h.k("installListener");
                throw null;
            }
        } else {
            ((InstallApksActivity) context).finish();
            n.debug("关闭 InstallApksActivity");
        }
    }

    public final void h(Context context, g.c.b.b.j.a aVar, g.c.b.b.j.b bVar, boolean z) {
        if (bVar.f2279d) {
            l(context, aVar, z);
        } else if (Build.VERSION.SDK_INT <= 22) {
            l(context, aVar, z);
        } else if (!f.P()) {
            t(context, aVar, bVar, z);
        } else if (f.Q()) {
            l(context, aVar, z);
        } else {
            t(context, aVar, bVar, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
        if ((new java.io.File(r15).exists()) != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(android.content.Context r33, java.lang.String r34, g.c.b.b.j.b r35, boolean r36) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r15 = r34
            r14 = r35
            r13 = r36
            java.lang.String r17 = "installListener"
            org.slf4j.Logger r0 = n
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "installAPK context: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", filePath: "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ", fileExist: "
            r3.append(r4)
            java.lang.String r4 = "filePath"
            i.o.c.h.e(r15, r4)
            boolean r5 = android.text.TextUtils.isEmpty(r34)
            r6 = 1
            r12 = 0
            if (r5 != 0) goto L_0x0047
            java.io.File r5 = new java.io.File
            r5.<init>(r15)
            boolean r5 = r5.exists()
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 == 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.info(r3)
            i.o.c.h.e(r15, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r34)
            if (r3 != 0) goto L_0x006c
            java.io.File r3 = new java.io.File
            r3.<init>(r15)
            boolean r3 = r3.exists()
            if (r3 == 0) goto L_0x0068
            r3 = 1
            goto L_0x0069
        L_0x0068:
            r3 = 0
        L_0x0069:
            if (r3 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            if (r6 == 0) goto L_0x0212
            r18 = 0
            android.content.pm.PackageManager r11 = r33.getPackageManager()     // Catch:{ Exception -> 0x01da }
            android.content.pm.PackageInfo r3 = r11.getPackageArchiveInfo(r15, r12)     // Catch:{ Exception -> 0x01da }
            if (r3 != 0) goto L_0x00bb
            java.lang.String r2 = "installAPK piIng is null."
            r0.info(r2)     // Catch:{ Exception -> 0x00b7 }
            g.c.b.b.i.c r0 = r1.c     // Catch:{ Exception -> 0x00b7 }
            if (r0 == 0) goto L_0x00b2
            g.c.b.b.j.a r13 = new g.c.b.b.j.a     // Catch:{ Exception -> 0x00b7 }
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            java.util.Map<java.lang.String, java.lang.String> r8 = r14.f2286k     // Catch:{ Exception -> 0x00b7 }
            r19 = 1007(0x3ef, float:1.411E-42)
            r2 = r13
            r20 = r8
            r8 = r34
            r21 = r13
            r13 = r16
            r14 = r20
            r1 = r15
            r15 = r19
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01d4 }
            r2 = 16
            java.lang.String r3 = g.c.b.b.f.C(r2)     // Catch:{ Exception -> 0x01d4 }
            r4 = r21
            r0.j(r4, r2, r3)     // Catch:{ Exception -> 0x01d4 }
            return
        L_0x00b2:
            r1 = r15
            i.o.c.h.k(r17)     // Catch:{ Exception -> 0x01d4 }
            throw r18
        L_0x00b7:
            r0 = move-exception
            r1 = r15
            goto L_0x01d5
        L_0x00bb:
            r1 = r15
            android.content.pm.ApplicationInfo r4 = r3.applicationInfo     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r15 = r4.packageName     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r5 = "appInfo"
            i.o.c.h.d(r4, r5)     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r5 = "pm"
            i.o.c.h.d(r11, r5)     // Catch:{ Exception -> 0x01d4 }
            r4.sourceDir = r1     // Catch:{ Exception -> 0x01d4 }
            r4.publicSourceDir = r1     // Catch:{ Exception -> 0x01d4 }
            java.lang.CharSequence r4 = r11.getApplicationLabel(r4)     // Catch:{ Exception -> 0x01d4 }
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x01d4 }
            r1 = r32
            long r19 = r1.f(r3)     // Catch:{ Exception -> 0x01d2 }
            r14 = r35
            java.util.Map<java.lang.String, java.lang.String> r10 = r14.f2286k     // Catch:{ Exception -> 0x01da }
            g.c.b.b.j.a r9 = new g.c.b.b.j.a     // Catch:{ Exception -> 0x01da }
            r5 = 0
            java.lang.String r16 = ".apk"
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 962(0x3c2, float:1.348E-42)
            r3 = r9
            r4 = r15
            r6 = r19
            r26 = r9
            r9 = r34
            r27 = r10
            r10 = r16
            r28 = r11
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r29 = r15
            r15 = r27
            r16 = r25
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x01d2 }
            g.c.b.b.i.c r3 = r1.c     // Catch:{ Exception -> 0x01d2 }
            if (r3 == 0) goto L_0x01ca
            r15 = r26
            r3.a(r15)     // Catch:{ Exception -> 0x01d2 }
            r3 = r28
            r4 = r29
            r5 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x01b9 }
            java.lang.String r5 = "pi"
            i.o.c.h.d(r3, r5)     // Catch:{ NameNotFoundException -> 0x01b9 }
            long r5 = r1.f(r3)     // Catch:{ NameNotFoundException -> 0x01b9 }
            r14 = r35
            boolean r3 = r14.f2283h     // Catch:{ NameNotFoundException -> 0x013a }
            if (r3 != 0) goto L_0x0140
            java.lang.String r3 = "options.isVersionDowngrade install"
            r0.debug(r3)     // Catch:{ NameNotFoundException -> 0x013a }
            r13 = r36
            r1.h(r2, r15, r14, r13)     // Catch:{ NameNotFoundException -> 0x0152 }
            return
        L_0x013a:
            r0 = move-exception
            r4 = r36
        L_0x013d:
            r3 = r14
            goto L_0x01be
        L_0x0140:
            r13 = r36
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x019d
            if (r13 == 0) goto L_0x0155
            java.lang.String r0 = "packageName"
            i.o.c.h.d(r4, r0)     // Catch:{ NameNotFoundException -> 0x0152 }
            r1.v(r2, r4, r15)     // Catch:{ NameNotFoundException -> 0x0152 }
            goto L_0x0212
        L_0x0152:
            r0 = move-exception
            r4 = r13
            goto L_0x013d
        L_0x0155:
            java.lang.String r3 = "存在更高版本, 错误提醒."
            r0.debug(r3)     // Catch:{ NameNotFoundException -> 0x01b9 }
            g.c.b.b.i.c r0 = r1.c     // Catch:{ NameNotFoundException -> 0x01b9 }
            if (r0 == 0) goto L_0x0197
            g.c.b.b.j.a r12 = new g.c.b.b.j.a     // Catch:{ NameNotFoundException -> 0x01b9 }
            r5 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            java.util.Map<java.lang.String, java.lang.String> r9 = r14.f2286k     // Catch:{ NameNotFoundException -> 0x0193 }
            r21 = 1006(0x3ee, float:1.41E-42)
            r3 = r12
            r22 = r9
            r9 = r34
            r30 = r12
            r12 = r16
            r13 = r19
            r14 = r20
            r31 = r15
            r15 = r22
            r16 = r21
            r3.<init>(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ NameNotFoundException -> 0x01b1 }
            r3 = 17
            java.lang.String r4 = g.c.b.b.f.C(r3)     // Catch:{ NameNotFoundException -> 0x01b1 }
            r5 = r30
            r0.j(r5, r3, r4)     // Catch:{ NameNotFoundException -> 0x01b1 }
            goto L_0x0212
        L_0x0193:
            r0 = move-exception
            r31 = r15
            goto L_0x01b2
        L_0x0197:
            r31 = r15
            i.o.c.h.k(r17)     // Catch:{ NameNotFoundException -> 0x01b1 }
            throw r18
        L_0x019d:
            r31 = r15
            java.lang.String r3 = "normal install"
            r0.debug(r3)     // Catch:{ NameNotFoundException -> 0x01b1 }
            r3 = r35
            r4 = r36
            r5 = r31
            r1.h(r2, r5, r3, r4)     // Catch:{ NameNotFoundException -> 0x01af }
            goto L_0x0212
        L_0x01af:
            r0 = move-exception
            goto L_0x01bf
        L_0x01b1:
            r0 = move-exception
        L_0x01b2:
            r3 = r35
            r4 = r36
            r5 = r31
            goto L_0x01bf
        L_0x01b9:
            r0 = move-exception
            r3 = r35
            r4 = r36
        L_0x01be:
            r5 = r15
        L_0x01bf:
            org.slf4j.Logger r6 = n     // Catch:{ Exception -> 0x01d0 }
            java.lang.String r7 = "installAPK error 1"
            r6.warn((java.lang.String) r7, (java.lang.Throwable) r0)     // Catch:{ Exception -> 0x01d0 }
            r1.h(r2, r5, r3, r4)     // Catch:{ Exception -> 0x01d0 }
            goto L_0x0212
        L_0x01ca:
            r3 = r35
            i.o.c.h.k(r17)     // Catch:{ Exception -> 0x01d0 }
            throw r18
        L_0x01d0:
            r0 = move-exception
            goto L_0x01dc
        L_0x01d2:
            r0 = move-exception
            goto L_0x01d7
        L_0x01d4:
            r0 = move-exception
        L_0x01d5:
            r1 = r32
        L_0x01d7:
            r3 = r35
            goto L_0x01dc
        L_0x01da:
            r0 = move-exception
            r3 = r14
        L_0x01dc:
            org.slf4j.Logger r2 = n
            java.lang.String r4 = "installAPK error 2"
            r2.warn((java.lang.String) r4, (java.lang.Throwable) r0)
            g.c.b.b.i.c r0 = r1.c
            if (r0 == 0) goto L_0x020e
            g.c.b.b.j.a r15 = new g.c.b.b.j.a
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            java.util.Map<java.lang.String, java.lang.String> r14 = r3.f2286k
            r16 = 1007(0x3ef, float:1.411E-42)
            r2 = r15
            r3 = r4
            r4 = r5
            r5 = r6
            r7 = r8
            r8 = r34
            r1 = r15
            r15 = r16
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 8
            java.lang.String r3 = g.c.b.b.f.C(r2)
            r0.j(r1, r2, r3)
            goto L_0x0212
        L_0x020e:
            i.o.c.h.k(r17)
            throw r18
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.c.i(android.content.Context, java.lang.String, g.c.b.b.j.b, boolean):void");
    }

    public final void j(Context context, g.c.b.b.j.b bVar, g.c.b.c.b.a aVar, g.c.b.b.j.a aVar2, boolean z) {
        int i2 = bVar.a;
        if (i2 == 4 || i2 == 5) {
            q(aVar, context, bVar, aVar2, z);
        }
    }

    public final void k(Context context, g.c.b.b.j.b bVar, g.c.b.c.b.a aVar, g.c.b.b.j.a aVar2, boolean z) {
        Integer num;
        g.c.b.b.l.g.b(context, this.a, 0).a.edit().putLong(this.b, System.currentTimeMillis()).apply();
        if (x(aVar) || bVar.b == 1) {
            List<a.C0077a> list = aVar.f2311g;
            if (list == null) {
                num = null;
            } else {
                num = Integer.valueOf(list.size());
            }
            if (num != null) {
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT < 21) {
                    if (intValue == 1) {
                        b(aVar, context, bVar, aVar2, z);
                        return;
                    }
                    r rVar = r.a;
                    r.a(context, bVar.a, 3);
                    g.c.b.b.i.c cVar = this.c;
                    if (cVar != null) {
                        cVar.j(aVar2, 3, f.C(3));
                    } else {
                        h.k("installListener");
                        throw null;
                    }
                } else if (!f.P()) {
                    o(context, aVar, bVar, aVar2, z);
                } else if (!f.Q() || intValue != 1) {
                    o(context, aVar, bVar, aVar2, z);
                } else {
                    b(aVar, context, bVar, aVar2, z);
                }
            }
        } else {
            r rVar2 = r.a;
            r.a(context, bVar.a, -1);
            g.c.b.b.i.c cVar2 = this.c;
            if (cVar2 != null) {
                cVar2.j(aVar2, 10, f.C(10));
            } else {
                h.k("installListener");
                throw null;
            }
        }
    }

    public final void l(Context context, g.c.b.b.j.a aVar, boolean z) {
        String str;
        Uri uri;
        n.info("installer use system");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        String str2 = aVar.f2272e;
        if (str2 != null) {
            File file = new File(str2);
            h.e(context, "mContext");
            h.e(file, "file");
            if (Build.VERSION.SDK_INT >= 24) {
                uri = FileProvider.a(context, h.j(context.getPackageName(), ".fileprovider")).b(file);
                str = "{\n            FileProvider.getUriForFile(mContext, mContext.packageName+fileProvider, file)\n        }";
            } else {
                uri = Uri.fromFile(file);
                str = "{\n            Uri.fromFile(file)\n        }";
            }
            h.d(uri, str);
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
        }
        try {
            aVar.f2274g = "old";
            g.c.b.b.i.c cVar = this.c;
            if (cVar != null) {
                cVar.g(aVar);
                r(aVar);
                Object obj = e.e.c.a.a;
                context.startActivity(intent, (Bundle) null);
                g(context, aVar, z);
                return;
            }
            h.k("installListener");
            throw null;
        } catch (Exception e2) {
            this.f2232i.clear();
            String D = f.D(e2);
            g.c.b.b.i.c cVar2 = this.c;
            if (cVar2 != null) {
                cVar2.j(aVar, 0, D);
                n.error(" use system exception ", (Throwable) e2);
                return;
            }
            h.k("installListener");
            throw null;
        }
    }

    public final void m(Context context, String str, g.c.b.b.j.b bVar) {
        h.e(context, "context");
        h.e(str, "filePath");
        n(context, str, bVar, true, g.c.b.b.l.f.DEFAULT);
    }

    public final void n(Context context, String str, g.c.b.b.j.b bVar, boolean z, g.c.b.b.l.f fVar) {
        g.c.b.b.i.c cVar;
        Context context2 = context;
        String str2 = str;
        g.c.b.b.j.b bVar2 = bVar;
        boolean z2 = z;
        g.c.b.b.l.f fVar2 = fVar;
        h.e(context2, "context");
        h.e(str2, "filePath");
        h.e(fVar2, "installSource");
        Logger logger = n;
        logger.info("origin  installer, filePath: " + str2 + ", showInstallerActivity: " + z2 + ", source: " + fVar2);
        if (!this.f2234k.isEmpty()) {
            logger.info(h.j("installer, isNotEmpty 存在安装任务: installs: ", Integer.valueOf(this.f2234k.size())));
            if (!z2 && bVar2 != null && (cVar = bVar2.f2285j) != null) {
                g.c.b.b.j.a aVar = r2;
                g.c.b.b.j.a aVar2 = new g.c.b.b.j.a((String) null, (String) null, 0, (String) null, "install error,is installing", (String) null, (String) null, 0, false, false, bVar2.f2286k, 1007);
                cVar.j(aVar, 22, f.C(22));
                return;
            }
            return;
        }
        this.f2231h = str2;
        logger.info(h.j("写入防重入标志: ", str2));
        this.f2234k.add(str2);
        this.f2230g = fVar2;
        g.c.b.b.l.e.e(context);
        g.c.b.b.j.b e2 = e(bVar2);
        this.f2228e = e2;
        h.c(e2);
        g.c.b.b.i.c cVar2 = e2.f2285j;
        if (cVar2 != null) {
            this.f2227d = new k(context2, cVar2);
            g.c.b.b.j.b bVar3 = this.f2228e;
            h.c(bVar3);
            if (bVar3.f2285j instanceof g.c.b.b.i.b) {
                g.c.b.b.j.b bVar4 = this.f2228e;
                h.c(bVar4);
                g.c.b.b.i.c cVar3 = bVar4.f2285j;
                h.c(cVar3);
                if (!((g.c.b.b.i.b) cVar3).d()) {
                    this.f2235l = new d(z2, context2, str2, this);
                    return;
                }
            }
            if (z2) {
                InstallApksActivity.a aVar3 = InstallApksActivity.r;
                g.c.b.b.j.b bVar5 = this.f2228e;
                h.c(bVar5);
                h.e(context2, "ctx");
                h.e(str2, "filePath");
                h.e(bVar5, "options");
                aVar3.c(context2, -1, str2, bVar5);
                return;
            }
            q.c(context2, -1, str2);
        }
    }

    public final void o(Context context, g.c.b.c.b.a aVar, g.c.b.b.j.b bVar, g.c.b.b.j.a aVar2, boolean z) {
        boolean z2;
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            z2 = true;
        } catch (Exception unused) {
            z2 = false;
        }
        if (z2) {
            r(aVar2);
        }
        aVar2.f2274g = "new";
        g.c.b.b.i.c cVar = this.c;
        if (cVar != null) {
            cVar.g(aVar2);
            new g.c.b.b.m.e(context, aVar, (File) null, new e(this, bVar, aVar2, context), z, 4);
            return;
        }
        h.k("installListener");
        throw null;
    }

    public final boolean p(int i2, int i3, g.c.b.b.j.a aVar) {
        if (i2 == 1) {
            aVar.f2275h = i3;
            g.c.b.b.i.c cVar = this.c;
            if (cVar != null) {
                return cVar.b(aVar);
            }
            h.k("installListener");
            throw null;
        } else if (i2 != 2) {
            return false;
        } else {
            aVar.f2275h = i3;
            g.c.b.b.i.c cVar2 = this.c;
            if (cVar2 != null) {
                return cVar2.i(aVar);
            }
            h.k("installListener");
            throw null;
        }
    }

    public final void q(g.c.b.c.b.a aVar, Context context, g.c.b.b.j.b bVar, g.c.b.b.j.a aVar2, boolean z) {
        new g.c.b.b.m.a(aVar, new f(this, bVar.a, aVar2, context, bVar, aVar, z));
    }

    public final void r(g.c.b.b.j.a aVar) {
        String str = aVar.a;
        if (str != null) {
            if (!this.f2232i.contains(str)) {
                this.f2232i.add(str);
            }
            k kVar = this.f2227d;
            if (kVar != null) {
                kVar.a().post(new g.c.b.b.i.e.i(kVar));
            }
        }
    }

    public final void s() {
        n.info(h.j("清除防重入标志 size", Integer.valueOf(this.f2234k.size())));
        List<String> list = this.f2234k;
        if (list != null && (!list.isEmpty())) {
            this.f2234k.clear();
        }
    }

    public final void t(Context context, g.c.b.b.j.a aVar, g.c.b.b.j.b bVar, boolean z) {
        boolean z2;
        n.info("use sessionInstaller install");
        try {
            Class.forName("ohos.utils.system.SystemCapability");
            z2 = true;
        } catch (Exception unused) {
            z2 = false;
        }
        if (z2) {
            r(aVar);
        }
        aVar.f2274g = "new";
        g.c.b.b.i.c cVar = this.c;
        if (cVar != null) {
            cVar.g(aVar);
            new g.c.b.b.m.e(context, (g.c.b.c.b.a) null, new File(this.f2231h), new g(this, bVar, aVar, context), z, 2);
            return;
        }
        h.k("installListener");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(android.content.Context r28, int r29, g.c.b.b.i.c r30, boolean r31) {
        /*
            r27 = this;
            r7 = r27
            r0 = r28
            r1 = r29
            r5 = r30
            r6 = r31
            java.lang.String r2 = "context"
            i.o.c.h.e(r0, r2)
            java.lang.String r2 = "installListener"
            i.o.c.h.e(r5, r2)
            org.slf4j.Logger r3 = n
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "startInstall context: "
            r4.append(r8)
            r4.append(r0)
            java.lang.String r8 = ", commit: "
            r4.append(r8)
            r4.append(r1)
            java.lang.String r9 = " api: "
            r4.append(r9)
            org.slf4j.Logger r9 = g.c.b.b.l.e.a
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 21
            if (r9 < r10) goto L_0x003f
            java.lang.String[] r11 = android.os.Build.SUPPORTED_ABIS
            java.util.List r11 = java.util.Arrays.asList(r11)
            goto L_0x0056
        L_0x003f:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.String r12 = android.os.Build.CPU_ABI
            r11.add(r12)
            java.lang.String r12 = android.os.Build.CPU_ABI2
            java.lang.String r13 = "unknown"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x0056
            r11.add(r12)
        L_0x0056:
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            r3.info(r4)
            g.c.b.b.j.b r4 = r7.f2228e
            if (r4 != 0) goto L_0x0073
            boolean r4 = r0 instanceof com.apkpure.components.installer.ui.InstallApksActivity
            if (r4 == 0) goto L_0x0073
            java.lang.String r4 = "startInstall options is null or context is installApksActivity "
            r3.info(r4)
            r4 = r0
            com.apkpure.components.installer.ui.InstallApksActivity r4 = (com.apkpure.components.installer.ui.InstallApksActivity) r4
            r4.finish()
        L_0x0073:
            g.c.b.b.i.e.k r4 = new g.c.b.b.i.e.k
            g.c.b.b.j.b r11 = r7.f2228e
            r12 = 0
            if (r11 != 0) goto L_0x007c
            r11 = r12
            goto L_0x007e
        L_0x007c:
            g.c.b.b.i.c r11 = r11.f2285j
        L_0x007e:
            if (r11 != 0) goto L_0x0081
            return
        L_0x0081:
            r4.<init>(r0, r11)
            r7.f2227d = r4
            g.c.b.b.j.b r4 = r7.f2228e
            if (r4 != 0) goto L_0x008b
            return
        L_0x008b:
            r7.c = r5
            r11 = 3
            if (r1 != r11) goto L_0x01d2
            g.c.b.c.b.a r5 = r7.f2229f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "installXAPK context: "
            r13.append(r14)
            r13.append(r0)
            r13.append(r8)
            r13.append(r1)
            r8 = 32
            r13.append(r8)
            java.lang.String r13 = r13.toString()
            r3.info(r13)
            if (r9 >= r10) goto L_0x00b5
            goto L_0x01cd
        L_0x00b5:
            if (r5 != 0) goto L_0x00e7
            g.c.b.b.i.c r0 = r7.c
            if (r0 == 0) goto L_0x00e3
            g.c.b.b.j.a r1 = new g.c.b.b.j.a
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            java.lang.String r2 = r7.f2231h
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 2031(0x7ef, float:2.846E-42)
            r13 = r1
            r19 = r2
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 1
            java.lang.String r3 = g.c.b.b.f.C(r2)
            r0.j(r1, r2, r3)
            goto L_0x01cd
        L_0x00e3:
            i.o.c.h.k(r2)
            throw r12
        L_0x00e7:
            if (r1 == r11) goto L_0x00eb
            goto L_0x01cd
        L_0x00eb:
            g.c.b.b.j.a r1 = r7.c(r5, r4)
            r9 = 30
            r1.f2275h = r9
            g.c.b.b.i.c r9 = r7.c
            if (r9 == 0) goto L_0x01ce
            r9.a(r1)
            r9 = 100
            android.content.pm.PackageManager r10 = r28.getPackageManager()     // Catch:{ all -> 0x0190 }
            java.lang.String r11 = r5.b     // Catch:{ all -> 0x0190 }
            if (r11 != 0) goto L_0x0106
            goto L_0x01cd
        L_0x0106:
            r13 = 0
            android.content.pm.PackageInfo r10 = r10.getPackageInfo(r11, r13)     // Catch:{ all -> 0x0190 }
            boolean r11 = r4.f2283h     // Catch:{ all -> 0x0190 }
            if (r11 == 0) goto L_0x0166
            java.lang.String r11 = r5.f2310f     // Catch:{ all -> 0x0190 }
            if (r11 == 0) goto L_0x0166
            i.o.c.h.c(r11)     // Catch:{ all -> 0x0190 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ all -> 0x0190 }
            long r13 = (long) r11     // Catch:{ all -> 0x0190 }
            java.lang.String r11 = "pi"
            i.o.c.h.d(r10, r11)     // Catch:{ all -> 0x0190 }
            long r10 = r7.f(r10)     // Catch:{ all -> 0x0190 }
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x0166
            if (r6 == 0) goto L_0x0134
            java.lang.String r3 = r5.b     // Catch:{ all -> 0x0190 }
            if (r3 != 0) goto L_0x0130
            goto L_0x01cd
        L_0x0130:
            r7.v(r0, r3, r1)     // Catch:{ all -> 0x0190 }
            goto L_0x0189
        L_0x0134:
            g.c.b.b.i.c r0 = r7.c     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x0162
            g.c.b.b.j.a r3 = new g.c.b.b.j.a     // Catch:{ all -> 0x0190 }
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            java.lang.String r5 = r7.f2231h     // Catch:{ all -> 0x0190 }
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f2286k     // Catch:{ all -> 0x0190 }
            r26 = 1007(0x3ef, float:1.411E-42)
            r13 = r3
            r19 = r5
            r25 = r4
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0190 }
            r4 = 17
            java.lang.String r5 = g.c.b.b.f.C(r4)     // Catch:{ all -> 0x0190 }
            r0.j(r3, r4, r5)     // Catch:{ all -> 0x0190 }
            goto L_0x0189
        L_0x0162:
            i.o.c.h.k(r2)     // Catch:{ all -> 0x0190 }
            throw r12
        L_0x0166:
            r1.f2275h = r9     // Catch:{ all -> 0x0190 }
            g.c.b.b.i.c r0 = r7.c     // Catch:{ all -> 0x0190 }
            if (r0 == 0) goto L_0x018c
            r0.g(r1)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = "xapk 提交安装任务 "
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0190 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0190 }
            java.lang.String r0 = i.o.c.h.j(r0, r4)     // Catch:{ all -> 0x0190 }
            r3.debug(r0)     // Catch:{ all -> 0x0190 }
            g.c.b.b.m.d r0 = r7.f2233j     // Catch:{ all -> 0x0190 }
            if (r0 != 0) goto L_0x0186
            r0 = r12
            goto L_0x0195
        L_0x0186:
            r0.a(r6)     // Catch:{ all -> 0x0190 }
        L_0x0189:
            i.j r0 = i.j.a     // Catch:{ all -> 0x0190 }
            goto L_0x0195
        L_0x018c:
            i.o.c.h.k(r2)     // Catch:{ all -> 0x0190 }
            throw r12
        L_0x0190:
            r0 = move-exception
            java.lang.Object r0 = g.c.b.b.f.v(r0)
        L_0x0195:
            java.lang.Throwable r0 = i.f.a(r0)
            if (r0 == 0) goto L_0x01cd
            r1.f2275h = r9
            g.c.b.b.i.c r3 = r7.c
            if (r3 == 0) goto L_0x01c9
            r3.g(r1)
            org.slf4j.Logger r1 = n
            java.lang.String r2 = "onFailure xapk 提交安装任务 "
            java.lang.StringBuilder r2 = g.a.a.a.a.i(r2)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.debug(r0)
            g.c.b.b.m.d r0 = r7.f2233j
            if (r0 != 0) goto L_0x01c5
            goto L_0x01cd
        L_0x01c5:
            r0.a(r6)
            goto L_0x01cd
        L_0x01c9:
            i.o.c.h.k(r2)
            throw r12
        L_0x01cd:
            return
        L_0x01ce:
            i.o.c.h.k(r2)
            throw r12
        L_0x01d2:
            java.lang.Thread r8 = new java.lang.Thread
            g.c.b.b.b r9 = new g.c.b.b.b
            r1 = r9
            r2 = r28
            r3 = r27
            r5 = r30
            r6 = r31
            r1.<init>(r2, r3, r4, r5, r6)
            r8.<init>(r9)
            r8.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.c.u(android.content.Context, int, g.c.b.b.i.c, boolean):void");
    }

    public final void v(Context context, String str, g.c.b.b.j.a aVar) {
        Activity activity = (Activity) context;
        String b2 = InstallApksActivity.r.b(context);
        g.c.b.b.i.c cVar = this.c;
        if (cVar != null) {
            new g.c.b.b.l.i(activity, str, b2, cVar, aVar);
        } else {
            h.k("installListener");
            throw null;
        }
    }

    public final boolean w(g.c.b.c.b.a aVar) {
        List<a.b> list = aVar.f2312h;
        return !(list == null || list.isEmpty());
    }

    public final boolean x(g.c.b.c.b.a aVar) {
        List<a.C0077a> list = aVar.f2311g;
        return !(list == null || list.isEmpty());
    }
}
