package g.c.b.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.gson.internal.bind.TypeAdapters;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.e.c.t.t;
import g.i.c.a.a.b0.n;
import g.i.c.a.a.q.c.a;
import g.i.c.a.a.r.e;
import g.i.c.a.a.s.t;
import i.f;
import i.g;
import i.k;
import i.m.d;
import i.m.e;
import i.m.f;
import i.o.b.l;
import i.o.c.c;
import i.o.c.h;
import i.o.c.r;
import i.r.b;
import j.a.a1;
import j.a.c1;
import j.a.d0;
import j.a.d1;
import j.a.e0;
import j.a.f0;
import j.a.g0;
import j.a.h0;
import j.a.i0;
import j.a.o;
import j.a.p;
import j.a.p1;
import j.a.t1.j;
import j.a.t1.m;
import j.a.v;
import j.a.w;
import j.a.x;
import j.a.y0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class f {
    public static Toast a;
    public static long b;
    public static int c;

    public static a A(Fragment fragment) {
        a aVar = new a();
        aVar.a(fragment.getActivity());
        aVar.b(fragment.getView());
        return aVar;
    }

    public static Writer A0(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new t(appendable);
    }

    public static final String B(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String C(int i2) {
        switch (i2) {
            case -1:
                return "file format error, only supports apk/xapk";
            case 0:
                return "apk install exception";
            case 1:
                return "xapk parse exception";
            case 2:
                return "expansion install exception";
            case 3:
                return "UnsupportedOperation";
            case 4:
                return "apk parse exception";
            case 7:
                return "cancel";
            case 8:
                return "file path is null";
            case 10:
                return "not apk file find";
            case 11:
                return "not expansion file find";
            case 12:
                return "not expansion size find";
            case ConnectionResult.CANCELED:
                return "install obb file exception";
            case ConnectionResult.TIMEOUT:
                return "not apk file find session";
            case ConnectionResult.INTERRUPTED:
                return "write apks exception";
            case ConnectionResult.API_UNAVAILABLE:
                return "parser apk exception";
            case ConnectionResult.SIGN_IN_FAILED:
                return "no activity have higher version.";
            case ConnectionResult.SERVICE_UPDATING:
                return "not grant installation permission msg.";
            case ConnectionResult.SERVICE_MISSING_PERMISSION:
                return "call receiver activity exception.";
            case 20:
                return "install use system.";
            case 21:
                return "seekable install xpak null.";
            case ConnectionResult.RESOLUTION_ACTIVITY_NOT_FOUND:
                return "now is installing.";
            default:
                return "unknown";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005b A[SYNTHETIC, Splitter:B:35:0x005b] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String D(java.lang.Object r4) {
        /*
            java.lang.String r0 = "e"
            i.o.c.h.e(r4, r0)
            boolean r0 = r4 instanceof java.lang.Exception
            java.lang.String r1 = "sw.toString()"
            r2 = 0
            if (r0 == 0) goto L_0x0056
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ Exception -> 0x0048, all -> 0x0039 }
            r0.<init>()     // Catch:{ Exception -> 0x0048, all -> 0x0039 }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0036, all -> 0x0032 }
            r2 = r4
            java.lang.Exception r2 = (java.lang.Exception) r2     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r2.printStackTrace(r3)     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r3.flush()     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r0.flush()     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            java.lang.String r2 = r0.toString()     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            i.o.c.h.d(r2, r1)     // Catch:{ Exception -> 0x0037, all -> 0x0030 }
            r0.close()
            r3.close()
            return r2
        L_0x0030:
            r4 = move-exception
            goto L_0x0034
        L_0x0032:
            r4 = move-exception
            r3 = r2
        L_0x0034:
            r2 = r0
            goto L_0x003b
        L_0x0036:
            r3 = r2
        L_0x0037:
            r2 = r0
            goto L_0x0049
        L_0x0039:
            r4 = move-exception
            r3 = r2
        L_0x003b:
            if (r2 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r2.close()
        L_0x0041:
            if (r3 != 0) goto L_0x0044
            goto L_0x0047
        L_0x0044:
            r3.close()
        L_0x0047:
            throw r4
        L_0x0048:
            r3 = r2
        L_0x0049:
            if (r2 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            r2.close()
        L_0x004f:
            if (r3 != 0) goto L_0x0052
            goto L_0x0057
        L_0x0052:
            r3.close()
            goto L_0x0057
        L_0x0056:
            r3 = r2
        L_0x0057:
            boolean r0 = r4 instanceof java.lang.Throwable
            if (r0 == 0) goto L_0x00a3
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch:{ Exception -> 0x0096, all -> 0x0088 }
            r0.<init>()     // Catch:{ Exception -> 0x0096, all -> 0x0088 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r4.printStackTrace(r2)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r2.flush()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r0.flush()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            i.o.c.h.d(r4, r1)     // Catch:{ Exception -> 0x0081, all -> 0x007e }
            r0.close()
            r2.close()
            return r4
        L_0x007e:
            r4 = move-exception
            r3 = r2
            goto L_0x0084
        L_0x0081:
            r3 = r2
            goto L_0x0086
        L_0x0083:
            r4 = move-exception
        L_0x0084:
            r2 = r0
            goto L_0x0089
        L_0x0086:
            r2 = r0
            goto L_0x0097
        L_0x0088:
            r4 = move-exception
        L_0x0089:
            if (r2 != 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r2.close()
        L_0x008f:
            if (r3 != 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r3.close()
        L_0x0095:
            throw r4
        L_0x0096:
        L_0x0097:
            if (r2 != 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            r2.close()
        L_0x009d:
            if (r3 != 0) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            r3.close()
        L_0x00a3:
            java.lang.String r4 = "get exception failed"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.f.D(java.lang.Object):java.lang.String");
    }

    public static final String E(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final <T> Class<T> F(b<T> bVar) {
        h.e(bVar, "$this$javaObjectType");
        Class<?> a2 = ((c) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : a2;
            case 104431:
                return name.equals("int") ? Integer.class : a2;
            case 3039496:
                return name.equals("byte") ? Byte.class : a2;
            case 3052374:
                return name.equals("char") ? Character.class : a2;
            case 3327612:
                return name.equals("long") ? Long.class : a2;
            case 3625364:
                return name.equals("void") ? Void.class : a2;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : a2;
            case 97526364:
                return name.equals("float") ? Float.class : a2;
            case 109413500:
                return name.equals("short") ? Short.class : a2;
            default:
                return a2;
        }
    }

    public static g.i.c.a.a.r.c G() {
        g.i.c.a.a.r.c cVar = e.b.a.d().o;
        return cVar == null ? g.i.c.a.a.a.w : cVar;
    }

    @SuppressLint({"PrivateApi"})
    public static final String H(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            if (invoke != null) {
                return (String) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e2) {
            Log.w("TAG", "Unable to use SystemProperties.get", e2);
            return null;
        }
    }

    public static DateFormat I(int i2, int i3) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i2 == 1) {
            str = "MMMM d, yyyy";
        } else if (i2 == 2) {
            str = "MMM d, yyyy";
        } else if (i2 == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException(g.a.a.a.a.q("Unknown DateFormat style: ", i2));
        }
        sb.append(str);
        sb.append(" ");
        if (i3 == 0 || i3 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i3 == 2) {
            str2 = "h:mm:ss a";
        } else if (i3 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException(g.a.a.a.a.q("Unknown DateFormat style: ", i3));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static final void J(i.m.f fVar, Throwable th) {
        try {
            int i2 = CoroutineExceptionHandler.O;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) fVar.get(CoroutineExceptionHandler.a.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(fVar, th);
            } else {
                w.a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                c(runtimeException, th);
                th = runtimeException;
            }
            w.a(fVar, th);
        }
    }

    public static void K(String str, String str2) {
        G();
        if (e.b.a.a) {
            Log.i("DT#" + str, str2);
        }
    }

    public static Toast L(Context context) {
        if (context != null) {
            if (a == null) {
                Toast makeText = Toast.makeText(context, "", 0);
                a = makeText;
                c = makeText.getYOffset();
            }
            a.setDuration(0);
            a.setGravity(80, 0, c);
            a.setMargin(0.0f, 0.0f);
            return a;
        }
        throw new IllegalArgumentException("Context should not be null!!!");
    }

    public static final <T> d<T> M(d<? super T> dVar) {
        h.e(dVar, "$this$intercepted");
        i.m.j.a.c cVar = (i.m.j.a.c) (!(dVar instanceof i.m.j.a.c) ? null : dVar);
        return cVar != null ? cVar.n() : dVar;
    }

    public static /* synthetic */ i0 N(y0 y0Var, boolean z, boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return y0Var.n(z, z2, lVar);
    }

    public static final boolean O(int i2) {
        return i2 == 1;
    }

    public static final boolean P() {
        return !TextUtils.isEmpty(H("ro.miui.ui.version.name"));
    }

    public static final boolean Q() {
        if (!P()) {
            return false;
        }
        boolean z = !h.a(SLAConstant.TYPE_DEPRECATED_START, H("ro.miui.cts"));
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE}).invoke((Object) null, new Object[]{"persist.sys.miui_optimization", Boolean.valueOf(z)});
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } catch (Exception e2) {
            Log.w("TAG", "Unable to use SystemProperties.getBoolean", e2);
            return z;
        }
    }

    public static final boolean R(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        if (r3 != i.m.i.a.b) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j.a.y0 S(j.a.x r1, i.m.f r2, j.a.y r3, i.o.b.p r4, int r5, java.lang.Object r6) {
        /*
            r3 = r5 & 1
            if (r3 == 0) goto L_0x0006
            i.m.h r2 = i.m.h.b
        L_0x0006:
            r3 = 2
            r5 = r5 & r3
            r6 = 0
            if (r5 == 0) goto L_0x000e
            j.a.y r5 = j.a.y.DEFAULT
            goto L_0x000f
        L_0x000e:
            r5 = r6
        L_0x000f:
            boolean r0 = j.a.t.a
            i.m.f r1 = r1.f()
            i.m.f r1 = r1.plus(r2)
            j.a.v r2 = j.a.h0.a
            if (r1 == r2) goto L_0x002b
            int r0 = i.m.e.N
            i.m.e$a r0 = i.m.e.a.a
            i.m.f$a r0 = r1.get(r0)
            if (r0 != 0) goto L_0x002b
            i.m.f r1 = r1.plus(r2)
        L_0x002b:
            java.util.Objects.requireNonNull(r5)
            j.a.y r2 = j.a.y.LAZY
            r0 = 1
            if (r5 != r2) goto L_0x0035
            r2 = 1
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            if (r2 == 0) goto L_0x003e
            j.a.e1 r2 = new j.a.e1
            r2.<init>(r1, r4)
            goto L_0x0043
        L_0x003e:
            j.a.k1 r2 = new j.a.k1
            r2.<init>(r1, r0)
        L_0x0043:
            r2.W()
            int r1 = r5.ordinal()
            if (r1 == 0) goto L_0x0097
            if (r1 == r0) goto L_0x009a
            java.lang.String r5 = "completion"
            if (r1 == r3) goto L_0x0081
            r0 = 3
            if (r1 != r0) goto L_0x007b
            i.o.c.h.e(r2, r5)
            i.m.f r1 = r2.c     // Catch:{ all -> 0x0072 }
            java.lang.Object r5 = j.a.t1.p.c(r1, r6)     // Catch:{ all -> 0x0072 }
            i.o.c.r.b(r4, r3)     // Catch:{ all -> 0x006d }
            java.lang.Object r3 = r4.d(r2, r2)     // Catch:{ all -> 0x006d }
            j.a.t1.p.a(r1, r5)     // Catch:{ all -> 0x0072 }
            i.m.i.a r1 = i.m.i.a.COROUTINE_SUSPENDED
            if (r3 == r1) goto L_0x009a
            goto L_0x0077
        L_0x006d:
            r3 = move-exception
            j.a.t1.p.a(r1, r5)     // Catch:{ all -> 0x0072 }
            throw r3     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r1 = move-exception
            java.lang.Object r3 = v(r1)
        L_0x0077:
            r2.g(r3)
            goto L_0x009a
        L_0x007b:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L_0x0081:
            java.lang.String r1 = "$this$startCoroutine"
            i.o.c.h.e(r4, r1)
            i.o.c.h.e(r2, r5)
            i.m.d r1 = u(r4, r2, r2)
            i.m.d r1 = M(r1)
            i.j r3 = i.j.a
            r1.g(r3)
            goto L_0x009a
        L_0x0097:
            k0(r4, r2, r2)
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.f.S(j.a.x, i.m.f, j.a.y, i.o.b.p, int, java.lang.Object):j.a.y0");
    }

    public static final <T> i.c<T> T(i.d dVar, i.o.b.a<? extends T> aVar) {
        h.e(dVar, "mode");
        h.e(aVar, "initializer");
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return new i.h(aVar, (Object) null, 2);
        }
        if (ordinal == 1) {
            return new g(aVar);
        }
        if (ordinal == 2) {
            return new k(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> i.c<T> U(i.o.b.a<? extends T> aVar) {
        h.e(aVar, "initializer");
        return new i.h(aVar, (Object) null, 2);
    }

    public static final <T> List<T> V(T t) {
        List<T> singletonList = Collections.singletonList(t);
        h.d(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    public static final int W(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static String X(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static final int Y(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    public static final int Z(i.p.c cVar, i.q.c cVar2) {
        h.e(cVar, "$this$nextInt");
        h.e(cVar2, "range");
        if (!cVar2.isEmpty()) {
            int i2 = cVar2.c;
            if (i2 < Integer.MAX_VALUE) {
                return cVar.c(cVar2.b, i2 + 1);
            }
            int i3 = cVar2.b;
            return i3 > Integer.MIN_VALUE ? cVar.c(i3 - 1, i2) + 1 : cVar.b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + cVar2);
    }

    public static final x a(i.m.f fVar) {
        v vVar = (v) fVar;
        f.a aVar = vVar.get(y0.P);
        i.m.f fVar2 = vVar;
        if (aVar == null) {
            fVar2 = vVar.plus(new a1((y0) null));
        }
        return new j.a.t1.d(fVar2);
    }

    public static void a0(Fragment fragment, View view) {
        e eVar = e.b.a;
        if (eVar.i()) {
            if (eVar.a) {
                StringBuilder i2 = g.a.a.a.a.i("onFragmentViewCreated: fragment = ");
                i2.append(fragment.getClass().getName());
                i2.append(", view = ");
                i2.append(n.b(view));
                K("AndroidXFragmentCollect", i2.toString());
            }
            t.b.a.t(view, fragment);
        }
    }

    public static final x b() {
        o a2 = e.e.i.b.a((y0) null, 1);
        v vVar = h0.a;
        return new j.a.t1.d(f.a.C0191a.d((c1) a2, j.b));
    }

    public static void b0(g.c.b.b.i.a aVar, List<String> list) {
        h.e(aVar, "this");
        h.e(list, "results");
    }

    public static final void c(Throwable th, Throwable th2) {
        h.e(th, "$this$addSuppressed");
        h.e(th2, "exception");
        if (th != th2) {
            i.n.b.a.a(th, th2);
        }
    }

    public static void c0(g.c.b.b.i.b bVar) {
        h.e(bVar, "this");
        h.e(bVar, "this");
    }

    public static final <T> List<T> d(T[] tArr) {
        h.e(tArr, "$this$asList");
        List<T> asList = Arrays.asList(tArr);
        h.d(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    public static void d0(g.c.b.b.i.b bVar, View view) {
        h.e(bVar, "this");
        h.e(view, "adView");
        e0(bVar, view);
    }

    public static final <T> i.s.b<T> e(Iterator<? extends T> it) {
        h.e(it, "$this$asSequence");
        i.s.c cVar = new i.s.c(it);
        h.e(cVar, "$this$constrainOnce");
        return cVar instanceof i.s.a ? cVar : new i.s.a(cVar);
    }

    public static void e0(g.c.b.b.i.c cVar, View view) {
        h.e(cVar, "this");
        h.e(view, "adView");
    }

    public static void f(x xVar, CancellationException cancellationException, int i2) {
        int i3 = i2 & 1;
        y0 y0Var = (y0) xVar.f().get(y0.P);
        if (y0Var != null) {
            y0Var.q((CancellationException) null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + xVar).toString());
    }

    public static void f0(g.c.b.b.i.b bVar) {
        h.e(bVar, "this");
        h.e(bVar, "this");
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static i.m.f g0(i.m.f fVar, i.m.f fVar2) {
        h.e(fVar2, "context");
        return fVar2 == i.m.h.b ? fVar : (i.m.f) fVar2.fold(fVar, i.m.g.b);
    }

    public static void h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static final <T> Object h0(Object obj, d<? super T> dVar) {
        return obj instanceof p ? v(((p) obj).a) : obj;
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static final <T> void i0(g0<? super T> g0Var, d<? super T> dVar, int i2) {
        Object j2 = g0Var.j();
        Throwable th = null;
        p pVar = (p) (!(j2 instanceof p) ? null : j2);
        Throwable th2 = pVar != null ? pVar.a : null;
        if (th2 != null) {
            th = th2;
        }
        Object v = th != null ? v(th) : g0Var.d(j2);
        if (i2 == 0) {
            dVar.g(v);
        } else if (i2 == 1) {
            e0.a(dVar, v);
        } else if (i2 == 2) {
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
            d0 d0Var = (d0) dVar;
            i.m.f c2 = d0Var.c();
            Object c3 = j.a.t1.p.c(c2, d0Var.f4595g);
            try {
                d0Var.f4597i.g(v);
            } finally {
                j.a.t1.p.a(c2, c3);
            }
        } else {
            throw new IllegalStateException(g.a.a.a.a.q("Invalid mode ", i2).toString());
        }
    }

    public static void j(String str) {
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            throw new IllegalStateException(str);
        }
    }

    public static void j0(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= b) {
                if (a == null) {
                    try {
                        L(context.getApplicationContext());
                    } catch (Exception unused) {
                        return;
                    }
                }
                a.setText(str);
                a.setDuration(0);
                a.setGravity(80, 0, c);
                b = currentTimeMillis + ((long) 2000);
                Toast toast = a;
                try {
                    Field declaredField = toast.getClass().getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(toast);
                    Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    Handler handler = (Handler) declaredField2.get(obj);
                    if (!(handler instanceof g.c.b.b.l.h)) {
                        declaredField2.set(obj, new g.c.b.b.l.h(handler));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                a.show();
            }
        }
    }

    @EnsuresNonNull({"#1"})
    public static String k(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static final <R, T> void k0(i.o.b.p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        try {
            e0.a(M(u(pVar, r, dVar)), i.j.a);
        } catch (Throwable th) {
            dVar.g(v(th));
        }
    }

    @EnsuresNonNull({"#1"})
    public static String l(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static final <T, R> Object l0(m<? super T> mVar, R r, i.o.b.p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object J;
        mVar.W();
        if (pVar != null) {
            try {
                r.b(pVar, 2);
                obj = pVar.d(r, mVar);
            } catch (Throwable th) {
                obj = new p(th, false, 2);
            }
            i.m.i.a aVar = i.m.i.a.COROUTINE_SUSPENDED;
            if (obj == aVar || (J = mVar.J(obj)) == d1.b) {
                return aVar;
            }
            if (!(J instanceof p)) {
                return d1.a(J);
            }
            throw ((p) J).a;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }

    public static void m(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r9 == '+') goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m0(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            java.lang.String r5 = n0(r21)
            if (r5 == 0) goto L_0x00f8
            java.lang.String r6 = "$this$toLongOrNull"
            i.o.c.h.e(r5, r6)
            i.o.c.h.e(r5, r6)
            r6 = 10
            p(r6)
            int r7 = r5.length()
            if (r7 != 0) goto L_0x0020
            goto L_0x0077
        L_0x0020:
            r8 = 0
            char r9 = r5.charAt(r8)
            r10 = 48
            int r10 = i.o.c.h.g(r9, r10)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r13 = 1
            if (r10 >= 0) goto L_0x0043
            if (r7 != r13) goto L_0x0036
            goto L_0x0077
        L_0x0036:
            r10 = 45
            if (r9 != r10) goto L_0x003e
            r11 = -9223372036854775808
            r8 = 1
            goto L_0x0044
        L_0x003e:
            r10 = 43
            if (r9 != r10) goto L_0x0077
            goto L_0x0044
        L_0x0043:
            r13 = 0
        L_0x0044:
            r9 = 0
            r16 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
        L_0x004b:
            if (r13 >= r7) goto L_0x007f
            char r14 = r5.charAt(r13)
            int r14 = java.lang.Character.digit(r14, r6)
            if (r14 >= 0) goto L_0x0058
            goto L_0x0077
        L_0x0058:
            int r15 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            r18 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            if (r15 >= 0) goto L_0x006d
            int r15 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r15 != 0) goto L_0x0077
            long r3 = (long) r6
            long r16 = r11 / r3
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x006d
            goto L_0x0077
        L_0x006d:
            long r3 = (long) r6
            long r9 = r9 * r3
            long r3 = (long) r14
            long r14 = r11 + r3
            int r20 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r20 >= 0) goto L_0x0079
        L_0x0077:
            r3 = 0
            goto L_0x008b
        L_0x0079:
            long r9 = r9 - r3
            int r13 = r13 + 1
            r3 = r26
            goto L_0x004b
        L_0x007f:
            if (r8 == 0) goto L_0x0086
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            goto L_0x008b
        L_0x0086:
            long r3 = -r9
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x008b:
            r4 = 39
            java.lang.String r6 = "System property '"
            if (r3 == 0) goto L_0x00d4
            long r7 = r3.longValue()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r9 = r26
            if (r3 > 0) goto L_0x00a0
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x00a0
            goto L_0x00fa
        L_0x00a0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = "' should be in range "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ".."
            r3.append(r0)
            r3.append(r9)
            java.lang.String r0 = ", but is '"
            r3.append(r0)
            r3.append(r7)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r1.append(r0)
            r1.append(r5)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x00f8:
            r7 = r22
        L_0x00fa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.b.b.f.m0(java.lang.String, long, long, long):long");
    }

    @EnsuresNonNull({"#1"})
    public static <T> T n(T t) {
        Objects.requireNonNull(t, "null reference");
        return t;
    }

    public static final String n0(String str) {
        int i2 = j.a.t1.o.a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    @EnsuresNonNull({"#1"})
    public static <T> T o(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int o0(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) m0(str, (long) i2, (long) i3, (long) i4);
    }

    public static final int p(int i2) {
        if (2 <= i2 && 36 >= i2) {
            return i2;
        }
        StringBuilder j2 = g.a.a.a.a.j("radix ", i2, " was not in valid range ");
        j2.append(new i.q.c(2, 36));
        throw new IllegalArgumentException(j2.toString());
    }

    public static /* synthetic */ long p0(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return m0(str, j2, j5, j4);
    }

    public static void q(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static final void q0(Object obj) {
        if (obj instanceof f.a) {
            throw ((f.a) obj).exception;
        }
    }

    public static void r(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static final String r0(d<?> dVar) {
        String str;
        if (dVar instanceof d0) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + E(dVar);
        } catch (Throwable th) {
            str = v(th);
        }
        Throwable a2 = i.f.a(str);
        String str2 = str;
        if (a2 != null) {
            str2 = dVar.getClass().getName() + '@' + E(dVar);
        }
        return (String) str2;
    }

    public static final void s(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                c(th, th2);
            }
        }
    }

    public static final <T> List<T> s0(i.s.b<? extends T> bVar) {
        h.e(bVar, "$this$toList");
        h.e(bVar, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        h.e(bVar, "$this$toCollection");
        h.e(arrayList, "destination");
        for (Object add : bVar) {
            arrayList.add(add);
        }
        return i.l.c.e(arrayList);
    }

    public static Object[] t(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        h.e(objArr, "$this$copyInto");
        h.e(objArr2, "destination");
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
        return objArr2;
    }

    public static final <T> Object t0(Object obj) {
        Throwable a2 = i.f.a(obj);
        return a2 == null ? obj : new p(a2, false, 2);
    }

    public static final <R, T> d<i.j> u(i.o.b.p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        h.e(pVar, "$this$createCoroutineUnintercepted");
        h.e(dVar, "completion");
        h.e(dVar, "completion");
        if (pVar instanceof i.m.j.a.a) {
            return ((i.m.j.a.a) pVar).a(r, dVar);
        }
        i.m.f c2 = dVar.c();
        return c2 == i.m.h.b ? new i.m.i.b(dVar, dVar, pVar, r) : new i.m.i.c(dVar, c2, dVar, c2, pVar, r);
    }

    public static final String u0(String str) {
        h.e(str, "filePath");
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        String name = new File(str).getName();
        h.d(name, "File(filePath).name");
        Locale locale = Locale.getDefault();
        h.d(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        h.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return i.t.e.b(lowerCase, ".xapk", false, 2) ? ".xapk" : i.t.e.b(lowerCase, ".apk", false, 2) ? ".apk" : "unknown";
    }

    public static final Object v(Throwable th) {
        h.e(th, "exception");
        return new f.a(th);
    }

    public static void v0(String str, String str2) {
        G();
        if (e.b.a.a) {
            Log.v("DT#" + str, str2);
        }
    }

    public static void w(String str, String str2) {
        G();
        if (e.b.a.a) {
            Log.d("DT#" + str, str2);
        }
    }

    public static void w0(String str, String str2) {
        G();
        if (e.b.a.a) {
            Log.w("DT#" + str, str2);
        }
    }

    public static void x(String str, String str2) {
        G();
        if (e.b.a.a) {
            Log.e("DT#" + str, str2);
        }
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object x0(i.m.f fVar, i.o.b.p<? super x, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        Object obj;
        i.m.f c2 = dVar.c();
        i.m.f plus = c2.plus(fVar);
        y0 y0Var = (y0) plus.get(y0.P);
        if (y0Var == null || y0Var.a()) {
            if (plus == c2) {
                m mVar = new m(plus, dVar);
                obj = l0(mVar, mVar, pVar);
            } else {
                int i2 = i.m.e.N;
                e.a aVar = e.a.a;
                if (h.a((i.m.e) plus.get(aVar), (i.m.e) c2.get(aVar))) {
                    p1 p1Var = new p1(plus, dVar);
                    Object c3 = j.a.t1.p.c(plus, (Object) null);
                    try {
                        Object l0 = l0(p1Var, p1Var, pVar);
                        j.a.t1.p.a(plus, c3);
                        obj = l0;
                    } catch (Throwable th) {
                        j.a.t1.p.a(plus, c3);
                        throw th;
                    }
                } else {
                    f0 f0Var = new f0(plus, dVar);
                    f0Var.W();
                    k0(pVar, f0Var, f0Var);
                    obj = f0Var.Y();
                }
            }
            if (obj == i.m.i.a.COROUTINE_SUSPENDED) {
                h.e(dVar, "frame");
            }
            return obj;
        }
        throw y0Var.o();
    }

    public static boolean y(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> Class<T> y0(Class<T> cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static final boolean z(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static void z0(g.e.c.j jVar, g.e.c.v.c cVar) throws IOException {
        TypeAdapters.X.c(cVar, jVar);
    }
}
