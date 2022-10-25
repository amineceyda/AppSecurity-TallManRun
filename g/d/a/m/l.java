package g.d.a.m;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import g.d.a.g;
import g.d.a.r.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class l implements Handler.Callback {

    /* renamed from: i  reason: collision with root package name */
    public static final b f2636i = new a();
    public volatile g a;
    public final Map<FragmentManager, k> b = new HashMap();
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2637d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2638e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.a<View, Fragment> f2639f = new e.d.a<>();

    /* renamed from: g  reason: collision with root package name */
    public final e.d.a<View, android.app.Fragment> f2640g = new e.d.a<>();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f2641h = new Bundle();

    public class a implements b {
    }

    public interface b {
    }

    public l(b bVar) {
        this.f2638e = bVar == null ? f2636i : bVar;
        this.f2637d = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    c(next.getChildFragmentManager().K(), map);
                }
            }
        }
    }

    public static boolean l(Context context) {
        Activity a2 = a(context);
        return a2 == null || !a2.isFinishing();
    }

    @TargetApi(26)
    @Deprecated
    public final void b(FragmentManager fragmentManager, e.d.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment next : fragmentManager.getFragments()) {
                if (next.getView() != null) {
                    aVar.put(next.getView(), next);
                    b(next.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            this.f2641h.putInt("key", i2);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.f2641h, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), aVar);
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public final g d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        k j2 = j(fragmentManager, fragment, z);
        g gVar = j2.f2633e;
        if (gVar != null) {
            return gVar;
        }
        g.d.a.b b2 = g.d.a.b.b(context);
        b bVar = this.f2638e;
        a aVar = j2.b;
        m mVar = j2.c;
        Objects.requireNonNull((a) bVar);
        g gVar2 = new g(b2, aVar, mVar, context);
        j2.f2633e = gVar2;
        return gVar2;
    }

    public g e(Activity activity) {
        if (j.g()) {
            return g(activity.getApplicationContext());
        }
        if (!activity.isDestroyed()) {
            return d(activity, activity.getFragmentManager(), (android.app.Fragment) null, l(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    @TargetApi(17)
    @Deprecated
    public g f(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (j.g()) {
            return g(fragment.getActivity().getApplicationContext());
        } else {
            return d(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    public g g(Context context) {
        if (context != null) {
            if (j.h() && !(context instanceof Application)) {
                if (context instanceof e.h.b.j) {
                    return i((e.h.b.j) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return g(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        g.d.a.b b2 = g.d.a.b.b(context.getApplicationContext());
                        b bVar = this.f2638e;
                        b bVar2 = new b();
                        g gVar = new g();
                        Context applicationContext = context.getApplicationContext();
                        Objects.requireNonNull((a) bVar);
                        this.a = new g(b2, bVar2, gVar, applicationContext);
                    }
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public g h(Fragment fragment) {
        Objects.requireNonNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (j.g()) {
            return g(fragment.getContext().getApplicationContext());
        }
        return m(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i2 = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i2 == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.b;
        } else if (i2 != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (androidx.fragment.app.FragmentManager) message.obj;
            map = this.c;
        }
        Object obj4 = obj2;
        obj3 = map.remove(obj2);
        obj = obj4;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    public g i(e.h.b.j jVar) {
        if (j.g()) {
            return g(jVar.getApplicationContext());
        }
        if (!jVar.isDestroyed()) {
            return m(jVar, jVar.k(), (Fragment) null, l(jVar));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final k j(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.b.get(fragmentManager)) == null) {
            kVar = new k();
            kVar.f2635g = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                kVar.a(fragment.getActivity());
            }
            if (z) {
                kVar.b.d();
            }
            this.b.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f2637d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    public final SupportRequestManagerFragment k(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.H("com.bumptech.glide.manager");
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.c.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.setParentFragmentHint(fragment);
            if (z) {
                supportRequestManagerFragment.getGlideLifecycle().d();
            }
            this.c.put(fragmentManager, supportRequestManagerFragment);
            e.h.b.a aVar = new e.h.b.a(fragmentManager);
            aVar.d(0, supportRequestManagerFragment, "com.bumptech.glide.manager", 1);
            aVar.g(true);
            this.f2637d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    public final g m(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        SupportRequestManagerFragment k2 = k(fragmentManager, fragment, z);
        g requestManager = k2.getRequestManager();
        if (requestManager != null) {
            return requestManager;
        }
        g.d.a.b b2 = g.d.a.b.b(context);
        b bVar = this.f2638e;
        a glideLifecycle = k2.getGlideLifecycle();
        m requestManagerTreeNode = k2.getRequestManagerTreeNode();
        Objects.requireNonNull((a) bVar);
        g gVar = new g(b2, glideLifecycle, requestManagerTreeNode, context);
        k2.setRequestManager(gVar);
        return gVar;
    }
}
