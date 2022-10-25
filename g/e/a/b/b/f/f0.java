package g.e.a.b.b.f;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import g.e.a.b.e.b.a;
import g.e.a.b.e.b.c;

public final class f0 extends a implements d {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account j() throws RemoteException {
        Parcel z = z(2, A());
        Account account = (Account) c.a(z, Account.CREATOR);
        z.recycle();
        return account;
    }
}
