package g.e.a.b.b.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zzaj;
import e.e.d.l.a;

public final class p implements Parcelable.Creator<zzaj> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                a.I0(parcel, readInt);
            } else {
                i2 = a.m0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new zzaj(i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzaj[i2];
    }
}
