package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import e.k.e;
import e.k.f;
import e.k.h;
import e.k.i;
import e.p.a;
import e.p.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements f {
    public final c b;

    public static final class a implements a.b {
        public final Set<String> a = new HashSet();

        public a(e.p.a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.a));
            return bundle;
        }

        public void b(String str) {
            this.a.add(str);
        }
    }

    public Recreator(c cVar) {
        this.b = cVar;
    }

    public void d(h hVar, e.a aVar) {
        if (aVar == e.a.ON_CREATE) {
            i iVar = (i) hVar.getLifecycle();
            iVar.d("removeObserver");
            iVar.a.i(this);
            Bundle a2 = this.b.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a2 != null) {
                ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0053a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.C0053a) declaredConstructor.newInstance(new Object[0])).a(this.b);
                                } catch (Exception e2) {
                                    throw new RuntimeException(g.a.a.a.a.w("Failed to instantiate ", next), e2);
                                }
                            } catch (NoSuchMethodException e3) {
                                StringBuilder i2 = g.a.a.a.a.i("Class");
                                i2.append(asSubclass.getSimpleName());
                                i2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(i2.toString(), e3);
                            }
                        } catch (ClassNotFoundException e4) {
                            throw new RuntimeException(g.a.a.a.a.c("Class ", next, " wasn't found"), e4);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
