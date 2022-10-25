package g.i.c.a.a.s;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class a {
    public static WeakHashMap<Activity, List<WeakReference<Dialog>>> a = new WeakHashMap<>();

    public static Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static List<WeakReference<Dialog>> b(Activity activity) {
        return a.get(activity);
    }

    public static void c(Dialog dialog) {
        Activity a2 = a(dialog);
        if (a2 != null) {
            List b = b(a2);
            if (b == null) {
                b = new ArrayList();
                a.put(a2, b);
            }
            e(dialog, b);
            b.add(new WeakReference(dialog));
        }
    }

    public static void d(Dialog dialog) {
        List<WeakReference<Dialog>> b;
        Activity a2 = a(dialog);
        if (a2 != null && (b = b(a2)) != null) {
            e(dialog, b);
        }
    }

    public static void e(Dialog dialog, List<WeakReference<Dialog>> list) {
        Iterator<WeakReference<Dialog>> it = list.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            Dialog dialog2 = next == null ? null : (Dialog) next.get();
            if (dialog2 == null || dialog2 == dialog) {
                it.remove();
            }
        }
    }
}
