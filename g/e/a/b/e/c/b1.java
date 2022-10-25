package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class b1 extends n0 implements c1 {
    public b1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final boolean z(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        ((v0) this).a((Bundle) o0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
