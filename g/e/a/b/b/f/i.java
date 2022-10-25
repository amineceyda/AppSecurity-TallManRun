package g.e.a.b.b.f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzj;
import g.c.b.b.f;
import g.e.a.b.e.b.b;
import g.e.a.b.e.b.c;
import java.util.Objects;

public abstract class i extends b implements e {
    public i() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean z(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 == 1) {
            ((s) this).A(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i2 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i2 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            zzj zzj = (zzj) c.a(parcel, zzj.CREATOR);
            s sVar = (s) this;
            f.o(sVar.a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Objects.requireNonNull(zzj, "null reference");
            sVar.A(readInt, readStrongBinder, zzj.b);
        }
        parcel2.writeNoException();
        return true;
    }
}
