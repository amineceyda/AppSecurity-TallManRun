package g.e.a.b.e.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class c extends a implements e {
    public c(IBinder iBinder) {
        super(iBinder);
    }

    public final String k() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        Parcel z = z(1, obtain);
        String readString = z.readString();
        z.recycle();
        return readString;
    }

    public final boolean n(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        int i2 = b.a;
        boolean z2 = true;
        obtain.writeInt(1);
        Parcel z3 = z(2, obtain);
        if (z3.readInt() == 0) {
            z2 = false;
        }
        z3.recycle();
        return z2;
    }
}
