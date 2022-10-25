package g.i.c.a.a.s;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import g.i.c.a.a.i.b;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;

public class t extends g.i.c.a.a.i.a {
    public final WeakHashMap<View, WeakReference<Object>> a = new WeakHashMap<>();

    public static class b {
        public static final t a;

        static {
            t tVar = new t((a) null);
            a = tVar;
            Objects.requireNonNull(tVar);
            b.C0166b.a.b.c.a(tVar);
        }
    }

    public t(a aVar) {
    }

    public void p(Activity activity, Dialog dialog) {
        View decorView;
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            t(decorView, dialog);
        }
    }

    public void s(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            t(decorView, activity);
        }
    }

    public void t(View view, Object obj) {
        if (view != null) {
            this.a.put(view, new WeakReference(obj));
        }
    }

    public Object u(View view) {
        if (view == null) {
            return null;
        }
        try {
            WeakReference weakReference = this.a.get(view);
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        } catch (ArrayIndexOutOfBoundsException e2) {
            int hashCode = view.hashCode();
            int i2 = hashCode + ((hashCode << 15) ^ -12931);
            int i3 = i2 ^ (i2 >>> 10);
            int i4 = i3 + (i3 << 3);
            int i5 = i4 ^ (i4 >>> 6);
            int i6 = (i5 << 2) + (i5 << 14) + i5;
            int i7 = (i6 >>> 16) ^ i6;
            StringBuilder k2 = g.a.a.a.a.k("hash = ", i7, ", masked = ", Integer.MAX_VALUE & i7, ", ");
            k2.append(e2.getMessage());
            throw new ArrayIndexOutOfBoundsException(k2.toString());
        }
    }
}
