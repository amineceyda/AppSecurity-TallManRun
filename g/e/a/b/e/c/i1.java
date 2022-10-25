package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzcl;
import e.e.d.l.a;

public final class i1 implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K0 = a.K0(parcel);
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z = false;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j2 = a.n0(parcel2, readInt);
                    break;
                case 2:
                    j3 = a.n0(parcel2, readInt);
                    break;
                case 3:
                    z = a.k0(parcel2, readInt);
                    break;
                case 4:
                    str = a.q(parcel2, readInt);
                    break;
                case 5:
                    str2 = a.q(parcel2, readInt);
                    break;
                case 6:
                    str3 = a.q(parcel2, readInt);
                    break;
                case 7:
                    bundle = a.m(parcel2, readInt);
                    break;
                case 8:
                    str4 = a.q(parcel2, readInt);
                    break;
                default:
                    a.I0(parcel2, readInt);
                    break;
            }
        }
        a.x(parcel2, K0);
        return new zzcl(j2, j3, z, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcl[i2];
    }
}
