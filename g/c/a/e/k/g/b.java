package g.c.a.e.k.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.apkpure.aegon.application.AegonApplication;
import g.d.a.l.l;
import g.d.a.l.t.b0.d;
import g.d.a.l.v.c.f;
import java.security.MessageDigest;

public class b extends f {
    public static final byte[] b = "com.apkpure.aegon.helper.glide.GlideRoundTransform".getBytes(l.a);
    public static float c = 0.0f;

    public b() {
        int i2;
        Context context = AegonApplication.getContext();
        float f2 = (float) 5;
        if (context == null) {
            i2 = 0;
        } else {
            i2 = (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        c = (float) i2;
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        if (bitmap == null) {
            return null;
        }
        Bitmap d2 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (d2 == null) {
            d2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(d2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        float f2 = c;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        return d2;
    }

    public boolean equals(Object obj) {
        return obj instanceof b;
    }

    public int hashCode() {
        return -375107315;
    }
}
