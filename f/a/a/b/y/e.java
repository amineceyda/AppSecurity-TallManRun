package f.a.a.b.y;

import f.a.a.b.y.d;
import java.util.List;

public class e {
    public final String a;
    public final int b;
    public a c = a.LITERAL_STATE;

    /* renamed from: d  reason: collision with root package name */
    public int f1862d = 0;

    public enum a {
        LITERAL_STATE,
        START_STATE,
        DEFAULT_VAL_STATE
    }

    public e(String str) {
        this.a = str;
        this.b = str.length();
    }

    public final void a(List<d> list, StringBuilder sb) {
        if (sb.length() != 0) {
            list.add(new d(d.a.LITERAL, sb.toString()));
        }
    }
}
