package g.e.b.r.l;

import com.google.auto.value.AutoValue;
import g.e.b.r.l.c;

@AutoValue
public abstract class d {
    public static final /* synthetic */ int a = 0;

    @AutoValue.Builder
    public static abstract class a {
        public abstract d a();

        public abstract a b(c.a aVar);
    }

    static {
        Long l2 = 0L;
        String str = l2 == null ? " expiresInSecs" : "";
        if (l2 == null) {
            str = g.a.a.a.a.w(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            l2.longValue();
            l2.longValue();
            return;
        }
        throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract c.a f();

    public abstract long g();

    public boolean h() {
        return f() == c.a.REGISTER_ERROR;
    }

    public boolean i() {
        c.a aVar = ((a) this).c;
        return aVar == c.a.NOT_GENERATED || aVar == c.a.ATTEMPT_MIGRATION;
    }

    public abstract a j();
}
