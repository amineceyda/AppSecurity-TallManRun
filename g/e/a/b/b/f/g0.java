package g.e.a.b.b.f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import g.e.a.b.c.a;
import g.e.a.b.e.b.a;

public final class g0 extends a implements h0 {
    public g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int k() throws RemoteException {
        Parcel z = z(2, A());
        int readInt = z.readInt();
        z.recycle();
        return readInt;
    }

    public final g.e.a.b.c.a l() throws RemoteException {
        Parcel z = z(1, A());
        g.e.a.b.c.a A = a.C0109a.A(z.readStrongBinder());
        z.recycle();
        return A;
    }
}
