package g.e.a.b.b.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.WakeLockEvent;
import e.e.d.l.a;
import java.util.ArrayList;

public final class b implements Parcelable.Creator<WakeLockEvent> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K0 = a.K0(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = a.m0(parcel2, readInt);
                    break;
                case 2:
                    j2 = a.n0(parcel2, readInt);
                    break;
                case 4:
                    str = a.q(parcel2, readInt);
                    break;
                case 5:
                    i4 = a.m0(parcel2, readInt);
                    break;
                case 6:
                    arrayList = a.r(parcel2, readInt);
                    break;
                case 8:
                    j3 = a.n0(parcel2, readInt);
                    break;
                case 10:
                    str3 = a.q(parcel2, readInt);
                    break;
                case 11:
                    i3 = a.m0(parcel2, readInt);
                    break;
                case 12:
                    str2 = a.q(parcel2, readInt);
                    break;
                case ConnectionResult.CANCELED:
                    str4 = a.q(parcel2, readInt);
                    break;
                case ConnectionResult.TIMEOUT:
                    i5 = a.m0(parcel2, readInt);
                    break;
                case ConnectionResult.INTERRUPTED:
                    a.W0(parcel2, readInt, 4);
                    f2 = parcel.readFloat();
                    break;
                case ConnectionResult.API_UNAVAILABLE:
                    j4 = a.n0(parcel2, readInt);
                    break;
                case ConnectionResult.SIGN_IN_FAILED:
                    str5 = a.q(parcel2, readInt);
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    z = a.k0(parcel2, readInt);
                    break;
                default:
                    a.I0(parcel2, readInt);
                    break;
            }
        }
        a.x(parcel2, K0);
        return new WakeLockEvent(i2, j2, i3, str, i4, arrayList, str2, j3, i5, str3, str4, f2, j4, str5, z);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }
}
