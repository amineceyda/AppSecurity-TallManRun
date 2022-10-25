package g.i.c.a.a.x.d;

import android.content.SharedPreferences;
import e.e.c.b;
import java.util.Objects;

public class e implements Runnable {
    public final /* synthetic */ Class b;
    public final /* synthetic */ f c;

    public e(f fVar, Class cls) {
        this.c = fVar;
        this.b = cls;
    }

    public void run() {
        h hVar = this.c.a;
        String a = hVar.a.a(this.b);
        SharedPreferences.Editor edit = hVar.b(hVar.c).edit();
        edit.remove(a);
        Objects.requireNonNull(b.b().a);
        try {
            edit.apply();
        } catch (AbstractMethodError unused) {
            edit.commit();
        }
    }
}
