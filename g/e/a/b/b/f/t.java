package g.e.a.b.b.f;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class t implements ServiceConnection {
    public final int a;
    public final /* synthetic */ b b;

    public t(b bVar, int i2) {
        this.b = bVar;
        this.a = i2;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar = this.b;
        if (iBinder == null) {
            b.f(bVar, 16);
            return;
        }
        synchronized (bVar.f2850g) {
            b bVar2 = this.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            bVar2.f2851h = (queryLocalInterface == null || !(queryLocalInterface instanceof f)) ? new j(iBinder) : (f) queryLocalInterface;
        }
        b bVar3 = this.b;
        int i2 = this.a;
        Handler handler = bVar3.f2848e;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new v(bVar3, 0)));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        b bVar;
        synchronized (this.b.f2850g) {
            bVar = this.b;
            bVar.f2851h = null;
        }
        Handler handler = bVar.f2848e;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
