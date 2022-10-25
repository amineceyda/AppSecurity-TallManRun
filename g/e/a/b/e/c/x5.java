package g.e.a.b.e.c;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public abstract class x5 {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f3080f = new Object();
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public static volatile w5 f3081g;

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicInteger f3082h = new AtomicInteger();
    public final v5 a;
    public final String b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public volatile int f3083d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f3084e;

    static {
        new AtomicReference();
    }

    public /* synthetic */ x5(v5 v5Var, String str, Object obj) {
        if (v5Var.a != null) {
            this.a = v5Var;
            this.b = str;
            this.c = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public abstract Object a(Object obj);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b1 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d7 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e9 A[Catch:{ all -> 0x008c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = f3082h
            int r0 = r0.get()
            int r1 = r7.f3083d
            if (r1 >= r0) goto L_0x013e
            monitor-enter(r7)
            int r1 = r7.f3083d     // Catch:{ all -> 0x008c }
            if (r1 >= r0) goto L_0x013a
            g.e.a.b.e.c.w5 r1 = f3081g     // Catch:{ all -> 0x008c }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0134
            g.e.a.b.e.c.v5 r2 = r7.a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x008c }
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.m5 r2 = g.e.a.b.e.c.m5.b(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.a(r3)     // Catch:{ all -> 0x008c }
            r3 = 0
            if (r2 == 0) goto L_0x0062
            java.util.regex.Pattern r4 = g.e.a.b.e.c.b5.c     // Catch:{ all -> 0x008c }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x008c }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0060
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.c()     // Catch:{ all -> 0x008c }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x008c }
            int r6 = r5.length()     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0057
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x008c }
            goto L_0x005d
        L_0x0057:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x008c }
            r5.<init>(r4)     // Catch:{ all -> 0x008c }
            r4 = r5
        L_0x005d:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x008c }
        L_0x0060:
            r2 = r3
            goto L_0x00ae
        L_0x0062:
            g.e.a.b.e.c.v5 r2 = r7.a     // Catch:{ all -> 0x008c }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0091
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.v5 r4 = r7.a     // Catch:{ all -> 0x008c }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x008c }
            boolean r2 = g.e.a.b.e.c.o5.a(r2, r4)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x008f
            g.e.a.b.e.c.v5 r2 = r7.a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x008c }
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x008c }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.v5 r4 = r7.a     // Catch:{ all -> 0x008c }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.g5 r2 = g.e.a.b.e.c.g5.b(r2, r4)     // Catch:{ all -> 0x008c }
            goto L_0x009e
        L_0x008c:
            r0 = move-exception
            goto L_0x013c
        L_0x008f:
            r2 = r3
            goto L_0x009e
        L_0x0091:
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.v5 r4 = r7.a     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.y5 r2 = g.e.a.b.e.c.y5.b(r2, r3)     // Catch:{ all -> 0x008c }
        L_0x009e:
            if (r2 == 0) goto L_0x0060
            java.lang.String r4 = r7.c()     // Catch:{ all -> 0x008c }
            java.lang.Object r2 = r2.a(r4)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0060
            java.lang.Object r2 = r7.a(r2)     // Catch:{ all -> 0x008c }
        L_0x00ae:
            if (r2 == 0) goto L_0x00b1
            goto L_0x00d9
        L_0x00b1:
            g.e.a.b.e.c.v5 r2 = r7.a     // Catch:{ all -> 0x008c }
            boolean r2 = r2.b     // Catch:{ all -> 0x008c }
            if (r2 != 0) goto L_0x00d4
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.m5 r2 = g.e.a.b.e.c.m5.b(r2)     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.v5 r4 = r7.a     // Catch:{ all -> 0x008c }
            boolean r4 = r4.b     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x00c7
            r4 = r3
            goto L_0x00c9
        L_0x00c7:
            java.lang.String r4 = r7.b     // Catch:{ all -> 0x008c }
        L_0x00c9:
            java.lang.String r2 = r2.a(r4)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r2 = r7.a(r2)     // Catch:{ all -> 0x008c }
            goto L_0x00d5
        L_0x00d4:
            r2 = r3
        L_0x00d5:
            if (r2 != 0) goto L_0x00d9
            java.lang.Object r2 = r7.c     // Catch:{ all -> 0x008c }
        L_0x00d9:
            g.e.a.b.e.c.c6 r1 = r1.b()     // Catch:{ all -> 0x008c }
            java.lang.Object r1 = r1.c()     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.a6 r1 = (g.e.a.b.e.c.a6) r1     // Catch:{ all -> 0x008c }
            boolean r4 = r1.b()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x012f
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.n5 r1 = (g.e.a.b.e.c.n5) r1     // Catch:{ all -> 0x008c }
            g.e.a.b.e.c.v5 r2 = r7.a     // Catch:{ all -> 0x008c }
            android.net.Uri r2 = r2.a     // Catch:{ all -> 0x008c }
            java.lang.String r4 = r7.b     // Catch:{ all -> 0x008c }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0126
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008c }
            java.util.Map r1 = r1.a     // Catch:{ all -> 0x008c }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x008c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x008c }
            if (r1 != 0) goto L_0x0109
            goto L_0x0126
        L_0x0109:
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = ""
            int r4 = r2.length()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x011a
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x008c }
            goto L_0x011f
        L_0x011a:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x008c }
            r2.<init>(r3)     // Catch:{ all -> 0x008c }
        L_0x011f:
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x008c }
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x008c }
        L_0x0126:
            if (r3 != 0) goto L_0x012b
            java.lang.Object r2 = r7.c     // Catch:{ all -> 0x008c }
            goto L_0x012f
        L_0x012b:
            java.lang.Object r2 = r7.a(r3)     // Catch:{ all -> 0x008c }
        L_0x012f:
            r7.f3084e = r2     // Catch:{ all -> 0x008c }
            r7.f3083d = r0     // Catch:{ all -> 0x008c }
            goto L_0x013a
        L_0x0134:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008c }
            r0.<init>(r2)     // Catch:{ all -> 0x008c }
            throw r0     // Catch:{ all -> 0x008c }
        L_0x013a:
            monitor-exit(r7)     // Catch:{ all -> 0x008c }
            goto L_0x013e
        L_0x013c:
            monitor-exit(r7)     // Catch:{ all -> 0x008c }
            throw r0
        L_0x013e:
            java.lang.Object r0 = r7.f3084e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.e.c.x5.b():java.lang.Object");
    }

    public final String c() {
        Objects.requireNonNull(this.a);
        return this.b;
    }
}
