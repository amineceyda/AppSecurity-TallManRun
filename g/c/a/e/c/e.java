package g.c.a.e.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apkpure.aegon.application.RealApplicationLike;

public class e extends BroadcastReceiver {
    public Context a;
    public d b;
    public boolean c = false;

    public e(Context context, d dVar) {
        this.a = context;
        this.b = dVar;
    }

    public void a() {
        if (!this.c) {
            IntentFilter intentFilter = new IntentFilter(RealApplicationLike.MAIN_PROCESS_NAME);
            intentFilter.setPriority(999);
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            this.a.registerReceiver(this, intentFilter);
            this.c = true;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
            this.b.a(context);
        }
    }
}
