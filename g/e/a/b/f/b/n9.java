package g.e.a.b.f.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzks;
import e.e.d.l.a;

public final class n9 implements Parcelable.Creator {
    public static void a(zzks zzks, Parcel parcel, int i2) {
        int T0 = a.T0(parcel, 20293);
        int i3 = zzks.zza;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        a.Q0(parcel, 2, zzks.zzb, false);
        long j2 = zzks.zzc;
        parcel.writeInt(524291);
        parcel.writeLong(j2);
        Long l2 = zzks.zzd;
        if (l2 != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l2.longValue());
        }
        a.Q0(parcel, 6, zzks.zze, false);
        a.Q0(parcel, 7, zzks.zzf, false);
        Double d2 = zzks.zzg;
        if (d2 != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d2.doubleValue());
        }
        a.V0(parcel, T0);
    }

    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int K0 = a.K0(parcel);
        String str = null;
        Long l2 = null;
        Float f2 = null;
        String str2 = null;
        String str3 = null;
        Double d2 = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < K0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = a.m0(parcel2, readInt);
                    break;
                case 2:
                    str = a.q(parcel2, readInt);
                    break;
                case 3:
                    j2 = a.n0(parcel2, readInt);
                    break;
                case 4:
                    int o0 = a.o0(parcel2, readInt);
                    if (o0 != 0) {
                        a.U0(parcel2, readInt, o0, 8);
                        l2 = Long.valueOf(parcel.readLong());
                        break;
                    } else {
                        l2 = null;
                        break;
                    }
                case 5:
                    int o02 = a.o0(parcel2, readInt);
                    if (o02 != 0) {
                        a.U0(parcel2, readInt, o02, 4);
                        f2 = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        f2 = null;
                        break;
                    }
                case 6:
                    str2 = a.q(parcel2, readInt);
                    break;
                case 7:
                    str3 = a.q(parcel2, readInt);
                    break;
                case 8:
                    int o03 = a.o0(parcel2, readInt);
                    if (o03 != 0) {
                        a.U0(parcel2, readInt, o03, 8);
                        d2 = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        d2 = null;
                        break;
                    }
                default:
                    a.I0(parcel2, readInt);
                    break;
            }
        }
        a.x(parcel2, K0);
        return new zzks(i2, str, j2, l2, f2, str2, str3, d2);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzks[i2];
    }
}
