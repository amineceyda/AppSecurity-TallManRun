package g.c.b.b.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import i.o.c.h;

public final class d {
    public static final d a = new d();
    public static boolean b;

    public interface a {
        void a(Context context, String str);
    }

    public static final class b extends BroadcastReceiver {
        public Context a;
        public a b;

        public b(Context context, a aVar) {
            h.e(context, "context");
            this.a = context;
            this.b = aVar;
        }

        public final void a() {
            if (!d.b) {
                IntentFilter intentFilter = new IntentFilter(this.a.getPackageName());
                intentFilter.setPriority(999);
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addDataScheme("package");
                this.a.registerReceiver(this, intentFilter);
                d.b = true;
            }
        }

        public void onReceive(Context context, Intent intent) {
            a aVar;
            a aVar2;
            h.e(context, "context");
            h.e(intent, "intent");
            if (this.b != null) {
                String str = null;
                if (h.a("android.intent.action.PACKAGE_ADDED", intent.getAction()) && (aVar2 = this.b) != null) {
                    Uri data = intent.getData();
                    aVar2.a(context, data == null ? null : data.getSchemeSpecificPart());
                }
                if (h.a("android.intent.action.PACKAGE_REPLACED", intent.getAction()) && (aVar = this.b) != null) {
                    Uri data2 = intent.getData();
                    if (data2 != null) {
                        str = data2.getSchemeSpecificPart();
                    }
                    aVar.a(context, str);
                }
            }
        }
    }
}
