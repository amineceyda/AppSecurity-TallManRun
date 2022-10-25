package g.e.a.a.f.z.h;

import com.google.auto.value.AutoValue;
import g.e.a.a.f.z.h.r;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@AutoValue
public abstract class t {

    @AutoValue
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: g.e.a.a.f.z.h.t$a$a  reason: collision with other inner class name */
        public static abstract class C0105a {
            public abstract a a();

            public abstract C0105a b(long j2);

            public abstract C0105a c(long j2);
        }

        public static C0105a a() {
            r.b bVar = new r.b();
            Set<b> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            bVar.c = emptySet;
            return bVar;
        }

        public abstract long b();

        public abstract Set<b> c();

        public abstract long d();
    }

    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract g.e.a.a.f.b0.a a();

    public long b(g.e.a.a.b bVar, long j2, int i2) {
        long a2 = j2 - a().a();
        a aVar = c().get(bVar);
        long b2 = aVar.b();
        int i3 = i2 - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((b2 > 1 ? b2 : 2) * ((long) i3))));
        double pow = Math.pow(3.0d, (double) i3);
        double d2 = (double) b2;
        Double.isNaN(d2);
        Double.isNaN(d2);
        return Math.min(Math.max((long) (pow * d2 * max), a2), aVar.d());
    }

    public abstract Map<g.e.a.a.b, a> c();
}
