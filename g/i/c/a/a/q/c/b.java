package g.i.c.a.a.q.c;

import androidx.fragment.app.Fragment;
import e.h.b.g;
import g.a.a.a.a;
import g.c.b.b.f;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;

public class b extends Fragment {
    public void onDestroyView() {
        super.onDestroyView();
        if (e.b.a.a) {
            StringBuilder i2 = a.i("onDestroyView: fragment = ");
            i2.append(getClass().getName());
            f.K("AndroidXFragmentCollect", i2.toString());
        }
        if (!(this instanceof g)) {
            b.C0166b.a.d(f.A(this));
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (e.b.a.a) {
            StringBuilder i2 = a.i("onHiddenChanged: fragment = ");
            i2.append(getClass().getName());
            i2.append(", hidden = ");
            i2.append(z);
            f.K("AndroidXFragmentCollect", i2.toString());
        }
        if (!(this instanceof g)) {
            if (z) {
                b.C0166b.a.e(f.A(this));
            } else {
                b.C0166b.a.f(f.A(this));
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (e.b.a.a) {
            StringBuilder i2 = a.i("onPause: fragment = ");
            i2.append(getClass().getName());
            f.K("AndroidXFragmentCollect", i2.toString());
        }
        if (!(this instanceof g)) {
            b.C0166b.a.e(f.A(this));
        }
    }

    public void onResume() {
        super.onResume();
        if (e.b.a.a) {
            StringBuilder i2 = a.i("onResume: fragment = ");
            i2.append(getClass().getName());
            f.K("AndroidXFragmentCollect", i2.toString());
        }
        if (!(this instanceof g)) {
            b.C0166b.a.f(f.A(this));
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (e.b.a.a) {
            StringBuilder i2 = a.i("setUserVisibleHint: fragment = ");
            i2.append(getClass().getName());
            i2.append(", isVisible = ");
            i2.append(z);
            f.K("AndroidXFragmentCollect", i2.toString());
        }
        if (!(this instanceof g)) {
            if (z) {
                b.C0166b.a.f(f.A(this));
            } else {
                b.C0166b.a.e(f.A(this));
            }
        }
    }
}
