package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g.e.a.b.b.v;
import g.e.a.b.c.a;
import g.e.a.b.c.b;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new v();
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final Context zzd;
    private final boolean zze;

    public zzn(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) b.B(a.C0109a.A(iBinder));
        this.zze = z3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = e.e.d.l.a.T0(parcel, 20293);
        e.e.d.l.a.Q0(parcel, 1, this.zza, false);
        boolean z = this.zzb;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        e.e.d.l.a.O0(parcel, 4, new b(this.zzd), false);
        boolean z3 = this.zze;
        parcel.writeInt(262149);
        parcel.writeInt(z3 ? 1 : 0);
        e.e.d.l.a.V0(parcel, T0);
    }
}
