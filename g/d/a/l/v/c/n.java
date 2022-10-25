package g.d.a.l.v.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import g.d.a.b;
import g.d.a.l.r;
import g.d.a.l.t.b0.d;
import g.d.a.l.t.v;
import java.security.MessageDigest;

public class n implements r<Drawable> {
    public final r<Bitmap> b;
    public final boolean c;

    public n(r<Bitmap> rVar, boolean z) {
        this.b = rVar;
        this.c = z;
    }

    public v<Drawable> a(Context context, v<Drawable> vVar, int i2, int i3) {
        d dVar = b.b(context).b;
        Drawable drawable = vVar.get();
        v<Bitmap> a = m.a(dVar, drawable, i2, i3);
        if (a != null) {
            v<Bitmap> a2 = this.b.a(context, a, i2, i3);
            if (!a2.equals(a)) {
                return t.e(context.getResources(), a2);
            }
            a2.d();
            return vVar;
        } else if (!this.c) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.b.equals(((n) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
