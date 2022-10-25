package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.f.b.c;

public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new c();
    public String zza;
    public String zzb;
    public zzks zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzau zzg;
    public long zzh;
    public zzau zzi;
    public final long zzj;
    public final zzau zzk;

    public zzab(zzab zzab) {
        this.zza = zzab.zza;
        this.zzb = zzab.zzb;
        this.zzc = zzab.zzc;
        this.zzd = zzab.zzd;
        this.zze = zzab.zze;
        this.zzf = zzab.zzf;
        this.zzg = zzab.zzg;
        this.zzh = zzab.zzh;
        this.zzi = zzab.zzi;
        this.zzj = zzab.zzj;
        this.zzk = zzab.zzk;
    }

    public zzab(String str, String str2, zzks zzks, long j2, boolean z, String str3, zzau zzau, long j3, zzau zzau2, long j4, zzau zzau3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzks;
        this.zzd = j2;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzau;
        this.zzh = j3;
        this.zzi = zzau2;
        this.zzj = j4;
        this.zzk = zzau3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        a.Q0(parcel, 2, this.zza, false);
        a.Q0(parcel, 3, this.zzb, false);
        a.P0(parcel, 4, this.zzc, i2, false);
        long j2 = this.zzd;
        parcel.writeInt(524293);
        parcel.writeLong(j2);
        boolean z = this.zze;
        parcel.writeInt(262150);
        parcel.writeInt(z ? 1 : 0);
        a.Q0(parcel, 7, this.zzf, false);
        a.P0(parcel, 8, this.zzg, i2, false);
        long j3 = this.zzh;
        parcel.writeInt(524297);
        parcel.writeLong(j3);
        a.P0(parcel, 10, this.zzi, i2, false);
        long j4 = this.zzj;
        parcel.writeInt(524299);
        parcel.writeLong(j4);
        a.P0(parcel, 12, this.zzk, i2, false);
        a.V0(parcel, T0);
    }
}
