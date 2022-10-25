package g.d.a.l.t.b0;

import android.graphics.Bitmap;

public class e implements d {
    public void a(int i2) {
    }

    public void b() {
    }

    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }
}
