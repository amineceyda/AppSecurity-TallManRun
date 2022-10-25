package e.b.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public class w0 extends o0 {
    public final WeakReference<Context> b;

    public w0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Drawable drawable = this.a.getDrawable(i2);
        Context context = (Context) this.b.get();
        if (!(drawable == null || context == null)) {
            n0.d().n(context, i2, drawable);
        }
        return drawable;
    }
}
