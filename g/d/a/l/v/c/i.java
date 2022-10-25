package g.d.a.l.v.c;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import g.d.a.l.l;
import g.d.a.l.t.b0.d;
import java.security.MessageDigest;

public class i extends f {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(l.a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        float f2;
        float f3;
        Paint paint = y.a;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f4 = 0.0f;
        if (bitmap.getWidth() * i3 > bitmap.getHeight() * i2) {
            f3 = ((float) i3) / ((float) bitmap.getHeight());
            f4 = (((float) i2) - (((float) bitmap.getWidth()) * f3)) * 0.5f;
            f2 = 0.0f;
        } else {
            f3 = ((float) i2) / ((float) bitmap.getWidth());
            f2 = (((float) i3) - (((float) bitmap.getHeight()) * f3)) * 0.5f;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((float) ((int) (f4 + 0.5f)), (float) ((int) (f2 + 0.5f)));
        Bitmap d2 = dVar.d(i2, i3, y.c(bitmap));
        d2.setHasAlpha(bitmap.hasAlpha());
        y.a(bitmap, d2, matrix);
        return d2;
    }

    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    public int hashCode() {
        return -599754482;
    }
}
