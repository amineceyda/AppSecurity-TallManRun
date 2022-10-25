package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class a1 extends m0 implements c1 {
    public a1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    public final void a(Bundle bundle) throws RemoteException {
        Parcel z = z();
        o0.b(z, bundle);
        B(1, z);
    }
}
