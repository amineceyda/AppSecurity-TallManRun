package g.e.a.b.f.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.ConnectionResult;
import g.c.b.b.f;
import g.e.a.b.b.f.b;

public final class e8 implements ServiceConnection, b.a, b.C0108b {
    public volatile boolean a;
    public volatile b3 b;
    public final /* synthetic */ f8 c;

    public e8(f8 f8Var) {
        this.c = f8Var;
    }

    public final void a(ConnectionResult connectionResult) {
        f.j("MeasurementServiceConnection.onConnectionFailed");
        f3 f3Var = this.c.a.f3260i;
        if (f3Var == null || !f3Var.n()) {
            f3Var = null;
        }
        if (f3Var != null) {
            f3Var.f3139i.b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.a.b().r(new d8(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.c.a.d().f3136f.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            g.c.b.b.f.j(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.a = r4     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.f8 r4 = r3.c     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.f3 r4 = r4.d()     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.d3 r4 = r4.f3136f     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x0095
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0060 }
            boolean r2 = r1 instanceof g.e.a.b.f.b.v2     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x003a
            g.e.a.b.f.b.v2 r1 = (g.e.a.b.f.b.v2) r1     // Catch:{ RemoteException -> 0x0060 }
        L_0x0038:
            r0 = r1
            goto L_0x0040
        L_0x003a:
            g.e.a.b.f.b.t2 r1 = new g.e.a.b.f.b.t2     // Catch:{ RemoteException -> 0x0060 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0038
        L_0x0040:
            g.e.a.b.f.b.f8 r5 = r3.c     // Catch:{ RemoteException -> 0x0060 }
            g.e.a.b.f.b.n4 r5 = r5.a     // Catch:{ RemoteException -> 0x0060 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ RemoteException -> 0x0060 }
            g.e.a.b.f.b.d3 r5 = r5.n     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0050:
            g.e.a.b.f.b.f8 r5 = r3.c     // Catch:{ RemoteException -> 0x0060 }
            g.e.a.b.f.b.n4 r5 = r5.a     // Catch:{ RemoteException -> 0x0060 }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ RemoteException -> 0x0060 }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ RemoteException -> 0x0060 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r2, r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x006f
        L_0x0060:
            g.e.a.b.f.b.f8 r5 = r3.c     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.n4 r5 = r5.a     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.f3 r5 = r5.d()     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.d3 r5 = r5.f3136f     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001c }
        L_0x006f:
            if (r0 != 0) goto L_0x0083
            r3.a = r4     // Catch:{ all -> 0x001c }
            g.e.a.b.b.g.a r4 = g.e.a.b.b.g.a.b()     // Catch:{ IllegalArgumentException -> 0x0093 }
            g.e.a.b.f.b.f8 r5 = r3.c     // Catch:{ IllegalArgumentException -> 0x0093 }
            g.e.a.b.f.b.n4 r0 = r5.a     // Catch:{ IllegalArgumentException -> 0x0093 }
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x0093 }
            g.e.a.b.f.b.e8 r5 = r5.c     // Catch:{ IllegalArgumentException -> 0x0093 }
            r4.c(r0, r5)     // Catch:{ IllegalArgumentException -> 0x0093 }
            goto L_0x0093
        L_0x0083:
            g.e.a.b.f.b.f8 r4 = r3.c     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.k4 r4 = r4.b()     // Catch:{ all -> 0x001c }
            g.e.a.b.f.b.z7 r5 = new g.e.a.b.f.b.z7     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.r(r5)     // Catch:{ all -> 0x001c }
        L_0x0093:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x0095:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            goto L_0x0098
        L_0x0097:
            throw r4
        L_0x0098:
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.e8.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        f.j("MeasurementServiceConnection.onServiceDisconnected");
        this.c.a.d().f3143m.a("Service disconnected");
        this.c.a.b().r(new a8(this, componentName));
    }
}
