package e.b.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import e.d.g;
import g.i.c.a.a.i.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class s {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f942d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    public static final g<String, Constructor<? extends View>> f943e = new g<>();
    public final Object[] a = new Object[2];

    public static class a implements View.OnClickListener {
        public final View b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public Method f944d;

        /* renamed from: e  reason: collision with root package name */
        public Context f945e;

        public a(View view, String str) {
            this.b = view;
            this.c = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f944d == null) {
                for (Context context = this.b.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.c, new Class[]{View.class})) != null) {
                            this.f944d = method;
                            this.f945e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.b.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder i2 = g.a.a.a.a.i(" with id '");
                    i2.append(this.b.getContext().getResources().getResourceEntryName(id));
                    i2.append("'");
                    str = i2.toString();
                }
                StringBuilder i3 = g.a.a.a.a.i("Could not find method ");
                i3.append(this.c);
                i3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                i3.append(this.b.getClass());
                i3.append(str);
                throw new IllegalStateException(i3.toString());
            }
            try {
                this.f944d.invoke(this.f945e, new Object[]{view});
                b.C0166b.a.j(view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public final View a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        g<String, Constructor<? extends View>> gVar = f943e;
        Constructor<? extends U> orDefault = gVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            gVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.a);
    }

    public final void b(View view, String str) {
    }
}
