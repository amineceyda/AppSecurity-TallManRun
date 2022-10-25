package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.IntentSenderRequest;
import e.a.e.d;
import e.a.e.e;
import e.a.e.f.a;
import e.e.b.f;
import e.k.e;
import e.k.h;
import e.k.i;
import e.k.p;
import e.k.y;
import e.k.z;
import g.i.c.a.a.i.b;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends f implements h, z, e.p.c, e.a.c, e {
    public final e.a.d.a c = new e.a.d.a();

    /* renamed from: d  reason: collision with root package name */
    public final i f10d;

    /* renamed from: e  reason: collision with root package name */
    public final e.p.b f11e;

    /* renamed from: f  reason: collision with root package name */
    public y f12f;

    /* renamed from: g  reason: collision with root package name */
    public final OnBackPressedDispatcher f13g;

    /* renamed from: h  reason: collision with root package name */
    public final d f14h;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    public class b extends d {

        public class a implements Runnable {
            public final /* synthetic */ int b;
            public final /* synthetic */ a.C0031a c;

            public a(int i2, a.C0031a aVar) {
                this.b = i2;
                this.c = aVar;
            }

            public void run() {
                e.a.e.a<O> aVar;
                b bVar = b.this;
                int i2 = this.b;
                T t = this.c.a;
                String str = bVar.b.get(Integer.valueOf(i2));
                if (str != null) {
                    bVar.f919e.remove(str);
                    d.b bVar2 = bVar.f920f.get(str);
                    if (bVar2 == null || (aVar = bVar2.a) == null) {
                        bVar.f922h.remove(str);
                        bVar.f921g.put(str, t);
                        return;
                    }
                    aVar.a(t);
                }
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        public class C0000b implements Runnable {
            public final /* synthetic */ int b;
            public final /* synthetic */ IntentSender.SendIntentException c;

            public C0000b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.b = i2;
                this.c = sendIntentException;
            }

            public void run() {
                b.this.a(this.b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.c));
            }
        }

        public b() {
        }

        public <I, O> void b(int i2, e.a.e.f.a<I, O> aVar, I i3, e.e.b.c cVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0031a<O> b = aVar.b(componentActivity, i3);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, b));
                return;
            }
            Intent a2 = aVar.a(componentActivity, i3);
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else if (cVar == null) {
                bundle = null;
            } else {
                throw null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                e.e.b.a.d(componentActivity, stringArrayExtra, i2);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender d2 = intentSenderRequest.d();
                    Intent a3 = intentSenderRequest.a();
                    int b2 = intentSenderRequest.b();
                    int c = intentSenderRequest.c();
                    int i4 = e.e.b.a.b;
                    componentActivity.startIntentSenderForResult(d2, i2, a3, b2, c, 0, bundle);
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new C0000b(i2, e2));
                }
            } else {
                int i5 = e.e.b.a.b;
                componentActivity.startActivityForResult(a2, i2, bundle);
            }
        }
    }

    public static final class c {
        public y a;
    }

    public ComponentActivity() {
        i iVar = new i(this);
        this.f10d = iVar;
        this.f11e = new e.p.b(this);
        this.f13g = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.f14h = new b();
        if (iVar != null) {
            int i2 = Build.VERSION.SDK_INT;
            iVar.a(new e.k.f() {
                public void d(h hVar, e.a aVar) {
                    if (aVar == e.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            iVar.a(new e.k.f() {
                public void d(h hVar, e.a aVar) {
                    if (aVar == e.a.ON_DESTROY) {
                        ComponentActivity.this.c.b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            iVar.a(new e.k.f() {
                public void d(h hVar, e.a aVar) {
                    ComponentActivity.this.i();
                    i iVar = ComponentActivity.this.f10d;
                    iVar.d("removeObserver");
                    iVar.a.i(this);
                }
            });
            if (i2 <= 23) {
                iVar.a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        j();
        super.addContentView(view, layoutParams);
    }

    public final OnBackPressedDispatcher b() {
        return this.f13g;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    public final d f() {
        return this.f14h;
    }

    public e.k.e getLifecycle() {
        return this.f10d;
    }

    public final e.p.a getSavedStateRegistry() {
        return this.f11e.b;
    }

    public y getViewModelStore() {
        if (getApplication() != null) {
            i();
            return this.f12f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void i() {
        if (this.f12f == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f12f = cVar.a;
            }
            if (this.f12f == null) {
                this.f12f = new y();
            }
        }
    }

    public final void j() {
        getWindow().getDecorView().setTag(2131297878, this);
        getWindow().getDecorView().setTag(2131297880, this);
        getWindow().getDecorView().setTag(2131297879, this);
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f14h.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        this.f13g.a();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.C0166b.a.b(this, configuration);
    }

    public void onCreate(Bundle bundle) {
        this.f11e.a(bundle);
        e.a.d.a aVar = this.c;
        aVar.b = this;
        for (e.a.d.b a2 : aVar.a) {
            a2.a(this);
        }
        super.onCreate(bundle);
        d dVar = this.f14h;
        Objects.requireNonNull(dVar);
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                int size = stringArrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = integerArrayList.get(i2).intValue();
                    String str = stringArrayList.get(i2);
                    dVar.b.put(Integer.valueOf(intValue), str);
                    dVar.c.put(str, Integer.valueOf(intValue));
                }
                dVar.f919e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                dVar.a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                dVar.f922h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        p.c(this);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.f14h.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        y yVar = this.f12f;
        if (yVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            yVar = cVar.a;
        }
        if (yVar == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = yVar;
        return cVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        i iVar = this.f10d;
        if (iVar instanceof i) {
            e.b bVar = e.b.CREATED;
            iVar.d("setCurrentState");
            iVar.g(bVar);
        }
        super.onSaveInstanceState(bundle);
        this.f11e.b(bundle);
        d dVar = this.f14h;
        Objects.requireNonNull(dVar);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(dVar.b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(dVar.b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(dVar.f919e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) dVar.f922h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", dVar.a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (e.e.c.a.a(r2, "android.permission.UPDATE_DEVICE_STATS") == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void reportFullyDrawn() {
        /*
            r2 = this;
            boolean r0 = e.e.i.b.H()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r0.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "reportFullyDrawn() for "
            r0.append(r1)     // Catch:{ all -> 0x0036 }
            android.content.ComponentName r1 = r2.getComponentName()     // Catch:{ all -> 0x0036 }
            r0.append(r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0036 }
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x0036 }
        L_0x001e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0036 }
            r1 = 19
            if (r0 <= r1) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            if (r0 != r1) goto L_0x0032
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r0 = e.e.c.a.a(r2, r0)     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0032
        L_0x002f:
            super.reportFullyDrawn()     // Catch:{ all -> 0x0036 }
        L_0x0032:
            android.os.Trace.endSection()
            return
        L_0x0036:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ComponentActivity.reportFullyDrawn():void");
    }

    public void setContentView(int i2) {
        j();
        super.setContentView(i2);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        j();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        j();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
