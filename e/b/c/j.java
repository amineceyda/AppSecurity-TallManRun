package e.b.c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import e.a.d.a;
import e.b.g.a;
import e.b.h.c1;
import g.i.c.a.a.i.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class j extends e.h.b.j implements k {
    public l n;
    public Resources o;

    public j() {
        this.f11e.b.b("androidx:appcompat", new h(this));
        i iVar = new i(this);
        a aVar = this.c;
        if (aVar.b != null) {
            iVar.a(aVar.b);
        }
        aVar.a.add(iVar);
    }

    private void j() {
        getWindow().getDecorView().setTag(2131297878, this);
        getWindow().getDecorView().setTag(2131297880, this);
        getWindow().getDecorView().setTag(2131297879, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        o().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(o().d(context));
    }

    public void closeOptionsMenu() {
        a p = p();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public void d(e.b.g.a aVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a p = p();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    public void e(e.b.g.a aVar) {
    }

    public <T extends View> T findViewById(int i2) {
        return o().e(i2);
    }

    public e.b.g.a g(a.C0036a aVar) {
        return null;
    }

    public MenuInflater getMenuInflater() {
        return o().g();
    }

    public Resources getResources() {
        if (this.o == null && c1.a()) {
            this.o = new c1(this, super.getResources());
        }
        Resources resources = this.o;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        o().j();
    }

    public void n() {
        o().j();
    }

    public l o() {
        if (this.n == null) {
            e.d.b<WeakReference<l>> bVar = l.b;
            this.n = new AppCompatDelegateImpl((Activity) this, (k) this);
        }
        return this.n;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.o != null) {
            this.o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        o().k(configuration);
        b.C0166b.a.b(this, configuration);
    }

    public void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        o().m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.j.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent l2;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a p = p();
        if (menuItem.getItemId() != 16908332 || p == null || (((w) p).f949e.p() & 4) == 0 || (l2 = e.b.a.l(this)) == null) {
            return false;
        }
        if (shouldUpRecreateTask(l2)) {
            ArrayList arrayList = new ArrayList();
            Intent q = q();
            if (q == null) {
                q = e.b.a.l(this);
            }
            if (q != null) {
                ComponentName component = q.getComponent();
                if (component == null) {
                    component = q.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent m2 = e.b.a.m(this, component);
                        if (m2 == null) {
                            break;
                        }
                        arrayList.add(size, m2);
                        component = m2.getComponent();
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                arrayList.add(q);
            }
            s();
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = e.e.c.a.a;
                startActivities(intentArr, (Bundle) null);
                try {
                    int i3 = e.e.b.a.b;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(l2);
            return true;
        }
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        o().n(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        o().o();
    }

    public void onStart() {
        super.onStart();
        o().q();
    }

    public void onStop() {
        super.onStop();
        o().r();
    }

    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        o().y(charSequence);
    }

    public void openOptionsMenu() {
        a p = p();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public a p() {
        return o().h();
    }

    public Intent q() {
        return e.b.a.l(this);
    }

    public void r() {
    }

    public void s() {
    }

    public void setContentView(int i2) {
        j();
        o().u(i2);
    }

    public void setContentView(View view) {
        j();
        o().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        o().w(view, layoutParams);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        o().x(i2);
    }
}
