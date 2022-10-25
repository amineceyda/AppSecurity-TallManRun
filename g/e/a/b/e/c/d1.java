package g.e.a.b.e.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class d1 extends m0 implements f1 {
    public d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    public final void d(String str, String str2, Bundle bundle, long j2) throws RemoteException {
        Parcel z = z();
        z.writeString(str);
        z.writeString(str2);
        o0.b(z, bundle);
        z.writeLong(j2);
        B(1, z);
    }

    public final int l() throws RemoteException {
        Parcel A = A(2, z());
        int readInt = A.readInt();
        A.recycle();
        return readInt;
    }
}
