package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import g.d.a.l.l;
import g.d.a.l.t.b0.d;
import java.security.MessageDigest;

public class j extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(l.a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        Paint paint = y.a;
        if (bitmap.getWidth() > i2 || bitmap.getHeight() > i3) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return y.b(dVar, bitmap, i2, i3);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    public int hashCode() {
        return -670243078;
    }
}
