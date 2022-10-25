package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.b.h.e;
import g.e.a.b.b.w;
import javax.annotation.Nullable;

public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new w();
    private final boolean zza;
    @Nullable
    private final String zzb;
    private final int zzc;

    public zzq(boolean z, String str, int i2) {
        this.zza = z;
        this.zzb = str;
        this.zzc = e.B(i2) - 1;
    }

    @Nullable
    public final String c() {
        return this.zzb;
    }

    public final boolean e() {
        return this.zza;
    }

    public final int f() {
        return e.B(this.zzc);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        boolean z = this.zza;
        parcel.writeInt(262145);
        parcel.writeInt(z ? 1 : 0);
        a.Q0(parcel, 2, this.zzb, false);
        int i3 = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        a.V0(parcel, T0);
    }
}
