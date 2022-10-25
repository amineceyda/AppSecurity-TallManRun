package e.p;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
public final class a {
    public e.c.a.b.b<String, b> a = new e.c.a.b.b<>();
    public Bundle b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Recreator.a f1539d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1540e = true;

    /* renamed from: e.p.a$a  reason: collision with other inner class name */
    public interface C0053a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.a.h(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void c(Class<? extends C0053a> cls) {
        if (this.f1540e) {
            if (this.f1539d == null) {
                this.f1539d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f1539d.b(cls.getName());
            } catch (NoSuchMethodException e2) {
                StringBuilder i2 = g.a.a.a.a.i("Class");
                i2.append(cls.getSimpleName());
                i2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(i2.toString(), e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
