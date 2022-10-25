package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g.e.a.b.b.f.g0;
import g.e.a.b.b.f.h0;
import g.e.a.b.b.q;
import g.e.a.b.b.r;
import g.e.a.b.b.x;
import g.e.a.b.c.a;
import g.e.a.b.c.b;
import javax.annotation.Nullable;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new x();
    private final String zza;
    @Nullable
    private final q zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzs(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.zza = str;
        r rVar = null;
        if (iBinder != null) {
            try {
                int i2 = q.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                a l2 = (queryLocalInterface instanceof h0 ? (h0) queryLocalInterface : new g0(iBinder)).l();
                byte[] bArr = l2 == null ? null : (byte[]) b.B(l2);
                if (bArr != null) {
                    rVar = new r(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.zzb = rVar;
        this.zzc = z;
        this.zzd = z2;
    }

    public zzs(String str, @Nullable q qVar, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = qVar;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = e.e.d.l.a.T0(parcel, 20293);
        e.e.d.l.a.Q0(parcel, 1, this.zza, false);
        q qVar = this.zzb;
        if (qVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            qVar = null;
        }
        e.e.d.l.a.O0(parcel, 2, qVar, false);
        boolean z = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzd;
        parcel.writeInt(262148);
        parcel.writeInt(z2 ? 1 : 0);
        e.e.d.l.a.V0(parcel, T0);
    }
}
