package g.c.a.e.k.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import com.tencent.raft.measure.utils.MeasureConst;
import g.d.a.b;
import g.d.a.l.t.b0.d;
import g.d.a.l.v.c.f;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public class a extends f {

    /* renamed from: f  reason: collision with root package name */
    public static Charset f1999f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f2000g;
    public Context b;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public int f2001d;

    /* renamed from: e  reason: collision with root package name */
    public int f2002e;

    static {
        Charset forName = Charset.forName(MeasureConst.CHARSET_UTF8);
        f1999f = forName;
        f2000g = "com.kevin.glidetest.BlurTransformation".getBytes(forName);
    }

    public a(Context context, int i2, int i3) {
        d dVar = b.b(context).b;
        this.b = context.getApplicationContext();
        this.c = dVar;
        this.f2001d = i2;
        this.f2002e = i3;
    }

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f2000g);
    }

    public Bitmap c(d dVar, Bitmap bitmap, int i2, int i3) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = this.f2002e;
        int i5 = width / i4;
        int i6 = height / i4;
        Bitmap d2 = this.c.d(i5, i6, Bitmap.Config.ARGB_8888);
        if (d2 == null) {
            d2 = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(d2);
        int i7 = this.f2002e;
        canvas.scale(1.0f / ((float) i7), 1.0f / ((float) i7));
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            e.e.d.l.a.f(this.b, d2, this.f2001d);
            return d2;
        } catch (RSRuntimeException unused) {
            return e.e.d.l.a.g(d2, this.f2001d, true);
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof a;
    }

    public int hashCode() {
        return -1101041951;
    }
}
