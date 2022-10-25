package g.e.a.b.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzs;
import e.e.d.l.a;

public final class x implements Parcelable.Creator<zzs> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        boolean z = false;
        String str = null;
        IBinder iBinder = null;
        boolean z2 = false;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = a.q(parcel, readInt);
            } else if (c == 2) {
                iBinder = a.l0(parcel, readInt);
            } else if (c == 3) {
                z = a.k0(parcel, readInt);
            } else if (c != 4) {
                a.I0(parcel, readInt);
            } else {
                z2 = a.k0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new zzs(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzs[i2];
    }
}
