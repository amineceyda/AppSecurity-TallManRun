package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g.a.a.a.a;
import g.e.a.b.f.b.s;
import java.util.Objects;

public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new s();
    public final String zza;
    public final zzas zzb;
    public final String zzc;
    public final long zzd;

    public zzau(zzau zzau, long j2) {
        Objects.requireNonNull(zzau, "null reference");
        this.zza = zzau.zza;
        this.zzb = zzau.zzb;
        this.zzc = zzau.zzc;
        this.zzd = j2;
    }

    public zzau(String str, zzas zzas, String str2, long j2) {
        this.zza = str;
        this.zzb = zzas;
        this.zzc = str2;
        this.zzd = j2;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        return a.f(sb, ",params=", valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        s.a(this, parcel, i2);
    }
}
