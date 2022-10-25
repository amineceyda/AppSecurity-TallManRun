package f.a.a.b.x;

import java.util.ArrayList;
import java.util.List;

public class g {
    public static List<d> a(List<d> list, long j2) {
        ArrayList arrayList = new ArrayList();
        for (d next : list) {
            if (next.b().longValue() >= j2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
