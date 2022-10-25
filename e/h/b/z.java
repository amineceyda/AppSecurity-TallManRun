package e.h.b;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.h.b.c0;
import e.s.a.a;
import java.util.Objects;

@Deprecated
public abstract class z extends a {
    public final FragmentManager a;
    public final int b;
    public c0 c = null;

    /* renamed from: d  reason: collision with root package name */
    public Fragment f1512d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1513e;

    @Deprecated
    public z(FragmentManager fragmentManager) {
        this.a = fragmentManager;
        this.b = 0;
    }

    public static String e(int i2, long j2) {
        return "android:switcher:" + i2 + Constants.KEY_INDEX_FILE_SEPARATOR + j2;
    }

    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.c == null) {
            this.c = new a(this.a);
        }
        a aVar = (a) this.c;
        Objects.requireNonNull(aVar);
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == aVar.p) {
            aVar.b(new c0.a(6, fragment));
            if (fragment.equals(this.f1512d)) {
                this.f1512d = null;
                return;
            }
            return;
        }
        StringBuilder i3 = g.a.a.a.a.i("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        i3.append(fragment.toString());
        i3.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(i3.toString());
    }

    /* JADX INFO: finally extract failed */
    public void b(ViewGroup viewGroup) {
        c0 c0Var = this.c;
        if (c0Var != null) {
            if (!this.f1513e) {
                try {
                    this.f1513e = true;
                    c0Var.c();
                    this.f1513e = false;
                } catch (Throwable th) {
                    this.f1513e = false;
                    throw th;
                }
            }
            this.c = null;
        }
    }

    public void d(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }
}
