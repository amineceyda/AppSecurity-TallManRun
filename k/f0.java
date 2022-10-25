package k;

import g.a.a.a.a;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;
import javax.annotation.Nullable;

public final class f0 {
    public final a a;
    public final Proxy b;
    public final InetSocketAddress c;

    public f0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.a = aVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public boolean a() {
        return this.a.f4675i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            return f0Var.a.equals(this.a) && f0Var.b.equals(this.b) && f0Var.c.equals(this.c);
        }
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder i2 = a.i("Route{");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
