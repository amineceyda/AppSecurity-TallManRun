package g.e.a.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import e.e.d.l.a;

public final class k implements Parcelable.Creator<Feature> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = a.q(parcel, readInt);
            } else if (c == 2) {
                i2 = a.m0(parcel, readInt);
            } else if (c != 3) {
                a.I0(parcel, readInt);
            } else {
                j2 = a.n0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new Feature(str, i2, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Feature[i2];
    }
}
