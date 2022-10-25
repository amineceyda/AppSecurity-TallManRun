package e.h.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.e.f.b;

public abstract class t<E> extends p {
    public final Activity b;
    public final Context c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1504d;

    /* renamed from: e  reason: collision with root package name */
    public final FragmentManager f1505e = new w();

    public t(j jVar) {
        Handler handler = new Handler();
        this.b = jVar;
        b.c(jVar, "context == null");
        this.c = jVar;
        b.c(handler, "handler == null");
        this.f1504d = handler;
    }

    public abstract E e();

    public abstract LayoutInflater g();

    public abstract boolean h(Fragment fragment);

    public abstract boolean i(String str);

    public abstract void j();
}
