package e.e.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import e.d.e;
import e.e.c.c.g;
import e.e.g.m;
import java.lang.reflect.Method;

@SuppressLint({"NewApi"})
public class d {
    public static final j a;
    public static final e<String, Typeface> b = new e<>(16);

    public static class a extends m {
        public g a;

        public a(g gVar) {
            this.a = gVar;
        }
    }

    static {
        j jVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            jVar = new i();
        } else if (i2 >= 28) {
            jVar = new h();
        } else if (i2 >= 26) {
            jVar = new g();
        } else {
            if (i2 >= 24) {
                Method method = f.f1294d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    jVar = new f();
                }
            }
            jVar = i2 >= 21 ? new e() : new j();
        }
        a = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r5, e.e.c.c.b r6, android.content.res.Resources r7, int r8, int r9, e.e.c.c.g r10, android.os.Handler r11, boolean r12) {
        /*
            boolean r0 = r6 instanceof e.e.c.c.e
            r1 = -3
            if (r0 == 0) goto L_0x014b
            e.e.c.c.e r6 = (e.e.c.c.e) r6
            java.lang.String r0 = r6.f1288d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r10 == 0) goto L_0x002f
            r10.b(r0, r11)
        L_0x002f:
            return r0
        L_0x0030:
            if (r12 == 0) goto L_0x0037
            int r0 = r6.c
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r10 != 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r0 = -1
            if (r12 == 0) goto L_0x0040
            int r12 = r6.b
            goto L_0x0041
        L_0x0040:
            r12 = -1
        L_0x0041:
            android.os.Handler r11 = e.e.c.c.g.c(r11)
            e.e.d.d$a r4 = new e.e.d.d$a
            r4.<init>(r10)
            e.e.g.e r6 = r6.a
            e.e.g.c r10 = new e.e.g.c
            r10.<init>(r4, r11)
            if (r3 == 0) goto L_0x00cb
            e.d.e<java.lang.String, android.graphics.Typeface> r11 = e.e.g.j.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r3 = r6.f1321e
            r11.append(r3)
            java.lang.String r3 = "-"
            r11.append(r3)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            e.d.e<java.lang.String, android.graphics.Typeface> r3 = e.e.g.j.a
            java.lang.Object r3 = r3.b(r11)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L_0x0084
            e.e.g.m r5 = r10.a
            android.os.Handler r6 = r10.b
            e.e.g.a r11 = new e.e.g.a
            r11.<init>(r10, r5, r3)
            r6.post(r11)
            r2 = r3
            goto L_0x015e
        L_0x0084:
            if (r12 != r0) goto L_0x0091
            e.e.g.j$a r5 = e.e.g.j.a(r11, r5, r6, r9)
            r10.a(r5)
            android.graphics.Typeface r2 = r5.a
            goto L_0x015e
        L_0x0091:
            e.e.g.f r0 = new e.e.g.f
            r0.<init>(r11, r5, r6, r9)
            java.util.concurrent.ExecutorService r5 = e.e.g.j.b     // Catch:{ InterruptedException -> 0x00bd }
            java.util.concurrent.Future r5 = r5.submit(r0)     // Catch:{ InterruptedException -> 0x00bd }
            long r11 = (long) r12
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b6, InterruptedException -> 0x00b4, TimeoutException -> 0x00ac }
            java.lang.Object r5 = r5.get(r11, r6)     // Catch:{ ExecutionException -> 0x00b6, InterruptedException -> 0x00b4, TimeoutException -> 0x00ac }
            e.e.g.j$a r5 = (e.e.g.j.a) r5     // Catch:{ InterruptedException -> 0x00bd }
            r10.a(r5)     // Catch:{ InterruptedException -> 0x00bd }
            android.graphics.Typeface r2 = r5.a     // Catch:{ InterruptedException -> 0x00bd }
            goto L_0x015e
        L_0x00ac:
            java.lang.InterruptedException r5 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00bd }
            java.lang.String r6 = "timeout"
            r5.<init>(r6)     // Catch:{ InterruptedException -> 0x00bd }
            throw r5     // Catch:{ InterruptedException -> 0x00bd }
        L_0x00b4:
            r5 = move-exception
            throw r5     // Catch:{ InterruptedException -> 0x00bd }
        L_0x00b6:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00bd }
            r6.<init>(r5)     // Catch:{ InterruptedException -> 0x00bd }
            throw r6     // Catch:{ InterruptedException -> 0x00bd }
        L_0x00bd:
            e.e.g.m r5 = r10.a
            android.os.Handler r6 = r10.b
            e.e.g.b r11 = new e.e.g.b
            r11.<init>(r10, r5, r1)
            r6.post(r11)
            goto L_0x015e
        L_0x00cb:
            e.d.e<java.lang.String, android.graphics.Typeface> r11 = e.e.g.j.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r6.f1321e
            r11.append(r12)
            java.lang.String r12 = "-"
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            e.d.e<java.lang.String, android.graphics.Typeface> r12 = e.e.g.j.a
            java.lang.Object r12 = r12.b(r11)
            android.graphics.Typeface r12 = (android.graphics.Typeface) r12
            if (r12 == 0) goto L_0x00fb
            e.e.g.m r5 = r10.a
            android.os.Handler r6 = r10.b
            e.e.g.a r11 = new e.e.g.a
            r11.<init>(r10, r5, r12)
            r6.post(r11)
            r2 = r12
            goto L_0x015e
        L_0x00fb:
            e.e.g.g r12 = new e.e.g.g
            r12.<init>(r10)
            java.lang.Object r0 = e.e.g.j.c
            monitor-enter(r0)
            e.d.g<java.lang.String, java.util.ArrayList<e.e.i.a<e.e.g.j$a>>> r10 = e.e.g.j.f1324d     // Catch:{ all -> 0x0148 }
            java.lang.Object r1 = r10.getOrDefault(r11, r2)     // Catch:{ all -> 0x0148 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x0112
            r1.add(r12)     // Catch:{ all -> 0x0148 }
            monitor-exit(r0)     // Catch:{ all -> 0x0148 }
            goto L_0x015e
        L_0x0112:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0148 }
            r1.<init>()     // Catch:{ all -> 0x0148 }
            r1.add(r12)     // Catch:{ all -> 0x0148 }
            r10.put(r11, r1)     // Catch:{ all -> 0x0148 }
            monitor-exit(r0)     // Catch:{ all -> 0x0148 }
            e.e.g.h r10 = new e.e.g.h
            r10.<init>(r11, r5, r6, r9)
            java.util.concurrent.ExecutorService r5 = e.e.g.j.b
            e.e.g.i r6 = new e.e.g.i
            r6.<init>(r11)
            android.os.Looper r11 = android.os.Looper.myLooper()
            if (r11 != 0) goto L_0x013a
            android.os.Handler r11 = new android.os.Handler
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            r11.<init>(r12)
            goto L_0x013f
        L_0x013a:
            android.os.Handler r11 = new android.os.Handler
            r11.<init>()
        L_0x013f:
            e.e.g.o r12 = new e.e.g.o
            r12.<init>(r11, r10, r6)
            r5.execute(r12)
            goto L_0x015e
        L_0x0148:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0148 }
            throw r5
        L_0x014b:
            e.e.d.j r12 = a
            e.e.c.c.c r6 = (e.e.c.c.c) r6
            android.graphics.Typeface r2 = r12.a(r5, r6, r7, r9)
            if (r10 == 0) goto L_0x015e
            if (r2 == 0) goto L_0x015b
            r10.b(r2, r11)
            goto L_0x015e
        L_0x015b:
            r10.a(r1, r11)
        L_0x015e:
            if (r2 == 0) goto L_0x0169
            e.d.e<java.lang.String, android.graphics.Typeface> r5 = b
            java.lang.String r6 = c(r7, r8, r9)
            r5.c(r6, r2)
        L_0x0169:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.d.a(android.content.Context, e.e.c.c.b, android.content.res.Resources, int, int, e.e.c.c.g, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i2, String str, int i3) {
        Typeface d2 = a.d(context, resources, i2, str, i3);
        if (d2 != null) {
            b.c(c(resources, i2, i3), d2);
        }
        return d2;
    }

    public static String c(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }
}
