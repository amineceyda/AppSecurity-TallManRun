package g.e.a.b.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.zzp;
import e.e.d.l.a;
import java.util.ArrayList;

public final class v9 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K0 = a.K0(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = "";
        long j7 = -2147483648L;
        boolean z = true;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = a.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = a.q(parcel2, readInt);
                    break;
                case 4:
                    str3 = a.q(parcel2, readInt);
                    break;
                case 5:
                    str4 = a.q(parcel2, readInt);
                    break;
                case 6:
                    j2 = a.n0(parcel2, readInt);
                    break;
                case 7:
                    j3 = a.n0(parcel2, readInt);
                    break;
                case 8:
                    str5 = a.q(parcel2, readInt);
                    break;
                case 9:
                    z = a.k0(parcel2, readInt);
                    break;
                case 10:
                    z2 = a.k0(parcel2, readInt);
                    break;
                case 11:
                    j7 = a.n0(parcel2, readInt);
                    break;
                case 12:
                    str6 = a.q(parcel2, readInt);
                    break;
                case ConnectionResult.CANCELED:
                    j4 = a.n0(parcel2, readInt);
                    break;
                case ConnectionResult.TIMEOUT:
                    j5 = a.n0(parcel2, readInt);
                    break;
                case ConnectionResult.INTERRUPTED:
                    i2 = a.m0(parcel2, readInt);
                    break;
                case ConnectionResult.API_UNAVAILABLE:
                    z3 = a.k0(parcel2, readInt);
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    z4 = a.k0(parcel2, readInt);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION:
                    str7 = a.q(parcel2, readInt);
                    break;
                case 21:
                    int o0 = a.o0(parcel2, readInt);
                    if (o0 != 0) {
                        a.U0(parcel2, readInt, o0, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                        break;
                    } else {
                        bool = null;
                        break;
                    }
                case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND:
                    j6 = a.n0(parcel2, readInt);
                    break;
                case ConnectionResult.API_DISABLED:
                    arrayList = a.r(parcel2, readInt);
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION:
                    str8 = a.q(parcel2, readInt);
                    break;
                case 25:
                    str9 = a.q(parcel2, readInt);
                    break;
                default:
                    a.I0(parcel2, readInt);
                    break;
            }
        }
        a.x(parcel2, K0);
        return new zzp(str, str2, str3, str4, j2, j3, str5, z, z2, j7, str6, j4, j5, i2, z3, z4, str7, bool, j6, arrayList, str8, str9);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzp[i2];
    }
}
