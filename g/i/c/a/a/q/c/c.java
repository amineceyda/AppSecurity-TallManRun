package g.i.c.a.a.q.c;

import android.app.Fragment;
import g.h.a.a;

public class c extends Fragment {
    public void onDestroyView() {
        super.onDestroyView();
        a.M(this);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        a.P(this, z);
    }

    public void onPause() {
        super.onPause();
        a.Q(this);
    }

    public void onResume() {
        super.onResume();
        a.R(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        a.Z(this, z);
    }
}
