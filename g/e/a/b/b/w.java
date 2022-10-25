package g.e.a.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;
import e.e.d.l.a;

public final class w implements Parcelable.Creator<zzq> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        boolean z = false;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = a.k0(parcel, readInt);
            } else if (c == 2) {
                str = a.q(parcel, readInt);
            } else if (c != 3) {
                a.I0(parcel, readInt);
            } else {
                i2 = a.m0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new zzq(z, str, i2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzq[i2];
    }
}
