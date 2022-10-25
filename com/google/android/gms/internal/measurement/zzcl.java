package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.e.c.i1;

public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new i1();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzcl(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j2;
        this.zzb = j3;
        this.zzc = z;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        long j2 = this.zza;
        parcel.writeInt(524289);
        parcel.writeLong(j2);
        long j3 = this.zzb;
        parcel.writeInt(524290);
        parcel.writeLong(j3);
        boolean z = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(z ? 1 : 0);
        a.Q0(parcel, 4, this.zzd, false);
        a.Q0(parcel, 5, this.zze, false);
        a.Q0(parcel, 6, this.zzf, false);
        a.N0(parcel, 7, this.zzg, false);
        a.Q0(parcel, 8, this.zzh, false);
        a.V0(parcel, T0);
    }
}
