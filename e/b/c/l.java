package e.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import e.d.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class l {
    public static final b<WeakReference<l>> b = new b<>(0);
    public static final Object c = new Object();

    public static void s(l lVar) {
        synchronized (c) {
            Iterator<WeakReference<l>> it = b.iterator();
            while (it.hasNext()) {
                l lVar2 = (l) it.next().get();
                if (lVar2 == lVar || lVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i2);

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract a h();

    public abstract void i();

    public abstract void j();

    public abstract void k(Configuration configuration);

    public abstract void l(Bundle bundle);

    public abstract void m();

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int i2);

    public abstract void u(int i2);

    public abstract void v(View view);

    public abstract void w(View view, ViewGroup.LayoutParams layoutParams);

    public void x(int i2) {
    }

    public abstract void y(CharSequence charSequence);
}
