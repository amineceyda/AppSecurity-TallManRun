package g.d.a.l.v.c;

import android.graphics.Bitmap;
import g.d.a.l.l;
import g.d.a.l.t.b0.d;
import java.security.MessageDigest;

public class p extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(l.a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        return y.b(dVar, bitmap, i2, i3);
    }

    public boolean equals(Object obj) {
        return obj instanceof p;
    }

    public int hashCode() {
        return 1572326941;
    }
}
