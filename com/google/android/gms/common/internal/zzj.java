package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.b.f.x;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new x();
    public Bundle b;
    public Feature[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f366d;

    /* renamed from: e  reason: collision with root package name */
    public ConnectionTelemetryConfiguration f367e;

    public zzj() {
    }

    public zzj(Bundle bundle, Feature[] featureArr, int i2, ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.b = bundle;
        this.c = featureArr;
        this.f366d = i2;
        this.f367e = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        a.N0(parcel, 1, this.b, false);
        a.R0(parcel, 2, this.c, i2, false);
        int i3 = this.f366d;
        parcel.writeInt(262147);
        parcel.writeInt(i3);
        a.P0(parcel, 4, this.f367e, i2, false);
        a.V0(parcel, T0);
    }
}
