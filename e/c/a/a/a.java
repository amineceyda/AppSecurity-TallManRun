package e.c.a.a;

public class a extends c {
    public static volatile a c;
    public c a;
    public c b;

    public a() {
        b bVar = new b();
        this.b = bVar;
        this.a = bVar;
    }

    public static a b() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
        }
        return c;
    }

    public boolean a() {
        return this.a.a();
    }
}
