package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.b.f.p;

@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new p();
    public final int b;

    public zzaj(int i2) {
        this.b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = this.b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        a.V0(parcel, T0);
    }
}
