package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import e.b.h.i;
import e.d.h;
import e.q.a.a.b;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class n0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1169h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    public static n0 f1170i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1171j = new c(6);
    public WeakHashMap<Context, h<ColorStateList>> a;
    public e.d.g<String, e> b;
    public h<String> c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, e.d.d<WeakReference<Drawable.ConstantState>>> f1172d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1173e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1174f;

    /* renamed from: g  reason: collision with root package name */
    public f f1175g;

    public static class a implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.b.e.a.a.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    public static class b implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                e.q.a.a.b bVar = new e.q.a.a.b(context, (b.C0054b) null, (Resources) null);
                bVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return bVar;
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    public static class c extends e.d.e<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }
    }

    public static class d implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                } else {
                    drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                }
                return drawable;
            } catch (Exception e2) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                return null;
            }
        }
    }

    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
    }

    public static class g implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.q.a.a.g.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    public static synchronized n0 d() {
        n0 n0Var;
        synchronized (n0.class) {
            if (f1170i == null) {
                n0 n0Var2 = new n0();
                f1170i = n0Var2;
                j(n0Var2);
            }
            n0Var = f1170i;
        }
        return n0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (n0.class) {
            c cVar = f1171j;
            Objects.requireNonNull(cVar);
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.b(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(cVar);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.c(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(n0 n0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            n0Var.a("vector", new g());
            n0Var.a("animated-vector", new b());
            n0Var.a("animated-selector", new a());
            n0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new e.d.g<>();
        }
        this.b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            e.d.d dVar = this.f1172d.get(context);
            if (dVar == null) {
                dVar = new e.d.d();
                this.f1172d.put(context, dVar);
            }
            dVar.e(j2, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final Drawable c(Context context, int i2) {
        int i3;
        if (this.f1173e == null) {
            this.f1173e = new TypedValue();
        }
        TypedValue typedValue = this.f1173e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        f fVar = this.f1175g;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            i.a aVar = (i.a) fVar;
            if (i2 == 2131230742) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, 2131230741), f(context, 2131230743)});
            } else {
                if (i2 == 2131230777) {
                    i3 = 2131165243;
                } else if (i2 == 2131230776) {
                    i3 = 2131165244;
                } else if (i2 == 2131230778) {
                    i3 = 2131165245;
                }
                layerDrawable = aVar.c(this, context, i3);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f1244d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, e.d.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1172d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            e.d.d r0 = (e.d.d) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.d(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.c     // Catch:{ all -> 0x0041 }
            int r2 = r0.f1245e     // Catch:{ all -> 0x0041 }
            int r4 = e.d.c.b(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f1244d     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = e.d.d.f1243f     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.b = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.n0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f1174f     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f1174f = r0     // Catch:{ all -> 0x0048 }
            r1 = 2131230804(0x7f080054, float:1.8077671E38)
            android.graphics.drawable.Drawable r1 = r4.f(r5, r1)     // Catch:{ all -> 0x0048 }
            r2 = 0
            if (r1 == 0) goto L_0x004a
            boolean r3 = r1 instanceof e.q.a.a.g     // Catch:{ all -> 0x0048 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0048 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x004a
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.k(r5, r6)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.c(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x0035:
            if (r0 != 0) goto L_0x003b
            android.graphics.drawable.Drawable r0 = e.e.c.a.c(r5, r6)     // Catch:{ all -> 0x0048 }
        L_0x003b:
            if (r0 == 0) goto L_0x0041
            android.graphics.drawable.Drawable r0 = r4.m(r5, r6, r7, r0)     // Catch:{ all -> 0x0048 }
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            e.b.h.e0.b(r0)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r4)
            return r0
        L_0x0048:
            r5 = move-exception
            goto L_0x0054
        L_0x004a:
            r4.f1174f = r2     // Catch:{ all -> 0x0048 }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x0048 }
            throw r5     // Catch:{ all -> 0x0048 }
        L_0x0054:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.n0.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList i(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, e.d.h<android.content.res.ColorStateList>> r0 = r3.a     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            e.d.h r0 = (e.d.h) r0     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.c(r5, r1)     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0049 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004b
            e.b.h.n0$f r0 = r3.f1175g     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            e.b.h.i$a r0 = (e.b.h.i.a) r0     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0023:
            if (r1 == 0) goto L_0x0047
            java.util.WeakHashMap<android.content.Context, e.d.h<android.content.res.ColorStateList>> r0 = r3.a     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            r3.a = r0     // Catch:{ all -> 0x0049 }
        L_0x0030:
            java.util.WeakHashMap<android.content.Context, e.d.h<android.content.res.ColorStateList>> r0 = r3.a     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            e.d.h r0 = (e.d.h) r0     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            e.d.h r0 = new e.d.h     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            java.util.WeakHashMap<android.content.Context, e.d.h<android.content.res.ColorStateList>> r2 = r3.a     // Catch:{ all -> 0x0049 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r0.a(r5, r1)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            r0 = r1
            goto L_0x004b
        L_0x0049:
            r4 = move-exception
            goto L_0x004d
        L_0x004b:
            monitor-exit(r3)
            return r0
        L_0x004d:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.n0.i(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[Catch:{ Exception -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable k(android.content.Context r11, int r12) {
        /*
            r10 = this;
            e.d.g<java.lang.String, e.b.h.n0$e> r0 = r10.b
            r1 = 0
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b7
            e.d.h<java.lang.String> r0 = r10.c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.c(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            e.d.g<java.lang.String, e.b.h.n0$e> r3 = r10.b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            e.d.h r0 = new e.d.h
            r0.<init>()
            r10.c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1173e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1173e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1173e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.e(r11, r4)
            if (r6 == 0) goto L_0x0055
            return r6
        L_0x0055:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00af
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00af
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a7 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x006d:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a7 }
            r9 = 2
            if (r8 == r9) goto L_0x0077
            if (r8 == r3) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r8 != r9) goto L_0x009f
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a7 }
            e.d.h<java.lang.String> r8 = r10.c     // Catch:{ Exception -> 0x00a7 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x00a7 }
            e.d.g<java.lang.String, e.b.h.n0$e> r8 = r10.b     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a7 }
            e.b.h.n0$e r3 = (e.b.h.n0.e) r3     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0094
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a7 }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a7 }
        L_0x0094:
            if (r6 == 0) goto L_0x00af
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a7 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a7 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00af
        L_0x009f:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a7 }
            throw r11     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00af:
            if (r6 != 0) goto L_0x00b6
            e.d.h<java.lang.String> r11 = r10.c
            r11.a(r12, r2)
        L_0x00b6:
            return r6
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.n0.k(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable l(Context context, c1 c1Var, int i2) {
        Drawable k2 = k(context, i2);
        if (k2 == null) {
            k2 = c1Var.b(i2);
        }
        if (k2 == null) {
            return null;
        }
        return m(context, i2, false, k2);
    }

    public final Drawable m(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList i3 = i(context, i2);
        PorterDuff.Mode mode = null;
        if (i3 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable L0 = e.e.d.l.a.L0(drawable);
            e.e.d.l.a.F0(L0, i3);
            f fVar = this.f1175g;
            if (fVar != null) {
                i.a aVar = (i.a) fVar;
                if (i2 == 2131230791) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return L0;
            }
            e.e.d.l.a.G0(L0, mode);
            return L0;
        }
        f fVar2 = this.f1175g;
        if (fVar2 != null) {
            i.a aVar2 = (i.a) fVar2;
            Objects.requireNonNull(aVar2);
            boolean z2 = true;
            if (i2 == 2131230786) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = s0.c(context, 2130968834);
                PorterDuff.Mode mode2 = i.b;
                aVar2.e(findDrawableByLayerId, c2, mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908303), s0.c(context, 2130968834), mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908301), s0.c(context, 2130968832), mode2);
            } else if (i2 == 2131230777 || i2 == 2131230776 || i2 == 2131230778) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = s0.b(context, 2130968834);
                PorterDuff.Mode mode3 = i.b;
                aVar2.e(findDrawableByLayerId2, b2, mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908303), s0.c(context, 2130968832), mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908301), s0.c(context, 2130968832), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (n(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            e.b.h.n0$f r0 = r7.f1175g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0079
            e.b.h.i$a r0 = (e.b.h.i.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = e.b.h.i.b
            int[] r4 = r0.a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001d
            r5 = 2130968834(0x7f040102, float:1.7546333E38)
            goto L_0x0049
        L_0x001d:
            int[] r4 = r0.c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L_0x0029
            r5 = 2130968832(0x7f040100, float:1.7546329E38)
            goto L_0x0049
        L_0x0029:
            int[] r4 = r0.f1143d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L_0x0034
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0049
        L_0x0034:
            r0 = 2131230763(0x7f08002b, float:1.8077588E38)
            if (r9 != r0) goto L_0x0044
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x004b
        L_0x0044:
            r0 = 2131230745(0x7f080019, float:1.8077551E38)
            if (r9 != r0) goto L_0x004d
        L_0x0049:
            r9 = r5
            r0 = -1
        L_0x004b:
            r4 = 1
            goto L_0x0050
        L_0x004d:
            r9 = 0
            r0 = -1
            r4 = 0
        L_0x0050:
            if (r4 == 0) goto L_0x0075
            boolean r4 = e.b.h.e0.a(r10)
            if (r4 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x005c:
            int r8 = e.b.h.s0.c(r8, r9)
            java.lang.Class<e.b.h.i> r9 = e.b.h.i.class
            monitor-enter(r9)
            android.graphics.PorterDuffColorFilter r8 = h(r8, r3)     // Catch:{ all -> 0x0072 }
            monitor-exit(r9)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0070
            r10.setAlpha(r0)
        L_0x0070:
            r8 = 1
            goto L_0x0076
        L_0x0072:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        L_0x0075:
            r8 = 0
        L_0x0076:
            if (r8 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.n0.n(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
