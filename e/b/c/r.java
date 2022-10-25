package e.b.c;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import e.b.g.a;
import e.d.b;
import e.e.j.e;
import java.lang.ref.WeakReference;

public class r extends g.i.c.a.a.q.b.a implements k {
    public l b;
    public final e.a c;

    public class a implements e.a {
        public a() {
        }

        public boolean c(KeyEvent keyEvent) {
            return r.this.b(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130968942(0x7f04016e, float:1.7546552E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            e.b.c.r$a r2 = new e.b.c.r$a
            r2.<init>()
            r4.c = r2
            e.b.c.l r2 = r4.a()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r2.x(r6)
            r5 = 0
            r2.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.r.<init>(android.content.Context, int):void");
    }

    public l a() {
        if (this.b == null) {
            b<WeakReference<l>> bVar = l.b;
            this.b = new AppCompatDelegateImpl((Dialog) this, (k) this);
        }
        return this.b;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void d(e.b.g.a aVar) {
    }

    public void dismiss() {
        super.dismiss();
        a().m();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.b(this.c, getWindow().getDecorView(), this, keyEvent);
    }

    public void e(e.b.g.a aVar) {
    }

    public <T extends View> T findViewById(int i2) {
        return a().e(i2);
    }

    public e.b.g.a g(a.C0036a aVar) {
        return null;
    }

    public void invalidateOptionsMenu() {
        a().j();
    }

    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l(bundle);
    }

    public void onStop() {
        super.onStop();
        a().r();
    }

    public void setContentView(int i2) {
        a().u(i2);
    }

    public void setContentView(View view) {
        a().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        a().y(getContext().getString(i2));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().y(charSequence);
    }
}
