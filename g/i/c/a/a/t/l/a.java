package g.i.c.a.a.t.l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import g.c.b.b.f;
import g.i.c.a.a.i.b;
import g.i.c.a.a.l.c;
import g.i.c.a.a.r.e;
import g.i.c.a.a.t.g;
import g.i.c.a.a.t.k.l;
import g.i.c.a.a.u.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

public class a extends g.i.c.a.a.i.a {
    public static final HashMap<Integer, String> a;

    public static class b {
        public static final a a;

        static {
            a aVar = new a((C0180a) null);
            a = aVar;
            Objects.requireNonNull(aVar);
            b.C0166b.a.b.c.a(aVar);
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put(6, "DONE");
        hashMap.put(2, "GO");
        hashMap.put(3, "SEARCH");
        hashMap.put(4, "SEND");
    }

    public a(C0180a aVar) {
        if (e.b.a.a) {
            f.w("KeyBoardClickReporter", "init ");
        }
    }

    public static a t() {
        return b.a;
    }

    public void h(View view) {
        g.i.c.a.a.l.b a2 = g.i.c.a.a.l.a.a(view);
        if (a2 != null && l.c(a2)) {
            Object d2 = c.d(view, "submitTarget");
            Object obj = d2 instanceof WeakReference ? ((WeakReference) d2).get() : null;
            if (obj instanceof TextView) {
                TextView textView = (TextView) obj;
                int imeOptions = textView.getImeOptions();
                if (imeOptions == 0) {
                    imeOptions = 6;
                }
                n(textView, imeOptions, (KeyEvent) null, 2);
            }
        } else if (e.b.a.a) {
            f.w("KeyBoardClickReporter", "onViewClick: dataEntity=" + a2);
        }
    }

    public void n(TextView textView, int i2, KeyEvent keyEvent, int i3) {
        g.i.c.a.a.l.b a2 = g.i.c.a.a.l.a.a(textView);
        if (a2 != null) {
            HashMap<Integer, String> hashMap = a;
            if (hashMap.containsKey(Integer.valueOf(i2))) {
                g.i.c.a.a.u.c a3 = a.b.a.a("dt_submit", e.e.i.b.e(textView));
                if (a3 != null) {
                    a3.a = "dt_submit";
                    a3.b = c.c(textView);
                    a3.b("dt_submit_type", hashMap.get(Integer.valueOf(i2)));
                    a3.b("dt_submit_way", Integer.valueOf(i3));
                    g.i.c.a.a.c cVar = e.b.a.f4498g;
                    if (cVar != null) {
                        cVar.b("dt_submit", a3.c);
                    }
                    g.d(textView, a3, false, false);
                }
            } else if (e.b.a.a) {
                f.w("KeyBoardClickReporter", "onEditorAction: isValidAction " + i2);
            }
        } else if (e.b.a.a) {
            f.w("KeyBoardClickReporter", "onEditorAction: dataEntity=" + a2);
        }
    }
}
