package e.e.j;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class x {
    public static final x b = (Build.VERSION.SDK_INT >= 30 ? j.n : k.b);
    public final k a;

    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f1342d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                StringBuilder i2 = g.a.a.a.a.i("Failed to get visible insets from AttachInfo ");
                i2.append(e2.getMessage());
                Log.w("WindowInsetsCompat", i2.toString(), e2);
            }
        }
    }

    public static class b extends e {

        /* renamed from: d  reason: collision with root package name */
        public static Field f1343d = null;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f1344e = false;

        /* renamed from: f  reason: collision with root package name */
        public static Constructor<WindowInsets> f1345f = null;

        /* renamed from: g  reason: collision with root package name */
        public static boolean f1346g = false;
        public WindowInsets b;
        public e.e.d.b c;

        public b() {
            if (!f1344e) {
                try {
                    f1343d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f1344e = true;
            }
            Field field = f1343d;
            WindowInsets windowInsets = null;
            if (field != null) {
                try {
                    WindowInsets windowInsets2 = (WindowInsets) field.get((Object) null);
                    if (windowInsets2 != null) {
                        windowInsets = new WindowInsets(windowInsets2);
                        this.b = windowInsets;
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f1346g) {
                try {
                    f1345f = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f1346g = true;
            }
            Constructor<WindowInsets> constructor = f1345f;
            if (constructor != null) {
                try {
                    windowInsets = constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            this.b = windowInsets;
        }

        public b(x xVar) {
            this.b = xVar.h();
        }

        public x a() {
            x i2 = x.i(this.b);
            i2.a.k((e.e.d.b[]) null);
            i2.a.m(this.c);
            return i2;
        }

        public void b(e.e.d.b bVar) {
            this.c = bVar;
        }

        public void c(e.e.d.b bVar) {
            WindowInsets windowInsets = this.b;
            if (windowInsets != null) {
                this.b = windowInsets.replaceSystemWindowInsets(bVar.a, bVar.b, bVar.c, bVar.f1290d);
            }
        }
    }

    public static class c extends e {
        public final WindowInsets.Builder b;

        public c() {
            this.b = new WindowInsets.Builder();
        }

        public c(x xVar) {
            WindowInsets.Builder builder;
            WindowInsets h2 = xVar.h();
            if (h2 == null) {
                builder = new WindowInsets.Builder();
            }
            this.b = builder;
        }

        public x a() {
            x i2 = x.i(this.b.build());
            i2.a.k((e.e.d.b[]) null);
            return i2;
        }

        public void b(e.e.d.b bVar) {
            this.b.setStableInsets(bVar.b());
        }

        public void c(e.e.d.b bVar) {
            this.b.setSystemWindowInsets(bVar.b());
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(x xVar) {
            super(xVar);
        }
    }

    public static class e {
        public final x a;

        public e() {
            this.a = new x((x) null);
        }

        public e(x xVar) {
            this.a = xVar;
        }

        public x a() {
            return this.a;
        }

        public void b(e.e.d.b bVar) {
        }

        public void c(e.e.d.b bVar) {
        }
    }

    public static class f extends k {

        /* renamed from: g  reason: collision with root package name */
        public static boolean f1347g = false;

        /* renamed from: h  reason: collision with root package name */
        public static Method f1348h;

        /* renamed from: i  reason: collision with root package name */
        public static Class<?> f1349i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f1350j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f1351k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f1352l;
        public final WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        public e.e.d.b f1353d = null;

        /* renamed from: e  reason: collision with root package name */
        public x f1354e;

        /* renamed from: f  reason: collision with root package name */
        public e.e.d.b f1355f;

        public f(x xVar, WindowInsets windowInsets) {
            super(xVar);
            this.c = windowInsets;
        }

        public void d(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f1347g) {
                    try {
                        f1348h = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                        f1349i = Class.forName("android.view.ViewRootImpl");
                        Class<?> cls = Class.forName("android.view.View$AttachInfo");
                        f1350j = cls;
                        f1351k = cls.getDeclaredField("mVisibleInsets");
                        f1352l = f1349i.getDeclaredField("mAttachInfo");
                        f1351k.setAccessible(true);
                        f1352l.setAccessible(true);
                    } catch (ReflectiveOperationException e2) {
                        StringBuilder i2 = g.a.a.a.a.i("Failed to get visible insets. (Reflection error). ");
                        i2.append(e2.getMessage());
                        Log.e("WindowInsetsCompat", i2.toString(), e2);
                    }
                    f1347g = true;
                }
                Method method = f1348h;
                e.e.d.b bVar = null;
                if (!(method == null || f1350j == null || f1351k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        } else {
                            Rect rect = (Rect) f1351k.get(f1352l.get(invoke));
                            if (rect != null) {
                                bVar = e.e.d.b.a(rect.left, rect.top, rect.right, rect.bottom);
                            }
                        }
                    } catch (ReflectiveOperationException e3) {
                        StringBuilder i3 = g.a.a.a.a.i("Failed to get visible insets. (Reflection error). ");
                        i3.append(e3.getMessage());
                        Log.e("WindowInsetsCompat", i3.toString(), e3);
                    }
                }
                if (bVar == null) {
                    bVar = e.e.d.b.f1289e;
                }
                this.f1355f = bVar;
                return;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f1355f, ((f) obj).f1355f);
        }

        public final e.e.d.b g() {
            if (this.f1353d == null) {
                this.f1353d = e.e.d.b.a(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.f1353d;
        }

        public x h(int i2, int i3, int i4, int i5) {
            x i6 = x.i(this.c);
            int i7 = Build.VERSION.SDK_INT;
            e dVar = i7 >= 30 ? new d(i6) : i7 >= 29 ? new c(i6) : i7 >= 20 ? new b(i6) : new e(i6);
            dVar.c(x.e(g(), i2, i3, i4, i5));
            dVar.b(x.e(f(), i2, i3, i4, i5));
            return dVar.a();
        }

        public boolean j() {
            return this.c.isRound();
        }

        public void k(e.e.d.b[] bVarArr) {
        }

        public void l(x xVar) {
            this.f1354e = xVar;
        }
    }

    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public e.e.d.b f1356m = null;

        public g(x xVar, WindowInsets windowInsets) {
            super(xVar, windowInsets);
        }

        public x b() {
            return x.i(this.c.consumeStableInsets());
        }

        public x c() {
            return x.i(this.c.consumeSystemWindowInsets());
        }

        public final e.e.d.b f() {
            if (this.f1356m == null) {
                this.f1356m = e.e.d.b.a(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.f1356m;
        }

        public boolean i() {
            return this.c.isConsumed();
        }

        public void m(e.e.d.b bVar) {
            this.f1356m = bVar;
        }
    }

    public static class h extends g {
        public h(x xVar, WindowInsets windowInsets) {
            super(xVar, windowInsets);
        }

        public x a() {
            return x.i(this.c.consumeDisplayCutout());
        }

        public d e() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new d(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.c, hVar.c) && Objects.equals(this.f1355f, hVar.f1355f);
        }

        public int hashCode() {
            return this.c.hashCode();
        }
    }

    public static class i extends h {
        public i(x xVar, WindowInsets windowInsets) {
            super(xVar, windowInsets);
        }

        public x h(int i2, int i3, int i4, int i5) {
            return x.i(this.c.inset(i2, i3, i4, i5));
        }

        public void m(e.e.d.b bVar) {
        }
    }

    public static class j extends i {
        public static final x n = x.i(WindowInsets.CONSUMED);

        public j(x xVar, WindowInsets windowInsets) {
            super(xVar, windowInsets);
        }

        public final void d(View view) {
        }
    }

    public static class k {
        public static final x b;
        public final x a;

        static {
            int i2 = Build.VERSION.SDK_INT;
            b = (i2 >= 30 ? new d() : i2 >= 29 ? new c() : i2 >= 20 ? new b() : new e()).a().a.a().a.b().a.c();
        }

        public k(x xVar) {
            this.a = xVar;
        }

        public x a() {
            return this.a;
        }

        public x b() {
            return this.a;
        }

        public x c() {
            return this.a;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (j() != kVar.j() || i() != kVar.i() || !Objects.equals(g(), kVar.g()) || !Objects.equals(f(), kVar.f()) || !Objects.equals(e(), kVar.e())) {
                return false;
            }
            return true;
        }

        public e.e.d.b f() {
            return e.e.d.b.f1289e;
        }

        public e.e.d.b g() {
            return e.e.d.b.f1289e;
        }

        public x h(int i2, int i3, int i4, int i5) {
            return b;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e()});
        }

        public boolean i() {
            return false;
        }

        public boolean j() {
            return false;
        }

        public void k(e.e.d.b[] bVarArr) {
        }

        public void l(x xVar) {
        }

        public void m(e.e.d.b bVar) {
        }
    }

    public x(WindowInsets windowInsets) {
        k kVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            kVar = new j(this, windowInsets);
        } else if (i2 >= 29) {
            kVar = new i(this, windowInsets);
        } else if (i2 >= 28) {
            kVar = new h(this, windowInsets);
        } else if (i2 >= 21) {
            kVar = new g(this, windowInsets);
        } else if (i2 >= 20) {
            kVar = new f(this, windowInsets);
        } else {
            this.a = new k(this);
            return;
        }
        this.a = kVar;
    }

    public x(x xVar) {
        this.a = new k(this);
    }

    public static e.e.d.b e(e.e.d.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.a - i2);
        int max2 = Math.max(0, bVar.b - i3);
        int max3 = Math.max(0, bVar.c - i4);
        int max4 = Math.max(0, bVar.f1290d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : e.e.d.b.a(max, max2, max3, max4);
    }

    public static x i(WindowInsets windowInsets) {
        return j(windowInsets, (View) null);
    }

    public static x j(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        x xVar = new x(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            xVar.a.l(q.g(view));
            xVar.a.d(view.getRootView());
        }
        return xVar;
    }

    @Deprecated
    public int a() {
        return this.a.g().f1290d;
    }

    @Deprecated
    public int b() {
        return this.a.g().a;
    }

    @Deprecated
    public int c() {
        return this.a.g().c;
    }

    @Deprecated
    public int d() {
        return this.a.g().b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return Objects.equals(this.a, ((x) obj).a);
    }

    public boolean f() {
        return this.a.i();
    }

    @Deprecated
    public x g(int i2, int i3, int i4, int i5) {
        int i6 = Build.VERSION.SDK_INT;
        e dVar = i6 >= 30 ? new d(this) : i6 >= 29 ? new c(this) : i6 >= 20 ? new b(this) : new e(this);
        dVar.c(e.e.d.b.a(i2, i3, i4, i5));
        return dVar.a();
    }

    public WindowInsets h() {
        k kVar = this.a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    public int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
