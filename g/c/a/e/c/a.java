package g.c.a.e.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class a {
    public static final String a = (a.class.getPackage().getName() + ".APP_UPDATES_CHANGED");

    /* renamed from: g.c.a.e.c.a$a  reason: collision with other inner class name */
    public interface C0059a {
        void a(Context context, int i2);
    }

    public static class b extends BroadcastReceiver {
        public Context a;
        public C0059a b;
        public boolean c = false;

        public b(Context context, C0059a aVar) {
            this.a = context;
            this.b = aVar;
        }

        public void a() {
            if (!this.c) {
                e.e.d.l.a.p0(this.a, 0, this, a.a);
                this.c = true;
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (a.a.equals(intent.getAction())) {
                this.b.a(context, intent.getIntExtra("appUpdatesCount", 0));
            }
        }
    }
}
