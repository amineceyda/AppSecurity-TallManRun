package g.e.a.b.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import e.e.d.l.a;

public final class c implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K0 = a.K0(parcel);
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        String str = null;
        String str2 = null;
        zzks zzks = null;
        String str3 = null;
        zzau zzau = null;
        zzau zzau2 = null;
        zzau zzau3 = null;
        boolean z = false;
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
                    zzks = (zzks) a.p(parcel2, readInt, zzks.CREATOR);
                    break;
                case 5:
                    j2 = a.n0(parcel2, readInt);
                    break;
                case 6:
                    z = a.k0(parcel2, readInt);
                    break;
                case 7:
                    str3 = a.q(parcel2, readInt);
                    break;
                case 8:
                    zzau = (zzau) a.p(parcel2, readInt, zzau.CREATOR);
                    break;
                case 9:
                    j3 = a.n0(parcel2, readInt);
                    break;
                case 10:
                    zzau2 = (zzau) a.p(parcel2, readInt, zzau.CREATOR);
                    break;
                case 11:
                    j4 = a.n0(parcel2, readInt);
                    break;
                case 12:
                    zzau3 = (zzau) a.p(parcel2, readInt, zzau.CREATOR);
                    break;
                default:
                    a.I0(parcel2, readInt);
                    break;
            }
        }
        a.x(parcel2, K0);
        return new zzab(str, str2, zzks, j2, z, str3, zzau, j3, zzau2, j4, zzau3);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzab[i2];
    }
}
