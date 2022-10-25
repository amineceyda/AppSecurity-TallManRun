package g.d.a.p;

public interface c {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        f2653e(true),
        FAILED(true);
        
        private final boolean isComplete;

        /* access modifiers changed from: public */
        a(boolean z) {
            this.isComplete = z;
        }

        public boolean a() {
            return this.isComplete;
        }
    }

    void a(b bVar);

    boolean c();

    boolean f(b bVar);

    boolean g(b bVar);

    c h();

    void j(b bVar);

    boolean l(b bVar);
}
