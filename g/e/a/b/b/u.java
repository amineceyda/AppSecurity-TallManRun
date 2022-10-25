package g.e.a.b.b;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import g.e.a.b.b.f.m;
import g.e.a.b.c.b;
import java.util.Objects;

public final class u {
    public static final s a = new o(q.A("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));
    public static final s b = new p(q.A("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));
    public static volatile m c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f2874d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static Context f2875e;

    static {
        new m(q.A("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));
        new n(q.A("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));
    }

    public static z a(String str, q qVar, boolean z, boolean z2) {
        try {
            b();
            Objects.requireNonNull(f2875e, "null reference");
            try {
                return c.v(new zzs(str, qVar, z, z2), new b(f2875e.getPackageManager())) ? z.f2877d : new y(new l(z, str, qVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return z.c("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String valueOf = String.valueOf(e3.getMessage());
            return z.c(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e3);
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b() throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            g.e.a.b.b.f.m r0 = c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r0 = f2875e
            java.lang.String r1 = "null reference"
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Object r0 = f2874d
            monitor-enter(r0)
            g.e.a.b.b.f.m r1 = c     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0041
            android.content.Context r1 = f2875e     // Catch:{ all -> 0x0037 }
            com.google.android.gms.dynamite.DynamiteModule$a r2 = com.google.android.gms.dynamite.DynamiteModule.c     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "com.google.android.gms.googlecertificates"
            com.google.android.gms.dynamite.DynamiteModule r1 = com.google.android.gms.dynamite.DynamiteModule.c(r1, r2, r3)     // Catch:{ all -> 0x0037 }
            java.lang.String r2 = "com.google.android.gms.common.GoogleCertificatesImpl"
            android.os.IBinder r1 = r1.b(r2)     // Catch:{ all -> 0x0037 }
            int r2 = g.e.a.b.b.f.l.a     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x0029
            r1 = 0
            goto L_0x003f
        L_0x0029:
            java.lang.String r2 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ all -> 0x0037 }
            boolean r3 = r2 instanceof g.e.a.b.b.f.m     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0039
            r1 = r2
            g.e.a.b.b.f.m r1 = (g.e.a.b.b.f.m) r1     // Catch:{ all -> 0x0037 }
            goto L_0x003f
        L_0x0037:
            r1 = move-exception
            goto L_0x0043
        L_0x0039:
            g.e.a.b.b.f.k r2 = new g.e.a.b.b.f.k     // Catch:{ all -> 0x0037 }
            r2.<init>(r1)     // Catch:{ all -> 0x0037 }
            r1 = r2
        L_0x003f:
            c = r1     // Catch:{ all -> 0x0037 }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0043:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.u.b():void");
    }
}
