package g.e.a.b.b.f;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

public final class c0 implements Handler.Callback {
    public final /* synthetic */ d0 a;

    public /* synthetic */ c0(d0 d0Var) {
        this.a = d0Var;
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            synchronized (this.a.c) {
                a0 a0Var = (a0) message.obj;
                b0 b0Var = this.a.c.get(a0Var);
                if (b0Var != null && b0Var.a.isEmpty()) {
                    if (b0Var.c) {
                        b0Var.f2860g.f2862e.removeMessages(1, b0Var.f2858e);
                        d0 d0Var = b0Var.f2860g;
                        d0Var.f2864g.c(d0Var.f2861d, b0Var);
                        b0Var.c = false;
                        b0Var.b = 2;
                    }
                    this.a.c.remove(a0Var);
                }
            }
            return true;
        } else if (i2 != 1) {
            return false;
        } else {
            synchronized (this.a.c) {
                a0 a0Var2 = (a0) message.obj;
                b0 b0Var2 = this.a.c.get(a0Var2);
                if (b0Var2 != null && b0Var2.b == 3) {
                    String valueOf = String.valueOf(a0Var2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = b0Var2.f2859f;
                    if (componentName == null) {
                        Objects.requireNonNull(a0Var2);
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = a0Var2.b;
                        Objects.requireNonNull(str, "null reference");
                        componentName = new ComponentName(str, "unknown");
                    }
                    b0Var2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
