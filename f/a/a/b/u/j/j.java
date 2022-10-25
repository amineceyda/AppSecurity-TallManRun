package f.a.a.b.u.j;

import java.util.Comparator;

public class j implements Comparator<String> {
    public final /* synthetic */ k b;

    public j(k kVar) {
        this.b = kVar;
    }

    public int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int i2 = 0;
        for (l next : this.b.a) {
            Comparable a = next.a(str2);
            Comparable a2 = next.a(str);
            if (!(a == null || a2 == null)) {
                i2 += a.compareTo(a2);
            }
        }
        return i2 == 0 ? str2.compareTo(str) : i2;
    }
}
