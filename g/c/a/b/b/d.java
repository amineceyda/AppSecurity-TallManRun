package g.c.a.b.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.apkpure.aegon.app.activity.RestartActivity;
import com.apkpure.aegon.app.event.SystemPackageEvent$Receiver;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.models.AssetInfo;
import com.apkpure.aegon.main.activity.MainTabActivity;
import g.c.a.m.g;
import g.c.b.b.f;
import g.c.b.b.j.b;
import g.c.b.c.b.a;
import i.j;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.l;
import i.o.b.p;
import i.o.c.i;
import j.a.h0;
import j.a.r0;
import j.a.x;
import j.a.y;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class d {
    public static final d a = new d();
    public static final Logger b = LoggerFactory.getLogger("InstallManager");
    public static long c;

    /* renamed from: d  reason: collision with root package name */
    public static g f1911d = g.Normal;

    /* renamed from: e  reason: collision with root package name */
    public static g.c.b.b.j.a f1912e;

    /* renamed from: f  reason: collision with root package name */
    public static SystemPackageEvent$Receiver f1913f;

    /* renamed from: g  reason: collision with root package name */
    public static List<String> f1914g = new ArrayList();

    @e(c = "com.apkpure.aegon.app.assetmanager.InstallManager$install$1", f = "InstallManager.kt", l = {95}, m = "invokeSuspend")
    public static final class a extends h implements p<x, i.m.d<? super j>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $filePath;
        public final /* synthetic */ int $xapkType;
        public int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, int i2, i.m.d<? super a> dVar) {
            super(2, dVar);
            this.$context = context;
            this.$filePath = str;
            this.$xapkType = i2;
        }

        public final i.m.d<j> a(Object obj, i.m.d<?> dVar) {
            return new a(this.$context, this.$filePath, this.$xapkType, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            return new a(this.$context, this.$filePath, this.$xapkType, (i.m.d) obj2).l(j.a);
        }

        public final Object l(Object obj) {
            i.m.i.a aVar = i.m.i.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                f.q0(obj);
                d dVar = d.a;
                Context context = this.$context;
                String str = this.$filePath;
                int i3 = this.$xapkType;
                this.label = 1;
                if (dVar.f(context, str, i3, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                try {
                    f.q0(obj);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return j.a;
        }
    }

    public static final class b extends i implements l<Throwable, j> {
        public final /* synthetic */ j.a.f<Boolean> $it1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j.a.f<? super Boolean> fVar) {
            super(1);
            this.$it1 = fVar;
        }

        public Object g(Object obj) {
            Throwable th = (Throwable) obj;
            this.$it1.h((Throwable) null);
            return j.a;
        }
    }

    public static final class c implements DialogInterface.OnClickListener {
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f1915d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f1916e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ j.a.f<Boolean> f1917f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f1918g;

        public c(Context context, String str, int i2, int i3, boolean z, j.a.f<? super Boolean> fVar, HashMap<String, String> hashMap) {
            this.b = context;
            this.c = str;
            this.f1915d = i2;
            this.f1916e = z;
            this.f1917f = fVar;
            this.f1918g = hashMap;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            g.c.b.b.c a = g.c.b.b.c.f2226m.a();
            Context context = this.b;
            String str = this.c;
            b.a aVar = new b.a();
            aVar.b = this.f1915d;
            aVar.f2288e = 0;
            aVar.f2291h = this.f1916e;
            Locale b2 = g.c.a.m.l.b();
            i.o.c.h.d(b2, "getLanguage()");
            aVar.c(b2);
            d dVar = d.a;
            aVar.b(new c(this.b, g.Normal, this.f1917f));
            aVar.f2294k = this.f1918g;
            a.m(context, str, aVar.a());
        }
    }

    /* renamed from: g.c.a.b.b.d$d  reason: collision with other inner class name */
    public static final class C0058d implements g.c.a.b.d.b {
        public void a(Context context, String str) {
            String str2;
            i.o.c.h.e(context, "context");
            i.o.c.h.e(str, "packageName");
            g.c.b.b.j.a aVar = d.f1912e;
            if (aVar != null) {
                if (aVar == null) {
                    str2 = null;
                } else {
                    str2 = aVar.a;
                }
                if (i.o.c.h.a(str2, str)) {
                    d dVar = d.a;
                    g gVar = d.f1911d;
                    g.c.b.b.j.a aVar2 = d.f1912e;
                    i.o.c.h.c(aVar2);
                    d.b(dVar, context, gVar, aVar2);
                    d.f1912e = null;
                }
            }
        }

        public void b(Context context, String str) {
            i.o.c.h.e(context, "context");
            i.o.c.h.e(str, "packageName");
        }
    }

    public static final AssetInfo a(d dVar, Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return new g.c.a.e.d.d(context).d(new File(str));
    }

    public static final void b(d dVar, Context context, g gVar, g.c.b.b.j.a aVar) {
        Map<String, Object> j2 = i.l.c.j(e.e.d.l.a.D(aVar));
        boolean k2 = dVar.k(context, gVar);
        b.debug("onStart should change pop type to FastDownload, {}", (Object) Boolean.valueOf(k2));
        if (k2) {
            j2.put("pop_type", "fast_download_pop");
        }
        f1912e = null;
        if (System.currentTimeMillis() - c > 200) {
            e.e.d.l.a.r0("AppSuccInstall", aVar, j2);
            c = System.currentTimeMillis();
        }
    }

    public final Activity c() {
        Activity c2 = g.c.a.g.a.o.c.b().c();
        if (c2 != null && !c2.isDestroyed()) {
            return c2;
        }
        Logger logger = b;
        logger.info("Get top activity is not Activity or is null");
        g.c.a.g.b.a a2 = g.c.a.g.a.o.c.b().a();
        if (a2 != null && !a2.isDestroyed()) {
            return a2;
        }
        logger.info("Get main activity is not Activity or is null");
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.app.Activity");
        return a2;
    }

    public final void d(Context context, String str, int i2) {
        i.o.c.h.e(context, "context");
        i.o.c.h.e(str, "filePath");
        r0 r0Var = r0.b;
        h0 h0Var = h0.c;
        f.S(r0Var, j.a.t1.j.b, (y) null, new a(context, str, i2, (i.m.d<? super a>) null), 2, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(android.content.Context r18, java.lang.String r19, int r20, i.m.d<? super java.lang.Boolean> r21) {
        /*
            r17 = this;
            r1 = r18
            r2 = r19
            j.a.g r8 = new j.a.g
            i.m.d r0 = g.c.b.b.f.M(r21)
            r3 = 1
            r8.<init>(r0, r3)
            r8.r()
            g.c.a.b.b.d$b r0 = new g.c.a.b.b.d$b
            r0.<init>(r8)
            r8.i(r0)
            r9 = 0
            if (r1 == 0) goto L_0x0032
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 == 0) goto L_0x0023
            goto L_0x0032
        L_0x0023:
            g.c.a.e.d.d r0 = new g.c.a.e.d.d
            r0.<init>(r1)
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            com.apkpure.aegon.components.models.AssetInfo r0 = r0.d(r4)
            goto L_0x0033
        L_0x0032:
            r0 = r9
        L_0x0033:
            r4 = 0
            if (r0 != 0) goto L_0x0039
            r7 = r9
            goto L_0x0040
        L_0x0039:
            int r6 = r0.versionCode
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
        L_0x0040:
            if (r7 == 0) goto L_0x0045
            int r4 = r0.versionCode
            long r4 = (long) r4
        L_0x0045:
            android.content.Context r6 = com.apkpure.aegon.application.AegonApplication.getContext()
            g.c.a.e.b.e r6 = g.c.a.e.b.e.i(r6)
            if (r0 != 0) goto L_0x0051
            r7 = r9
            goto L_0x0053
        L_0x0051:
            java.lang.String r7 = r0.packageName
        L_0x0053:
            if (r0 != 0) goto L_0x0057
            r10 = r9
            goto L_0x0059
        L_0x0057:
            java.lang.String r10 = r0.type
        L_0x0059:
            boolean r11 = r6.k()
            r12 = 0
            if (r11 == 0) goto L_0x00cf
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            if (r11 == 0) goto L_0x0067
            goto L_0x00cf
        L_0x0067:
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.h()
            if (r6 != 0) goto L_0x006e
            goto L_0x00cf
        L_0x006e:
            r11 = 0
        L_0x006f:
            int r13 = r6.size()
            if (r11 >= r13) goto L_0x00cf
            java.lang.Object r13 = r6.get(r11)
            com.apkpure.aegon.components.download.DownloadTask r13 = (com.apkpure.aegon.components.download.DownloadTask) r13
            com.apkpure.aegon.components.models.SimpleDisplayInfo r14 = r13.getSimpleDisplayInfo()
            if (r14 == 0) goto L_0x00cf
            com.apkpure.aegon.components.models.Asset r14 = r13.getAsset()
            if (r14 == 0) goto L_0x00cf
            java.lang.String r14 = r13.getUserData()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x0092
            goto L_0x00cf
        L_0x0092:
            java.lang.String r14 = r13.getUserData()
            com.apkpure.aegon.components.models.AppDigest r14 = com.apkpure.aegon.components.models.AppDigest.d(r14)
            if (r14 == 0) goto L_0x00cc
            java.lang.String r15 = r14.a()
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x00cc
            java.lang.String r15 = r14.a()
            boolean r15 = r15.equals(r7)
            if (r15 == 0) goto L_0x00cc
            int r14 = r14.b()
            long r14 = (long) r14
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x00cc
            com.apkpure.aegon.components.models.Asset r14 = r13.asset
            java.lang.String r14 = r14.e()
            boolean r14 = r14.equals(r10)
            if (r14 == 0) goto L_0x00cc
            boolean r14 = r13.isSuccess()
            if (r14 == 0) goto L_0x00cc
            goto L_0x00d0
        L_0x00cc:
            int r11 = r11 + 1
            goto L_0x006f
        L_0x00cf:
            r13 = r9
        L_0x00d0:
            if (r13 != 0) goto L_0x00d3
            goto L_0x00d9
        L_0x00d3:
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r4 = r13.getStatInfo()
            if (r4 != 0) goto L_0x00db
        L_0x00d9:
            r4 = r9
            goto L_0x00df
        L_0x00db:
            java.lang.String r4 = g.c.a.e.k.h.b.c(r4)
        L_0x00df:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.lang.String r5 = "stat_info"
            e.e.d.l.a.j0(r7, r5, r4)
            if (r0 != 0) goto L_0x00ed
            r4 = r9
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r4 = r0.packageName
        L_0x00ef:
            java.lang.String r5 = "com.apkpure.aegon"
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            r5 = r4 ^ 1
            g.c.a.b.b.g r4 = g.c.a.b.b.g.Normal
            f1911d = r4
            if (r0 == 0) goto L_0x0158
            java.lang.String r6 = r0.packageName
            if (r6 == 0) goto L_0x010a
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0108
            goto L_0x010a
        L_0x0108:
            r6 = 0
            goto L_0x010b
        L_0x010a:
            r6 = 1
        L_0x010b:
            if (r6 != 0) goto L_0x0158
            java.util.List<java.lang.String> r6 = f1914g
            java.lang.String r0 = r0.packageName
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x0158
            android.content.res.Resources r0 = r18.getResources()
            r4 = 2131100019(0x7f060173, float:1.7812408E38)
            int r0 = r0.getColor(r4)
            g.c.a.n.b.b r10 = new g.c.a.n.b.b
            android.content.Context r4 = com.apkpure.aegon.application.AegonApplication.getContext()
            r10.<init>(r4, r3)
            r4 = 2131820999(0x7f1101c7, float:1.9274729E38)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            r3[r12] = r6
            r10.k(r4, r3)
            r11 = 17039379(0x1040013, float:2.4244624E-38)
            g.c.a.b.b.d$c r12 = new g.c.a.b.b.d$c
            r4 = 0
            r0 = r12
            r1 = r18
            r2 = r19
            r3 = r20
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.n(r11, r12)
            r0 = 17039369(0x1040009, float:2.4244596E-38)
            r10.m(r0, r9)
            r10.e()
            goto L_0x0188
        L_0x0158:
            g.c.b.b.c$b r0 = g.c.b.b.c.f2226m
            g.c.b.b.c r0 = r0.a()
            g.c.b.b.j.b$a r3 = new g.c.b.b.j.b$a
            r3.<init>()
            r6 = r20
            r3.b = r6
            r3.f2288e = r12
            r3.f2291h = r5
            java.util.Locale r5 = g.c.a.m.l.b()
            java.lang.String r6 = "getLanguage()"
            i.o.c.h.d(r5, r6)
            r3.c(r5)
            g.c.a.b.b.c r5 = new g.c.a.b.b.c
            r5.<init>(r1, r4, r8)
            r3.b(r5)
            r3.f2294k = r7
            g.c.b.b.j.b r3 = r3.a()
            r0.m(r1, r2, r3)
        L_0x0188:
            java.lang.Object r0 = r8.m()
            i.m.i.a r1 = i.m.i.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x0197
            java.lang.String r1 = "frame"
            r2 = r21
            i.o.c.h.e(r2, r1)
        L_0x0197:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.b.d.e(android.content.Context, java.lang.String, int, i.m.d):java.lang.Object");
    }

    public final Object f(Context context, String str, int i2, i.m.d<? super j> dVar) {
        if (e.e.c.a.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 || !g(context, str) || Build.VERSION.SDK_INT < 23) {
            Object e2 = e(context, str, i2, dVar);
            return e2 == i.m.i.a.COROUTINE_SUSPENDED ? e2 : j.a;
        }
        Activity c2 = c();
        g.c.a.n.b.a aVar = new g.c.a.n.b.a(c2);
        aVar.f(false);
        aVar.d(2131821816);
        aVar.b(2131821814);
        aVar.g(2131821815, new a(str, i2, c2));
        aVar.c(new f());
        aVar.e();
        return j.a;
    }

    public final boolean g(Context context, String str) {
        i.o.c.h.e(context, "context");
        i.o.c.h.e(str, "filePath");
        try {
            g.c.b.c.b.a c2 = g.c.b.c.b.b.a.c(context, str);
            if ((c2 == null ? null : c2.f2312h) != null) {
                List<a.b> list = c2.f2312h;
                i.o.c.h.c(list);
                if (!list.isEmpty()) {
                    return true;
                }
            }
        } catch (Exception e2) {
            b.warn("isObb Exception:", (Throwable) e2);
        }
        return false;
    }

    public final void h(Context context) {
        i.o.c.h.e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("install_manager_config", 0);
            i.o.c.h.d(sharedPreferences, "context.getSharedPreferences(PREFERENCE_NAME_INSTALL_MANAGER_CONFIG, Context.MODE_PRIVATE)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("need_restart_for_storage_permission", true);
            edit.apply();
        }
    }

    public final void i(Context context) {
        i.o.c.h.e(context, "context");
        SystemPackageEvent$Receiver systemPackageEvent$Receiver = new SystemPackageEvent$Receiver(context, new C0058d());
        f1913f = systemPackageEvent$Receiver;
        i.o.c.h.c(systemPackageEvent$Receiver);
        systemPackageEvent$Receiver.a(1000);
    }

    public final boolean j(Context context, String str, g.c.b.b.j.a aVar) {
        String str2;
        i.o.c.h.e(context, "context");
        i.o.c.h.e(str, "installErrorMsg");
        i.o.c.h.e(aVar, "installTask");
        if (i.t.e.m(str, "INSTALL_FAILED_NO_MATCHING_ABIS", false, 2) && (str2 = aVar.a) != null && !i.l.c.d(f1914g, str2)) {
            List<String> list = f1914g;
            String str3 = aVar.a;
            i.o.c.h.c(str3);
            list.add(str3);
        } else if (i.t.e.m(str, "INSTALL_FAILED_INSUFFICIENT_STORAGE", false, 2) || i.t.e.a(str, "No space left on device", false, 2) || i.t.e.a(str, "No storage with enough free space", false, 2)) {
            g.a(context, context.getString(2131821004), context.getString(2131821750));
        } else if (i.t.e.m(str, "java.io.FileNotFoundException", false, 2)) {
            String str4 = aVar.f2272e;
            if (str4 == null) {
                str4 = "";
            }
            if (g(context, str4)) {
                i.o.c.h.e(context, "context");
                SharedPreferences sharedPreferences = context.getSharedPreferences("install_manager_config", 0);
                i.o.c.h.d(sharedPreferences, "context.getSharedPreferences(PREFERENCE_NAME_INSTALL_MANAGER_CONFIG, Context.MODE_PRIVATE)");
                if (sharedPreferences.getBoolean("need_restart_for_storage_permission", false) && e.e.c.a.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    i.o.c.h.e(context, "context");
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("install_manager_config", 0);
                    i.o.c.h.d(sharedPreferences2, "context.getSharedPreferences(PREFERENCE_NAME_INSTALL_MANAGER_CONFIG, Context.MODE_PRIVATE)");
                    SharedPreferences.Editor edit = sharedPreferences2.edit();
                    edit.remove("need_restart_for_storage_permission");
                    edit.apply();
                    g.c.b.b.l.e.d(context, false, aVar.f2272e);
                    Intent intent = new Intent(AegonApplication.getContext(), RestartActivity.class);
                    intent.addFlags(268435456);
                    c().startActivities(new Intent[]{new Intent(AegonApplication.getContext(), MainTabActivity.class), intent});
                    new Handler(Looper.getMainLooper()).postDelayed(b.b, 2000);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k(Context context, g gVar) {
        boolean z = gVar == g.RestoreInstaller;
        boolean z2 = g.c.b.b.l.e.b() && 1 == g.c.b.b.l.g.a(context).a.getInt("latest_install_source_flag", 0);
        Logger logger = b;
        logger.debug("restoreInstaller: " + z + ", isFromFastDownload: " + z2);
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
