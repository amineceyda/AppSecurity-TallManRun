package g.e.a.b.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzn;
import e.e.d.l.a;

public final class v implements Parcelable.Creator<zzn> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = a.q(parcel, readInt);
            } else if (c == 2) {
                z = a.k0(parcel, readInt);
            } else if (c == 3) {
                z2 = a.k0(parcel, readInt);
            } else if (c == 4) {
                iBinder = a.l0(parcel, readInt);
            } else if (c != 5) {
                a.I0(parcel, readInt);
            } else {
                z3 = a.k0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new zzn(str, z, z2, iBinder, z3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzn[i2];
    }
}
