package g.d.a.p.i;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    public void l(Object obj) {
        ((ImageView) this.b).setImageDrawable((Drawable) obj);
    }
}
