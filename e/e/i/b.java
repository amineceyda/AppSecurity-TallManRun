package e.e.i;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import e.e.j.l;
import e.e.j.r;
import e.e.j.x;
import f.a.a.b.z.k;
import f.a.a.b.z.n;
import g.b.a.a.a;
import g.c.a.m.m;
import g.i.c.a.a.b0.g;
import g.i.c.a.a.l.c;
import g.i.c.a.a.l.f;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.i;
import g.i.c.a.a.s.t;
import g.i.c.a.a.t.k.h;
import g.i.c.a.a.u.d;
import g.i.c.a.a.w.a;
import j.a.i0;
import j.a.j0;
import j.a.l1;
import j.a.o;
import j.a.y0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class b {
    public static long a;
    public static Method b;
    public static a c;

    /* renamed from: d  reason: collision with root package name */
    public static g.c.a.e.j.b f1329d;

    /* renamed from: e  reason: collision with root package name */
    public static SharedPreferences f1330e;

    public static x A(View view) {
        if (!x.a.f1342d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = x.a.a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) x.a.b.get(obj);
            Rect rect2 = (Rect) x.a.c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            x.e dVar = i2 >= 30 ? new x.d() : i2 >= 29 ? new x.c() : i2 >= 20 ? new x.b() : new x.e();
            dVar.b(e.e.d.b.a(rect.left, rect.top, rect.right, rect.bottom));
            dVar.c(e.e.d.b.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            x a2 = dVar.a();
            a2.a.l(a2);
            a2.a.d(view.getRootView());
            return a2;
        } catch (IllegalAccessException e2) {
            StringBuilder i3 = g.a.a.a.a.i("Failed to get insets from AttachInfo. ");
            i3.append(e2.getMessage());
            Log.w("WindowInsetsCompat", i3.toString(), e2);
            return null;
        }
    }

    public static x B(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        x i2 = x.i(rootWindowInsets);
        i2.a.l(i2);
        i2.a.d(view.getRootView());
        return i2;
    }

    public static String C(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringExtra(str);
        } catch (Throwable unused) {
            Logger logger = g.c.a.e.e.a.a;
            return null;
        }
    }

    public static g.c.a.e.j.b D() {
        synchronized (g.c.a.e.j.b.class) {
            if (f1329d == null) {
                f1329d = new g.c.a.e.j.b(3, 6, 1000);
            }
        }
        return f1329d;
    }

    public static SharedPreferences E(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getSharedPreferences(str, 0);
        }
        SharedPreferences sharedPreferences = f1330e;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("video_report_profile", 0);
        f1330e = sharedPreferences2;
        return sharedPreferences2;
    }

    public static boolean F(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean G(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    @SuppressLint({"NewApi"})
    public static boolean H() {
        try {
            if (b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (b == null) {
                a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) b.invoke((Object) null, new Object[]{Long.valueOf(a)})).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
            return false;
        }
    }

    public static boolean I(Context context) {
        String y = y();
        return TextUtils.isEmpty(y) || y.equals(context.getApplicationContext().getPackageName());
    }

    public static boolean J(Object obj) {
        if (obj == null) {
            return false;
        }
        return !TextUtils.isEmpty(g.h.a.a.G(g.i.c.a.a.l.a.a(obj)));
    }

    public static void K(Context context) {
        g.i.c.a.a.y.a.a(new g.i.c.a.a.b0.a(context));
    }

    public static <E> void L(Context context, String str, String str2, E e2) {
        SharedPreferences.Editor edit = E(context, str).edit();
        if ((e2 instanceof String) || (e2 instanceof Integer) || (e2 instanceof Boolean) || (e2 instanceof Float) || (e2 instanceof Long) || (e2 instanceof Double)) {
            edit.putString(str2, String.valueOf(e2));
        }
        e.e.c.b.b().a(edit);
    }

    public static void M(String str, Map<String, Object> map, g.i.c.a.a.l.b bVar) {
        Map<String, Object> map2;
        if (bVar != null) {
            String G = g.h.a.a.G(bVar);
            String v = g.h.a.a.v(bVar);
            Map<String, Object> map3 = bVar.f4458h;
            map.put("pgid", G);
            if (v != null) {
                map.put("pg_contentid", v);
            }
            if (map3 != null) {
                map.putAll(map3);
            }
            f fVar = bVar.f4454d;
            if (fVar == null) {
                map2 = null;
            } else {
                map2 = fVar.a(str);
            }
            if (map2 != null) {
                map.putAll(map2);
            }
        }
    }

    public static void N(String str, Object obj, Map<String, ?> map) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = map != null ? new HashMap(map) : null;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        g.i.c.a.a.j.b bVar = new g.i.c.a.a.j.b(obj, str, hashMap, (g.i.c.a.a.j.a) null, (String) null);
        e eVar = e.b.a;
        if (eVar.j()) {
            eVar.r(bVar);
            return;
        }
        synchronized (eVar) {
            if (eVar.j()) {
                eVar.r(bVar);
            } else {
                a.b.a.b(bVar);
            }
        }
    }

    public static void O(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
    }

    public static void P(View view, l lVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131297651, lVar);
        }
        if (lVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131297661));
        } else {
            view.setOnApplyWindowInsetsListener(new r(view, lVar));
        }
    }

    public static void Q(Object obj, Object obj2, String str) {
        e eVar = e.b.a;
        if (eVar.a) {
            g.c.b.b.f.K("ReportPolicyOperator", "setElementClickPolicy: object=" + obj + ", policy=" + obj2);
        }
        if (eVar.a(obj)) {
            c.j(obj, str, obj2);
        }
    }

    @TargetApi(19)
    public static void R(Activity activity, int i2, boolean z, boolean z2) {
        View view;
        int i3;
        m mVar;
        ViewTreeObserver viewTreeObserver;
        Window window = activity.getWindow();
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 256;
        if (i4 >= 23) {
            view = window.getDecorView();
            if (!z2 || i2 == -1) {
                i5 = 8192;
            }
            if (z) {
                i3 = i5 | 1024;
                View findViewById = view.findViewById(16908290);
                viewTreeObserver = findViewById.getViewTreeObserver();
                mVar = new m(findViewById, activity);
            }
            view.setSystemUiVisibility(i5);
            window.setStatusBarColor(i2);
        } else if (i4 >= 21) {
            view = window.getDecorView();
            if (!z2 || i2 == -1) {
                i5 = 8192;
            }
            if (z) {
                i3 = i5 | 1024;
                View findViewById2 = view.findViewById(16908290);
                viewTreeObserver = findViewById2.getViewTreeObserver();
                mVar = new m(findViewById2, activity);
            }
            view.setSystemUiVisibility(i5);
            window.setStatusBarColor(i2);
        } else if (z) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags = 67108864 | attributes.flags;
            return;
        } else {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(mVar);
        i5 = i3;
        view.setSystemUiVisibility(i5);
        window.setStatusBarColor(i2);
    }

    public static o a(y0 y0Var, int i2) {
        int i3 = i2 & 1;
        return new l1((y0) null);
    }

    public static void b(g.b.a.a.b bVar) {
        c.f1875l.add(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x0039
        L_0x0005:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x0029
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x0029
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x0029:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
        L_0x0039:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.i.b.c(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static void d(Closeable closeable, String str) throws SQLException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                throw j("could not close " + str, e2);
            }
        }
    }

    public static d e(View view) {
        boolean z;
        d dVar = new d();
        while (view != null) {
            g.i.c.a.a.l.b a2 = g.i.c.a.a.l.a.a(view);
            if (g.h.a.a.s(a2)) {
                dVar.a.addLast(a2);
            }
            i m2 = m(view);
            if (m2 != null) {
                a2 = g.i.c.a.a.l.a.a(m2.c());
                if (a2 == null) {
                    z = false;
                } else {
                    z = !TextUtils.isEmpty(g.h.a.a.G(a2));
                }
                if (z) {
                    dVar.b = new WeakReference<>(m2.c());
                    return dVar;
                }
            }
            view = g.i.c.a.a.t.k.l.b(view, a2);
        }
        return dVar;
    }

    public static x f(View view, x xVar, Rect rect) {
        WindowInsets h2 = xVar.h();
        if (h2 != null) {
            return x.j(view.computeSystemWindowInsets(h2, rect), view);
        }
        rect.setEmpty();
        return xVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [f.a.a.b.w.d, f.a.a.b.s.h, f.a.a.a.f.a] */
    public static g.b.a.a.a g(f.a.a.b.d dVar) {
        ? aVar = new f.a.a.a.f.a();
        aVar.g(dVar);
        aVar.f1768f = "[%thread] %msg%n";
        aVar.start();
        g.b.a.a.a aVar2 = new g.b.a.a.a();
        aVar2.g(dVar);
        aVar2.f1874k = aVar;
        aVar2.start();
        return aVar2;
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [f.a.a.b.m.a<E>, f.a.a.b.w.d, f.a.a.b.s.h, f.a.a.a.f.a] */
    public static f.a.a.b.a<f.a.a.a.l.c> h(f.a.a.b.d dVar, String str) {
        f.a.a.b.u.b bVar = new f.a.a.b.u.b();
        bVar.o = true;
        bVar.g(dVar);
        bVar.F(str + "/log.txt");
        f.a.a.b.u.e eVar = new f.a.a.b.u.e();
        eVar.f1799g = g.a.a.a.a.w(str, "/log_%d{yyyyMMdd}.%i.txt");
        eVar.o = 30;
        k kVar = new k(10485760);
        StringBuilder i2 = g.a.a.a.a.i("setting totalSizeCap to ");
        i2.append(kVar.toString());
        eVar.n(i2.toString());
        eVar.p = kVar;
        eVar.f1800h = bVar;
        eVar.g(dVar);
        eVar.s = new k(PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        eVar.start();
        ? aVar = new f.a.a.a.f.a();
        aVar.g(dVar);
        aVar.f1768f = "%d{yyyyMMdd-}%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n";
        aVar.start();
        bVar.t = eVar;
        bVar.s = eVar;
        bVar.f1694k = aVar;
        bVar.start();
        return bVar;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [f.a.a.b.w.d, f.a.a.b.s.h, f.a.a.a.f.a] */
    public static void i(String str, boolean z) {
        if (z) {
            f.a.a.a.c cVar = (f.a.a.a.c) LoggerFactory.getILoggerFactory();
            cVar.stop();
            f.a.a.a.b bVar = (f.a.a.a.b) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
            bVar.l(f.a.a.a.a.f1611e);
            bVar.a(h(cVar, str));
            g.b.a.a.a g2 = g(cVar);
            c = g2;
            bVar.a(g2);
            n.c(cVar);
            return;
        }
        f.a.a.a.c cVar2 = (f.a.a.a.c) LoggerFactory.getILoggerFactory();
        cVar2.stop();
        f.a.a.a.b bVar2 = (f.a.a.a.b) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        bVar2.l(f.a.a.a.a.f1612f);
        ? aVar = new f.a.a.a.f.a();
        aVar.g(cVar2);
        aVar.f1768f = "[%thread] %msg%n";
        aVar.start();
        f.a.a.a.e.a aVar2 = new f.a.a.a.e.a();
        aVar2.g(cVar2);
        aVar2.f1624k = aVar;
        aVar2.start();
        bVar2.a(aVar2);
        bVar2.a(h(cVar2, str));
        g.b.a.a.a g3 = g(cVar2);
        c = g3;
        bVar2.a(g3);
        n.c(cVar2);
    }

    public static SQLException j(String str, Throwable th) {
        SQLException sQLException = th instanceof SQLException ? new SQLException(str, ((SQLException) th).getSQLState()) : new SQLException(str);
        sQLException.initCause(th);
        return sQLException;
    }

    public static g.i.c.a.a.u.c k(String str, Object obj) {
        g.i.c.a.a.u.c cVar = (g.i.c.a.a.u.c) g.a(6);
        cVar.a = str;
        cVar.b("cur_pg", w(str, obj, obj.hashCode()));
        return cVar;
    }

    public static final void l(j.a.f<?> fVar, i0 i0Var) {
        fVar.i(new j0(i0Var));
    }

    public static i m(View view) {
        if (J(view)) {
            return new i(view, view);
        }
        Object u = t.b.a.u(view);
        if (J(u)) {
            return new i(u, view);
        }
        return null;
    }

    public static <E> E n(Context context, String str, String str2, E e2) {
        E string = E(context, str).getString(str2, String.valueOf(e2));
        return e2 instanceof String ? string : e2 instanceof Integer ? Integer.valueOf(string) : e2 instanceof Boolean ? Boolean.valueOf(string) : e2 instanceof Float ? Float.valueOf(string) : e2 instanceof Long ? Long.valueOf(string) : e2 instanceof Double ? Double.valueOf(string) : e2;
    }

    public static ListIterator<g.i.c.a.a.l.b> o(g.i.c.a.a.l.b bVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        while (bVar != null) {
            if (z) {
                arrayList.add(0, bVar);
            } else {
                arrayList.add(bVar);
            }
            bVar = bVar.f4460j;
        }
        return arrayList.listIterator();
    }

    public static Bundle p(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.get("ICERAO");
            }
            return extras;
        } catch (Throwable th) {
            if (!(th instanceof RuntimeException) || TextUtils.isEmpty(th.toString()) || th.toString().indexOf("ClassNotFound") < 0) {
                return null;
            }
            g.c.a.e.e.a.b("IntentCommonUtils", "get intent extras fail." + th);
            return null;
        }
    }

    public static Object q(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception e2) {
            g.c.b.b.f.x("ReflectUtils", "getField " + e2);
            return null;
        }
    }

    public static Object r(Class<?> cls, String str, Object obj) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e2) {
            g.c.b.b.f.x("ReflectUtils", "getField " + e2);
            return null;
        }
    }

    public static <T> T s(String str, Object obj) {
        try {
            Field field = obj.getClass().getField(str);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public static g.i.c.a.a.t.k.i t() {
        return h.a.a;
    }

    public static int u(Intent intent, String str, int i2) {
        if (intent == null) {
            return i2;
        }
        try {
            return intent.getIntExtra(str, i2);
        } catch (Throwable unused) {
            Logger logger = g.c.a.e.e.a.a;
            return i2;
        }
    }

    public static long v(Intent intent, String str, long j2) {
        if (intent == null) {
            return j2;
        }
        try {
            return intent.getLongExtra(str, j2);
        } catch (Throwable unused) {
            Logger logger = g.c.a.e.e.a.a;
            return j2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: g.i.c.a.a.s.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: g.i.c.a.a.s.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: g.i.c.a.a.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: g.i.c.a.a.s.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: g.i.c.a.a.s.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: g.i.c.a.a.s.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: g.i.c.a.a.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: g.i.c.a.a.l.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: g.i.c.a.a.s.l} */
    /* JADX WARNING: type inference failed for: r7v0, types: [g.i.c.a.a.l.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Object> w(java.lang.String r11, java.lang.Object r12, int r13) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 2
            r0.<init>(r1)
            g.i.c.a.a.s.e r1 = g.i.c.a.a.s.e.b.a
            android.util.SparseArray<g.i.c.a.a.s.d> r1 = r1.a
            java.lang.Object r13 = r1.get(r13)
            g.i.c.a.a.s.d r13 = (g.i.c.a.a.s.d) r13
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "flutter_api"
            java.lang.String r3 = "pg_path"
            r4 = 1
            r5 = 0
            if (r13 == 0) goto L_0x008b
            int r6 = r13.a
            g.i.c.a.a.l.b r7 = r13.b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "pg_stp"
            r0.put(r8, r6)
            g.i.c.a.a.l.b r13 = r13.c
            java.util.ListIterator r6 = o(r13, r4)
        L_0x0030:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0050
            java.lang.Object r8 = r6.next()
            g.i.c.a.a.l.b r8 = (g.i.c.a.a.l.b) r8
            g.i.c.a.a.p.b r9 = g.i.c.a.a.p.b.C0174b.a
            java.util.Objects.requireNonNull(r9)
            java.lang.Object r10 = g.h.a.a.A(r8, r2)
            boolean r10 = r10 instanceof g.i.c.a.a.p.a
            if (r10 == 0) goto L_0x004c
            r9.b(r8)
        L_0x004c:
            M(r11, r1, r8)
            goto L_0x0030
        L_0x0050:
            if (r13 != 0) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            java.lang.String r6 = "last_click_element"
            java.lang.Object r6 = g.h.a.a.C(r13, r6)
            boolean r8 = r6 instanceof g.i.c.a.a.s.l
            if (r8 == 0) goto L_0x0060
            r5 = r6
            g.i.c.a.a.s.l r5 = (g.i.c.a.a.s.l) r5
        L_0x0060:
            if (r5 == 0) goto L_0x006b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.a
            if (r5 == 0) goto L_0x006b
            java.lang.String r6 = "last_clck_ele"
            r1.put(r6, r5)
        L_0x006b:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = "pgid"
            java.lang.String r6 = "vr_page_none"
            r1.put(r5, r6)
        L_0x0078:
            java.util.List r13 = x(r13)
            g.i.c.a.a.r.e r5 = g.i.c.a.a.r.e.b.a
            g.i.c.a.a.a r5 = r5.d()
            boolean r5 = r5.v
            if (r5 != 0) goto L_0x0087
            goto L_0x008a
        L_0x0087:
            r1.put(r3, r13)
        L_0x008a:
            r5 = r7
        L_0x008b:
            java.lang.String r13 = "ref_pg"
            r0.put(r13, r1)
            if (r5 != 0) goto L_0x0096
            g.i.c.a.a.l.b r5 = g.i.c.a.a.l.a.a(r12)
        L_0x0096:
            java.util.List r12 = x(r5)
            g.i.c.a.a.r.e r13 = g.i.c.a.a.r.e.b.a
            g.i.c.a.a.a r13 = r13.d()
            boolean r13 = r13.v
            if (r13 != 0) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r0.put(r3, r12)
        L_0x00a8:
            java.util.ListIterator r12 = o(r5, r4)
        L_0x00ac:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00cc
            java.lang.Object r13 = r12.next()
            g.i.c.a.a.l.b r13 = (g.i.c.a.a.l.b) r13
            g.i.c.a.a.p.b r1 = g.i.c.a.a.p.b.C0174b.a
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r3 = g.h.a.a.A(r13, r2)
            boolean r3 = r3 instanceof g.i.c.a.a.p.a
            if (r3 == 0) goto L_0x00c8
            r1.b(r13)
        L_0x00c8:
            M(r11, r0, r13)
            goto L_0x00ac
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.i.b.w(java.lang.String, java.lang.Object, int):java.util.Map");
    }

    public static List<String> x(g.i.c.a.a.l.b bVar) {
        ArrayList arrayList = new ArrayList();
        ListIterator<g.i.c.a.a.l.b> o = o(bVar, false);
        while (o.hasNext()) {
            arrayList.add(g.h.a.a.G(o.next()));
        }
        return arrayList;
    }

    public static String y() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String trim = bufferedReader.readLine().trim();
            bufferedReader.close();
            return trim;
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T z(Object obj, String str, Class<T> cls) {
        e eVar = e.b.a;
        if (eVar.a) {
            g.c.b.b.f.w("ReportPolicyOperator", "getElementExposePolicy: ");
        }
        if (!eVar.a(obj)) {
            return null;
        }
        Object e2 = c.e(obj, str);
        if (cls.isInstance(e2)) {
            return cls.cast(e2);
        }
        return null;
    }
}
