package g.e.a.a.f;

import com.google.auto.value.AutoValue;
import g.e.a.a.f.h;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class l {

    @AutoValue.Builder
    public static abstract class a {
        public final a a(String str, String str2) {
            c().put(str, str2);
            return this;
        }

        public abstract l b();

        public abstract Map<String, String> c();

        public abstract a d(k kVar);

        public abstract a e(long j2);

        public abstract a f(String str);

        public abstract a g(long j2);
    }

    public static a a() {
        h.b bVar = new h.b();
        bVar.f2761f = new HashMap();
        return bVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract k e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String h();

    public abstract long i();

    public a j() {
        h.b bVar = new h.b();
        bVar.f(h());
        bVar.b = d();
        bVar.d(e());
        bVar.e(f());
        bVar.g(i());
        bVar.f2761f = new HashMap(c());
        return bVar;
    }
}
