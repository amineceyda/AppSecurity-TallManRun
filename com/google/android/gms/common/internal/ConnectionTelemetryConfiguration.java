package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.b.f.y;

public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new y();
    private final RootTelemetryConfiguration zza;
    private final boolean zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final int zze;
    private final int[] zzf;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.zza = rootTelemetryConfiguration;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = iArr;
        this.zze = i2;
        this.zzf = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        a.P0(parcel, 1, this.zza, i2, false);
        boolean z = this.zzb;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzc;
        parcel.writeInt(262147);
        parcel.writeInt(z2 ? 1 : 0);
        int[] iArr = this.zzd;
        if (iArr != null) {
            int T02 = a.T0(parcel, 4);
            parcel.writeIntArray(iArr);
            a.V0(parcel, T02);
        }
        int i3 = this.zze;
        parcel.writeInt(262149);
        parcel.writeInt(i3);
        int[] iArr2 = this.zzf;
        if (iArr2 != null) {
            int T03 = a.T0(parcel, 6);
            parcel.writeIntArray(iArr2);
            a.V0(parcel, T03);
        }
        a.V0(parcel, T0);
    }
}
