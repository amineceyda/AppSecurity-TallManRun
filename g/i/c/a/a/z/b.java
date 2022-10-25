package g.i.c.a.a.z;

import e.d.g;
import java.util.Map;

public class b {
    public static Map<String, C0188b> a = new e.d.a();

    /* renamed from: g.i.c.a.a.z.b$b  reason: collision with other inner class name */
    public static class C0188b {
        public int a = 0;
        public long b = 0;
        public long c = -1;

        public C0188b() {
        }

        public C0188b(a aVar) {
        }
    }

    public static C0188b a(String str) {
        C0188b bVar = (C0188b) ((g) a).get(str);
        if (bVar != null) {
            return bVar;
        }
        C0188b bVar2 = new C0188b((a) null);
        ((g) a).put(str, bVar2);
        return bVar2;
    }
}
