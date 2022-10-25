package g.d.a.r.k;

import android.util.Log;
import g.d.a.r.k.d;

public final class a {
    public static final e<Object> a = new C0101a();

    /* renamed from: g.d.a.r.k.a$a  reason: collision with other inner class name */
    public class C0101a implements e<Object> {
        public void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements e.e.i.c<T> {
        public final b<T> a;
        public final e<T> b;
        public final e.e.i.c<T> c;

        public c(e.e.i.c<T> cVar, b<T> bVar, e<T> eVar) {
            this.c = cVar;
            this.a = bVar;
            this.b = eVar;
        }

        public boolean a(T t) {
            if (t instanceof d) {
                ((d.b) ((d) t).e()).a = true;
            }
            this.b.a(t);
            return this.c.a(t);
        }

        public T b() {
            T b2 = this.c.b();
            if (b2 == null) {
                b2 = this.a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder i2 = g.a.a.a.a.i("Created new ");
                    i2.append(b2.getClass());
                    Log.v("FactoryPools", i2.toString());
                }
            }
            if (b2 instanceof d) {
                ((d.b) ((d) b2).e()).a = false;
            }
            return b2;
        }
    }

    public interface d {
        d e();
    }

    public interface e<T> {
        void a(T t);
    }

    public static <T extends d> e.e.i.c<T> a(int i2, b<T> bVar) {
        return new c(new e.e.i.d(i2), bVar, a);
    }
}
