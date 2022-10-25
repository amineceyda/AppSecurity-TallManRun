package g.i.c.a.a.i.e;

import android.view.KeyEvent;
import android.widget.TextView;

public class d implements c {
    public TextView a;
    public int b;
    public KeyEvent c;

    /* renamed from: d  reason: collision with root package name */
    public int f4438d;

    public void a(g.i.c.a.a.i.d dVar) {
        dVar.n(this.a, this.b, this.c, this.f4438d);
    }

    public int b() {
        return 11;
    }

    public void c() {
        this.a = null;
        this.b = -1;
        this.c = null;
        this.f4438d = -1;
    }

    public void d(TextView textView, int i2, KeyEvent keyEvent, int i3) {
        this.a = textView;
        this.b = i2;
        this.c = keyEvent;
        this.f4438d = i3;
    }
}
