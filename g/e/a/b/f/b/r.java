package g.e.a.b.f.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzas;
import e.e.d.l.a;

public final class r implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                a.I0(parcel, readInt);
            } else {
                bundle = a.m(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new zzas(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzas[i2];
    }
}
