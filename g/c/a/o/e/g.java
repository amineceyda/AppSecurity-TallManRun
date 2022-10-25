package g.c.a.o.e;

import android.view.View;
import android.view.ViewParent;

public class g {
    public ViewParent a;
    public ViewParent b;
    public final View c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2167d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2168e;

    public g(View view) {
        this.c = view;
    }

    public final ViewParent a(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.b;
    }
}
