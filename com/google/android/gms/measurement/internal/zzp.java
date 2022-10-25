package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.c.b.b.f;
import g.e.a.b.f.b.v9;
import java.util.List;

public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new v9();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final long zze;
    public final long zzf;
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final String zzk;
    public final long zzl;
    public final long zzm;
    public final int zzn;
    public final boolean zzo;
    public final boolean zzp;
    public final String zzq;
    public final Boolean zzr;
    public final long zzs;
    public final List zzt;
    public final String zzu;
    public final String zzv;

    public zzp(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, String str7, Boolean bool, long j7, List list, String str8) {
        f.k(str);
        this.zza = str;
        this.zzb = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.zzc = str3;
        this.zzj = j2;
        this.zzd = str4;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j5;
        this.zzm = j6;
        this.zzn = i2;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j7;
        this.zzt = list;
        this.zzu = null;
        this.zzv = str8;
    }

    public zzp(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, String str7, Boolean bool, long j7, List list, String str8, String str9) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j4;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j5;
        this.zzm = j6;
        this.zzn = i2;
        this.zzo = z3;
        this.zzp = z4;
        this.zzq = str7;
        this.zzr = bool;
        this.zzs = j7;
        this.zzt = list;
        this.zzu = str8;
        this.zzv = str9;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        a.Q0(parcel, 2, this.zza, false);
        a.Q0(parcel, 3, this.zzb, false);
        a.Q0(parcel, 4, this.zzc, false);
        a.Q0(parcel, 5, this.zzd, false);
        long j2 = this.zze;
        parcel.writeInt(524294);
        parcel.writeLong(j2);
        long j3 = this.zzf;
        parcel.writeInt(524295);
        parcel.writeLong(j3);
        a.Q0(parcel, 8, this.zzg, false);
        boolean z = this.zzh;
        parcel.writeInt(262153);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzi;
        parcel.writeInt(262154);
        parcel.writeInt(z2 ? 1 : 0);
        long j4 = this.zzj;
        parcel.writeInt(524299);
        parcel.writeLong(j4);
        a.Q0(parcel, 12, this.zzk, false);
        long j5 = this.zzl;
        parcel.writeInt(524301);
        parcel.writeLong(j5);
        long j6 = this.zzm;
        parcel.writeInt(524302);
        parcel.writeLong(j6);
        int i3 = this.zzn;
        parcel.writeInt(262159);
        parcel.writeInt(i3);
        boolean z3 = this.zzo;
        parcel.writeInt(262160);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzp;
        parcel.writeInt(262162);
        parcel.writeInt(z4 ? 1 : 0);
        a.Q0(parcel, 19, this.zzq, false);
        Boolean bool = this.zzr;
        if (bool != null) {
            parcel.writeInt(262165);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        long j7 = this.zzs;
        parcel.writeInt(524310);
        parcel.writeLong(j7);
        List list = this.zzt;
        if (list != null) {
            int T02 = a.T0(parcel, 23);
            parcel.writeStringList(list);
            a.V0(parcel, T02);
        }
        a.Q0(parcel, 24, this.zzu, false);
        a.Q0(parcel, 25, this.zzv, false);
        a.V0(parcel, T0);
    }
}
