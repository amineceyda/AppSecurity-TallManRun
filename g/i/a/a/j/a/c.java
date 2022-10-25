package g.i.a.a.j.a;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import g.i.a.a.a.b;

public class c implements b {
    public final ServiceConnection a = new a(this);

    public class a implements ServiceConnection {
        public a(c cVar) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g.i.a.a.m.a.a("ServiceProcessCaller", "onServiceConnected " + componentName);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            g.i.a.a.m.a.a("ServiceProcessCaller", "onServiceDisconnected" + componentName);
        }
    }

    public void a(b bVar) {
        Class<? extends Service> a2 = bVar.f4085h.a();
        if (a2 != null) {
            Intent intent = new Intent(bVar.a, a2);
            intent.putExtra("from", "call_from_service");
            intent.putExtra("via", "qqdownload");
            try {
                bVar.a.bindService(intent, this.a, 1);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
