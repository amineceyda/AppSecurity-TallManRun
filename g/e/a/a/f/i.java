package g.e.a.a.f;

import g.e.a.a.f.p;
import java.util.Arrays;
import java.util.Objects;

public final class i extends p {
    public final String a;
    public final byte[] b;
    public final g.e.a.a.b c;

    public static final class b extends p.a {
        public String a;
        public byte[] b;
        public g.e.a.a.b c;

        public p a() {
            String str = this.a == null ? " backendName" : "";
            if (this.c == null) {
                str = g.a.a.a.a.w(str, " priority");
            }
            if (str.isEmpty()) {
                return new i(this.a, this.b, this.c, (a) null);
            }
            throw new IllegalStateException(g.a.a.a.a.w("Missing required properties:", str));
        }

        public p.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        public p.a c(g.e.a.a.b bVar) {
            Objects.requireNonNull(bVar, "Null priority");
            this.c = bVar;
            return this;
        }
    }

    public i(String str, byte[] bArr, g.e.a.a.b bVar, a aVar) {
        this.a = str;
        this.b = bArr;
        this.c = bVar;
    }

    public String b() {
        return this.a;
    }

    public byte[] c() {
        return this.b;
    }

    public g.e.a.a.b d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a.equals(pVar.b())) {
            return Arrays.equals(this.b, pVar instanceof i ? ((i) pVar).b : pVar.c()) && this.c.equals(pVar.d());
        }
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
