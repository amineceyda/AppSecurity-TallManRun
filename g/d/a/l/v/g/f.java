package g.d.a.l.v.g;

import android.content.Context;
import android.graphics.Bitmap;
import g.d.a.b;
import g.d.a.l.r;
import g.d.a.l.t.v;
import g.d.a.l.v.c.e;
import java.security.MessageDigest;
import java.util.Objects;

public class f implements r<c> {
    public final r<Bitmap> b;

    public f(r<Bitmap> rVar) {
        Objects.requireNonNull(rVar, "Argument must not be null");
        this.b = rVar;
    }

    public v<c> a(Context context, v<c> vVar, int i2, int i3) {
        c cVar = vVar.get();
        e eVar = new e(cVar.b(), b.b(context).b);
        v<Bitmap> a = this.b.a(context, eVar, i2, i3);
        if (!eVar.equals(a)) {
            eVar.d();
        }
        r<Bitmap> rVar = this.b;
        cVar.b.a.c(rVar, a.get());
        return vVar;
    }

    public void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.b.equals(((f) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
