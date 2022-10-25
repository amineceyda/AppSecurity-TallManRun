package g.i.c.a.a.s;

import android.content.Context;
import android.view.View;
import g.c.b.b.f;
import g.i.c.a.a.b0.p;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class j {
    public WeakHashMap<Context, Set<View>> a = new WeakHashMap<>();
    public Set<View> b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public final void a(View view, Context context) {
        Set set = this.a.get(context);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
            this.a.put(context, set);
        }
        set.add(view);
        f.w("PageInfoCacheController", "view = " + view + ", context = " + context);
    }

    public final Context b(Object obj, View view) {
        if ((!(obj instanceof View) || p.a((View) obj)) && view != null) {
            return view.getRootView().getContext();
        }
        return null;
    }
}
