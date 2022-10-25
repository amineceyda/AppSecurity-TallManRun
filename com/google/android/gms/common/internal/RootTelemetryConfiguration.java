package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.b.f.o;

public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new o();
    private final int zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int zzd;
    private final int zze;

    public RootTelemetryConfiguration(int i2, boolean z, boolean z2, int i3, int i4) {
        this.zza = i2;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i3;
        this.zze = i4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = this.zza;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        boolean z = this.zzb;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        int i4 = this.zzd;
        parcel.writeInt(262148);
        parcel.writeInt(i4);
        int i5 = this.zze;
        parcel.writeInt(262149);
        parcel.writeInt(i5);
        a.V0(parcel, T0);
    }
}
