package e.b.h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

public class b1 {
    public final Context a;
    public final View b;
    public final TextView c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1114d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1115e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1116f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1117g = new int[2];

    public b1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1114d = layoutParams;
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(2131297125);
        layoutParams.setTitle(b1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131886085;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.b.getParent() != null) {
            ((WindowManager) this.a.getSystemService("window")).removeView(this.b);
        }
    }
}
