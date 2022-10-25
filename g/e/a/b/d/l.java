package g.e.a.b.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import g.e.a.b.c.a;
import g.e.a.b.e.b.a;
import g.e.a.b.e.b.c;

public final class l extends a implements IInterface {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final g.e.a.b.c.a B(g.e.a.b.c.a aVar, String str, int i2, g.e.a.b.c.a aVar2) throws RemoteException {
        Parcel A = A();
        c.b(A, aVar);
        A.writeString(str);
        A.writeInt(i2);
        c.b(A, aVar2);
        Parcel z = z(2, A);
        g.e.a.b.c.a A2 = a.C0109a.A(z.readStrongBinder());
        z.recycle();
        return A2;
    }

    public final g.e.a.b.c.a C(g.e.a.b.c.a aVar, String str, int i2, g.e.a.b.c.a aVar2) throws RemoteException {
        Parcel A = A();
        c.b(A, aVar);
        A.writeString(str);
        A.writeInt(i2);
        c.b(A, aVar2);
        Parcel z = z(3, A);
        g.e.a.b.c.a A2 = a.C0109a.A(z.readStrongBinder());
        z.recycle();
        return A2;
    }
}
