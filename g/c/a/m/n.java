package g.c.a.m;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

public final class n implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2093d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f2094e;

    public n(View view, int i2, int i3, View view2) {
        this.b = view;
        this.c = i2;
        this.f2093d = i3;
        this.f2094e = view2;
    }

    public void run() {
        Rect rect = new Rect();
        this.b.getHitRect(rect);
        int i2 = rect.left;
        int i3 = this.c;
        rect.left = i2 - i3;
        rect.right += i3;
        int i4 = rect.top;
        int i5 = this.f2093d;
        rect.top = i4 - i5;
        rect.bottom += i5;
        this.f2094e.setTouchDelegate(new TouchDelegate(rect, this.b));
    }
}
