package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import e.e.d.l.a;
import g.e.a.b.f.b.q;
import g.e.a.b.f.b.r;
import java.util.Iterator;

public final class zzas extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzas> CREATOR = new r();
    /* access modifiers changed from: private */
    public final Bundle zza;

    public zzas(Bundle bundle) {
        this.zza = bundle;
    }

    public final int c() {
        return this.zza.size();
    }

    public final Bundle f() {
        return new Bundle(this.zza);
    }

    public final Double h() {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    public final Long i() {
        return Long.valueOf(this.zza.getLong("value"));
    }

    public final Iterator iterator() {
        return new q(this);
    }

    public final Object l(String str) {
        return this.zza.get(str);
    }

    public final String m(String str) {
        return this.zza.getString(str);
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        a.N0(parcel, 2, f(), false);
        a.V0(parcel, T0);
    }
}
