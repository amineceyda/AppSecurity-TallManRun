package e.h.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.h.b.j0;

public class l implements Animation.AnimationListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ j0.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e.e.f.a f1480d;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (l.this.b.getAnimatingAway() != null) {
                l.this.b.setAnimatingAway((View) null);
                l lVar = l.this;
                ((FragmentManager.d) lVar.c).a(lVar.b, lVar.f1480d);
            }
        }
    }

    public l(ViewGroup viewGroup, Fragment fragment, j0.a aVar, e.e.f.a aVar2) {
        this.a = viewGroup;
        this.b = fragment;
        this.c = aVar;
        this.f1480d = aVar2;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
