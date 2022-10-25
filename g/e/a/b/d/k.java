package g.e.a.b.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import g.e.a.b.c.a;
import g.e.a.b.e.b.a;
import g.e.a.b.e.b.c;

public final class k extends a implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final g.e.a.b.c.a B(g.e.a.b.c.a aVar, String str, int i2) throws RemoteException {
        Parcel A = A();
        c.b(A, aVar);
        A.writeString(str);
        A.writeInt(i2);
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
        Parcel z = z(8, A);
        g.e.a.b.c.a A2 = a.C0109a.A(z.readStrongBinder());
        z.recycle();
        return A2;
    }

    public final g.e.a.b.c.a D(g.e.a.b.c.a aVar, String str, int i2) throws RemoteException {
        Parcel A = A();
        c.b(A, aVar);
        A.writeString(str);
        A.writeInt(i2);
        Parcel z = z(4, A);
        g.e.a.b.c.a A2 = a.C0109a.A(z.readStrongBinder());
        z.recycle();
        return A2;
    }

    public final g.e.a.b.c.a E(g.e.a.b.c.a aVar, String str, boolean z, long j2) throws RemoteException {
        Parcel A = A();
        c.b(A, aVar);
        A.writeString(str);
        A.writeInt(z ? 1 : 0);
        A.writeLong(j2);
        Parcel z2 = z(7, A);
        g.e.a.b.c.a A2 = a.C0109a.A(z2.readStrongBinder());
        z2.recycle();
        return A2;
    }
}
