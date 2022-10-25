package g.c.a.e.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class c {
    public static final String a;
    public static final String b;
    public static final String c;

    public interface a {
        void a(Context context, String str);

        void b(Context context, String str);
    }

    public static class b extends BroadcastReceiver {
        public Context a;
        public a b;
        public boolean c = false;

        public b(Context context, a aVar) {
            this.a = context;
            this.b = aVar;
        }

        public final void a(int i2) {
            if (!this.c) {
                e.e.d.l.a.p0(this.a, i2, this, c.a, c.b, c.c);
                this.c = true;
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (c.a.equals(intent.getAction())) {
                this.b.a(context, intent.getStringExtra("packageName"));
            } else if (c.c.equals(intent.getAction())) {
                this.b.b(context, intent.getStringExtra("packageName"));
            }
        }
    }

    static {
        Class<c> cls = c.class;
        a = cls.getPackage().getName() + ".PACKAGE_ADDED";
        b = cls.getPackage().getName() + ".PACKAGE_REPLACED";
        c = cls.getPackage().getName() + ".PACKAGE_REMOVED";
    }
}
