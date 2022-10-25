package g.c.a.b.a.k;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.GlideException;
import g.c.a.e.k.g.e;
import java.util.Objects;

public class g implements e {
    public final /* synthetic */ ImageView a;
    public final /* synthetic */ h b;

    public g(h hVar, ImageView imageView) {
        this.b = hVar;
        this.a = imageView;
    }

    public void a(GlideException glideException) {
    }

    public void b(Drawable drawable) {
        h hVar = this.b;
        ImageView imageView = this.a;
        Objects.requireNonNull(hVar);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (!(layoutParams == null || drawable == null)) {
            int i2 = hVar.o;
            layoutParams.height = i2;
            layoutParams.width = (drawable.getMinimumWidth() * i2) / drawable.getMinimumHeight();
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setImageDrawable(drawable);
        imageView.postInvalidate();
    }
}
