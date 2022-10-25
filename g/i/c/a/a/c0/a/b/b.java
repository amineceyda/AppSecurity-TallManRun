package g.i.c.a.a.c0.a.b;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import g.i.c.a.a.c0.a.c.c;
import java.lang.ref.WeakReference;

public class b {
    public final WeakReference<View> a;
    public final Rect b;
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public b f4411d;

    /* renamed from: e  reason: collision with root package name */
    public String f4412e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4413f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4414g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4415h;

    public b(View view) {
        this.a = new WeakReference<>(view);
        view.getClass().getSimpleName();
        this.b = c.a(view);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (c.b()) {
            int i2 = rect.top;
            Resources system = Resources.getSystem();
            rect.top = i2 - system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
        }
        rect.top = Math.max(rect.top, 0);
        this.c = rect;
    }
}
