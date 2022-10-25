package g.d.a.l.t;

public abstract class k {
    public static final k a = new a();
    public static final k b = new b();
    public static final k c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final k f2494d = new d();

    public class a extends k {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(g.d.a.l.a aVar) {
            return aVar == g.d.a.l.a.REMOTE;
        }

        public boolean d(boolean z, g.d.a.l.a aVar, g.d.a.l.c cVar) {
            return (aVar == g.d.a.l.a.RESOURCE_DISK_CACHE || aVar == g.d.a.l.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends k {
        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(g.d.a.l.a aVar) {
            return false;
        }

        public boolean d(boolean z, g.d.a.l.a aVar, g.d.a.l.c cVar) {
            return false;
        }
    }

    public class c extends k {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(g.d.a.l.a aVar) {
            return (aVar == g.d.a.l.a.DATA_DISK_CACHE || aVar == g.d.a.l.a.MEMORY_CACHE) ? false : true;
        }

        public boolean d(boolean z, g.d.a.l.a aVar, g.d.a.l.c cVar) {
            return false;
        }
    }

    public class d extends k {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(g.d.a.l.a aVar) {
            return aVar == g.d.a.l.a.REMOTE;
        }

        public boolean d(boolean z, g.d.a.l.a aVar, g.d.a.l.c cVar) {
            return ((z && aVar == g.d.a.l.a.DATA_DISK_CACHE) || aVar == g.d.a.l.a.LOCAL) && cVar == g.d.a.l.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(g.d.a.l.a aVar);

    public abstract boolean d(boolean z, g.d.a.l.a aVar, g.d.a.l.c cVar);
}
