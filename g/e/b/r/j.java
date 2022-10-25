package g.e.b.r;

import g.e.b.r.n.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class j {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static j f3738d;
    public final a a;

    public j(a aVar) {
        this.a = aVar;
    }

    public static j c() {
        if (a.a == null) {
            a.a = new a();
        }
        a aVar = a.a;
        if (f3738d == null) {
            f3738d = new j(aVar);
        }
        return f3738d;
    }

    public long a() {
        Objects.requireNonNull(this.a);
        return System.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }
}
