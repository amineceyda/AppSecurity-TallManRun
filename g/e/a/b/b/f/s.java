package g.e.a.b.b.f;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import g.c.b.b.f;

public final class s extends i {
    public b a;
    public final int b;

    public s(b bVar, int i2) {
        this.a = bVar;
        this.b = i2;
    }

    public final void A(int i2, IBinder iBinder, Bundle bundle) {
        f.o(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        b bVar = this.a;
        int i3 = this.b;
        Handler handler = bVar.f2848e;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new u(bVar, i2, iBinder, bundle)));
        this.a = null;
    }
}
