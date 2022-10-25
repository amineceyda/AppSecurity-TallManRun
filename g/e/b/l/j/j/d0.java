package g.e.b.l.j.j;

import android.content.Context;
import g.a.a.a.a;
import g.e.b.l.j.l.a0;
import g.e.b.l.j.l.b0;
import g.e.b.l.j.l.n;
import g.e.b.l.j.l.o;
import g.e.b.l.j.l.p;
import g.e.b.l.j.l.q;
import g.e.b.l.j.l.r;
import g.e.b.l.j.q.d;
import g.e.b.l.j.q.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class d0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Integer> f3483e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f3484f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.9"});
    public final Context a;
    public final k0 b;
    public final h c;

    /* renamed from: d  reason: collision with root package name */
    public final d f3485d;

    static {
        HashMap hashMap = new HashMap();
        f3483e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public d0(Context context, k0 k0Var, h hVar, d dVar) {
        this.a = context;
        this.b = k0Var;
        this.c = hVar;
        this.f3485d = dVar;
    }

    public final b0<a0.e.d.a.b.C0116a> a() {
        a0.e.d.a.b.C0116a[] aVarArr = new a0.e.d.a.b.C0116a[1];
        Long l2 = 0L;
        Long l3 = 0L;
        String str = this.c.f3492d;
        Objects.requireNonNull(str, "Null name");
        String str2 = this.c.b;
        String str3 = l2 == null ? " baseAddress" : "";
        if (l3 == null) {
            str3 = a.w(str3, " size");
        }
        if (str3.isEmpty()) {
            aVarArr[0] = new n(l2.longValue(), l3.longValue(), str, str2, (n.a) null);
            return new b0<>(Arrays.asList(aVarArr));
        }
        throw new IllegalStateException(a.w("Missing required properties:", str3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g.e.b.l.j.l.a0.e.d.c b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.a
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ IllegalStateException -> 0x0044 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0044 }
            android.content.Intent r0 = r0.registerReceiver(r4, r5)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r5 = "status"
            r6 = -1
            int r5 = r0.getIntExtra(r5, r6)     // Catch:{ IllegalStateException -> 0x0044 }
            if (r5 != r6) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            if (r5 == r3) goto L_0x0025
            r7 = 5
            if (r5 != r7) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = 0
            goto L_0x0026
        L_0x0025:
            r5 = 1
        L_0x0026:
            java.lang.String r7 = "level"
            int r7 = r0.getIntExtra(r7, r6)     // Catch:{ IllegalStateException -> 0x003f }
            java.lang.String r8 = "scale"
            int r0 = r0.getIntExtra(r8, r6)     // Catch:{ IllegalStateException -> 0x003f }
            if (r7 == r6) goto L_0x0056
            if (r0 != r6) goto L_0x0037
            goto L_0x0056
        L_0x0037:
            float r6 = (float) r7     // Catch:{ IllegalStateException -> 0x003f }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x003f }
            float r6 = r6 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch:{ IllegalStateException -> 0x003f }
            goto L_0x0057
        L_0x003f:
            r0 = move-exception
            goto L_0x0046
        L_0x0041:
            r0 = r4
            r5 = 0
            goto L_0x0057
        L_0x0044:
            r0 = move-exception
            r5 = 0
        L_0x0046:
            g.e.b.l.j.f r6 = g.e.b.l.j.f.a
            r7 = 6
            boolean r6 = r6.a(r7)
            if (r6 == 0) goto L_0x0056
            java.lang.String r6 = "FirebaseCrashlytics"
            java.lang.String r7 = "An error occurred getting battery state."
            android.util.Log.e(r6, r7, r0)
        L_0x0056:
            r0 = r4
        L_0x0057:
            if (r0 == 0) goto L_0x0061
            double r6 = r0.doubleValue()
            java.lang.Double r4 = java.lang.Double.valueOf(r6)
        L_0x0061:
            if (r5 == 0) goto L_0x0077
            if (r0 != 0) goto L_0x0066
            goto L_0x0077
        L_0x0066:
            float r0 = r0.floatValue()
            double r5 = (double) r0
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r3 = 3
            goto L_0x0078
        L_0x0077:
            r3 = 1
        L_0x0078:
            android.content.Context r0 = r13.a
            boolean r5 = g.e.b.l.j.j.l.j(r0)
            if (r5 == 0) goto L_0x0081
            goto L_0x0092
        L_0x0081:
            java.lang.String r5 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r5 = 8
            android.hardware.Sensor r0 = r0.getDefaultSensor(r5)
            if (r0 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r1 = 0
        L_0x0093:
            long r5 = g.e.b.l.j.j.l.h()
            android.content.Context r0 = r13.a
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo
            r2.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r2)
            long r7 = r2.availMem
            long r5 = r5 - r7
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r2 = new android.os.StatFs
            r2.<init>(r0)
            int r0 = r2.getBlockSize()
            long r7 = (long) r0
            int r0 = r2.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r2.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            g.e.b.l.j.l.s$b r0 = new g.e.b.l.j.l.s$b
            r0.<init>()
            r0.a = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.b = r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.f3673d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            r0.f3674e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f3675f = r14
            g.e.b.l.j.l.a0$e$d$c r14 = r0.a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.b.l.j.j.d0.b(int):g.e.b.l.j.l.a0$e$d$c");
    }

    public final a0.e.d.a.b.C0117b c(e eVar, int i2, int i3, int i4) {
        String str = eVar.b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e eVar2 = eVar.f3710d;
        if (i4 >= i3) {
            e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f3710d;
                i5++;
            }
        }
        a0.e.d.a.b.C0117b bVar = null;
        Objects.requireNonNull(str, "Null type");
        b0 b0Var = new b0(d(stackTraceElementArr, i2));
        Integer valueOf = Integer.valueOf(i5);
        if (eVar2 != null && i5 == 0) {
            bVar = c(eVar2, i2, i3, i4 + 1);
        }
        String str3 = valueOf == null ? " overflowCount" : "";
        if (str3.isEmpty()) {
            return new o(str, str2, b0Var, bVar, valueOf.intValue(), (o.a) null);
        }
        throw new IllegalStateException(a.w("Missing required properties:", str3));
    }

    public final b0<a0.e.d.a.b.C0118d.C0119a> d(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            r.b bVar = new r.b();
            bVar.f3669e = Integer.valueOf(i2);
            long j2 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = (long) stackTraceElement.getLineNumber();
            }
            bVar.a = Long.valueOf(max);
            Objects.requireNonNull(str, "Null symbol");
            bVar.b = str;
            bVar.c = fileName;
            bVar.f3668d = Long.valueOf(j2);
            arrayList.add(bVar.a());
        }
        return new b0<>(arrayList);
    }

    public final a0.e.d.a.b.c e() {
        Long l2 = 0L;
        String str = l2 == null ? " address" : "";
        if (str.isEmpty()) {
            return new p("0", "0", l2.longValue(), (p.a) null);
        }
        throw new IllegalStateException(a.w("Missing required properties:", str));
    }

    public final a0.e.d.a.b.C0118d f(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        Integer valueOf = Integer.valueOf(i2);
        b0 b0Var = new b0(d(stackTraceElementArr, i2));
        String str = valueOf == null ? " importance" : "";
        if (str.isEmpty()) {
            return new q(name, valueOf.intValue(), b0Var, (q.a) null);
        }
        throw new IllegalStateException(a.w("Missing required properties:", str));
    }
}
