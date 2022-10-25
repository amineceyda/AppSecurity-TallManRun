package g.i.c.a.a.t.k;

import android.view.View;
import g.a.a.a.a;
import g.i.c.a.a.u.c;
import g.i.c.a.a.u.d;
import java.lang.ref.WeakReference;

public class f {
    public WeakReference<View> a;
    public WeakReference<Object> b;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public c f4537d;

    /* renamed from: e  reason: collision with root package name */
    public String f4538e;

    /* renamed from: f  reason: collision with root package name */
    public long f4539f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4540g = true;

    public f() {
    }

    public f(View view, Object obj, c cVar, d dVar) {
        this.a = new WeakReference<>(view);
        this.b = new WeakReference<>(obj);
        this.f4537d = cVar;
        this.c = dVar;
    }

    public Object a() {
        WeakReference<Object> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public View b() {
        WeakReference<View> weakReference = this.a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public String toString() {
        WeakReference<View> weakReference = this.a;
        View view = weakReference == null ? null : (View) weakReference.get();
        if (view == null) {
            return "_null_view_";
        }
        StringBuilder i2 = a.i("uniqueId = ");
        i2.append(this.f4539f);
        i2.append(", identifier = ");
        i2.append(this.f4538e);
        i2.append(", eid = ");
        i2.append(g.i.c.a.a.l.c.b(view));
        i2.append(", ");
        i2.append(view);
        return i2.toString();
    }
}
