package g.i.c.a.a.m;

public class d {
    public static b a;
    public static e b;

    public static class a {
        public static a a = new a();
    }

    public static class b {
        public static f a = new f();
    }

    static {
        b bVar = new b();
        a = bVar;
        b = bVar;
    }

    public static void a(int i2) {
        if (i2 == 1) {
            b = a.a;
        } else if (i2 != 2) {
            b = a;
        } else {
            b = b.a;
        }
    }
}
