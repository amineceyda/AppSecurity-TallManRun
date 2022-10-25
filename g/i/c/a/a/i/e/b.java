package g.i.c.a.a.i.e;

import android.view.MotionEvent;
import android.view.Window;
import g.i.c.a.a.i.d;

public class b implements c {
    public Object a;
    public Window b;
    public MotionEvent c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4436d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4437e;

    public void a(d dVar) {
        dVar.a(this.a, this.b, this.c, this.f4436d, this.f4437e);
    }

    public int b() {
        return 10;
    }

    public void c() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.f4436d = false;
    }

    public void d(Object obj, Window window, MotionEvent motionEvent, boolean z, boolean z2) {
        this.a = obj;
        this.b = window;
        this.c = motionEvent;
        this.f4436d = z;
        this.f4437e = z2;
    }
}
