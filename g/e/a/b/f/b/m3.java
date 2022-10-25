package g.e.a.b.f.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class m3 extends BroadcastReceiver {
    public final k9 a;
    public boolean b;
    public boolean c;

    static {
        Class<m3> cls = m3.class;
    }

    public m3(k9 k9Var) {
        this.a = k9Var;
    }

    public final void a() {
        this.a.g();
        this.a.b().h();
        this.a.b().h();
        if (this.b) {
            this.a.d().n.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                this.a.f3238l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.a.d().f3136f.b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.g();
        String action = intent.getAction();
        this.a.d().n.b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            k3 k3Var = this.a.b;
            k9.I(k3Var);
            boolean l2 = k3Var.l();
            if (this.c != l2) {
                this.c = l2;
                this.a.b().r(new l3(this, l2));
                return;
            }
            return;
        }
        this.a.d().f3139i.b("NetworkBroadcastReceiver received unknown action", action);
    }
}
