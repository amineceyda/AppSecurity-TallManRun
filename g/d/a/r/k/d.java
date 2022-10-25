package g.d.a.r.k;

public abstract class d {

    public static class b extends d {
        public volatile boolean a;

        public b() {
            super((a) null);
        }

        public void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d(a aVar) {
    }

    public abstract void a();
}
