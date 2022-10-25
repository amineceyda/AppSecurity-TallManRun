package g.d.a.p.i;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import g.d.a.p.b;
import g.d.a.p.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
public abstract class i<T extends View, Z> extends a<Z> {
    public final T b;
    public final a c;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f2677d;
        public final View a;
        public final List<g> b = new ArrayList();
        public C0098a c;

        /* renamed from: g.d.a.p.i.i$a$a  reason: collision with other inner class name */
        public static final class C0098a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> b;

            public C0098a(a aVar) {
                this.b = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.b.get();
                if (aVar == null || aVar.b.isEmpty()) {
                    return true;
                }
                int d2 = aVar.d();
                int c = aVar.c();
                if (!aVar.e(d2, c)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.b).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).a(d2, c);
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.c);
            }
            this.c = null;
            this.b.clear();
        }

        public final int b(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.a.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.a.getContext();
            if (f2677d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f2677d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f2677d.intValue();
        }

        public final int c() {
            int paddingBottom = this.a.getPaddingBottom() + this.a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return b(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.a.getPaddingRight() + this.a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return b(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i2, int i3) {
            if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                if (i3 > 0 || i3 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }
    }

    public i(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.b = t;
        this.c = new a(t);
    }

    public void b(g gVar) {
        this.c.b.remove(gVar);
    }

    public b g() {
        Object tag = this.b.getTag(2131296902);
        if (tag == null) {
            return null;
        }
        if (tag instanceof b) {
            return (b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void i(g gVar) {
        a aVar = this.c;
        int d2 = aVar.d();
        int c2 = aVar.c();
        if (aVar.e(d2, c2)) {
            ((g) gVar).a(d2, c2);
            return;
        }
        if (!aVar.b.contains(gVar)) {
            aVar.b.add(gVar);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
            a.C0098a aVar2 = new a.C0098a(aVar);
            aVar.c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public void j(b bVar) {
        this.b.setTag(2131296902, bVar);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Target for: ");
        i2.append(this.b);
        return i2.toString();
    }
}
