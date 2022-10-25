package g.c.a.m;

import android.content.Context;
import com.apkpure.aegon.application.AegonApplication;

public class k {
    public static int a;

    public static int a(Context context) {
        return (context != null ? context.getResources() : AegonApplication.getApplication().getResources()).getDisplayMetrics().heightPixels;
    }

    public static int b(Context context) {
        int i2;
        int i3 = a;
        if (i3 != 0) {
            return i3;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            i2 = context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e2) {
            e2.printStackTrace();
            i2 = 0;
        }
        a = i2;
        return i2;
    }
}
