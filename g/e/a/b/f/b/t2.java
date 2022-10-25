package g.e.a.b.f.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzks;
import com.google.android.gms.measurement.internal.zzp;
import g.e.a.b.e.c.m0;
import g.e.a.b.e.c.o0;
import java.util.ArrayList;
import java.util.List;

public final class t2 extends m0 implements v2 {
    public t2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final void b(zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzp);
        B(20, z);
    }

    public final void c(long j2, String str, String str2, String str3) throws RemoteException {
        Parcel z = z();
        z.writeLong(j2);
        z.writeString(str);
        z.writeString(str2);
        z.writeString(str3);
        B(10, z);
    }

    public final void e(Bundle bundle, zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, bundle);
        o0.b(z, zzp);
        B(19, z);
    }

    public final List f(String str, String str2, boolean z, zzp zzp) throws RemoteException {
        Parcel z2 = z();
        z2.writeString(str);
        z2.writeString(str2);
        ClassLoader classLoader = o0.a;
        z2.writeInt(z ? 1 : 0);
        o0.b(z2, zzp);
        Parcel A = A(14, z2);
        ArrayList<zzks> createTypedArrayList = A.createTypedArrayList(zzks.CREATOR);
        A.recycle();
        return createTypedArrayList;
    }

    public final void g(zzab zzab, zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzab);
        o0.b(z, zzp);
        B(12, z);
    }

    public final List h(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel z2 = z();
        z2.writeString((String) null);
        z2.writeString(str2);
        z2.writeString(str3);
        ClassLoader classLoader = o0.a;
        z2.writeInt(z ? 1 : 0);
        Parcel A = A(15, z2);
        ArrayList<zzks> createTypedArrayList = A.createTypedArrayList(zzks.CREATOR);
        A.recycle();
        return createTypedArrayList;
    }

    public final void i(zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzp);
        B(18, z);
    }

    public final String o(zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzp);
        Parcel A = A(11, z);
        String readString = A.readString();
        A.recycle();
        return readString;
    }

    public final void q(zzks zzks, zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzks);
        o0.b(z, zzp);
        B(2, z);
    }

    public final List r(String str, String str2, String str3) throws RemoteException {
        Parcel z = z();
        z.writeString((String) null);
        z.writeString(str2);
        z.writeString(str3);
        Parcel A = A(17, z);
        ArrayList<zzab> createTypedArrayList = A.createTypedArrayList(zzab.CREATOR);
        A.recycle();
        return createTypedArrayList;
    }

    public final void s(zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzp);
        B(4, z);
    }

    public final void t(zzau zzau, zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzau);
        o0.b(z, zzp);
        B(1, z);
    }

    public final List u(String str, String str2, zzp zzp) throws RemoteException {
        Parcel z = z();
        z.writeString(str);
        z.writeString(str2);
        o0.b(z, zzp);
        Parcel A = A(16, z);
        ArrayList<zzab> createTypedArrayList = A.createTypedArrayList(zzab.CREATOR);
        A.recycle();
        return createTypedArrayList;
    }

    public final void w(zzp zzp) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzp);
        B(6, z);
    }

    public final byte[] x(zzau zzau, String str) throws RemoteException {
        Parcel z = z();
        o0.b(z, zzau);
        z.writeString(str);
        Parcel A = A(9, z);
        byte[] createByteArray = A.createByteArray();
        A.recycle();
        return createByteArray;
    }
}
