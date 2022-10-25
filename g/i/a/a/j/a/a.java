package g.i.a.a.j.a;

import android.os.IBinder;
import android.os.Parcel;
import g.i.a.a.a.b;
import g.i.a.a.j.d.c;

public class a implements b {
    public final IBinder a;

    public a() {
        IBinder iBinder = null;
        try {
            iBinder = (IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", new Class[]{String.class}).invoke((Object) null, new Object[]{"activity"});
        } catch (Exception e2) {
            g.i.a.a.m.a.b(e2);
        }
        this.a = iBinder;
    }

    public void a(b bVar) {
        if (this.a != null) {
            c cVar = new c(bVar.a(), bVar.f4085h.a());
            try {
                this.a.transact(cVar.e(), cVar.b, (Parcel) null, 1);
            } catch (Exception e2) {
                g.i.a.a.m.a.b(e2);
            }
        }
    }
}
