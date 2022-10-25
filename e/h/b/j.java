package e.h.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.a.c;
import e.a.e.d;
import e.a.e.e;
import e.e.b.a;
import e.e.f.b;
import e.k.e;
import e.k.i;
import e.k.y;
import e.k.z;
import g.i.c.a.a.i.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class j extends ComponentActivity implements a.b, a.c {

    /* renamed from: i  reason: collision with root package name */
    public final r f1467i;

    /* renamed from: j  reason: collision with root package name */
    public final i f1468j = new i(this);

    /* renamed from: k  reason: collision with root package name */
    public boolean f1469k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1470l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1471m = true;

    public class a extends t<j> implements z, c, e, y {
        public a() {
            super(j.this);
        }

        public void a(FragmentManager fragmentManager, Fragment fragment) {
            j.this.m();
        }

        public OnBackPressedDispatcher b() {
            return j.this.f13g;
        }

        public View c(int i2) {
            return j.this.findViewById(i2);
        }

        public boolean d() {
            Window window = j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public Object e() {
            return j.this;
        }

        public d f() {
            return j.this.f14h;
        }

        public LayoutInflater g() {
            return j.this.getLayoutInflater().cloneInContext(j.this);
        }

        public e.k.e getLifecycle() {
            return j.this.f1468j;
        }

        public y getViewModelStore() {
            return j.this.getViewModelStore();
        }

        public boolean h(Fragment fragment) {
            return !j.this.isFinishing();
        }

        public boolean i(String str) {
            j jVar = j.this;
            int i2 = e.e.b.a.b;
            if (Build.VERSION.SDK_INT >= 23) {
                return jVar.shouldShowRequestPermissionRationale(str);
            }
            return false;
        }

        public void j() {
            j.this.n();
        }
    }

    public j() {
        a aVar = new a();
        b.c(aVar, "callbacks == null");
        this.f1467i = new r(aVar);
        this.f11e.b.b("android:support:fragments", new h(this));
        i iVar = new i(this);
        e.a.d.a aVar2 = this.c;
        if (aVar2.b != null) {
            iVar.a(aVar2.b);
        }
        aVar2.a.add(iVar);
    }

    public static boolean l(FragmentManager fragmentManager, e.b bVar) {
        e.b bVar2 = e.b.STARTED;
        boolean z = false;
        for (Fragment next : fragmentManager.K()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= l(next.getChildFragmentManager(), bVar);
                }
                o0 o0Var = next.mViewLifecycleOwner;
                if (o0Var != null) {
                    o0Var.c();
                    if (o0Var.c.b.compareTo(bVar2) >= 0) {
                        i iVar = next.mViewLifecycleOwner.c;
                        iVar.d("setCurrentState");
                        iVar.g(bVar);
                        z = true;
                    }
                }
                if (next.mLifecycleRegistry.b.compareTo(bVar2) >= 0) {
                    i iVar2 = next.mLifecycleRegistry;
                    iVar2.d("setCurrentState");
                    iVar2.g(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Deprecated
    public final void a(int i2) {
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1469k);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1470l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1471m);
        if (getApplication() != null) {
            e.l.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1467i.a.f1505e.y(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager k() {
        return this.f1467i.a.f1505e;
    }

    @Deprecated
    public void m() {
    }

    @Deprecated
    public void n() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f1467i.a();
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1467i.a();
        this.f1467i.a.f1505e.k(configuration);
        b.C0166b.a.b(this, configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1468j.e(e.a.ON_CREATE);
        this.f1467i.a.f1505e.m();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        r rVar = this.f1467i;
        return onCreatePanelMenu | rVar.a.f1505e.n(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1467i.a.f1505e.f206f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1467i.a.f1505e.o();
        this.f1468j.e(e.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1467i.a.f1505e.p();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1467i.a.f1505e.r(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1467i.a.f1505e.l(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f1467i.a.f1505e.q(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1467i.a();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1467i.a.f1505e.s(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.f1470l = false;
        this.f1467i.a.f1505e.w(5);
        this.f1468j.e(e.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f1467i.a.f1505e.u(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1468j.e(e.a.ON_RESUME);
        FragmentManager fragmentManager = this.f1467i.a.f1505e;
        fragmentManager.B = false;
        fragmentManager.C = false;
        fragmentManager.J.f1511h = false;
        fragmentManager.w(7);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.f1467i.a.f1505e.v(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1467i.a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f1470l = true;
        this.f1467i.a();
        this.f1467i.a.f1505e.C(true);
    }

    public void onStart() {
        super.onStart();
        this.f1471m = false;
        if (!this.f1469k) {
            this.f1469k = true;
            FragmentManager fragmentManager = this.f1467i.a.f1505e;
            fragmentManager.B = false;
            fragmentManager.C = false;
            fragmentManager.J.f1511h = false;
            fragmentManager.w(4);
        }
        this.f1467i.a();
        this.f1467i.a.f1505e.C(true);
        this.f1468j.e(e.a.ON_START);
        FragmentManager fragmentManager2 = this.f1467i.a.f1505e;
        fragmentManager2.B = false;
        fragmentManager2.C = false;
        fragmentManager2.J.f1511h = false;
        fragmentManager2.w(5);
    }

    public void onStateNotSaved() {
        this.f1467i.a();
    }

    public void onStop() {
        super.onStop();
        this.f1471m = true;
        do {
        } while (l(k(), e.b.CREATED));
        FragmentManager fragmentManager = this.f1467i.a.f1505e;
        fragmentManager.C = true;
        fragmentManager.J.f1511h = true;
        fragmentManager.w(4);
        this.f1468j.e(e.a.ON_STOP);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1467i.a.f1505e.f206f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
