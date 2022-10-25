package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g.c.b.b.f;
import g.e.a.b.f.b.n9;
import g.e.a.b.f.b.o9;

public final class zzks extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzks> CREATOR = new n9();
    public final int zza;
    public final String zzb;
    public final long zzc;
    public final Long zzd;
    public final String zze;
    public final String zzf;
    public final Double zzg;

    public zzks(int i2, String str, long j2, Long l2, Float f2, String str2, String str3, Double d2) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = l2;
        if (i2 == 1) {
            this.zzg = f2 != null ? Double.valueOf(f2.doubleValue()) : null;
        } else {
            this.zzg = d2;
        }
        this.zze = str2;
        this.zzf = str3;
    }

    public zzks(o9 o9Var) {
        this(o9Var.c, o9Var.f3278d, o9Var.f3279e, o9Var.b);
    }

    public zzks(String str, long j2, Object obj, String str2) {
        f.k(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j2;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else if (obj instanceof Double) {
            this.zzd = null;
            this.zzg = (Double) obj;
            this.zze = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object c() {
        Long l2 = this.zzd;
        if (l2 != null) {
            return l2;
        }
        Double d2 = this.zzg;
        if (d2 != null) {
            return d2;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        n9.a(this, parcel, i2);
    }
}
