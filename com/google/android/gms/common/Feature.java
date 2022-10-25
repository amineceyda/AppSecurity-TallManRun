package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.d.l.a;
import g.e.a.b.b.f.g;
import g.e.a.b.b.k;
import java.util.Arrays;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new k();
    private final String zza;
    @Deprecated
    private final int zzb;
    private final long zzc;

    public Feature(String str, int i2, long j2) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = j2;
    }

    public long c() {
        long j2 = this.zzc;
        return j2 == -1 ? (long) this.zzb : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.zza;
            if (((str == null || !str.equals(feature.zza)) && (this.zza != null || feature.zza != null)) || c() != feature.c()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Long.valueOf(c())});
    }

    public final String toString() {
        g gVar = new g(this);
        gVar.a("name", this.zza);
        gVar.a(Constants.Raft.VERSION, Long.valueOf(c()));
        return gVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        a.Q0(parcel, 1, this.zza, false);
        int i3 = this.zzb;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        long c = c();
        parcel.writeInt(524291);
        parcel.writeLong(c);
        a.V0(parcel, T0);
    }
}
