package g.c.a.e.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e.e.d.l.a;
import e.e.i.b;
import g.c.a.e.k.a.d;
import java.util.Objects;

public class g extends BroadcastReceiver {
    public Context a;
    public f b;
    public boolean c = false;

    public g(Context context, f fVar) {
        this.a = context;
        this.b = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            f fVar = this.b;
            String b2 = a.b(intent);
            d.a aVar = (d.a) fVar;
            Objects.requireNonNull(aVar);
            b.D().a(new g.c.a.e.k.a.a(aVar, context, b2));
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
            f fVar2 = this.b;
            String b3 = a.b(intent);
            d.a aVar2 = (d.a) fVar2;
            synchronized (d.this.f1996e) {
                if (d.this.d()) {
                    d.this.f1997f.remove(b3);
                }
            }
            Intent intent2 = new Intent(c.c);
            intent2.putExtra("packageName", b3);
            e.m.a.a.a(context).b(intent2);
            Objects.requireNonNull(d.this);
        }
    }
}
