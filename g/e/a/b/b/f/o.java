package g.e.a.b.b.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import e.e.d.l.a;

public final class o implements Parcelable.Creator<RootTelemetryConfiguration> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = a.m0(parcel, readInt);
            } else if (c == 2) {
                z = a.k0(parcel, readInt);
            } else if (c == 3) {
                z2 = a.k0(parcel, readInt);
            } else if (c == 4) {
                i3 = a.m0(parcel, readInt);
            } else if (c != 5) {
                a.I0(parcel, readInt);
            } else {
                i4 = a.m0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new RootTelemetryConfiguration(i2, z, z2, i3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new RootTelemetryConfiguration[i2];
    }
}
