package g.e.a.b.b.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import e.e.d.l.a;

public final class b implements Parcelable.Creator<Scope> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = a.m0(parcel, readInt);
            } else if (c != 2) {
                a.I0(parcel, readInt);
            } else {
                str = a.q(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new Scope(i2, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Scope[i2];
    }
}
