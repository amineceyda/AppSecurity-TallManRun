package g.i.c.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import g.i.c.a.a.q.c.a;

public interface d {
    void a(Object obj, Window window, MotionEvent motionEvent, boolean z, boolean z2);

    void c(Activity activity, Dialog dialog);

    void d(AbsListView absListView, int i2);

    void e(a aVar);

    void f(ViewGroup viewGroup, View view, long j2);

    void g(a aVar);

    void h(View view);

    void i(e.o.a.a aVar);

    void j(Activity activity, Configuration configuration);

    void k(Activity activity);

    void l(Activity activity);

    void m(a aVar);

    void n(TextView textView, int i2, KeyEvent keyEvent, int i3);

    void o(e.o.a.a aVar);

    void onActivityDestroyed(Activity activity);

    void onActivityStarted(Activity activity);

    void onActivityStopped(Activity activity);

    void p(Activity activity, Dialog dialog);

    void r(ViewPager viewPager);

    void s(Activity activity);
}
