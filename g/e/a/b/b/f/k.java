package g.e.a.b.b.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import g.e.a.b.e.b.a;
import g.e.a.b.e.b.c;

public final class k extends a implements m {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean m() throws RemoteException {
        Parcel z = z(7, A());
        int i2 = c.a;
        boolean z2 = z.readInt() != 0;
        z.recycle();
        return z2;
    }

    public final boolean v(zzs zzs, g.e.a.b.c.a aVar) throws RemoteException {
        Parcel A = A();
        int i2 = c.a;
        boolean z = true;
        A.writeInt(1);
        zzs.writeToParcel(A, 0);
        c.b(A, aVar);
        Parcel z2 = z(5, A);
        if (z2.readInt() == 0) {
            z = false;
        }
        z2.recycle();
        return z;
    }

    public final zzq y(zzn zzn) throws RemoteException {
        Parcel A = A();
        int i2 = c.a;
        A.writeInt(1);
        zzn.writeToParcel(A, 0);
        Parcel z = z(6, A);
        zzq zzq = (zzq) c.a(z, zzq.CREATOR);
        z.recycle();
        return zzq;
    }
}
