package g.i.c.a.a.b0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.c.b.b.f;
import g.i.c.a.a.s.a;
import g.i.c.a.a.s.t;

public class n {
    public static final Rect a = new Rect();

    public static Activity a(View view) {
        if (!p.a(view)) {
            return null;
        }
        Object u = t.b.a.u(view.getRootView());
        if (u instanceof Activity) {
            return (Activity) u;
        }
        if (u instanceof Dialog) {
            return a.a((Dialog) u);
        }
        return null;
    }

    public static String b(View view) {
        if (view == null) {
            return "null";
        }
        String str = "0";
        int id = view.getId();
        if (id != -1) {
            try {
                Context c = f.c();
                if (c != null) {
                    str = c.getResources().getResourceName(id);
                }
            } catch (Resources.NotFoundException e2) {
                f.x("UIUtils", "NotFoundException " + e2);
            }
        }
        return view.getClass().getSimpleName() + Constants.KEY_INDEX_FILE_SEPARATOR + str;
    }
}
