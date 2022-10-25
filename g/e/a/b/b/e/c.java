package g.e.a.b.b.e;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import e.e.d.l.a;

public final class c implements Parcelable.Creator<Status> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i3 = a.m0(parcel, readInt);
            } else if (c == 2) {
                str = a.q(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) a.p(parcel, readInt, PendingIntent.CREATOR);
            } else if (c == 4) {
                connectionResult = (ConnectionResult) a.p(parcel, readInt, ConnectionResult.CREATOR);
            } else if (c != 1000) {
                a.I0(parcel, readInt);
            } else {
                i2 = a.m0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new Status(i2, i3, str, pendingIntent, connectionResult);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
