package e.b.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

public class c1 extends Resources {
    public static boolean b = false;
    public final WeakReference<Context> a;

    public c1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference<>(context);
    }

    public static boolean a() {
        return b && Build.VERSION.SDK_INT <= 20;
    }

    public final Drawable b(int i2) {
        return super.getDrawable(i2);
    }

    public Drawable getDrawable(int i2) throws Resources.NotFoundException {
        Context context = (Context) this.a.get();
        return context != null ? n0.d().l(context, this, i2) : super.getDrawable(i2);
    }
}
