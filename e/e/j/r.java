package e.e.j;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public class r implements View.OnApplyWindowInsetsListener {
    public x a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ l c;

    public r(View view, l lVar) {
        this.b = view;
        this.c = lVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        x j2 = x.j(windowInsets, view);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            View view2 = this.b;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view2.getTag(2131297661);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsets);
            }
            if (j2.equals(this.a)) {
                return this.c.a(view, j2).h();
            }
        }
        this.a = j2;
        x a2 = this.c.a(view, j2);
        if (i2 >= 30) {
            return a2.h();
        }
        WeakHashMap<View, String> weakHashMap = q.a;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
        return a2.h();
    }
}
