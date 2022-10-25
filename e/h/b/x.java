package e.h.b;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.k.s;
import e.k.u;
import e.k.y;
import java.util.HashMap;
import java.util.Iterator;

public final class x extends s {

    /* renamed from: i  reason: collision with root package name */
    public static final u f1506i = new a();
    public final HashMap<String, Fragment> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, x> f1507d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, y> f1508e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1509f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1510g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1511h = false;

    public class a implements u {
        public <T extends s> T a(Class<T> cls) {
            return new x(true);
        }
    }

    public x(boolean z) {
        this.f1509f = z;
    }

    public void a() {
        if (FragmentManager.N(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1510g = true;
    }

    public void c(Fragment fragment) {
        if (this.f1511h) {
            if (FragmentManager.N(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.c.containsKey(fragment.mWho)) {
            this.c.put(fragment.mWho, fragment);
            if (FragmentManager.N(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void d(Fragment fragment) {
        if (!this.f1511h) {
            if ((this.c.remove(fragment.mWho) != null) && FragmentManager.N(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.N(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public boolean e(Fragment fragment) {
        if (this.c.containsKey(fragment.mWho) && this.f1509f) {
            return this.f1510g;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.c.equals(xVar.c) && this.f1507d.equals(xVar.f1507d) && this.f1508e.equals(xVar.f1508e);
    }

    public int hashCode() {
        int hashCode = this.f1507d.hashCode();
        return this.f1508e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1507d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1508e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
