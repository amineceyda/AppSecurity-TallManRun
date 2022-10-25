package g.c.a.g.b;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import g.c.a.e.f.b.a;
import g.i.c.a.a.q.c.b;

public abstract class c extends b {
    public boolean b = true;
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f2031d;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = getActivity();
        this.f2031d = getActivity();
    }

    public void onDestroyView() {
        super.onDestroyView();
        getClass().getName();
        String str = a.a;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (getUserVisibleHint() && this.b) {
            this.b = false;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getView() != null && z && this.b) {
            this.b = false;
        }
    }
}
