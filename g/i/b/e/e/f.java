package g.i.b.e.e;

import java.io.Serializable;
import java.util.Map;

public final class f implements Serializable {
    public long a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public long f4178d;

    /* renamed from: e  reason: collision with root package name */
    public long f4179e;

    /* renamed from: f  reason: collision with root package name */
    private String f4180f;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f4181g;

    public final synchronized String a() {
        return this.f4180f;
    }

    public final synchronized void b(String str) {
        this.f4180f = str;
    }

    public final synchronized void c(Map<String, String> map) {
        this.f4181g = map;
    }

    public final synchronized Map<String, String> d() {
        return this.f4181g;
    }
}
