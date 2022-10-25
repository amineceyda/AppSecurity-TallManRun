package g.e.a.b.b.f;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import g.e.a.b.b.f.b;
import g.e.a.b.f.b.e8;
import java.util.Objects;

public final class u extends h {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f2870g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f2871h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(b bVar, int i2, IBinder iBinder, Bundle bundle) {
        super(bVar, i2, bundle);
        this.f2871h = bVar;
        this.f2870g = iBinder;
    }

    public final void d(ConnectionResult connectionResult) {
        b.C0108b bVar = this.f2871h.o;
        if (bVar != null) {
            ((e8) bVar).a(connectionResult);
        }
        Objects.requireNonNull(this.f2871h);
        System.currentTimeMillis();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r6 = this;
            r0 = 0
            android.os.IBinder r1 = r6.f2870g     // Catch:{ RemoteException -> 0x00b9 }
            java.lang.String r2 = "null reference"
            java.util.Objects.requireNonNull(r1, r2)     // Catch:{ RemoteException -> 0x00b9 }
            java.lang.String r1 = r1.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x00b9 }
            g.e.a.b.b.f.b r2 = r6.f2871h
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0048
            g.e.a.b.b.f.b r2 = r6.f2871h
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 97
            int r5 = r5 + r3
            r4.<init>(r5)
            java.lang.String r3 = "service descriptor mismatch: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = " vs. "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = r4.toString()
            goto L_0x00bd
        L_0x0048:
            g.e.a.b.b.f.b r1 = r6.f2871h
            android.os.IBinder r2 = r6.f2870g
            g.e.a.b.f.b.b3 r1 = (g.e.a.b.f.b.b3) r1
            java.util.Objects.requireNonNull(r1)
            r1 = 0
            if (r2 != 0) goto L_0x0056
            r3 = r1
            goto L_0x0068
        L_0x0056:
            java.lang.String r3 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof g.e.a.b.f.b.v2
            if (r4 == 0) goto L_0x0063
            g.e.a.b.f.b.v2 r3 = (g.e.a.b.f.b.v2) r3
            goto L_0x0068
        L_0x0063:
            g.e.a.b.f.b.t2 r3 = new g.e.a.b.f.b.t2
            r3.<init>(r2)
        L_0x0068:
            if (r3 == 0) goto L_0x00b8
            g.e.a.b.b.f.b r2 = r6.f2871h
            r4 = 2
            r5 = 4
            boolean r2 = g.e.a.b.b.f.b.g(r2, r4, r5, r3)
            if (r2 != 0) goto L_0x007d
            g.e.a.b.b.f.b r2 = r6.f2871h
            r4 = 3
            boolean r2 = g.e.a.b.b.f.b.g(r2, r4, r5, r3)
            if (r2 == 0) goto L_0x00b8
        L_0x007d:
            g.e.a.b.b.f.b r2 = r6.f2871h
            r2.r = r1
            g.e.a.b.b.f.b$a r2 = r2.n
            if (r2 == 0) goto L_0x00b7
            g.e.a.b.f.b.e8 r2 = (g.e.a.b.f.b.e8) r2
            java.lang.String r3 = "MeasurementServiceConnection.onConnected"
            g.c.b.b.f.j(r3)
            monitor-enter(r2)
            g.e.a.b.f.b.b3 r3 = r2.b     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r3, r4)     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            g.e.a.b.f.b.b3 r3 = r2.b     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            android.os.IInterface r3 = r3.b()     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            g.e.a.b.f.b.v2 r3 = (g.e.a.b.f.b.v2) r3     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            g.e.a.b.f.b.f8 r4 = r2.c     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            g.e.a.b.f.b.n4 r4 = r4.a     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            g.e.a.b.f.b.k4 r4 = r4.b()     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            g.e.a.b.f.b.b8 r5 = new g.e.a.b.f.b.b8     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            r5.<init>(r2, r3)     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            r4.r(r5)     // Catch:{ DeadObjectException | IllegalStateException -> 0x00af }
            goto L_0x00b3
        L_0x00ad:
            r0 = move-exception
            goto L_0x00b5
        L_0x00af:
            r2.b = r1     // Catch:{ all -> 0x00ad }
            r2.a = r0     // Catch:{ all -> 0x00ad }
        L_0x00b3:
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            goto L_0x00b7
        L_0x00b5:
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            throw r0
        L_0x00b7:
            r0 = 1
        L_0x00b8:
            return r0
        L_0x00b9:
            java.lang.String r1 = "GmsClient"
            java.lang.String r2 = "service probably died"
        L_0x00bd:
            android.util.Log.w(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.f.u.e():boolean");
    }
}
