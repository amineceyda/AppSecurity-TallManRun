package g.h.a.c.b.k;

import android.annotation.SuppressLint;
import i.o.c.h;
import java.util.Arrays;

public final class c {
    @SuppressLint({"DefaultLocale"})
    public static final String a(float f2) {
        float f3 = (float) 60;
        String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f2 / f3)), Integer.valueOf((int) (f2 % f3))}, 2));
        h.d(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
