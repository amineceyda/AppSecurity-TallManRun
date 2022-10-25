package g.e.a.b.b;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import g.c.b.b.f;
import g.e.a.b.b.f.h0;
import g.e.a.b.c.a;
import g.e.a.b.e.b.b;
import g.e.a.b.e.b.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class q extends b implements h0 {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public q(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        f.g(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] A(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public abstract byte[] B();

    public final boolean equals(Object obj) {
        a l2;
        if (obj != null && (obj instanceof h0)) {
            try {
                h0 h0Var = (h0) obj;
                if (h0Var.k() != this.a || (l2 = h0Var.l()) == null) {
                    return false;
                }
                return Arrays.equals(B(), (byte[]) g.e.a.b.c.b.B(l2));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final int k() {
        return this.a;
    }

    public final a l() {
        return new g.e.a.b.c.b(B());
    }

    public final boolean z(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a l2 = l();
            parcel2.writeNoException();
            c.b(parcel2, l2);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            int i4 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }
    }
}
