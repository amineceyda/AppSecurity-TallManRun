package g.e.a.b.b.f;

import android.os.Looper;
import android.os.Message;
import g.e.a.b.e.b.d;

public final class q extends d {
    public final /* synthetic */ b a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(b bVar, Looper looper) {
        super(looper);
        this.a = bVar;
    }

    public static final boolean a(Message message) {
        int i2 = message.what;
        return i2 == 2 || i2 == 1 || i2 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r0 == 5) goto L_0x0031;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            g.e.a.b.b.f.b r0 = r7.a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.t
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x001d
            boolean r0 = a(r8)
            if (r0 == 0) goto L_0x001c
            java.lang.Object r8 = r8.obj
            g.e.a.b.b.f.r r8 = (g.e.a.b.b.f.r) r8
            r8.b()
            r8.c()
        L_0x001c:
            return
        L_0x001d:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x0031
            r4 = 7
            if (r0 == r4) goto L_0x0031
            if (r0 != r1) goto L_0x002f
            g.e.a.b.b.f.b r0 = r7.a
            java.util.Objects.requireNonNull(r0)
            goto L_0x0031
        L_0x002f:
            if (r0 != r3) goto L_0x0039
        L_0x0031:
            g.e.a.b.b.f.b r0 = r7.a
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0182
        L_0x0039:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x0079
            g.e.a.b.b.f.b r0 = r7.a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.r = r1
            boolean r8 = g.e.a.b.b.f.b.h(r0)
            if (r8 == 0) goto L_0x005d
            g.e.a.b.b.f.b r8 = r7.a
            boolean r0 = r8.s
            if (r0 == 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r8.i(r5, r6)
            return
        L_0x005d:
            g.e.a.b.b.f.b r8 = r7.a
            com.google.android.gms.common.ConnectionResult r0 = r8.r
            if (r0 == 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r4)
        L_0x0069:
            g.e.a.b.b.f.b$c r8 = r8.f2852i
            g.e.a.b.b.f.b$d r8 = (g.e.a.b.b.f.b.d) r8
            r8.a(r0)
            g.e.a.b.b.f.b r8 = r7.a
            java.util.Objects.requireNonNull(r8)
            java.lang.System.currentTimeMillis()
            return
        L_0x0079:
            if (r0 != r3) goto L_0x0097
            g.e.a.b.b.f.b r8 = r7.a
            com.google.android.gms.common.ConnectionResult r0 = r8.r
            if (r0 == 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r4)
        L_0x0087:
            g.e.a.b.b.f.b$c r8 = r8.f2852i
            g.e.a.b.b.f.b$d r8 = (g.e.a.b.b.f.b.d) r8
            r8.a(r0)
            g.e.a.b.b.f.b r8 = r7.a
            java.util.Objects.requireNonNull(r8)
            java.lang.System.currentTimeMillis()
            return
        L_0x0097:
            if (r0 != r5) goto L_0x00bb
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00a2
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00a2:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            g.e.a.b.b.f.b r8 = r7.a
            g.e.a.b.b.f.b$c r8 = r8.f2852i
            g.e.a.b.b.f.b$d r8 = (g.e.a.b.b.f.b.d) r8
            r8.a(r0)
            g.e.a.b.b.f.b r8 = r7.a
            java.util.Objects.requireNonNull(r8)
            java.lang.System.currentTimeMillis()
            return
        L_0x00bb:
            r1 = 6
            if (r0 != r1) goto L_0x00fd
            g.e.a.b.b.f.b r8 = r7.a
            r8.i(r3, r6)
            g.e.a.b.b.f.b r8 = r7.a
            g.e.a.b.b.f.b$a r8 = r8.n
            if (r8 == 0) goto L_0x00ef
            g.e.a.b.f.b.e8 r8 = (g.e.a.b.f.b.e8) r8
            java.lang.String r0 = "MeasurementServiceConnection.onConnectionSuspended"
            g.c.b.b.f.j(r0)
            g.e.a.b.f.b.f8 r0 = r8.c
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.f3 r0 = r0.d()
            g.e.a.b.f.b.d3 r0 = r0.f3143m
            java.lang.String r1 = "Service connection suspended"
            r0.a(r1)
            g.e.a.b.f.b.f8 r0 = r8.c
            g.e.a.b.f.b.n4 r0 = r0.a
            g.e.a.b.f.b.k4 r0 = r0.b()
            g.e.a.b.f.b.c8 r1 = new g.e.a.b.f.b.c8
            r1.<init>(r8)
            r0.r(r1)
        L_0x00ef:
            g.e.a.b.b.f.b r8 = r7.a
            java.util.Objects.requireNonNull(r8)
            java.lang.System.currentTimeMillis()
            g.e.a.b.b.f.b r8 = r7.a
            g.e.a.b.b.f.b.g(r8, r3, r2, r6)
            return
        L_0x00fd:
            r1 = 2
            if (r0 != r1) goto L_0x0114
            g.e.a.b.b.f.b r0 = r7.a
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0109
            goto L_0x0114
        L_0x0109:
            java.lang.Object r8 = r8.obj
            g.e.a.b.b.f.r r8 = (g.e.a.b.b.f.r) r8
            r8.b()
            r8.c()
            return
        L_0x0114:
            boolean r0 = a(r8)
            if (r0 == 0) goto L_0x0162
            java.lang.Object r8 = r8.obj
            r0 = r8
            g.e.a.b.b.f.r r0 = (g.e.a.b.b.f.r) r0
            monitor-enter(r0)
            TListener r8 = r0.a     // Catch:{ all -> 0x015f }
            boolean r1 = r0.b     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x014b
            java.lang.String r1 = "GmsClient"
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x015f }
            int r4 = r3.length()     // Catch:{ all -> 0x015f }
            int r4 = r4 + 47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x015f }
            r5.<init>(r4)     // Catch:{ all -> 0x015f }
            java.lang.String r4 = "Callback proxy "
            r5.append(r4)     // Catch:{ all -> 0x015f }
            r5.append(r3)     // Catch:{ all -> 0x015f }
            java.lang.String r3 = " being reused. This is not safe."
            r5.append(r3)     // Catch:{ all -> 0x015f }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x015f }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x015f }
        L_0x014b:
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            if (r8 == 0) goto L_0x0154
            r0.a(r8)     // Catch:{ RuntimeException -> 0x0152 }
            goto L_0x0154
        L_0x0152:
            r8 = move-exception
            throw r8
        L_0x0154:
            monitor-enter(r0)
            r0.b = r2     // Catch:{ all -> 0x015c }
            monitor-exit(r0)     // Catch:{ all -> 0x015c }
            r0.c()
            return
        L_0x015c:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x015c }
            throw r8
        L_0x015f:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x015f }
            throw r8
        L_0x0162:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r1 = "GmsClient"
            java.lang.String r0 = r0.toString()
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0182:
            java.lang.Object r8 = r8.obj
            g.e.a.b.b.f.r r8 = (g.e.a.b.b.f.r) r8
            r8.b()
            r8.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.f.q.handleMessage(android.os.Message):void");
    }
}
