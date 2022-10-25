package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class p0 extends m0 implements r0 {
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    public final Bundle a(Bundle bundle) throws RemoteException {
        Parcel z = z();
        o0.b(z, bundle);
        Parcel A = A(1, z);
        Bundle bundle2 = (Bundle) o0.a(A, Bundle.CREATOR);
        A.recycle();
        return bundle2;
    }
}
