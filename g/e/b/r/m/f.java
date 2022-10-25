package g.e.b.r.m;

import com.google.auto.value.AutoValue;
import g.e.b.r.m.b;

@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(long j2);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        b.C0127b bVar = new b.C0127b();
        bVar.b(0);
        return bVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
