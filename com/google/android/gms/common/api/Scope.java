package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.c.b.b.f;
import g.e.a.b.b.e.b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new b();
    public final int b;
    private final String zzb;

    public Scope(int i2, String str) {
        f.l(str, "scopeUri must not be null or empty");
        this.b = i2;
        this.zzb = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.zzb.equals(((Scope) obj).zzb);
    }

    public int hashCode() {
        return this.zzb.hashCode();
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = this.b;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        a.Q0(parcel, 2, this.zzb, false);
        a.V0(parcel, T0);
    }
}
