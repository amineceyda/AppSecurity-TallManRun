package g.f.a.e;

public interface b {

    public enum a {
        TRACE(1),
        DEBUG(2),
        INFO(3),
        WARNING(4),
        ERROR(5),
        FATAL(6);
        
        private int level;

        /* access modifiers changed from: public */
        a(int i2) {
            this.level = i2;
        }

        public boolean a(a aVar) {
            return this.level <= aVar.level;
        }
    }

    boolean a(a aVar);

    void b(a aVar, String str, Throwable th);

    void c(a aVar, String str);
}
