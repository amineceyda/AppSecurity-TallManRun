package g.e.a.b.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import e.e.d.l.a;

public final class s implements Parcelable.Creator {
    public static void a(zzau zzau, Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        a.Q0(parcel, 2, zzau.zza, false);
        a.P0(parcel, 3, zzau.zzb, i2, false);
        a.Q0(parcel, 4, zzau.zzc, false);
        long j2 = zzau.zzd;
        parcel.writeInt(524293);
        parcel.writeLong(j2);
        a.V0(parcel, T0);
    }

    public final Object createFromParcel(Parcel parcel) {
        int K0 = a.K0(parcel);
        String str = null;
        zzas zzas = null;
        String str2 = null;
        long j2 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = a.q(parcel, readInt);
            } else if (c == 3) {
                zzas = (zzas) a.p(parcel, readInt, zzas.CREATOR);
            } else if (c == 4) {
                str2 = a.q(parcel, readInt);
            } else if (c != 5) {
                a.I0(parcel, readInt);
            } else {
                j2 = a.n0(parcel, readInt);
            }
        }
        a.x(parcel, K0);
        return new zzau(str, zzas, str2, j2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzau[i2];
    }
}
