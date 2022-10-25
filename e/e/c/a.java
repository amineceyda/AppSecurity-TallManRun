package e.e.c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;

public class a {
    public static final Object a = new Object();

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static int b(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i2) : context.getResources().getColor(i2);
    }

    public static Drawable c(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 21 ? context.getDrawable(i2) : context.getResources().getDrawable(i2);
    }
}
