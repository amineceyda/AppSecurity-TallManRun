package g.i.c.a.a.m;

import android.app.Activity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public class f implements e {
    public static final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());

    public boolean a(Activity activity) {
        return a.contains(activity);
    }
}
