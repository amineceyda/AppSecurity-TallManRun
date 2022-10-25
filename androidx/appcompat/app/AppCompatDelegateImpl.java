package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import e.b.c.k;
import e.b.c.l;
import e.b.c.n;
import e.b.c.o;
import e.b.c.s;
import e.b.c.t;
import e.b.c.w;
import e.b.g.a;
import e.b.g.i.g;
import e.b.g.i.m;
import e.b.h.c0;
import e.b.h.d1;
import e.b.h.g0;
import e.b.h.n0;
import e.b.h.x0;
import e.e.j.q;
import e.e.j.u;
import e.e.j.v;
import e.e.j.x;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class AppCompatDelegateImpl extends l implements g.a, LayoutInflater.Factory2 {
    public static final e.d.g<String, Integer> n0 = new e.d.g<>();
    public static final boolean o0;
    public static final int[] p0 = {16842836};
    public static final boolean q0 = (!"robolectric".equals(Build.FINGERPRINT));
    public static final boolean r0 = true;
    public static boolean s0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean Q;
    public boolean R;
    public PanelFeatureState[] S;
    public PanelFeatureState T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public int a0;
    public boolean b0;
    public boolean c0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f45d;
    public g d0;

    /* renamed from: e  reason: collision with root package name */
    public final Context f46e;
    public g e0;

    /* renamed from: f  reason: collision with root package name */
    public Window f47f;
    public boolean f0;

    /* renamed from: g  reason: collision with root package name */
    public e f48g;
    public int g0;

    /* renamed from: h  reason: collision with root package name */
    public final k f49h;
    public final Runnable h0;

    /* renamed from: i  reason: collision with root package name */
    public e.b.c.a f50i;
    public boolean i0;

    /* renamed from: j  reason: collision with root package name */
    public MenuInflater f51j;
    public Rect j0;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f52k;
    public Rect k0;

    /* renamed from: l  reason: collision with root package name */
    public c0 f53l;
    public s l0;

    /* renamed from: m  reason: collision with root package name */
    public c f54m;
    public t m0;
    public j n;
    public e.b.g.a o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    public e.e.j.t s;
    public boolean t;
    public ViewGroup u;
    public TextView v;
    public View w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static final class PanelFeatureState {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f55d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f56e;

        /* renamed from: f  reason: collision with root package name */
        public View f57f;

        /* renamed from: g  reason: collision with root package name */
        public View f58g;

        /* renamed from: h  reason: collision with root package name */
        public e.b.g.i.g f59h;

        /* renamed from: i  reason: collision with root package name */
        public e.b.g.i.e f60i;

        /* renamed from: j  reason: collision with root package name */
        public Context f61j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f62k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f63l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f64m;
        public boolean n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int b;
            public boolean c;

            /* renamed from: d  reason: collision with root package name */
            public Bundle f65d;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                public Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, (ClassLoader) null);
                }

                public Object[] newArray(int i2) {
                    return new SavedState[i2];
                }

                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.b = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.c = z;
                if (z) {
                    savedState.f65d = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.b);
                parcel.writeInt(this.c ? 1 : 0);
                if (this.c) {
                    parcel.writeBundle(this.f65d);
                }
            }
        }

        public PanelFeatureState(int i2) {
            this.a = i2;
        }

        public void a(e.b.g.i.g gVar) {
            e.b.g.i.e eVar;
            e.b.g.i.g gVar2 = this.f59h;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.u(this.f60i);
                }
                this.f59h = gVar;
                if (gVar != null && (eVar = this.f60i) != null) {
                    gVar.b(eVar, gVar.a);
                }
            }
        }
    }

    public class a implements Thread.UncaughtExceptionHandler {
        public final /* synthetic */ Thread.UncaughtExceptionHandler a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.a = uncaughtExceptionHandler;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.a.uncaughtException(thread, notFoundException);
                return;
            }
            this.a.uncaughtException(thread, th);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.g0 & 1) != 0) {
                appCompatDelegateImpl.H(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.g0 & 4096) != 0) {
                appCompatDelegateImpl2.H(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f0 = false;
            appCompatDelegateImpl3.g0 = 0;
        }
    }

    public final class c implements m.a {
        public c() {
        }

        public void a(e.b.g.i.g gVar, boolean z) {
            AppCompatDelegateImpl.this.D(gVar);
        }

        public boolean b(e.b.g.i.g gVar) {
            Window.Callback O = AppCompatDelegateImpl.this.O();
            if (O == null) {
                return true;
            }
            O.onMenuOpened(108, gVar);
            return true;
        }
    }

    public class d implements a.C0036a {
        public a.C0036a a;

        public class a extends v {
            public a() {
            }

            public void b(View view) {
                AppCompatDelegateImpl.this.p.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.p.getParent() instanceof View) {
                    q.l((View) AppCompatDelegateImpl.this.p.getParent());
                }
                AppCompatDelegateImpl.this.p.h();
                AppCompatDelegateImpl.this.s.d((u) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.s = null;
                q.l(appCompatDelegateImpl2.u);
            }
        }

        public d(a.C0036a aVar) {
            this.a = aVar;
        }

        public boolean a(e.b.g.a aVar, Menu menu) {
            q.l(AppCompatDelegateImpl.this.u);
            return this.a.a(aVar, menu);
        }

        public void b(e.b.g.a aVar) {
            this.a.b(aVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.q != null) {
                appCompatDelegateImpl.f47f.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.r);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.p != null) {
                appCompatDelegateImpl2.I();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                e.e.j.t b2 = q.b(appCompatDelegateImpl3.p);
                b2.a(0.0f);
                appCompatDelegateImpl3.s = b2;
                e.e.j.t tVar = AppCompatDelegateImpl.this.s;
                a aVar2 = new a();
                View view = (View) tVar.a.get();
                if (view != null) {
                    tVar.e(view, aVar2);
                }
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            k kVar = appCompatDelegateImpl4.f49h;
            if (kVar != null) {
                kVar.e(appCompatDelegateImpl4.o);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.o = null;
            q.l(appCompatDelegateImpl5.u);
        }

        public boolean c(e.b.g.a aVar, MenuItem menuItem) {
            return this.a.c(aVar, menuItem);
        }

        public boolean d(e.b.g.a aVar, Menu menu) {
            return this.a.d(aVar, menu);
        }
    }

    public class f extends g {
        public final PowerManager c;

        public f(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.c.isPowerSaveMode()) ? 1 : 2;
        }

        public void d() {
            AppCompatDelegateImpl.this.z();
        }
    }

    public abstract class g {
        public BroadcastReceiver a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f46e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                AppCompatDelegateImpl.this.f46e.registerReceiver(this.a, b2);
            }
        }
    }

    public class h extends g {
        public final e.b.c.v c;

        public h(e.b.c.v vVar) {
            super();
            this.c = vVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c() {
            /*
                r22 = this;
                r0 = r22
                e.b.c.v r1 = r0.c
                e.b.c.v$a r2 = r1.c
                long r3 = r2.b
                long r5 = java.lang.System.currentTimeMillis()
                r7 = 0
                r8 = 1
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x0014
                r3 = 1
                goto L_0x0015
            L_0x0014:
                r3 = 0
            L_0x0015:
                if (r3 == 0) goto L_0x001b
            L_0x0017:
                boolean r1 = r2.a
                goto L_0x00ea
            L_0x001b:
                android.content.Context r3 = r1.a
                java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = e.b.a.b(r3, r4)
                r4 = 0
                if (r3 != 0) goto L_0x002d
                java.lang.String r3 = "network"
                android.location.Location r3 = r1.a(r3)
                goto L_0x002e
            L_0x002d:
                r3 = r4
            L_0x002e:
                android.content.Context r5 = r1.a
                java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
                int r5 = e.b.a.b(r5, r6)
                if (r5 != 0) goto L_0x003e
                java.lang.String r4 = "gps"
                android.location.Location r4 = r1.a(r4)
            L_0x003e:
                if (r4 == 0) goto L_0x004f
                if (r3 == 0) goto L_0x004f
                long r5 = r4.getTime()
                long r9 = r3.getTime()
                int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x0052
                goto L_0x0051
            L_0x004f:
                if (r4 == 0) goto L_0x0052
            L_0x0051:
                r3 = r4
            L_0x0052:
                if (r3 == 0) goto L_0x00d0
                e.b.c.v$a r1 = r1.c
                long r4 = java.lang.System.currentTimeMillis()
                e.b.c.u r6 = e.b.c.u.f946d
                if (r6 != 0) goto L_0x0065
                e.b.c.u r6 = new e.b.c.u
                r6.<init>()
                e.b.c.u.f946d = r6
            L_0x0065:
                e.b.c.u r6 = e.b.c.u.f946d
                r16 = 86400000(0x5265c00, double:4.2687272E-316)
                long r10 = r4 - r16
                double r12 = r3.getLatitude()
                double r14 = r3.getLongitude()
                r9 = r6
                r9.a(r10, r12, r14)
                double r12 = r3.getLatitude()
                double r14 = r3.getLongitude()
                r10 = r4
                r9.a(r10, r12, r14)
                int r9 = r6.c
                if (r9 != r8) goto L_0x0089
                r7 = 1
            L_0x0089:
                long r14 = r6.b
                long r12 = r6.a
                long r10 = r4 + r16
                double r16 = r3.getLatitude()
                double r18 = r3.getLongitude()
                r9 = r6
                r20 = r12
                r12 = r16
                r16 = r14
                r14 = r18
                r9.a(r10, r12, r14)
                long r9 = r6.b
                r11 = 0
                r13 = -1
                int r3 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
                if (r3 == 0) goto L_0x00c6
                int r3 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                if (r3 != 0) goto L_0x00b2
                goto L_0x00c6
            L_0x00b2:
                int r3 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r3 <= 0) goto L_0x00b8
                long r9 = r9 + r11
                goto L_0x00c1
            L_0x00b8:
                int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
                if (r3 <= 0) goto L_0x00bf
                long r9 = r20 + r11
                goto L_0x00c1
            L_0x00bf:
                long r9 = r16 + r11
            L_0x00c1:
                r3 = 60000(0xea60, double:2.9644E-319)
                long r9 = r9 + r3
                goto L_0x00ca
            L_0x00c6:
                r9 = 43200000(0x2932e00, double:2.1343636E-316)
                long r9 = r9 + r4
            L_0x00ca:
                r1.a = r7
                r1.b = r9
                goto L_0x0017
            L_0x00d0:
                java.lang.String r1 = "TwilightManager"
                java.lang.String r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
                android.util.Log.i(r1, r2)
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00e8
                r2 = 22
                if (r1 < r2) goto L_0x00e9
            L_0x00e8:
                r7 = 1
            L_0x00e9:
                r1 = r7
            L_0x00ea:
                if (r1 == 0) goto L_0x00ed
                r8 = 2
            L_0x00ed:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.h.c():int");
        }

        public void d() {
            AppCompatDelegateImpl.this.z();
        }
    }

    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context, (AttributeSet) null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.E(appCompatDelegateImpl.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(e.b.d.a.a.b(getContext(), i2));
        }
    }

    public final class j implements m.a {
        public j() {
        }

        public void a(e.b.g.i.g gVar, boolean z) {
            e.b.g.i.g k2 = gVar.k();
            boolean z2 = k2 != gVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                gVar = k2;
            }
            PanelFeatureState L = appCompatDelegateImpl.L(gVar);
            if (L == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.C(L.a, L, k2);
                AppCompatDelegateImpl.this.E(L, true);
                return;
            }
            AppCompatDelegateImpl.this.E(L, z);
        }

        public boolean b(e.b.g.i.g gVar) {
            Window.Callback O;
            if (gVar != gVar.k()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.z || (O = appCompatDelegateImpl.O()) == null || AppCompatDelegateImpl.this.Y) {
                return true;
            }
            O.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        boolean z2 = Build.VERSION.SDK_INT < 21;
        o0 = z2;
        if (z2 && !s0) {
            Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    public AppCompatDelegateImpl(Activity activity, k kVar) {
        this(activity, (Window) null, kVar, activity);
    }

    public AppCompatDelegateImpl(Dialog dialog, k kVar) {
        this(dialog.getContext(), dialog.getWindow(), kVar, dialog);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatDelegateImpl(android.content.Context r4, android.view.Window r5, e.b.c.k r6, java.lang.Object r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.s = r0
            r1 = -100
            r3.Z = r1
            androidx.appcompat.app.AppCompatDelegateImpl$b r2 = new androidx.appcompat.app.AppCompatDelegateImpl$b
            r2.<init>()
            r3.h0 = r2
            r3.f46e = r4
            r3.f49h = r6
            r3.f45d = r7
            boolean r6 = r7 instanceof android.app.Dialog
            if (r6 == 0) goto L_0x003c
        L_0x001b:
            if (r4 == 0) goto L_0x002f
            boolean r6 = r4 instanceof e.b.c.j
            if (r6 == 0) goto L_0x0024
            e.b.c.j r4 = (e.b.c.j) r4
            goto L_0x0030
        L_0x0024:
            boolean r6 = r4 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L_0x002f
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L_0x001b
        L_0x002f:
            r4 = r0
        L_0x0030:
            if (r4 == 0) goto L_0x003c
            e.b.c.l r4 = r4.o()
            int r4 = r4.f()
            r3.Z = r4
        L_0x003c:
            int r4 = r3.Z
            if (r4 != r1) goto L_0x0067
            e.d.g<java.lang.String, java.lang.Integer> r4 = n0
            java.lang.Object r6 = r3.f45d
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r4.getOrDefault(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0067
            int r6 = r6.intValue()
            r3.Z = r6
            java.lang.Object r6 = r3.f45d
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4.remove(r6)
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r3.B(r5)
        L_0x006c:
            e.b.h.i.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.<init>(android.content.Context, android.view.Window, e.b.c.k, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.Map} */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01f9, code lost:
        if (r1 != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01fe, code lost:
        if (r13.X != false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c8, code lost:
        if (e.e.b.d.b(r14) == false) goto L_0x00ca;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A(boolean r14) {
        /*
            r13 = this;
            boolean r0 = r13.Y
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r13.Z
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = -100
        L_0x000f:
            android.content.Context r2 = r13.f46e
            int r2 = r13.R(r2, r0)
            android.content.Context r3 = r13.f46e
            r4 = 0
            android.content.res.Configuration r2 = r13.F(r3, r2, r4)
            boolean r3 = r13.c0
            r5 = 24
            r6 = 1
            if (r3 != 0) goto L_0x006b
            java.lang.Object r3 = r13.f45d
            boolean r3 = r3 instanceof android.app.Activity
            if (r3 == 0) goto L_0x006b
            android.content.Context r3 = r13.f46e
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 != 0) goto L_0x0033
            r3 = 0
            goto L_0x006f
        L_0x0033:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0061 }
            r8 = 29
            if (r7 < r8) goto L_0x003c
            r7 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0042
        L_0x003c:
            if (r7 < r5) goto L_0x0041
            r7 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.Context r9 = r13.f46e     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.Object r10 = r13.f45d     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0061 }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 == 0) goto L_0x005d
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x0061 }
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            r13.b0 = r3     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x006b
        L_0x0061:
            r3 = move-exception
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r3)
            r13.b0 = r1
        L_0x006b:
            r13.c0 = r6
            boolean r3 = r13.b0
        L_0x006f:
            android.content.Context r7 = r13.f46e
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & 48
            int r2 = r2.uiMode
            r2 = r2 & 48
            r8 = 28
            r9 = 23
            if (r7 == r2) goto L_0x00cf
            if (r14 == 0) goto L_0x00cf
            if (r3 != 0) goto L_0x00cf
            boolean r14 = r13.V
            if (r14 == 0) goto L_0x00cf
            boolean r14 = q0
            if (r14 != 0) goto L_0x0097
            boolean r14 = r13.W
            if (r14 == 0) goto L_0x00cf
        L_0x0097:
            java.lang.Object r14 = r13.f45d
            boolean r10 = r14 instanceof android.app.Activity
            if (r10 == 0) goto L_0x00cf
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r14 = r14.isChild()
            if (r14 != 0) goto L_0x00cf
            java.lang.Object r14 = r13.f45d
            android.app.Activity r14 = (android.app.Activity) r14
            int r10 = e.e.b.a.b
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L_0x00b0
            goto L_0x00ca
        L_0x00b0:
            if (r10 > r9) goto L_0x00c4
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r11 = r14.getMainLooper()
            r10.<init>(r11)
            e.e.b.b r11 = new e.e.b.b
            r11.<init>(r14)
            r10.post(r11)
            goto L_0x00cd
        L_0x00c4:
            boolean r10 = e.e.b.d.b(r14)
            if (r10 != 0) goto L_0x00cd
        L_0x00ca:
            r14.recreate()
        L_0x00cd:
            r14 = 1
            goto L_0x00d0
        L_0x00cf:
            r14 = 0
        L_0x00d0:
            if (r14 != 0) goto L_0x0204
            if (r7 == r2) goto L_0x0204
            android.content.Context r14 = r13.f46e
            android.content.res.Resources r14 = r14.getResources()
            android.content.res.Configuration r7 = new android.content.res.Configuration
            android.content.res.Configuration r10 = r14.getConfiguration()
            r7.<init>(r10)
            android.content.res.Configuration r10 = r14.getConfiguration()
            int r10 = r10.uiMode
            r10 = r10 & -49
            r2 = r2 | r10
            r7.uiMode = r2
            r14.updateConfiguration(r7, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r2 >= r10) goto L_0x01bf
            if (r2 < r8) goto L_0x00fb
            goto L_0x01bf
        L_0x00fb:
            java.lang.String r8 = "mDrawableCache"
            java.lang.String r10 = "ResourcesFlusher"
            if (r2 < r5) goto L_0x0160
            boolean r2 = e.b.a.f928h
            if (r2 != 0) goto L_0x011b
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r5 = "mResourcesImpl"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x0113 }
            e.b.a.f927g = r2     // Catch:{ NoSuchFieldException -> 0x0113 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0113 }
            goto L_0x0119
        L_0x0113:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r10, r5, r2)
        L_0x0119:
            e.b.a.f928h = r6
        L_0x011b:
            java.lang.reflect.Field r2 = e.b.a.f927g
            if (r2 != 0) goto L_0x0121
            goto L_0x01bf
        L_0x0121:
            java.lang.Object r14 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x0126 }
            goto L_0x012d
        L_0x0126:
            r14 = move-exception
            java.lang.String r2 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r10, r2, r14)
            r14 = r4
        L_0x012d:
            if (r14 != 0) goto L_0x0131
            goto L_0x01bf
        L_0x0131:
            boolean r2 = e.b.a.b
            if (r2 != 0) goto L_0x014b
            java.lang.Class r2 = r14.getClass()     // Catch:{ NoSuchFieldException -> 0x0143 }
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0143 }
            e.b.a.a = r2     // Catch:{ NoSuchFieldException -> 0x0143 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0143 }
            goto L_0x0149
        L_0x0143:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r10, r5, r2)
        L_0x0149:
            e.b.a.b = r6
        L_0x014b:
            java.lang.reflect.Field r2 = e.b.a.a
            if (r2 == 0) goto L_0x015a
            java.lang.Object r4 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x0154 }
            goto L_0x015a
        L_0x0154:
            r14 = move-exception
            java.lang.String r2 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r10, r2, r14)
        L_0x015a:
            if (r4 == 0) goto L_0x01bf
            e.b.a.k(r4)
            goto L_0x01bf
        L_0x0160:
            java.lang.String r5 = "Could not retrieve Resources#mDrawableCache field"
            java.lang.String r11 = "Could not retrieve value from Resources#mDrawableCache"
            if (r2 < r9) goto L_0x0190
            boolean r2 = e.b.a.b
            if (r2 != 0) goto L_0x017c
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0176 }
            e.b.a.a = r2     // Catch:{ NoSuchFieldException -> 0x0176 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0176 }
            goto L_0x017a
        L_0x0176:
            r2 = move-exception
            android.util.Log.e(r10, r5, r2)
        L_0x017a:
            e.b.a.b = r6
        L_0x017c:
            java.lang.reflect.Field r2 = e.b.a.a
            if (r2 == 0) goto L_0x0189
            java.lang.Object r4 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x0185 }
            goto L_0x0189
        L_0x0185:
            r14 = move-exception
            android.util.Log.e(r10, r11, r14)
        L_0x0189:
            if (r4 != 0) goto L_0x018c
            goto L_0x01bf
        L_0x018c:
            e.b.a.k(r4)
            goto L_0x01bf
        L_0x0190:
            r12 = 21
            if (r2 < r12) goto L_0x01bf
            boolean r2 = e.b.a.b
            if (r2 != 0) goto L_0x01aa
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x01a4 }
            e.b.a.a = r2     // Catch:{ NoSuchFieldException -> 0x01a4 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x01a4 }
            goto L_0x01a8
        L_0x01a4:
            r2 = move-exception
            android.util.Log.e(r10, r5, r2)
        L_0x01a8:
            e.b.a.b = r6
        L_0x01aa:
            java.lang.reflect.Field r2 = e.b.a.a
            if (r2 == 0) goto L_0x01bf
            java.lang.Object r14 = r2.get(r14)     // Catch:{ IllegalAccessException -> 0x01b6 }
            java.util.Map r14 = (java.util.Map) r14     // Catch:{ IllegalAccessException -> 0x01b6 }
            r4 = r14
            goto L_0x01ba
        L_0x01b6:
            r14 = move-exception
            android.util.Log.e(r10, r11, r14)
        L_0x01ba:
            if (r4 == 0) goto L_0x01bf
            r4.clear()
        L_0x01bf:
            int r14 = r13.a0
            if (r14 == 0) goto L_0x01d7
            android.content.Context r2 = r13.f46e
            r2.setTheme(r14)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r9) goto L_0x01d7
            android.content.Context r14 = r13.f46e
            android.content.res.Resources$Theme r14 = r14.getTheme()
            int r2 = r13.a0
            r14.applyStyle(r2, r6)
        L_0x01d7:
            if (r3 == 0) goto L_0x0205
            java.lang.Object r14 = r13.f45d
            boolean r2 = r14 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0205
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r2 = r14 instanceof e.k.h
            if (r2 == 0) goto L_0x01fc
            r2 = r14
            e.k.h r2 = (e.k.h) r2
            e.k.e r2 = r2.getLifecycle()
            e.k.i r2 = (e.k.i) r2
            e.k.e$b r2 = r2.b
            e.k.e$b r3 = e.k.e.b.STARTED
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L_0x01f9
            r1 = 1
        L_0x01f9:
            if (r1 == 0) goto L_0x0205
            goto L_0x0200
        L_0x01fc:
            boolean r1 = r13.X
            if (r1 == 0) goto L_0x0205
        L_0x0200:
            r14.onConfigurationChanged(r7)
            goto L_0x0205
        L_0x0204:
            r6 = r14
        L_0x0205:
            if (r6 == 0) goto L_0x0212
            java.lang.Object r14 = r13.f45d
            boolean r1 = r14 instanceof e.b.c.j
            if (r1 == 0) goto L_0x0212
            e.b.c.j r14 = (e.b.c.j) r14
            r14.r()
        L_0x0212:
            if (r0 != 0) goto L_0x021e
            android.content.Context r14 = r13.f46e
            androidx.appcompat.app.AppCompatDelegateImpl$g r14 = r13.M(r14)
            r14.e()
            goto L_0x0225
        L_0x021e:
            androidx.appcompat.app.AppCompatDelegateImpl$g r14 = r13.d0
            if (r14 == 0) goto L_0x0225
            r14.a()
        L_0x0225:
            r14 = 3
            if (r0 != r14) goto L_0x023b
            android.content.Context r14 = r13.f46e
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = r13.e0
            if (r0 != 0) goto L_0x0235
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = new androidx.appcompat.app.AppCompatDelegateImpl$f
            r0.<init>(r14)
            r13.e0 = r0
        L_0x0235:
            androidx.appcompat.app.AppCompatDelegateImpl$g r14 = r13.e0
            r14.e()
            goto L_0x0242
        L_0x023b:
            androidx.appcompat.app.AppCompatDelegateImpl$g r14 = r13.e0
            if (r14 == 0) goto L_0x0242
            r14.a()
        L_0x0242:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.A(boolean):boolean");
    }

    public final void B(Window window) {
        if (this.f47f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e eVar = new e(callback);
                this.f48g = eVar;
                window.setCallback(eVar);
                x0 n2 = x0.n(this.f46e, (AttributeSet) null, p0);
                Drawable f2 = n2.f(0);
                if (f2 != null) {
                    window.setBackgroundDrawable(f2);
                }
                n2.b.recycle();
                this.f47f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void C(int i2, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null && panelFeatureState != null) {
            menu = panelFeatureState.f59h;
        }
        if ((panelFeatureState == null || panelFeatureState.f64m) && !this.Y) {
            this.f48g.b.onPanelClosed(i2, menu);
        }
    }

    public void D(e.b.g.i.g gVar) {
        if (!this.R) {
            this.R = true;
            this.f53l.l();
            Window.Callback O = O();
            if (O != null && !this.Y) {
                O.onPanelClosed(108, gVar);
            }
            this.R = false;
        }
    }

    public void E(PanelFeatureState panelFeatureState, boolean z2) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (!z2 || panelFeatureState.a != 0 || (c0Var = this.f53l) == null || !c0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f46e.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f64m || (viewGroup = panelFeatureState.f56e) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    C(panelFeatureState.a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f62k = false;
            panelFeatureState.f63l = false;
            panelFeatureState.f64m = false;
            panelFeatureState.f57f = null;
            panelFeatureState.o = true;
            if (this.T == panelFeatureState) {
                this.T = null;
                return;
            }
            return;
        }
        D(panelFeatureState.f59h);
    }

    public final Configuration F(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0123, code lost:
        if (r7 != false) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f45d
            boolean r1 = r0 instanceof e.e.j.e.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof e.b.c.r
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f47f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = e.e.j.e.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            androidx.appcompat.app.AppCompatDelegateImpl$e r0 = r6.f48g
            android.view.Window$Callback r0 = r0.b
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x012a
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.N(r4)
            boolean r1 = r0.f64m
            if (r1 != 0) goto L_0x012a
            r6.U(r0, r7)
            goto L_0x012a
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r6.U = r2
        L_0x0062:
            r2 = 0
            goto L_0x012a
        L_0x0065:
            if (r0 == r5) goto L_0x00ee
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            e.b.g.a r0 = r6.o
            if (r0 == 0) goto L_0x0070
            goto L_0x012a
        L_0x0070:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.N(r4)
            e.b.h.c0 r1 = r6.f53l
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.f46e
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            e.b.h.c0 r1 = r6.f53l
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.Y
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.U(r0, r7)
            if (r7 == 0) goto L_0x00ca
            e.b.h.c0 r7 = r6.f53l
            boolean r7 = r7.g()
            goto L_0x00d0
        L_0x00a3:
            e.b.h.c0 r7 = r6.f53l
            boolean r7 = r7.f()
            goto L_0x00d0
        L_0x00aa:
            boolean r1 = r0.f64m
            if (r1 != 0) goto L_0x00cc
            boolean r3 = r0.f63l
            if (r3 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.f62k
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.p
            if (r1 == 0) goto L_0x00c2
            r0.f62k = r4
            boolean r1 = r6.U(r0, r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = 1
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.S(r0, r7)
            r7 = 1
            goto L_0x00d0
        L_0x00ca:
            r7 = 0
            goto L_0x00d0
        L_0x00cc:
            r6.E(r0, r2)
            r7 = r1
        L_0x00d0:
            if (r7 == 0) goto L_0x012a
            android.content.Context r7 = r6.f46e
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e6
            r7.playSoundEffect(r4)
            goto L_0x012a
        L_0x00e6:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x012a
        L_0x00ee:
            boolean r7 = r6.U
            r6.U = r4
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.N(r4)
            boolean r1 = r0.f64m
            if (r1 == 0) goto L_0x0100
            if (r7 != 0) goto L_0x012a
            r6.E(r0, r2)
            goto L_0x012a
        L_0x0100:
            e.b.g.a r7 = r6.o
            if (r7 == 0) goto L_0x0108
            r7.c()
            goto L_0x0125
        L_0x0108:
            r6.P()
            e.b.c.a r7 = r6.f50i
            if (r7 == 0) goto L_0x0127
            e.b.c.w r7 = (e.b.c.w) r7
            e.b.h.d0 r0 = r7.f949e
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0122
            e.b.h.d0 r7 = r7.f949e
            r7.collapseActionView()
            r7 = 1
            goto L_0x0123
        L_0x0122:
            r7 = 0
        L_0x0123:
            if (r7 == 0) goto L_0x0127
        L_0x0125:
            r7 = 1
            goto L_0x0128
        L_0x0127:
            r7 = 0
        L_0x0128:
            if (r7 == 0) goto L_0x0062
        L_0x012a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.G(android.view.KeyEvent):boolean");
    }

    public void H(int i2) {
        PanelFeatureState N = N(i2);
        if (N.f59h != null) {
            Bundle bundle = new Bundle();
            N.f59h.w(bundle);
            if (bundle.size() > 0) {
                N.q = bundle;
            }
            N.f59h.z();
            N.f59h.clear();
        }
        N.p = true;
        N.o = true;
        if ((i2 == 108 || i2 == 0) && this.f53l != null) {
            PanelFeatureState N2 = N(0);
            N2.f62k = false;
            U(N2, (KeyEvent) null);
        }
    }

    public void I() {
        e.e.j.t tVar = this.s;
        if (tVar != null) {
            tVar.b();
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        if (!this.t) {
            TypedArray obtainStyledAttributes = this.f46e.obtainStyledAttributes(e.b.b.f935j);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    t(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    t(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    t(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    t(10);
                }
                this.C = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                K();
                this.f47f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f46e);
                if (this.Q) {
                    viewGroup = (ViewGroup) from.inflate(this.B ? 2131492886 : 2131492885, (ViewGroup) null);
                } else if (this.C) {
                    viewGroup = (ViewGroup) from.inflate(2131492876, (ViewGroup) null);
                    this.A = false;
                    this.z = false;
                } else if (this.z) {
                    TypedValue typedValue = new TypedValue();
                    this.f46e.getTheme().resolveAttribute(2130968589, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new e.b.g.c(this.f46e, typedValue.resourceId) : this.f46e).inflate(2131492887, (ViewGroup) null);
                    c0 c0Var = (c0) viewGroup.findViewById(2131296717);
                    this.f53l = c0Var;
                    c0Var.setWindowCallback(O());
                    if (this.A) {
                        this.f53l.k(109);
                    }
                    if (this.x) {
                        this.f53l.k(2);
                    }
                    if (this.y) {
                        this.f53l.k(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 21) {
                        e.b.c.m mVar = new e.b.c.m(this);
                        WeakHashMap<View, String> weakHashMap = q.a;
                        if (i2 >= 21) {
                            e.e.i.b.P(viewGroup, mVar);
                        }
                    } else if (viewGroup instanceof g0) {
                        ((g0) viewGroup).setOnFitSystemWindowsListener(new n(this));
                    }
                    if (this.f53l == null) {
                        this.v = (TextView) viewGroup.findViewById(2131297689);
                    }
                    Method method = d1.a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296323);
                    ViewGroup viewGroup2 = (ViewGroup) this.f47f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f47f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new o(this));
                    this.u = viewGroup;
                    Object obj = this.f45d;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f52k;
                    if (!TextUtils.isEmpty(title)) {
                        c0 c0Var2 = this.f53l;
                        if (c0Var2 != null) {
                            c0Var2.setWindowTitle(title);
                        } else {
                            e.b.c.a aVar = this.f50i;
                            if (aVar != null) {
                                ((w) aVar).f949e.setWindowTitle(title);
                            } else {
                                TextView textView = this.v;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.u.findViewById(16908290);
                    View decorView = this.f47f.getDecorView();
                    contentFrameLayout2.f133h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, String> weakHashMap2 = q.a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f46e.obtainStyledAttributes(e.b.b.f935j);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.t = true;
                    PanelFeatureState N = N(0);
                    if (!this.Y && N.f59h == null) {
                        Q(108);
                        return;
                    }
                    return;
                }
                StringBuilder i3 = g.a.a.a.a.i("AppCompat does not support the current theme features: { windowActionBar: ");
                i3.append(this.z);
                i3.append(", windowActionBarOverlay: ");
                i3.append(this.A);
                i3.append(", android:windowIsFloating: ");
                i3.append(this.C);
                i3.append(", windowActionModeOverlay: ");
                i3.append(this.B);
                i3.append(", windowNoTitle: ");
                i3.append(this.Q);
                i3.append(" }");
                throw new IllegalArgumentException(i3.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void K() {
        if (this.f47f == null) {
            Object obj = this.f45d;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.f47f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public PanelFeatureState L(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.S;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
            if (panelFeatureState != null && panelFeatureState.f59h == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    public final g M(Context context) {
        if (this.d0 == null) {
            if (e.b.c.v.f947d == null) {
                Context applicationContext = context.getApplicationContext();
                e.b.c.v.f947d = new e.b.c.v(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.d0 = new h(e.b.c.v.f947d);
        }
        return this.d0;
    }

    public PanelFeatureState N(int i2) {
        PanelFeatureState[] panelFeatureStateArr = this.S;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i2) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i2 + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.S = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i2];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i2);
        panelFeatureStateArr[i2] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final Window.Callback O() {
        return this.f47f.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P() {
        /*
            r3 = this;
            r3.J()
            boolean r0 = r3.z
            if (r0 == 0) goto L_0x0037
            e.b.c.a r0 = r3.f50i
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f45d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            e.b.c.w r0 = new e.b.c.w
            java.lang.Object r1 = r3.f45d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.A
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f50i = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            e.b.c.w r0 = new e.b.c.w
            java.lang.Object r1 = r3.f45d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            e.b.c.a r0 = r3.f50i
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.i0
            r0.c(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.P():void");
    }

    public final void Q(int i2) {
        this.g0 = (1 << i2) | this.g0;
        if (!this.f0) {
            View decorView = this.f47f.getDecorView();
            Runnable runnable = this.h0;
            WeakHashMap<View, String> weakHashMap = q.a;
            decorView.postOnAnimation(runnable);
            this.f0 = true;
        }
    }

    public int R(Context context, int i2) {
        g M;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        if (this.e0 == null) {
                            this.e0 = new f(context);
                        }
                        M = this.e0;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                M = M(context);
            }
            return M.c();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0154, code lost:
        if (r14 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f64m
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r12.Y
            if (r0 == 0) goto L_0x000a
            goto L_0x01d5
        L_0x000a:
            int r0 = r13.a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f46e
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.O()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.a
            e.b.g.i.g r4 = r13.f59h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.E(r13, r1)
            return
        L_0x003b:
            android.content.Context r0 = r12.f46e
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.U(r13, r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f56e
            r3 = -2
            r4 = -1
            if (r14 == 0) goto L_0x006b
            boolean r5 = r13.o
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r14 = r13.f58g
            if (r14 == 0) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x01b2
            int r14 = r14.width
            if (r14 != r4) goto L_0x01b2
            r5 = -1
            goto L_0x01b3
        L_0x006b:
            if (r14 != 0) goto L_0x00e3
            r12.P()
            e.b.c.a r14 = r12.f50i
            if (r14 == 0) goto L_0x0079
            android.content.Context r14 = r14.b()
            goto L_0x007a
        L_0x0079:
            r14 = 0
        L_0x007a:
            if (r14 != 0) goto L_0x007e
            android.content.Context r14 = r12.f46e
        L_0x007e:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r14.getTheme()
            r5.setTo(r6)
            r6 = 2130968582(0x7f040006, float:1.7545822E38)
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x009f
            r5.applyStyle(r6, r1)
        L_0x009f:
            r6 = 2130969390(0x7f04032e, float:1.754746E38)
            r5.resolveAttribute(r6, r4, r1)
            int r4 = r4.resourceId
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r4 = 2131886522(0x7f1201ba, float:1.9407625E38)
        L_0x00ad:
            r5.applyStyle(r4, r1)
            e.b.g.c r4 = new e.b.g.c
            r4.<init>((android.content.Context) r14, (int) r2)
            android.content.res.Resources$Theme r14 = r4.getTheme()
            r14.setTo(r5)
            r13.f61j = r4
            int[] r14 = e.b.b.f935j
            android.content.res.TypedArray r14 = r4.obtainStyledAttributes(r14)
            r4 = 86
            int r4 = r14.getResourceId(r4, r2)
            r13.b = r4
            int r4 = r14.getResourceId(r1, r2)
            r13.f55d = r4
            r14.recycle()
            androidx.appcompat.app.AppCompatDelegateImpl$i r14 = new androidx.appcompat.app.AppCompatDelegateImpl$i
            android.content.Context r4 = r13.f61j
            r14.<init>(r4)
            r13.f56e = r14
            r14 = 81
            r13.c = r14
            goto L_0x00f2
        L_0x00e3:
            boolean r4 = r13.o
            if (r4 == 0) goto L_0x00f2
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00f2
            android.view.ViewGroup r14 = r13.f56e
            r14.removeAllViews()
        L_0x00f2:
            android.view.View r14 = r13.f58g
            if (r14 == 0) goto L_0x00f9
            r13.f57f = r14
            goto L_0x0156
        L_0x00f9:
            e.b.g.i.g r14 = r13.f59h
            if (r14 != 0) goto L_0x00fe
            goto L_0x0158
        L_0x00fe:
            androidx.appcompat.app.AppCompatDelegateImpl$j r14 = r12.n
            if (r14 != 0) goto L_0x0109
            androidx.appcompat.app.AppCompatDelegateImpl$j r14 = new androidx.appcompat.app.AppCompatDelegateImpl$j
            r14.<init>()
            r12.n = r14
        L_0x0109:
            androidx.appcompat.app.AppCompatDelegateImpl$j r14 = r12.n
            e.b.g.i.e r4 = r13.f60i
            if (r4 != 0) goto L_0x0124
            e.b.g.i.e r4 = new e.b.g.i.e
            android.content.Context r5 = r13.f61j
            r6 = 2131492880(0x7f0c0010, float:1.8609224E38)
            r4.<init>(r5, r6)
            r13.f60i = r4
            r4.f1038f = r14
            e.b.g.i.g r14 = r13.f59h
            android.content.Context r5 = r14.a
            r14.b(r4, r5)
        L_0x0124:
            e.b.g.i.e r14 = r13.f60i
            android.view.ViewGroup r4 = r13.f56e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r14.f1037e
            if (r5 != 0) goto L_0x0150
            android.view.LayoutInflater r5 = r14.c
            r6 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r4 = r5.inflate(r6, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r14.f1037e = r4
            e.b.g.i.e$a r4 = r14.f1039g
            if (r4 != 0) goto L_0x0144
            e.b.g.i.e$a r4 = new e.b.g.i.e$a
            r4.<init>()
            r14.f1039g = r4
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f1037e
            e.b.g.i.e$a r5 = r14.f1039g
            r4.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f1037e
            r4.setOnItemClickListener(r14)
        L_0x0150:
            androidx.appcompat.view.menu.ExpandedMenuView r14 = r14.f1037e
            r13.f57f = r14
            if (r14 == 0) goto L_0x0158
        L_0x0156:
            r14 = 1
            goto L_0x0159
        L_0x0158:
            r14 = 0
        L_0x0159:
            if (r14 == 0) goto L_0x01d3
            android.view.View r14 = r13.f57f
            if (r14 != 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            android.view.View r14 = r13.f58g
            if (r14 == 0) goto L_0x0165
            goto L_0x0173
        L_0x0165:
            e.b.g.i.e r14 = r13.f60i
            android.widget.ListAdapter r14 = r14.b()
            e.b.g.i.e$a r14 = (e.b.g.i.e.a) r14
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x0175
        L_0x0173:
            r14 = 1
            goto L_0x0176
        L_0x0175:
            r14 = 0
        L_0x0176:
            if (r14 != 0) goto L_0x0179
            goto L_0x01d3
        L_0x0179:
            android.view.View r14 = r13.f57f
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x0186:
            int r4 = r13.b
            android.view.ViewGroup r5 = r13.f56e
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f57f
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x019e
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f57f
            r4.removeView(r5)
        L_0x019e:
            android.view.ViewGroup r4 = r13.f56e
            android.view.View r5 = r13.f57f
            r4.addView(r5, r14)
            android.view.View r14 = r13.f57f
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x01b2
            android.view.View r14 = r13.f57f
            r14.requestFocus()
        L_0x01b2:
            r5 = -2
        L_0x01b3:
            r13.f63l = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            r7 = 0
            r8 = 0
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.c
            r14.gravity = r2
            int r2 = r13.f55d
            r14.windowAnimations = r2
            android.view.ViewGroup r2 = r13.f56e
            r0.addView(r2, r14)
            r13.f64m = r1
            return
        L_0x01d3:
            r13.o = r1
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.S(androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState, android.view.KeyEvent):void");
    }

    public final boolean T(PanelFeatureState panelFeatureState, int i2, KeyEvent keyEvent, int i3) {
        e.b.g.i.g gVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f62k || U(panelFeatureState, keyEvent)) && (gVar = panelFeatureState.f59h) != null) {
            z2 = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.f53l == null) {
            E(panelFeatureState, true);
        }
        return z2;
    }

    public final boolean U(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        c0 c0Var;
        c0 c0Var2;
        c0 c0Var3;
        Resources.Theme theme;
        c0 c0Var4;
        if (this.Y) {
            return false;
        }
        if (panelFeatureState.f62k) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.T;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            E(panelFeatureState2, false);
        }
        Window.Callback O = O();
        if (O != null) {
            panelFeatureState.f58g = O.onCreatePanelView(panelFeatureState.a);
        }
        int i2 = panelFeatureState.a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (c0Var4 = this.f53l) != null) {
            c0Var4.d();
        }
        if (panelFeatureState.f58g == null) {
            e.b.g.i.g gVar = panelFeatureState.f59h;
            if (gVar == null || panelFeatureState.p) {
                if (gVar == null) {
                    Context context = this.f46e;
                    int i3 = panelFeatureState.a;
                    if ((i3 == 0 || i3 == 108) && this.f53l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(2130968589, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(2130968590, typedValue, true);
                        } else {
                            theme2.resolveAttribute(2130968590, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            e.b.g.c cVar = new e.b.g.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    e.b.g.i.g gVar2 = new e.b.g.i.g(context);
                    gVar2.f1045e = this;
                    panelFeatureState.a(gVar2);
                    if (panelFeatureState.f59h == null) {
                        return false;
                    }
                }
                if (z2 && (c0Var3 = this.f53l) != null) {
                    if (this.f54m == null) {
                        this.f54m = new c();
                    }
                    c0Var3.a(panelFeatureState.f59h, this.f54m);
                }
                panelFeatureState.f59h.z();
                if (!O.onCreatePanelMenu(panelFeatureState.a, panelFeatureState.f59h)) {
                    panelFeatureState.a((e.b.g.i.g) null);
                    if (z2 && (c0Var2 = this.f53l) != null) {
                        c0Var2.a((Menu) null, this.f54m);
                    }
                    return false;
                }
                panelFeatureState.p = false;
            }
            panelFeatureState.f59h.z();
            Bundle bundle = panelFeatureState.q;
            if (bundle != null) {
                panelFeatureState.f59h.v(bundle);
                panelFeatureState.q = null;
            }
            if (!O.onPreparePanel(0, panelFeatureState.f58g, panelFeatureState.f59h)) {
                if (z2 && (c0Var = this.f53l) != null) {
                    c0Var.a((Menu) null, this.f54m);
                }
                panelFeatureState.f59h.y();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.n = z3;
            panelFeatureState.f59h.setQwertyMode(z3);
            panelFeatureState.f59h.y();
        }
        panelFeatureState.f62k = true;
        panelFeatureState.f63l = false;
        this.T = panelFeatureState;
        return true;
    }

    public final boolean V() {
        ViewGroup viewGroup;
        if (this.t && (viewGroup = this.u) != null) {
            WeakHashMap<View, String> weakHashMap = q.a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int X(x xVar, Rect rect) {
        boolean z2;
        boolean z3;
        int i2;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4 = 0;
        int d2 = xVar != null ? xVar.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            boolean z4 = true;
            if (this.p.isShown()) {
                if (this.j0 == null) {
                    this.j0 = new Rect();
                    this.k0 = new Rect();
                }
                Rect rect2 = this.j0;
                Rect rect3 = this.k0;
                if (xVar == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(xVar.b(), xVar.d(), xVar.c(), xVar.a());
                }
                d1.a(this.u, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                x g2 = q.g(this.u);
                int b2 = g2 == null ? 0 : g2.b();
                int c2 = g2 == null ? 0 : g2.c();
                if (marginLayoutParams2.topMargin == i5 && marginLayoutParams2.leftMargin == i6 && marginLayoutParams2.rightMargin == i7) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i5;
                    marginLayoutParams2.leftMargin = i6;
                    marginLayoutParams2.rightMargin = i7;
                    z3 = true;
                }
                if (i5 <= 0 || this.w != null) {
                    View view = this.w;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i3 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == b2 && marginLayoutParams.rightMargin == c2))) {
                        marginLayoutParams.height = i3;
                        marginLayoutParams.leftMargin = b2;
                        marginLayoutParams.rightMargin = c2;
                        this.w.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f46e);
                    this.w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    this.u.addView(this.w, -1, layoutParams);
                }
                View view3 = this.w;
                z2 = view3 != null;
                if (z2 && view3.getVisibility() != 0) {
                    View view4 = this.w;
                    WeakHashMap<View, String> weakHashMap = q.a;
                    if ((view4.getWindowSystemUiVisibility() & 8192) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        context = this.f46e;
                        i2 = 2131099654;
                    } else {
                        context = this.f46e;
                        i2 = 2131099653;
                    }
                    view4.setBackgroundColor(e.e.c.a.b(context, i2));
                }
                if (!this.B && z2) {
                    d2 = 0;
                }
                z4 = z3;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z2 = false;
            } else {
                z2 = false;
                z4 = false;
            }
            if (z4) {
                this.p.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.w;
        if (view5 != null) {
            if (!z2) {
                i4 = 8;
            }
            view5.setVisibility(i4);
        }
        return d2;
    }

    public boolean a(e.b.g.i.g gVar, MenuItem menuItem) {
        PanelFeatureState L;
        Window.Callback O = O();
        if (O == null || this.Y || (L = L(gVar.k())) == null) {
            return false;
        }
        return O.onMenuItemSelected(L.a, menuItem);
    }

    public void b(e.b.g.i.g gVar) {
        c0 c0Var = this.f53l;
        if (c0Var == null || !c0Var.h() || (ViewConfiguration.get(this.f46e).hasPermanentMenuKey() && !this.f53l.e())) {
            PanelFeatureState N = N(0);
            N.o = true;
            E(N, false);
            S(N, (KeyEvent) null);
            return;
        }
        Window.Callback O = O();
        if (this.f53l.b()) {
            this.f53l.f();
            if (!this.Y) {
                O.onPanelClosed(108, N(0).f59h);
            }
        } else if (O != null && !this.Y) {
            if (this.f0 && (1 & this.g0) != 0) {
                this.f47f.getDecorView().removeCallbacks(this.h0);
                this.h0.run();
            }
            PanelFeatureState N2 = N(0);
            e.b.g.i.g gVar2 = N2.f59h;
            if (gVar2 != null && !N2.p && O.onPreparePanel(0, N2.f58g, gVar2)) {
                O.onMenuOpened(108, N2.f59h);
                this.f53l.g();
            }
        }
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.u.findViewById(16908290)).addView(view, layoutParams);
        this.f48g.b.onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context d(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            r9.V = r0
            int r1 = r9.Z
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            r1 = -100
        L_0x000c:
            int r1 = r9.R(r10, r1)
            boolean r2 = r0
            r3 = 0
            if (r2 == 0) goto L_0x0025
            boolean r2 = r10 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0025
            android.content.res.Configuration r2 = r9.F(r10, r1, r3)
            r4 = r10
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0024 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0024 }
            return r10
        L_0x0024:
        L_0x0025:
            boolean r2 = r10 instanceof e.b.g.c
            if (r2 == 0) goto L_0x0035
            android.content.res.Configuration r2 = r9.F(r10, r1, r3)
            r4 = r10
            e.b.g.c r4 = (e.b.g.c) r4     // Catch:{ IllegalStateException -> 0x0034 }
            r4.a(r2)     // Catch:{ IllegalStateException -> 0x0034 }
            return r10
        L_0x0034:
        L_0x0035:
            boolean r2 = q0
            if (r2 != 0) goto L_0x003a
            return r10
        L_0x003a:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>()
            r5 = -1
            r4.uiMode = r5
            r5 = 0
            r4.fontScale = r5
            android.content.Context r4 = r10.createConfigurationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r4.uiMode = r7
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L_0x0183
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r5
            int r5 = r4.diff(r6)
            if (r5 != 0) goto L_0x0074
            goto L_0x0184
        L_0x0074:
            float r5 = r4.fontScale
            float r8 = r6.fontScale
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x007e
            r7.fontScale = r8
        L_0x007e:
            int r5 = r4.mcc
            int r8 = r6.mcc
            if (r5 == r8) goto L_0x0086
            r7.mcc = r8
        L_0x0086:
            int r5 = r4.mnc
            int r8 = r6.mnc
            if (r5 == r8) goto L_0x008e
            r7.mnc = r8
        L_0x008e:
            r5 = 24
            if (r2 < r5) goto L_0x00a8
            android.os.LocaleList r5 = r4.getLocales()
            android.os.LocaleList r8 = r6.getLocales()
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00b6
            r7.setLocales(r8)
            java.util.Locale r5 = r6.locale
            r7.locale = r5
            goto L_0x00b6
        L_0x00a8:
            java.util.Locale r5 = r4.locale
            java.util.Locale r8 = r6.locale
            boolean r5 = java.util.Objects.equals(r5, r8)
            if (r5 != 0) goto L_0x00b6
            java.util.Locale r5 = r6.locale
            r7.locale = r5
        L_0x00b6:
            int r5 = r4.touchscreen
            int r8 = r6.touchscreen
            if (r5 == r8) goto L_0x00be
            r7.touchscreen = r8
        L_0x00be:
            int r5 = r4.keyboard
            int r8 = r6.keyboard
            if (r5 == r8) goto L_0x00c6
            r7.keyboard = r8
        L_0x00c6:
            int r5 = r4.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r5 == r8) goto L_0x00ce
            r7.keyboardHidden = r8
        L_0x00ce:
            int r5 = r4.navigation
            int r8 = r6.navigation
            if (r5 == r8) goto L_0x00d6
            r7.navigation = r8
        L_0x00d6:
            int r5 = r4.navigationHidden
            int r8 = r6.navigationHidden
            if (r5 == r8) goto L_0x00de
            r7.navigationHidden = r8
        L_0x00de:
            int r5 = r4.orientation
            int r8 = r6.orientation
            if (r5 == r8) goto L_0x00e6
            r7.orientation = r8
        L_0x00e6:
            int r5 = r4.screenLayout
            r5 = r5 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r5 == r8) goto L_0x00f5
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00f5:
            int r5 = r4.screenLayout
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r5 == r8) goto L_0x0104
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x0104:
            int r5 = r4.screenLayout
            r5 = r5 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r5 == r8) goto L_0x0113
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x0113:
            int r5 = r4.screenLayout
            r5 = r5 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r5 == r8) goto L_0x0122
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x0122:
            r5 = 26
            if (r2 < r5) goto L_0x0144
            int r2 = r4.colorMode
            r2 = r2 & 3
            int r5 = r6.colorMode
            r5 = r5 & 3
            if (r2 == r5) goto L_0x0135
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x0135:
            int r2 = r4.colorMode
            r2 = r2 & 12
            int r5 = r6.colorMode
            r5 = r5 & 12
            if (r2 == r5) goto L_0x0144
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x0144:
            int r2 = r4.uiMode
            r2 = r2 & 15
            int r5 = r6.uiMode
            r5 = r5 & 15
            if (r2 == r5) goto L_0x0153
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0153:
            int r2 = r4.uiMode
            r2 = r2 & 48
            int r5 = r6.uiMode
            r5 = r5 & 48
            if (r2 == r5) goto L_0x0162
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0162:
            int r2 = r4.screenWidthDp
            int r5 = r6.screenWidthDp
            if (r2 == r5) goto L_0x016a
            r7.screenWidthDp = r5
        L_0x016a:
            int r2 = r4.screenHeightDp
            int r5 = r6.screenHeightDp
            if (r2 == r5) goto L_0x0172
            r7.screenHeightDp = r5
        L_0x0172:
            int r2 = r4.smallestScreenWidthDp
            int r5 = r6.smallestScreenWidthDp
            if (r2 == r5) goto L_0x017a
            r7.smallestScreenWidthDp = r5
        L_0x017a:
            int r2 = r4.densityDpi
            int r4 = r6.densityDpi
            if (r2 == r4) goto L_0x0184
            r7.densityDpi = r4
            goto L_0x0184
        L_0x0183:
            r7 = r3
        L_0x0184:
            android.content.res.Configuration r1 = r9.F(r10, r1, r7)
            e.b.g.c r2 = new e.b.g.c
            r4 = 2131886534(0x7f1201c6, float:1.940765E38)
            r2.<init>((android.content.Context) r10, (int) r4)
            r2.a(r1)
            r1 = 0
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ NullPointerException -> 0x019c }
            if (r10 == 0) goto L_0x019c
            r10 = 1
            goto L_0x019d
        L_0x019c:
            r10 = 0
        L_0x019d:
            if (r10 == 0) goto L_0x01ed
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x01ad
            e.b.a.t(r10)
            goto L_0x01ed
        L_0x01ad:
            r5 = 23
            if (r4 < r5) goto L_0x01ed
            java.lang.Object r4 = e.e.c.c.h.a.a
            monitor-enter(r4)
            boolean r5 = e.e.c.c.h.a.c     // Catch:{ all -> 0x01ea }
            if (r5 != 0) goto L_0x01d2
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x01c8 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            e.e.c.c.h.a.b = r5     // Catch:{ NoSuchMethodException -> 0x01c8 }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            goto L_0x01d0
        L_0x01c8:
            r5 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x01ea }
        L_0x01d0:
            e.e.c.c.h.a.c = r0     // Catch:{ all -> 0x01ea }
        L_0x01d2:
            java.lang.reflect.Method r0 = e.e.c.c.h.a.b     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x01e8
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            r0.invoke(r10, r1)     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            goto L_0x01e8
        L_0x01dc:
            r10 = move-exception
            goto L_0x01df
        L_0x01de:
            r10 = move-exception
        L_0x01df:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r1, r10)     // Catch:{ all -> 0x01ea }
            e.e.c.c.h.a.b = r3     // Catch:{ all -> 0x01ea }
        L_0x01e8:
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            goto L_0x01ed
        L_0x01ea:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            throw r10
        L_0x01ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.d(android.content.Context):android.content.Context");
    }

    public <T extends View> T e(int i2) {
        J();
        return this.f47f.findViewById(i2);
    }

    public int f() {
        return this.Z;
    }

    public MenuInflater g() {
        if (this.f51j == null) {
            P();
            e.b.c.a aVar = this.f50i;
            this.f51j = new e.b.g.f(aVar != null ? aVar.b() : this.f46e);
        }
        return this.f51j;
    }

    public e.b.c.a h() {
        P();
        return this.f50i;
    }

    public void i() {
        LayoutInflater from = LayoutInflater.from(this.f46e);
        if (from.getFactory() == null) {
            e.e.f.b.u(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void j() {
        P();
        e.b.c.a aVar = this.f50i;
        Q(0);
    }

    public void k(Configuration configuration) {
        if (this.z && this.t) {
            P();
            e.b.c.a aVar = this.f50i;
            if (aVar != null) {
                w wVar = (w) aVar;
                wVar.f(wVar.a.getResources().getBoolean(2131034112));
            }
        }
        e.b.h.i a2 = e.b.h.i.a();
        Context context = this.f46e;
        synchronized (a2) {
            n0 n0Var = a2.a;
            synchronized (n0Var) {
                e.d.d dVar = n0Var.f1172d.get(context);
                if (dVar != null) {
                    int i2 = dVar.f1245e;
                    Object[] objArr = dVar.f1244d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        objArr[i3] = null;
                    }
                    dVar.f1245e = 0;
                    dVar.b = false;
                }
            }
        }
        A(false);
    }

    public void l(Bundle bundle) {
        this.V = true;
        A(false);
        K();
        Object obj = this.f45d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = e.b.a.n(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                e.b.c.a aVar = this.f50i;
                if (aVar == null) {
                    this.i0 = true;
                } else {
                    aVar.c(true);
                }
            }
            synchronized (l.c) {
                l.s(this);
                l.b.add(new WeakReference(this));
            }
        }
        this.W = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f45d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = e.b.c.l.c
            monitor-enter(r0)
            e.b.c.l.s(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f47f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.h0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 0
            r3.X = r0
            r0 = 1
            r3.Y = r0
            int r0 = r3.Z
            r1 = -100
            if (r0 == r1) goto L_0x0050
            java.lang.Object r0 = r3.f45d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0050
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0050
            e.d.g<java.lang.String, java.lang.Integer> r0 = n0
            java.lang.Object r1 = r3.f45d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.Z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005f
        L_0x0050:
            e.d.g<java.lang.String, java.lang.Integer> r0 = n0
            java.lang.Object r1 = r3.f45d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005f:
            e.b.c.a r0 = r3.f50i
            if (r0 == 0) goto L_0x0066
            java.util.Objects.requireNonNull(r0)
        L_0x0066:
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = r3.d0
            if (r0 == 0) goto L_0x006d
            r0.a()
        L_0x006d:
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = r3.e0
            if (r0 == 0) goto L_0x0074
            r0.a()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m():void");
    }

    public void n(Bundle bundle) {
        J();
    }

    public void o() {
        P();
        e.b.c.a aVar = this.f50i;
        if (aVar != null) {
            ((w) aVar).u = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v74, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v75, resolved type: e.b.h.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v76, resolved type: e.b.h.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v77, resolved type: e.b.h.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v78, resolved type: e.b.h.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v79, resolved type: e.b.h.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v80, resolved type: e.b.h.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v81, resolved type: androidx.appcompat.widget.AppCompatSpinner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v82, resolved type: e.b.h.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v83, resolved type: e.b.h.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v84, resolved type: e.b.h.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v85, resolved type: e.b.h.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v86, resolved type: e.b.h.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v87, resolved type: e.b.h.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v88, resolved type: e.b.h.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: org.xmlpull.v1.XmlPullParser} */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r0v10, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r7v4, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01eb, code lost:
        if (r2.equals("TextView") == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r3).getDepth() > 1) goto L_0x00ee;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x020f A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0293 A[Catch:{ Exception -> 0x02c7, all -> 0x02bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02b3 A[SYNTHETIC, Splitter:B:164:0x02b3] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x00ab A[EDGE_INSN: B:183:0x00ab->B:35:0x00ab ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[LOOP:0: B:20:0x0080->B:33:0x00a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x018f  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r17, java.lang.String r18, android.content.Context r19, android.util.AttributeSet r20) {
        /*
            r16 = this;
            r1 = r16
            r2 = r18
            r3 = r20
            e.b.c.s r0 = r1.l0
            r4 = 0
            if (r0 != 0) goto L_0x0059
            android.content.Context r0 = r1.f46e
            int[] r5 = e.b.b.f935j
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r5)
            r5 = 116(0x74, float:1.63E-43)
            java.lang.String r5 = r0.getString(r5)
            if (r5 != 0) goto L_0x0021
            e.b.c.s r0 = new e.b.c.s
            r0.<init>()
            goto L_0x0057
        L_0x0021:
            java.lang.Class r0 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x0036 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x0036 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r6)     // Catch:{ all -> 0x0036 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.newInstance(r6)     // Catch:{ all -> 0x0036 }
            e.b.c.s r0 = (e.b.c.s) r0     // Catch:{ all -> 0x0036 }
            r1.l0 = r0     // Catch:{ all -> 0x0036 }
            goto L_0x0059
        L_0x0036:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to instantiate custom view inflater "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = ". Falling back to default."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "AppCompatDelegate"
            android.util.Log.i(r6, r5, r0)
            e.b.c.s r0 = new e.b.c.s
            r0.<init>()
        L_0x0057:
            r1.l0 = r0
        L_0x0059:
            boolean r0 = o0
            r5 = 3
            r6 = 0
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0107
            e.b.c.t r0 = r1.m0
            if (r0 != 0) goto L_0x006c
            e.b.c.t r0 = new e.b.c.t
            r0.<init>()
            r1.m0 = r0
        L_0x006c:
            e.b.c.t r0 = r1.m0
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r3 instanceof org.xmlpull.v1.XmlPullParser
            if (r9 == 0) goto L_0x00cf
            r10 = r3
            org.xmlpull.v1.XmlPullParser r10 = (org.xmlpull.v1.XmlPullParser) r10
            int r11 = r10.getDepth()
            if (r11 != r8) goto L_0x00cf
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r11 = r0.a
        L_0x0080:
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x00aa
            java.lang.Object r12 = r11.peek()
            java.lang.ref.WeakReference r12 = (java.lang.ref.WeakReference) r12
            java.lang.Object r12 = r12.get()
            org.xmlpull.v1.XmlPullParser r12 = (org.xmlpull.v1.XmlPullParser) r12
            if (r12 == 0) goto L_0x00a3
            int r13 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x00a3 }
            if (r13 == r5) goto L_0x00a3
            int r13 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x00a3 }
            if (r13 != r8) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r13 = 0
            goto L_0x00a4
        L_0x00a3:
            r13 = 1
        L_0x00a4:
            if (r13 == 0) goto L_0x00ab
            r11.pop()
            goto L_0x0080
        L_0x00aa:
            r12 = r6
        L_0x00ab:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r0.a
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            r11.<init>(r10)
            r0.push(r11)
            if (r12 == 0) goto L_0x00ca
            if (r10 == r12) goto L_0x00ca
            int r0 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x00ca }
            if (r0 != r7) goto L_0x00ca
            java.lang.String r0 = "include"
            java.lang.String r10 = r12.getName()     // Catch:{ XmlPullParserException -> 0x00ca }
            boolean r0 = r0.equals(r10)     // Catch:{ XmlPullParserException -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            r0 = 0
        L_0x00cb:
            if (r0 == 0) goto L_0x00cf
            r0 = 1
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            if (r0 == 0) goto L_0x00d3
            goto L_0x00ee
        L_0x00d3:
            if (r9 == 0) goto L_0x00df
            r0 = r3
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r8) goto L_0x0107
            goto L_0x00ee
        L_0x00df:
            r0 = r17
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L_0x00e6
            goto L_0x0107
        L_0x00e6:
            android.view.Window r9 = r1.f47f
            android.view.View r9 = r9.getDecorView()
        L_0x00ec:
            if (r0 != 0) goto L_0x00f0
        L_0x00ee:
            r0 = 1
            goto L_0x0108
        L_0x00f0:
            if (r0 == r9) goto L_0x0107
            boolean r10 = r0 instanceof android.view.View
            if (r10 == 0) goto L_0x0107
            r10 = r0
            android.view.View r10 = (android.view.View) r10
            java.util.WeakHashMap<android.view.View, java.lang.String> r11 = e.e.j.q.a
            boolean r10 = r10.isAttachedToWindow()
            if (r10 == 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x00ec
        L_0x0107:
            r0 = 0
        L_0x0108:
            e.b.c.s r9 = r1.l0
            boolean r10 = o0
            boolean r11 = e.b.h.c1.a()
            java.util.Objects.requireNonNull(r9)
            if (r0 == 0) goto L_0x011c
            if (r17 == 0) goto L_0x011c
            android.content.Context r0 = r17.getContext()
            goto L_0x011e
        L_0x011c:
            r0 = r19
        L_0x011e:
            int[] r12 = e.b.b.x
            android.content.res.TypedArray r12 = r0.obtainStyledAttributes(r3, r12, r4, r4)
            if (r10 == 0) goto L_0x012b
            int r10 = r12.getResourceId(r4, r4)
            goto L_0x012c
        L_0x012b:
            r10 = 0
        L_0x012c:
            r13 = 4
            if (r10 != 0) goto L_0x013c
            int r10 = r12.getResourceId(r13, r4)
            if (r10 == 0) goto L_0x013c
            java.lang.String r14 = "AppCompatViewInflater"
            java.lang.String r15 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r14, r15)
        L_0x013c:
            r12.recycle()
            if (r10 == 0) goto L_0x0152
            boolean r12 = r0 instanceof e.b.g.c
            if (r12 == 0) goto L_0x014c
            r12 = r0
            e.b.g.c r12 = (e.b.g.c) r12
            int r12 = r12.a
            if (r12 == r10) goto L_0x0152
        L_0x014c:
            e.b.g.c r12 = new e.b.g.c
            r12.<init>((android.content.Context) r0, (int) r10)
            r0 = r12
        L_0x0152:
            if (r11 == 0) goto L_0x0158
            android.content.Context r0 = e.b.h.u0.a(r0)
        L_0x0158:
            r18.hashCode()
            int r10 = r18.hashCode()
            r11 = -1
            switch(r10) {
                case -1946472170: goto L_0x0204;
                case -1455429095: goto L_0x01f9;
                case -1346021293: goto L_0x01ee;
                case -938935918: goto L_0x01e5;
                case -937446323: goto L_0x01da;
                case -658531749: goto L_0x01cf;
                case -339785223: goto L_0x01c4;
                case 776382189: goto L_0x01b9;
                case 799298502: goto L_0x01ab;
                case 1125864064: goto L_0x019d;
                case 1413872058: goto L_0x018f;
                case 1601505219: goto L_0x0181;
                case 1666676343: goto L_0x0173;
                case 2001146706: goto L_0x0165;
                default: goto L_0x0163;
            }
        L_0x0163:
            goto L_0x020f
        L_0x0165:
            java.lang.String r5 = "Button"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x016f
            goto L_0x020f
        L_0x016f:
            r5 = 13
            goto L_0x0210
        L_0x0173:
            java.lang.String r5 = "EditText"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x017d
            goto L_0x020f
        L_0x017d:
            r5 = 12
            goto L_0x0210
        L_0x0181:
            java.lang.String r5 = "CheckBox"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x018b
            goto L_0x020f
        L_0x018b:
            r5 = 11
            goto L_0x0210
        L_0x018f:
            java.lang.String r5 = "AutoCompleteTextView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0199
            goto L_0x020f
        L_0x0199:
            r5 = 10
            goto L_0x0210
        L_0x019d:
            java.lang.String r5 = "ImageView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01a7
            goto L_0x020f
        L_0x01a7:
            r5 = 9
            goto L_0x0210
        L_0x01ab:
            java.lang.String r5 = "ToggleButton"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01b5
            goto L_0x020f
        L_0x01b5:
            r5 = 8
            goto L_0x0210
        L_0x01b9:
            java.lang.String r5 = "RadioButton"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01c2
            goto L_0x020f
        L_0x01c2:
            r5 = 7
            goto L_0x0210
        L_0x01c4:
            java.lang.String r5 = "Spinner"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01cd
            goto L_0x020f
        L_0x01cd:
            r5 = 6
            goto L_0x0210
        L_0x01cf:
            java.lang.String r5 = "SeekBar"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01d8
            goto L_0x020f
        L_0x01d8:
            r5 = 5
            goto L_0x0210
        L_0x01da:
            java.lang.String r5 = "ImageButton"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01e3
            goto L_0x020f
        L_0x01e3:
            r5 = 4
            goto L_0x0210
        L_0x01e5:
            java.lang.String r7 = "TextView"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L_0x0210
            goto L_0x020f
        L_0x01ee:
            java.lang.String r5 = "MultiAutoCompleteTextView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x01f7
            goto L_0x020f
        L_0x01f7:
            r5 = 2
            goto L_0x0210
        L_0x01f9:
            java.lang.String r5 = "CheckedTextView"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0202
            goto L_0x020f
        L_0x0202:
            r5 = 1
            goto L_0x0210
        L_0x0204:
            java.lang.String r5 = "RatingBar"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r5 = 0
            goto L_0x0210
        L_0x020f:
            r5 = -1
        L_0x0210:
            switch(r5) {
                case 0: goto L_0x0269;
                case 1: goto L_0x0263;
                case 2: goto L_0x025d;
                case 3: goto L_0x0257;
                case 4: goto L_0x024e;
                case 5: goto L_0x0248;
                case 6: goto L_0x023f;
                case 7: goto L_0x0239;
                case 8: goto L_0x0233;
                case 9: goto L_0x022d;
                case 10: goto L_0x0227;
                case 11: goto L_0x0221;
                case 12: goto L_0x021b;
                case 13: goto L_0x0215;
                default: goto L_0x0213;
            }
        L_0x0213:
            r5 = r6
            goto L_0x0271
        L_0x0215:
            e.b.h.e r5 = new e.b.h.e
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x021b:
            e.b.h.j r5 = new e.b.h.j
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x0221:
            e.b.h.f r5 = new e.b.h.f
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x0227:
            e.b.h.c r5 = new e.b.h.c
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x022d:
            e.b.h.m r5 = new e.b.h.m
            r5.<init>(r0, r3, r4)
            goto L_0x026e
        L_0x0233:
            e.b.h.b0 r5 = new e.b.h.b0
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x0239:
            e.b.h.q r5 = new e.b.h.q
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x023f:
            androidx.appcompat.widget.AppCompatSpinner r5 = new androidx.appcompat.widget.AppCompatSpinner
            r7 = 2130969599(0x7f0403ff, float:1.7547884E38)
            r5.<init>(r0, r3, r7)
            goto L_0x026e
        L_0x0248:
            e.b.h.t r5 = new e.b.h.t
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x024e:
            e.b.h.k r5 = new e.b.h.k
            r7 = 2130969119(0x7f04021f, float:1.754691E38)
            r5.<init>(r0, r3, r7)
            goto L_0x026e
        L_0x0257:
            e.b.h.z r5 = new e.b.h.z
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x025d:
            e.b.h.n r5 = new e.b.h.n
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x0263:
            e.b.h.g r5 = new e.b.h.g
            r5.<init>(r0, r3)
            goto L_0x026e
        L_0x0269:
            e.b.h.r r5 = new e.b.h.r
            r5.<init>(r0, r3)
        L_0x026e:
            r9.b(r5, r2)
        L_0x0271:
            if (r5 != 0) goto L_0x02ce
            r7 = r19
            if (r7 == r0) goto L_0x02ce
            java.lang.String r5 = "view"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0285
            java.lang.String r2 = "class"
            java.lang.String r2 = r3.getAttributeValue(r6, r2)
        L_0x0285:
            java.lang.Object[] r5 = r9.a     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            r5[r4] = r0     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            r5[r8] = r3     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            r5 = 46
            int r5 = r2.indexOf(r5)     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            if (r11 != r5) goto L_0x02b3
            r5 = 0
        L_0x0294:
            java.lang.String[] r7 = e.b.c.s.f942d     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            int r10 = r7.length     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            if (r5 >= r10) goto L_0x02ac
            r7 = r7[r5]     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            android.view.View r7 = r9.a(r0, r2, r7)     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            if (r7 == 0) goto L_0x02a9
            java.lang.Object[] r0 = r9.a
            r0[r4] = r6
            r0[r8] = r6
            r6 = r7
            goto L_0x02cd
        L_0x02a9:
            int r5 = r5 + 1
            goto L_0x0294
        L_0x02ac:
            java.lang.Object[] r0 = r9.a
            r0[r4] = r6
            r0[r8] = r6
            goto L_0x02cd
        L_0x02b3:
            android.view.View r0 = r9.a(r0, r2, r6)     // Catch:{ Exception -> 0x02c7, all -> 0x02bf }
            java.lang.Object[] r2 = r9.a
            r2[r4] = r6
            r2[r8] = r6
            r6 = r0
            goto L_0x02cd
        L_0x02bf:
            r0 = move-exception
            java.lang.Object[] r2 = r9.a
            r2[r4] = r6
            r2[r8] = r6
            throw r0
        L_0x02c7:
            java.lang.Object[] r0 = r9.a
            r0[r4] = r6
            r0[r8] = r6
        L_0x02cd:
            r5 = r6
        L_0x02ce:
            if (r5 == 0) goto L_0x02f8
            android.content.Context r0 = r5.getContext()
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x02f8
            java.util.WeakHashMap<android.view.View, java.lang.String> r2 = e.e.j.q.a
            boolean r2 = r5.hasOnClickListeners()
            if (r2 != 0) goto L_0x02e1
            goto L_0x02f8
        L_0x02e1:
            int[] r2 = e.b.c.s.c
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r3, r2)
            java.lang.String r2 = r0.getString(r4)
            if (r2 == 0) goto L_0x02f5
            e.b.c.s$a r3 = new e.b.c.s$a
            r3.<init>(r5, r2)
            r5.setOnClickListener(r3)
        L_0x02f5:
            r0.recycle()
        L_0x02f8:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void p(Bundle bundle) {
    }

    public void q() {
        this.X = true;
        z();
    }

    public void r() {
        this.X = false;
        P();
        e.b.c.a aVar = this.f50i;
        if (aVar != null) {
            w wVar = (w) aVar;
            wVar.u = false;
            e.b.g.g gVar = wVar.t;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    public boolean t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.Q && i2 == 108) {
            return false;
        }
        if (this.z && i2 == 1) {
            this.z = false;
        }
        if (i2 == 1) {
            W();
            this.Q = true;
            return true;
        } else if (i2 == 2) {
            W();
            this.x = true;
            return true;
        } else if (i2 == 5) {
            W();
            this.y = true;
            return true;
        } else if (i2 == 10) {
            W();
            this.B = true;
            return true;
        } else if (i2 == 108) {
            W();
            this.z = true;
            return true;
        } else if (i2 != 109) {
            return this.f47f.requestFeature(i2);
        } else {
            W();
            this.A = true;
            return true;
        }
    }

    public void u(int i2) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f46e).inflate(i2, viewGroup);
        this.f48g.b.onContentChanged();
    }

    public void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f48g.b.onContentChanged();
    }

    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f48g.b.onContentChanged();
    }

    public void x(int i2) {
        this.a0 = i2;
    }

    public final void y(CharSequence charSequence) {
        this.f52k = charSequence;
        c0 c0Var = this.f53l;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        e.b.c.a aVar = this.f50i;
        if (aVar != null) {
            ((w) aVar).f949e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean z() {
        return A(true);
    }

    public class e extends e.b.g.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r11) {
            /*
                r10 = this;
                e.b.g.e$a r0 = new e.b.g.e$a
                androidx.appcompat.app.AppCompatDelegateImpl r1 = androidx.appcompat.app.AppCompatDelegateImpl.this
                android.content.Context r1 = r1.f46e
                r0.<init>(r1, r11)
                androidx.appcompat.app.AppCompatDelegateImpl r11 = androidx.appcompat.app.AppCompatDelegateImpl.this
                java.util.Objects.requireNonNull(r11)
                e.b.g.a r1 = r11.o
                if (r1 == 0) goto L_0x0015
                r1.c()
            L_0x0015:
                androidx.appcompat.app.AppCompatDelegateImpl$d r1 = new androidx.appcompat.app.AppCompatDelegateImpl$d
                r1.<init>(r0)
                r11.P()
                e.b.c.a r2 = r11.f50i
                r3 = 32
                r4 = 1
                r5 = 0
                r6 = 0
                if (r2 == 0) goto L_0x007f
                e.b.c.w r2 = (e.b.c.w) r2
                e.b.c.w$d r7 = r2.f953i
                if (r7 == 0) goto L_0x002f
                r7.c()
            L_0x002f:
                androidx.appcompat.widget.ActionBarOverlayLayout r7 = r2.c
                r7.setHideOnContentScrollEnabled(r5)
                androidx.appcompat.widget.ActionBarContextView r7 = r2.f950f
                r7.h()
                e.b.c.w$d r7 = new e.b.c.w$d
                androidx.appcompat.widget.ActionBarContextView r8 = r2.f950f
                android.content.Context r8 = r8.getContext()
                r7.<init>(r8, r1)
                e.b.g.i.g r8 = r7.f959e
                r8.z()
                e.b.g.a$a r8 = r7.f960f     // Catch:{ all -> 0x0078 }
                e.b.g.i.g r9 = r7.f959e     // Catch:{ all -> 0x0078 }
                boolean r8 = r8.d(r7, r9)     // Catch:{ all -> 0x0078 }
                e.b.g.i.g r9 = r7.f959e
                r9.y()
                if (r8 == 0) goto L_0x006b
                r2.f953i = r7
                r7.i()
                androidx.appcompat.widget.ActionBarContextView r8 = r2.f950f
                r8.f(r7)
                r2.d(r4)
                androidx.appcompat.widget.ActionBarContextView r2 = r2.f950f
                r2.sendAccessibilityEvent(r3)
                goto L_0x006c
            L_0x006b:
                r7 = r6
            L_0x006c:
                r11.o = r7
                if (r7 == 0) goto L_0x007f
                e.b.c.k r2 = r11.f49h
                if (r2 == 0) goto L_0x007f
                r2.d(r7)
                goto L_0x007f
            L_0x0078:
                r11 = move-exception
                e.b.g.i.g r0 = r7.f959e
                r0.y()
                throw r11
            L_0x007f:
                e.b.g.a r2 = r11.o
                if (r2 != 0) goto L_0x01fd
                r11.I()
                e.b.g.a r2 = r11.o
                if (r2 == 0) goto L_0x008d
                r2.c()
            L_0x008d:
                e.b.c.k r2 = r11.f49h
                if (r2 == 0) goto L_0x009a
                boolean r7 = r11.Y
                if (r7 != 0) goto L_0x009a
                e.b.g.a r2 = r2.g(r1)     // Catch:{ AbstractMethodError -> 0x009a }
                goto L_0x009b
            L_0x009a:
                r2 = r6
            L_0x009b:
                if (r2 == 0) goto L_0x00a1
                r11.o = r2
                goto L_0x01ee
            L_0x00a1:
                androidx.appcompat.widget.ActionBarContextView r2 = r11.p
                if (r2 != 0) goto L_0x015b
                boolean r2 = r11.C
                if (r2 == 0) goto L_0x012e
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
                android.content.Context r7 = r11.f46e
                android.content.res.Resources$Theme r7 = r7.getTheme()
                r8 = 2130968589(0x7f04000d, float:1.7545836E38)
                r7.resolveAttribute(r8, r2, r4)
                int r8 = r2.resourceId
                if (r8 == 0) goto L_0x00df
                android.content.Context r8 = r11.f46e
                android.content.res.Resources r8 = r8.getResources()
                android.content.res.Resources$Theme r8 = r8.newTheme()
                r8.setTo(r7)
                int r7 = r2.resourceId
                r8.applyStyle(r7, r4)
                e.b.g.c r7 = new e.b.g.c
                android.content.Context r9 = r11.f46e
                r7.<init>((android.content.Context) r9, (int) r5)
                android.content.res.Resources$Theme r9 = r7.getTheme()
                r9.setTo(r8)
                goto L_0x00e1
            L_0x00df:
                android.content.Context r7 = r11.f46e
            L_0x00e1:
                androidx.appcompat.widget.ActionBarContextView r8 = new androidx.appcompat.widget.ActionBarContextView
                r8.<init>(r7, r6)
                r11.p = r8
                android.widget.PopupWindow r8 = new android.widget.PopupWindow
                r9 = 2130968604(0x7f04001c, float:1.7545866E38)
                r8.<init>(r7, r6, r9)
                r11.q = r8
                r9 = 2
                e.e.d.l.a.H0(r8, r9)
                android.widget.PopupWindow r8 = r11.q
                androidx.appcompat.widget.ActionBarContextView r9 = r11.p
                r8.setContentView(r9)
                android.widget.PopupWindow r8 = r11.q
                r9 = -1
                r8.setWidth(r9)
                android.content.res.Resources$Theme r8 = r7.getTheme()
                r9 = 2130968583(0x7f040007, float:1.7545824E38)
                r8.resolveAttribute(r9, r2, r4)
                int r2 = r2.data
                android.content.res.Resources r7 = r7.getResources()
                android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
                int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r7)
                androidx.appcompat.widget.ActionBarContextView r7 = r11.p
                r7.setContentHeight(r2)
                android.widget.PopupWindow r2 = r11.q
                r7 = -2
                r2.setHeight(r7)
                e.b.c.p r2 = new e.b.c.p
                r2.<init>(r11)
                r11.r = r2
                goto L_0x015b
            L_0x012e:
                android.view.ViewGroup r2 = r11.u
                r7 = 2131296356(0x7f090064, float:1.8210626E38)
                android.view.View r2 = r2.findViewById(r7)
                androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
                if (r2 == 0) goto L_0x015b
                r11.P()
                e.b.c.a r7 = r11.f50i
                if (r7 == 0) goto L_0x0147
                android.content.Context r7 = r7.b()
                goto L_0x0148
            L_0x0147:
                r7 = r6
            L_0x0148:
                if (r7 != 0) goto L_0x014c
                android.content.Context r7 = r11.f46e
            L_0x014c:
                android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
                r2.setLayoutInflater(r7)
                android.view.View r2 = r2.a()
                androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
                r11.p = r2
            L_0x015b:
                androidx.appcompat.widget.ActionBarContextView r2 = r11.p
                if (r2 == 0) goto L_0x01ee
                r11.I()
                androidx.appcompat.widget.ActionBarContextView r2 = r11.p
                r2.h()
                e.b.g.d r2 = new e.b.g.d
                androidx.appcompat.widget.ActionBarContextView r7 = r11.p
                android.content.Context r7 = r7.getContext()
                androidx.appcompat.widget.ActionBarContextView r8 = r11.p
                android.widget.PopupWindow r9 = r11.q
                if (r9 != 0) goto L_0x0176
                goto L_0x0177
            L_0x0176:
                r4 = 0
            L_0x0177:
                r2.<init>(r7, r8, r1, r4)
                e.b.g.i.g r4 = r2.f990i
                boolean r1 = r1.d(r2, r4)
                if (r1 == 0) goto L_0x01ec
                r2.i()
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                r1.f(r2)
                r11.o = r2
                boolean r1 = r11.V()
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto L_0x01b8
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                r3 = 0
                r1.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                e.e.j.t r1 = e.e.j.q.b(r1)
                r1.a(r2)
                r11.s = r1
                e.b.c.q r2 = new e.b.c.q
                r2.<init>(r11)
                java.lang.ref.WeakReference<android.view.View> r3 = r1.a
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01dc
                r1.e(r3, r2)
                goto L_0x01dc
            L_0x01b8:
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                r1.setAlpha(r2)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                r1.setVisibility(r5)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                r1.sendAccessibilityEvent(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                android.view.ViewParent r1 = r1.getParent()
                boolean r1 = r1 instanceof android.view.View
                if (r1 == 0) goto L_0x01dc
                androidx.appcompat.widget.ActionBarContextView r1 = r11.p
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                e.e.j.q.l(r1)
            L_0x01dc:
                android.widget.PopupWindow r1 = r11.q
                if (r1 == 0) goto L_0x01ee
                android.view.Window r1 = r11.f47f
                android.view.View r1 = r1.getDecorView()
                java.lang.Runnable r2 = r11.r
                r1.post(r2)
                goto L_0x01ee
            L_0x01ec:
                r11.o = r6
            L_0x01ee:
                e.b.g.a r1 = r11.o
                if (r1 == 0) goto L_0x01f9
                e.b.c.k r2 = r11.f49h
                if (r2 == 0) goto L_0x01f9
                r2.d(r1)
            L_0x01f9:
                e.b.g.a r1 = r11.o
                r11.o = r1
            L_0x01fd:
                e.b.g.a r11 = r11.o
                if (r11 == 0) goto L_0x0206
                android.view.ActionMode r11 = r0.e(r11)
                return r11
            L_0x0206:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.e.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.G(keyEvent) || this.b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            if (r3 != false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            if (r7 != false) goto L_0x006b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                android.view.Window$Callback r0 = r6.b
                boolean r0 = r0.dispatchKeyShortcutEvent(r7)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0072
                androidx.appcompat.app.AppCompatDelegateImpl r0 = androidx.appcompat.app.AppCompatDelegateImpl.this
                int r3 = r7.getKeyCode()
                r0.P()
                e.b.c.a r4 = r0.f50i
                if (r4 == 0) goto L_0x003f
                e.b.c.w r4 = (e.b.c.w) r4
                e.b.c.w$d r4 = r4.f953i
                if (r4 != 0) goto L_0x001e
                goto L_0x003b
            L_0x001e:
                e.b.g.i.g r4 = r4.f959e
                if (r4 == 0) goto L_0x003b
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r1) goto L_0x0032
                r5 = 1
                goto L_0x0033
            L_0x0032:
                r5 = 0
            L_0x0033:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r2)
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                if (r3 == 0) goto L_0x003f
                goto L_0x006b
            L_0x003f:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.T
                if (r3 == 0) goto L_0x0054
                int r4 = r7.getKeyCode()
                boolean r3 = r0.T(r3, r4, r7, r1)
                if (r3 == 0) goto L_0x0054
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r7 = r0.T
                if (r7 == 0) goto L_0x006b
                r7.f63l = r1
                goto L_0x006b
            L_0x0054:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.T
                if (r3 != 0) goto L_0x006d
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r0.N(r2)
                r0.U(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.T(r3, r4, r7, r1)
                r3.f62k = r2
                if (r7 == 0) goto L_0x006d
            L_0x006b:
                r7 = 1
                goto L_0x006e
            L_0x006d:
                r7 = 0
            L_0x006e:
                if (r7 == 0) goto L_0x0071
                goto L_0x0072
            L_0x0071:
                r1 = 0
            L_0x0072:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof e.b.g.i.g)) {
                return this.b.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i2, Menu menu) {
            this.b.onMenuOpened(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i2 == 108) {
                appCompatDelegateImpl.P();
                e.b.c.a aVar = appCompatDelegateImpl.f50i;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i2, Menu menu) {
            this.b.onPanelClosed(i2, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i2 == 108) {
                appCompatDelegateImpl.P();
                e.b.c.a aVar = appCompatDelegateImpl.f50i;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i2 == 0) {
                PanelFeatureState N = appCompatDelegateImpl.N(i2);
                if (N.f64m) {
                    appCompatDelegateImpl.E(N, false);
                }
            }
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            e.b.g.i.g gVar = menu instanceof e.b.g.i.g ? (e.b.g.i.g) menu : null;
            if (i2 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.x = true;
            }
            boolean onPreparePanel = this.b.onPreparePanel(i2, view, menu);
            if (gVar != null) {
                gVar.x = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            e.b.g.i.g gVar = AppCompatDelegateImpl.this.N(0).f59h;
            if (gVar != null) {
                this.b.onProvideKeyboardShortcuts(list, gVar, i2);
            } else {
                this.b.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            Objects.requireNonNull(AppCompatDelegateImpl.this);
            return a(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            Objects.requireNonNull(AppCompatDelegateImpl.this);
            if (i2 != 0) {
                return this.b.onWindowStartingActionMode(callback, i2);
            }
            return a(callback);
        }
    }
}
