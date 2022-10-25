package g.e.a.b.b.f;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public abstract class h extends r<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public final int f2867d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f2868e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f2869f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(b bVar, int i2, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f2869f = bVar;
        this.f2867d = i2;
        this.f2868e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f2867d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.e()
            if (r3 != 0) goto L_0x001b
            g.e.a.b.b.f.b r3 = r2.f2869f
            r3.i(r0, r1)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.d(r3)
        L_0x001b:
            return
        L_0x001c:
            g.e.a.b.b.f.b r3 = r2.f2869f
            r3.i(r0, r1)
            android.os.Bundle r3 = r2.f2868e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f2867d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.b.f.h.a(java.lang.Object):void");
    }

    public final void b() {
    }

    public abstract void d(ConnectionResult connectionResult);

    public abstract boolean e();
}
