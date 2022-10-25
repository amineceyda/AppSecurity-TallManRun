package g.e.a.a.f.x.a;

import g.e.b.n.j.e;

public final class c {
    public static final /* synthetic */ int c = 0;
    public final long a;
    public final a b;

    public enum a implements e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        /* access modifiers changed from: public */
        a(int i2) {
            this.number_ = i2;
        }

        public int a() {
            return this.number_;
        }
    }

    public c(long j2, a aVar) {
        this.a = j2;
        this.b = aVar;
    }
}
