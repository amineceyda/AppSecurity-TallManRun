package f.a.a.b.v;

import f.a.a.b.q.c.d;
import java.util.List;
import java.util.Map;

public abstract class a<E> {
    public final List<d> a;
    public String b;
    public Map<String, String> c;

    public a(List<d> list, String str, Map<String, String> map) {
        this.a = list.subList(1, list.size() - 1);
        this.b = str;
        this.c = map;
    }
}
