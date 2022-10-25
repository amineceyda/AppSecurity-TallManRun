package g.e.b.l.j.j;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import g.e.a.b.g.b0;
import g.e.a.b.g.g;
import g.e.b.l.j.c;
import g.e.b.l.j.e;
import g.e.b.l.j.j.l;
import g.e.b.l.j.k.e;
import g.e.b.l.j.k.k;
import g.e.b.l.j.l.a0;
import g.e.b.l.j.l.b;
import g.e.b.l.j.l.g;
import g.e.b.l.j.l.h;
import g.e.b.l.j.l.j;
import g.e.b.l.j.l.k;
import g.e.b.l.j.l.l;
import g.e.b.l.j.l.m;
import g.e.b.l.j.l.u;
import g.e.b.l.j.l.w;
import g.e.b.l.j.l.x;
import g.e.b.l.j.l.y;
import g.e.b.l.j.l.z;
import g.e.b.l.j.n.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

public class v {
    public static final /* synthetic */ int q = 0;
    public final Context a;
    public final g0 b;
    public final c0 c;

    /* renamed from: d  reason: collision with root package name */
    public final k f3521d;

    /* renamed from: e  reason: collision with root package name */
    public final m f3522e;

    /* renamed from: f  reason: collision with root package name */
    public final k0 f3523f;

    /* renamed from: g  reason: collision with root package name */
    public final f f3524g;

    /* renamed from: h  reason: collision with root package name */
    public final h f3525h;

    /* renamed from: i  reason: collision with root package name */
    public final e f3526i;

    /* renamed from: j  reason: collision with root package name */
    public final c f3527j;

    /* renamed from: k  reason: collision with root package name */
    public final g.e.b.l.j.h.a f3528k;

    /* renamed from: l  reason: collision with root package name */
    public final n0 f3529l;

    /* renamed from: m  reason: collision with root package name */
    public f0 f3530m;
    public final g<Boolean> n = new g<>();
    public final g<Boolean> o = new g<>();
    public final g<Void> p = new g<>();

    public class a implements g.e.a.b.g.e<Boolean, Void> {
        public final /* synthetic */ g.e.a.b.g.f a;

        public a(g.e.a.b.g.f fVar) {
            this.a = fVar;
        }

        public g.e.a.b.g.f a(Object obj) throws Exception {
            return v.this.f3522e.c(new u(this, (Boolean) obj));
        }
    }

    public v(Context context, m mVar, k0 k0Var, g0 g0Var, f fVar, c0 c0Var, h hVar, k kVar, e eVar, n0 n0Var, c cVar, g.e.b.l.j.h.a aVar) {
        new AtomicBoolean(false);
        this.a = context;
        this.f3522e = mVar;
        this.f3523f = k0Var;
        this.b = g0Var;
        this.f3524g = fVar;
        this.c = c0Var;
        this.f3525h = hVar;
        this.f3521d = kVar;
        this.f3526i = eVar;
        this.f3527j = cVar;
        this.f3528k = aVar;
        this.f3529l = n0Var;
    }

    public static void a(v vVar, String str) {
        OutputStreamWriter outputStreamWriter;
        Throwable th;
        Integer num;
        v vVar2 = vVar;
        String str2 = str;
        Objects.requireNonNull(vVar);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        g.e.b.l.j.f fVar = g.e.b.l.j.f.a;
        fVar.b("Opening a new session with ID " + str2);
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", new Object[]{"18.2.9"});
        k0 k0Var = vVar2.f3523f;
        h hVar = vVar2.f3525h;
        x xVar = new x(k0Var.c, hVar.f3493e, hVar.f3494f, k0Var.c(), (hVar.c != null ? h0.APP_STORE : h0.DEVELOPER).f(), hVar.f3495g);
        Context context = vVar2.a;
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        z zVar = new z(str3, str4, l.k(context));
        Context context2 = vVar2.a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str5 = str4;
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        l.a aVar = l.a.UNKNOWN;
        String str6 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str6)) {
            fVar.e("Architecture#getValue()::Build.CPU_ABI returned null or empty");
        } else {
            l.a aVar2 = l.a.f3514l.get(str6.toLowerCase(locale));
            if (aVar2 != null) {
                aVar = aVar2;
            }
        }
        int ordinal = aVar.ordinal();
        String str7 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long h2 = l.h();
        boolean j2 = l.j(context2);
        int d2 = l.d(context2);
        String str8 = Build.MANUFACTURER;
        String str9 = Build.PRODUCT;
        y yVar = new y(ordinal, str7, availableProcessors, h2, blockCount, j2, d2, str8, str9);
        g.e.b.l.j.f fVar2 = fVar;
        String str10 = str9;
        String str11 = str8;
        vVar2.f3527j.c(str, format, currentTimeMillis, new w(xVar, zVar, yVar));
        vVar2.f3526i.a(str2);
        n0 n0Var = vVar2.f3529l;
        d0 d0Var = n0Var.a;
        Objects.requireNonNull(d0Var);
        Charset charset = a0.a;
        b.C0123b bVar = new b.C0123b();
        bVar.a = "18.2.9";
        String str12 = d0Var.c.a;
        Objects.requireNonNull(str12, "Null gmpAppId");
        bVar.b = str12;
        String c2 = d0Var.b.c();
        Objects.requireNonNull(c2, "Null installationUuid");
        bVar.f3606d = c2;
        String str13 = d0Var.c.f3493e;
        Objects.requireNonNull(str13, "Null buildVersion");
        bVar.f3607e = str13;
        String str14 = d0Var.c.f3494f;
        Objects.requireNonNull(str14, "Null displayVersion");
        bVar.f3608f = str14;
        bVar.c = 4;
        g.b bVar2 = new g.b();
        bVar2.b(false);
        bVar2.c = Long.valueOf(currentTimeMillis);
        Objects.requireNonNull(str2, "Null identifier");
        bVar2.b = str2;
        String str15 = d0.f3484f;
        Objects.requireNonNull(str15, "Null generator");
        bVar2.a = str15;
        String str16 = d0Var.b.c;
        Objects.requireNonNull(str16, "Null identifier");
        String str17 = d0Var.c.f3493e;
        Objects.requireNonNull(str17, "Null version");
        String str18 = d0Var.c.f3494f;
        String c3 = d0Var.b.c();
        g.e.b.l.j.e eVar = d0Var.c.f3495g;
        if (eVar.b == null) {
            eVar.b = new e.b(eVar, (e.a) null);
        }
        String str19 = eVar.b.a;
        g.e.b.l.j.e eVar2 = d0Var.c.f3495g;
        if (eVar2.b == null) {
            eVar2.b = new e.b(eVar2, (e.a) null);
        }
        bVar2.f3631f = new h(str16, str17, str18, (a0.e.a.C0114a) null, c3, str19, eVar2.b.b, (h.a) null);
        Integer num2 = 3;
        Boolean valueOf = Boolean.valueOf(l.k(d0Var.a));
        String str20 = num2 == null ? " platform" : "";
        if (valueOf == null) {
            str20 = g.a.a.a.a.w(str20, " jailbroken");
        }
        if (str20.isEmpty()) {
            int intValue = num2.intValue();
            boolean booleanValue = valueOf.booleanValue();
            String str21 = str7;
            String str22 = str6;
            String str23 = str5;
            bVar2.f3633h = new u(intValue, str3, str5, booleanValue, (u.a) null);
            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
            int i2 = 7;
            if (!TextUtils.isEmpty(str22) && (num = d0.f3483e.get(str22.toLowerCase(locale))) != null) {
                i2 = num.intValue();
            }
            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
            long h3 = l.h();
            b.C0123b bVar3 = bVar;
            g.b bVar4 = bVar2;
            long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
            boolean j3 = l.j(d0Var.a);
            int d3 = l.d(d0Var.a);
            j.b bVar5 = new j.b();
            bVar5.a = Integer.valueOf(i2);
            bVar5.b = str21;
            bVar5.c = Integer.valueOf(availableProcessors2);
            bVar5.f3647d = Long.valueOf(h3);
            bVar5.f3648e = Long.valueOf(blockCount2);
            bVar5.f3649f = Boolean.valueOf(j3);
            bVar5.f3650g = Integer.valueOf(d3);
            bVar5.f3651h = str11;
            bVar5.f3652i = str10;
            bVar4.f3634i = bVar5.a();
            bVar4.f3636k = 3;
            b.C0123b bVar6 = bVar3;
            bVar6.f3609g = bVar4.a();
            a0 a2 = bVar6.a();
            g.e.b.l.j.n.e eVar3 = n0Var.b;
            Objects.requireNonNull(eVar3);
            a0.e h4 = a2.h();
            if (h4 == null) {
                fVar2.b("Could not get session for report");
                return;
            }
            String g2 = h4.g();
            try {
                g.e.b.l.j.n.e.f(eVar3.b.f(g2, "report"), g.e.b.l.j.n.e.f3688f.f(a2));
                File f2 = eVar3.b.f(g2, "start-time");
                long i3 = h4.i();
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(f2), g.e.b.l.j.n.e.f3686d);
                outputStreamWriter.write("");
                f2.setLastModified(i3 * 1000);
                outputStreamWriter.close();
                return;
            } catch (IOException e2) {
                g.e.b.l.j.f fVar3 = g.e.b.l.j.f.a;
                String w = g.a.a.a.a.w("Could not persist report for session ", g2);
                if (fVar3.a(3)) {
                    Log.d("FirebaseCrashlytics", w, e2);
                    return;
                }
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str20));
        }
        throw th;
    }

    public static g.e.a.b.g.f b(v vVar) {
        boolean z;
        g.e.a.b.g.f fVar;
        Objects.requireNonNull(vVar);
        ArrayList arrayList = new ArrayList();
        f fVar2 = vVar.f3524g;
        for (File file : f.i(fVar2.a.listFiles(a.a))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    g.e.b.l.j.f.a.f("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    fVar = g.e.a.b.b.h.e.h(null);
                } else {
                    g.e.b.l.j.f.a.b("Logging app exception event to Firebase Analytics");
                    fVar = g.e.a.b.b.h.e.d(new ScheduledThreadPoolExecutor(1), new y(vVar, parseLong));
                }
                arrayList.add(fVar);
            } catch (NumberFormatException unused2) {
                g.e.b.l.j.f fVar3 = g.e.b.l.j.f.a;
                StringBuilder i2 = g.a.a.a.a.i("Could not parse app exception timestamp from file ");
                i2.append(file.getName());
                fVar3.f(i2.toString());
            }
            file.delete();
        }
        return g.e.a.b.b.h.e.p(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r12, g.e.b.l.j.p.f r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            g.e.b.l.j.j.n0 r1 = r11.f3529l
            g.e.b.l.j.n.e r1 = r1.b
            java.util.SortedSet r1 = r1.c()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r12) goto L_0x001b
            g.e.b.l.j.f r12 = g.e.b.l.j.f.a
            java.lang.String r13 = "No open sessions to be closed."
            r12.e(r13)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r12)
            java.lang.String r1 = (java.lang.String) r1
            g.e.b.l.j.p.e r13 = (g.e.b.l.j.p.e) r13
            g.e.b.l.j.p.j.d r13 = r13.b()
            g.e.b.l.j.p.j.b r13 = r13.b()
            boolean r13 = r13.b
            if (r13 == 0) goto L_0x0033
            r11.h(r1)
            goto L_0x003a
        L_0x0033:
            g.e.b.l.j.f r13 = g.e.b.l.j.f.a
            java.lang.String r2 = "ANR feature disabled."
            r13.e(r2)
        L_0x003a:
            g.e.b.l.j.c r13 = r11.f3527j
            boolean r13 = r13.d(r1)
            if (r13 == 0) goto L_0x0075
            g.e.b.l.j.f r13 = g.e.b.l.j.f.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Finalizing native report for session "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r13.e(r2)
            g.e.b.l.j.c r2 = r11.f3527j
            g.e.b.l.j.g r2 = r2.a(r1)
            java.util.Objects.requireNonNull(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No minidump data found for session "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r13.f(r1)
        L_0x0075:
            r13 = 0
            r1 = 0
            if (r12 == 0) goto L_0x0080
            java.lang.Object r12 = r0.get(r1)
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
        L_0x0080:
            g.e.b.l.j.j.n0 r12 = r11.f3529l
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            g.e.b.l.j.n.e r12 = r12.b
            g.e.b.l.j.n.f r0 = r12.b
            java.util.Objects.requireNonNull(r0)
            r4 = 2
            java.io.File[] r5 = new java.io.File[r4]
            java.io.File r6 = new java.io.File
            java.io.File r7 = r0.a
            java.lang.String r7 = r7.getParent()
            java.lang.String r8 = ".com.google.firebase.crashlytics"
            r6.<init>(r7, r8)
            r5[r1] = r6
            java.io.File r1 = new java.io.File
            java.io.File r0 = r0.a
            java.lang.String r0 = r0.getParent()
            java.lang.String r6 = ".com.google.firebase.crashlytics-ndk"
            r1.<init>(r0, r6)
            r0 = 1
            r5[r0] = r1
            r0 = 0
        L_0x00b3:
            if (r0 >= r4) goto L_0x00dc
            r1 = r5[r0]
            boolean r6 = r1.exists()
            if (r6 == 0) goto L_0x00d9
            boolean r6 = g.e.b.l.j.n.f.h(r1)
            if (r6 == 0) goto L_0x00d9
            g.e.b.l.j.f r6 = g.e.b.l.j.f.a
            java.lang.String r7 = "Deleted legacy Crashlytics files from "
            java.lang.StringBuilder r7 = g.a.a.a.a.i(r7)
            java.lang.String r1 = r1.getPath()
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r6.b(r1)
        L_0x00d9:
            int r0 = r0 + 1
            goto L_0x00b3
        L_0x00dc:
            java.util.SortedSet r0 = r12.c()
            if (r13 == 0) goto L_0x00e5
            r0.remove(r13)
        L_0x00e5:
            int r13 = r0.size()
            r1 = 8
            if (r13 > r1) goto L_0x00ee
            goto L_0x0123
        L_0x00ee:
            int r13 = r0.size()
            if (r13 <= r1) goto L_0x0123
            java.lang.Object r13 = r0.last()
            java.lang.String r13 = (java.lang.String) r13
            g.e.b.l.j.f r4 = g.e.b.l.j.f.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Removing session over cap: "
            r5.append(r6)
            r5.append(r13)
            java.lang.String r5 = r5.toString()
            r4.b(r5)
            g.e.b.l.j.n.f r4 = r12.b
            java.util.Objects.requireNonNull(r4)
            java.io.File r5 = new java.io.File
            java.io.File r4 = r4.b
            r5.<init>(r4, r13)
            g.e.b.l.j.n.f.h(r5)
            r0.remove(r13)
            goto L_0x00ee
        L_0x0123:
            java.util.Iterator r13 = r0.iterator()
        L_0x0127:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x02c0
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Finalizing report for session "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.e(r4)
            g.e.b.l.j.n.f r4 = r12.b
            java.io.FilenameFilter r5 = g.e.b.l.j.n.e.f3690h
            java.io.File r4 = r4.e(r0)
            java.io.File[] r4 = r4.listFiles(r5)
            java.util.List r4 = g.e.b.l.j.n.f.i(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x017a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Session "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " has no events."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.e(r4)
            goto L_0x02af
        L_0x017a:
            java.util.Collections.sort(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0186:
            r5 = 0
        L_0x0187:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01f6
            java.lang.Object r6 = r4.next()
            java.io.File r6 = (java.io.File) r6
            g.e.b.l.j.l.d0.g r7 = g.e.b.l.j.n.e.f3688f     // Catch:{ IOException -> 0x01de }
            java.lang.String r8 = g.e.b.l.j.n.e.e(r6)     // Catch:{ IOException -> 0x01de }
            java.util.Objects.requireNonNull(r7)     // Catch:{ IOException -> 0x01de }
            android.util.JsonReader r7 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x01d7 }
            java.io.StringReader r9 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x01d7 }
            r9.<init>(r8)     // Catch:{ IllegalStateException -> 0x01d7 }
            r7.<init>(r9)     // Catch:{ IllegalStateException -> 0x01d7 }
            g.e.b.l.j.l.a0$e$d r8 = g.e.b.l.j.l.d0.g.b(r7)     // Catch:{ all -> 0x01cd }
            r7.close()     // Catch:{ IllegalStateException -> 0x01d7 }
            r1.add(r8)     // Catch:{ IOException -> 0x01de }
            if (r5 != 0) goto L_0x01cb
            java.lang.String r7 = r6.getName()     // Catch:{ IOException -> 0x01de }
            java.lang.String r8 = "event"
            boolean r8 = r7.startsWith(r8)     // Catch:{ IOException -> 0x01de }
            if (r8 == 0) goto L_0x01c8
            java.lang.String r8 = "_"
            boolean r5 = r7.endsWith(r8)     // Catch:{ IOException -> 0x01de }
            if (r5 == 0) goto L_0x01c8
            r5 = 1
            goto L_0x01c9
        L_0x01c8:
            r5 = 0
        L_0x01c9:
            if (r5 == 0) goto L_0x0186
        L_0x01cb:
            r5 = 1
            goto L_0x0187
        L_0x01cd:
            r8 = move-exception
            r7.close()     // Catch:{ all -> 0x01d2 }
            goto L_0x01d6
        L_0x01d2:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch:{ IllegalStateException -> 0x01d7 }
        L_0x01d6:
            throw r8     // Catch:{ IllegalStateException -> 0x01d7 }
        L_0x01d7:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x01de }
            r8.<init>(r7)     // Catch:{ IOException -> 0x01de }
            throw r8     // Catch:{ IOException -> 0x01de }
        L_0x01de:
            r7 = move-exception
            g.e.b.l.j.f r8 = g.e.b.l.j.f.a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Could not add event to report for "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r8.g(r6, r7)
            goto L_0x0187
        L_0x01f6:
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0214
            g.e.b.l.j.f r1 = g.e.b.l.j.f.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Could not parse event files for session "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r1.f(r4)
            goto L_0x02af
        L_0x0214:
            g.e.b.l.j.n.f r4 = r12.b
            g.e.b.l.j.k.g r6 = new g.e.b.l.j.k.g
            r6.<init>(r4)
            java.lang.String r4 = r6.c(r0)
            g.e.b.l.j.n.f r6 = r12.b
            java.lang.String r7 = "report"
            java.io.File r6 = r6.f(r0, r7)
            g.e.b.l.j.l.d0.g r7 = g.e.b.l.j.n.e.f3688f     // Catch:{ IOException -> 0x0298 }
            java.lang.String r8 = g.e.b.l.j.n.e.e(r6)     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0 r8 = r7.e(r8)     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0 r4 = r8.j(r2, r5, r4)     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.b0 r8 = new g.e.b.l.j.l.b0     // Catch:{ IOException -> 0x0298 }
            r8.<init>(r1)     // Catch:{ IOException -> 0x0298 }
            r1 = r4
            g.e.b.l.j.l.b r1 = (g.e.b.l.j.l.b) r1     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0$e r1 = r1.f3604h     // Catch:{ IOException -> 0x0298 }
            if (r1 == 0) goto L_0x0290
            g.e.b.l.j.l.a0$b r1 = r4.i()     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.b r4 = (g.e.b.l.j.l.b) r4     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0$e r4 = r4.f3604h     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0$e$b r4 = r4.l()     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.g$b r4 = (g.e.b.l.j.l.g.b) r4     // Catch:{ IOException -> 0x0298 }
            r4.f3635j = r8     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0$e r4 = r4.a()     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.b$b r1 = (g.e.b.l.j.l.b.C0123b) r1     // Catch:{ IOException -> 0x0298 }
            r1.f3609g = r4     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0 r1 = r1.a()     // Catch:{ IOException -> 0x0298 }
            r4 = r1
            g.e.b.l.j.l.b r4 = (g.e.b.l.j.l.b) r4     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.l.a0$e r4 = r4.f3604h     // Catch:{ IOException -> 0x0298 }
            if (r4 != 0) goto L_0x0265
            goto L_0x02af
        L_0x0265:
            if (r5 == 0) goto L_0x0278
            g.e.b.l.j.n.f r5 = r12.b     // Catch:{ IOException -> 0x0298 }
            java.lang.String r4 = r4.g()     // Catch:{ IOException -> 0x0298 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ IOException -> 0x0298 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0298 }
            java.io.File r5 = r5.f3691d     // Catch:{ IOException -> 0x0298 }
            r8.<init>(r5, r4)     // Catch:{ IOException -> 0x0298 }
            goto L_0x0288
        L_0x0278:
            g.e.b.l.j.n.f r5 = r12.b     // Catch:{ IOException -> 0x0298 }
            java.lang.String r4 = r4.g()     // Catch:{ IOException -> 0x0298 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ IOException -> 0x0298 }
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x0298 }
            java.io.File r5 = r5.c     // Catch:{ IOException -> 0x0298 }
            r8.<init>(r5, r4)     // Catch:{ IOException -> 0x0298 }
        L_0x0288:
            java.lang.String r1 = r7.f(r1)     // Catch:{ IOException -> 0x0298 }
            g.e.b.l.j.n.e.f(r8, r1)     // Catch:{ IOException -> 0x0298 }
            goto L_0x02af
        L_0x0290:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0298 }
            java.lang.String r4 = "Reports without sessions cannot have events added to them."
            r1.<init>(r4)     // Catch:{ IOException -> 0x0298 }
            throw r1     // Catch:{ IOException -> 0x0298 }
        L_0x0298:
            r1 = move-exception
            g.e.b.l.j.f r4 = g.e.b.l.j.f.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Could not synthesize final report file for "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.g(r5, r1)
        L_0x02af:
            g.e.b.l.j.n.f r1 = r12.b
            java.util.Objects.requireNonNull(r1)
            java.io.File r4 = new java.io.File
            java.io.File r1 = r1.b
            r4.<init>(r1, r0)
            g.e.b.l.j.n.f.h(r4)
            goto L_0x0127
        L_0x02c0:
            g.e.b.l.j.p.f r13 = r12.c
            g.e.b.l.j.p.e r13 = (g.e.b.l.j.p.e) r13
            g.e.b.l.j.p.j.d r13 = r13.b()
            g.e.b.l.j.p.j.c r13 = r13.a()
            java.util.Objects.requireNonNull(r13)
            java.util.List r12 = r12.b()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r13 = r12.size()
            r0 = 4
            if (r13 > r0) goto L_0x02dd
            goto L_0x02f5
        L_0x02dd:
            java.util.List r12 = r12.subList(r0, r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x02e5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x02f5
            java.lang.Object r13 = r12.next()
            java.io.File r13 = (java.io.File) r13
            r13.delete()
            goto L_0x02e5
        L_0x02f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.j.v.c(boolean, g.e.b.l.j.p.f):void");
    }

    public final void d(long j2) {
        try {
            f fVar = this.f3524g;
            if (!fVar.a(".ae" + j2).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            if (g.e.b.l.j.f.a.a(5)) {
                Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
            }
        }
    }

    public boolean e(g.e.b.l.j.p.f fVar) {
        this.f3522e.a();
        f0 f0Var = this.f3530m;
        if (f0Var != null && f0Var.f3487e.get()) {
            g.e.b.l.j.f.a.f("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
        fVar2.e("Finalizing previously open sessions.");
        try {
            c(true, fVar);
            fVar2.e("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            if (g.e.b.l.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e2);
            }
            return false;
        }
    }

    public final String f() {
        SortedSet<String> c2 = this.f3529l.b.c();
        if (!c2.isEmpty()) {
            return c2.first();
        }
        return null;
    }

    public g.e.a.b.g.f<Void> g(g.e.a.b.g.f<g.e.b.l.j.p.j.a> fVar) {
        Object obj;
        b0<TResult> b0Var;
        g.e.b.l.j.n.e eVar = this.f3529l.b;
        if (!(!eVar.b.d().isEmpty() || !eVar.b.c().isEmpty() || !eVar.b.b().isEmpty())) {
            g.e.b.l.j.f.a.e("No crash reports are available to be sent.");
            this.n.b(Boolean.FALSE);
            return g.e.a.b.b.h.e.h(null);
        }
        g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
        fVar2.e("Crash reports are available to be sent.");
        if (this.b.a()) {
            fVar2.b("Automatic data collection is enabled. Allowing upload.");
            this.n.b(Boolean.FALSE);
            obj = g.e.a.b.b.h.e.h(Boolean.TRUE);
        } else {
            fVar2.b("Automatic data collection is disabled.");
            fVar2.e("Notifying that unsent reports are available.");
            this.n.b(Boolean.TRUE);
            g0 g0Var = this.b;
            synchronized (g0Var.c) {
                b0Var = g0Var.f3488d.a;
            }
            s sVar = new s(this);
            Objects.requireNonNull(b0Var);
            Executor executor = g.e.a.b.g.h.a;
            b0 b0Var2 = new b0();
            b0Var.b.a(new g.e.a.b.g.w(executor, sVar, b0Var2));
            b0Var.q();
            fVar2.b("Waiting for send/deleteUnsentReports to be called.");
            b0<TResult> b0Var3 = this.o.a;
            ExecutorService executorService = q0.a;
            g.e.a.b.g.g gVar = new g.e.a.b.g.g();
            f fVar3 = new f(gVar);
            b0Var2.d(fVar3);
            b0Var3.d(fVar3);
            obj = gVar.a;
        }
        a aVar = new a(fVar);
        b0 b0Var4 = (b0) obj;
        Objects.requireNonNull(b0Var4);
        Executor executor2 = g.e.a.b.g.h.a;
        b0 b0Var5 = new b0();
        b0Var4.b.a(new g.e.a.b.g.w(executor2, aVar, b0Var5));
        b0Var4.q();
        return b0Var5;
    }

    public final void h(String str) {
        String str2 = str;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            boolean z = false;
            List historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                g.e.b.l.j.k.e eVar = new g.e.b.l.j.k.e(this.f3524g, str2);
                f fVar = this.f3524g;
                m mVar = this.f3522e;
                g.e.b.l.j.k.g gVar = new g.e.b.l.j.k.g(fVar);
                k kVar = new k(str2, fVar, mVar);
                kVar.f3538d.a.getReference().d(gVar.b(str2, false));
                kVar.f3539e.a.getReference().d(gVar.b(str2, true));
                kVar.f3540f.set(gVar.c(str2), false);
                n0 n0Var = this.f3529l;
                ApplicationExitInfo d2 = n0Var.d(str2, historicalProcessExitReasons);
                if (d2 == null) {
                    g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
                    fVar2.e("No relevant ApplicationExitInfo occurred during session: " + str2);
                    return;
                }
                d0 d0Var = n0Var.a;
                a0.a b2 = n0.b(d2);
                int i3 = d0Var.a.getResources().getConfiguration().orientation;
                k.b bVar = new k.b();
                bVar.e("anr");
                g.e.b.l.j.l.c cVar = (g.e.b.l.j.l.c) b2;
                bVar.d(cVar.f3614g);
                if (cVar.f3611d != 100) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                Integer valueOf2 = Integer.valueOf(i3);
                m mVar2 = new m((g.e.b.l.j.l.b0) null, (a0.e.d.a.b.C0117b) null, b2, d0Var.e(), d0Var.a(), (m.a) null);
                String str3 = valueOf2 == null ? " uiOrientation" : "";
                if (str3.isEmpty()) {
                    bVar.b(new g.e.b.l.j.l.l(mVar2, (g.e.b.l.j.l.b0) null, (g.e.b.l.j.l.b0) null, valueOf, valueOf2.intValue(), (l.a) null));
                    bVar.c(d0Var.b(i3));
                    a0.e.d a2 = bVar.a();
                    g.e.b.l.j.f fVar3 = g.e.b.l.j.f.a;
                    fVar3.b("Persisting anr for session " + str2);
                    n0Var.b.d(n0Var.a(a2, eVar, kVar), str2, true);
                    return;
                }
                throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str3));
            }
            g.e.b.l.j.f fVar4 = g.e.b.l.j.f.a;
            fVar4.e("No ApplicationExitInfo available. Session: " + str2);
            return;
        }
        g.e.b.l.j.f fVar5 = g.e.b.l.j.f.a;
        fVar5.e("ANR feature enabled, but device is API " + i2);
    }
}
