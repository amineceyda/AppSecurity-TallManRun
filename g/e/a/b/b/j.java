package g.e.a.b.b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import e.e.d.l.a;

public final class j implements Parcelable.Creator<ConnectionResult> {
    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = a.m0(parcel, readInt);
            } else if (c == 2) {
                i3 = a.m0(parcel, readInt);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) a.p(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 4) {
                a.I0(parcel, readInt);
            } else {
                str = a.q(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new ConnectionResult(i2, i3, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionResult[i2];
    }
}
