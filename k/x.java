package k;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import k.h0.c;
import k.q;
import k.r;
import org.slf4j.helpers.MessageFormatter;

public final class x {
    public final r a;
    public final String b;
    public final q c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final b0 f4956d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f4957e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public volatile c f4958f;

    public static class a {
        @Nullable
        public r a;
        public String b;
        public q.a c;
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public b0 f4959d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f4960e;

        public a() {
            this.f4960e = Collections.emptyMap();
            this.b = "GET";
            this.c = new q.a();
        }

        public a(x xVar) {
            this.f4960e = Collections.emptyMap();
            this.a = xVar.a;
            this.b = xVar.b;
            this.f4959d = xVar.f4956d;
            this.f4960e = xVar.f4957e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(xVar.f4957e);
            this.c = xVar.c.e();
        }

        public x a() {
            if (this.a != null) {
                return new x(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b() {
            e("GET", (b0) null);
            return this;
        }

        public a c(String str, String str2) {
            q.a aVar = this.c;
            Objects.requireNonNull(aVar);
            q.a(str);
            q.b(str2, str);
            aVar.c(str);
            aVar.a.add(str);
            aVar.a.add(str2.trim());
            return this;
        }

        public a d(q qVar) {
            this.c = qVar.e();
            return this;
        }

        public a e(String str, @Nullable b0 b0Var) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (b0Var == null || g.h.a.a.T(str)) {
                if (b0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        throw new IllegalArgumentException(g.a.a.a.a.c("method ", str, " must have a request body."));
                    }
                }
                this.b = str;
                this.f4959d = b0Var;
                return this;
            } else {
                throw new IllegalArgumentException(g.a.a.a.a.c("method ", str, " must not have a request body."));
            }
        }

        public a f(@Nullable Object obj) {
            Class<Object> cls = Object.class;
            if (obj == null) {
                this.f4960e.remove(cls);
            } else {
                if (this.f4960e.isEmpty()) {
                    this.f4960e = new LinkedHashMap();
                }
                this.f4960e.put(cls, cls.cast(obj));
            }
            return this;
        }

        public a g(String str) {
            int i2;
            StringBuilder sb;
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                sb = g.a.a.a.a.i("http:");
                i2 = 3;
            } else {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    sb = g.a.a.a.a.i("https:");
                    i2 = 4;
                }
                r.a aVar = new r.a();
                aVar.c((r) null, str);
                i(aVar.a());
                return this;
            }
            sb.append(str.substring(i2));
            str = sb.toString();
            r.a aVar2 = new r.a();
            aVar2.c((r) null, str);
            i(aVar2.a());
            return this;
        }

        public a h(URL url) {
            String url2 = url.toString();
            r.a aVar = new r.a();
            aVar.c((r) null, url2);
            i(aVar.a());
            return this;
        }

        public a i(r rVar) {
            Objects.requireNonNull(rVar, "url == null");
            this.a = rVar;
            return this;
        }
    }

    public x(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = new q(aVar.c);
        this.f4956d = aVar.f4959d;
        Map<Class<?>, Object> map = aVar.f4960e;
        byte[] bArr = c.a;
        this.f4957e = map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public c a() {
        c cVar = this.f4958f;
        if (cVar != null) {
            return cVar;
        }
        c a2 = c.a(this.c);
        this.f4958f = a2;
        return a2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Request{method=");
        i2.append(this.b);
        i2.append(", url=");
        i2.append(this.a);
        i2.append(", tags=");
        i2.append(this.f4957e);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
