package g.i.c.a.a.l;

import android.view.View;

public class a {
    public static final c a = new d((C0168a) null);
    public static final c b = new b((C0168a) null);

    public static class b implements c {
        public b(C0168a aVar) {
        }

        public b a(Object obj) {
            return (b) e.a.a.get(obj);
        }

        public void b(Object obj, b bVar) {
            e.a.a.put(obj, bVar);
        }
    }

    public interface c {
        b a(Object obj);

        void b(Object obj, b bVar);
    }

    public static class d implements c {
        public d(C0168a aVar) {
        }

        public b a(Object obj) {
            if (!(obj instanceof View)) {
                return null;
            }
            try {
                Object tag = ((View) obj).getTag(2131297030);
                if (tag instanceof b) {
                    return (b) tag;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public void b(Object obj, b bVar) {
            if (obj instanceof View) {
                try {
                    ((View) obj).setTag(2131297030, bVar);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static b a(Object obj) {
        if (obj == null) {
            return null;
        }
        return (obj instanceof View ? a : b).a(obj);
    }
}
