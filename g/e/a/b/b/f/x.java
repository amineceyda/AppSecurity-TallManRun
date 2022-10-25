package g.e.a.b.b.f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import e.e.d.l.a;

public final class x implements Parcelable.Creator<zzj> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int i2 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = a.m(parcel, readInt);
            } else if (c == 2) {
                featureArr = (Feature[]) a.s(parcel, readInt, Feature.CREATOR);
            } else if (c == 3) {
                i2 = a.m0(parcel, readInt);
            } else if (c != 4) {
                a.I0(parcel, readInt);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) a.p(parcel, readInt, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        a.x(parcel, K0);
        return new zzj(bundle, featureArr, i2, connectionTelemetryConfiguration);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzj[i2];
    }
}
