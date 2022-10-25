package g.d.a.l.v.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import e.b.g.c;
import e.e.c.c.h;

public final class a {
    public static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (a) {
                return e.b.d.a.a.b(theme != null ? new c(context2, theme) : context2, i2);
            }
        } catch (NoClassDefFoundError unused) {
            a = false;
        } catch (IllegalStateException e2) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return e.e.c.a.c(context2, i2);
            }
            throw e2;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return h.a(context2.getResources(), i2, theme);
    }
}
