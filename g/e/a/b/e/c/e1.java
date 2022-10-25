package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class e1 extends n0 implements f1 {
    public e1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final boolean z(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            ((c2) this).d(parcel.readString(), parcel.readString(), (Bundle) o0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i2 != 2) {
            return false;
        } else {
            int l2 = ((c2) this).l();
            parcel2.writeNoException();
            parcel2.writeInt(l2);
        }
        return true;
    }
}
