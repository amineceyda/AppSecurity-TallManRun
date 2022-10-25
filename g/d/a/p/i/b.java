package g.d.a.p.i;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    public void l(Object obj) {
        ((ImageView) this.b).setImageBitmap((Bitmap) obj);
    }
}
