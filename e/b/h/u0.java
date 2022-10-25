package e.b.h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class u0 extends ContextWrapper {
    public static final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<WeakReference<u0>> f1197d;
    public final Resources a;
    public final Resources.Theme b;

    public u0(Context context) {
        super(context);
        if (c1.a()) {
            c1 c1Var = new c1(this, context.getResources());
            this.a = c1Var;
            Resources.Theme newTheme = c1Var.newTheme();
            this.b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.a = new w0(this, context.getResources());
        this.b = null;
    }

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof u0) && !(context.getResources() instanceof w0) && !(context.getResources() instanceof c1) && (Build.VERSION.SDK_INT < 21 || c1.a())) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (c) {
            ArrayList<WeakReference<u0>> arrayList = f1197d;
            if (arrayList == null) {
                f1197d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1197d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1197d.remove(size);
                    }
                }
                for (int size2 = f1197d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1197d.get(size2);
                    u0 u0Var = weakReference2 != null ? (u0) weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            u0 u0Var2 = new u0(context);
            f1197d.add(new WeakReference(u0Var2));
            return u0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    public Resources getResources() {
        return this.a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i2) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
