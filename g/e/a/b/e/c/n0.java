package g.e.a.b.e.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class n0 extends Binder implements IInterface {
    public n0(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i2, parcel, parcel2, i3)) {
            return true;
        }
        return z(i2, parcel, parcel2, i3);
    }

    public boolean z(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        throw null;
    }
}
