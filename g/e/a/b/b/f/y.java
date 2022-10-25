package g.e.a.b.b.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import e.e.d.l.a;

public final class y implements Parcelable.Creator<ConnectionTelemetryConfiguration> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        RootTelemetryConfiguration rootTelemetryConfiguration = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    rootTelemetryConfiguration = (RootTelemetryConfiguration) a.p(parcel, readInt, RootTelemetryConfiguration.CREATOR);
                    break;
                case 2:
                    z = a.k0(parcel, readInt);
                    break;
                case 3:
                    z2 = a.k0(parcel, readInt);
                    break;
                case 4:
                    iArr = a.n(parcel, readInt);
                    break;
                case 5:
                    i2 = a.m0(parcel, readInt);
                    break;
                case 6:
                    iArr2 = a.n(parcel, readInt);
                    break;
                default:
                    a.I0(parcel, readInt);
                    break;
            }
        }
        a.x(parcel, K0);
        return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, z, z2, iArr, i2, iArr2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionTelemetryConfiguration[i2];
    }
}
