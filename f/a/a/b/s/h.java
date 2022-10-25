package f.a.a.b.s;

import f.a.a.b.e;
import f.a.a.b.g;
import g.a.a.a.a;
import java.util.Objects;

public class h<E> extends h<E> {

    /* renamed from: e  reason: collision with root package name */
    public g<E> f1767e;

    /* renamed from: f  reason: collision with root package name */
    public String f1768f;

    public /* bridge */ /* synthetic */ boolean k() {
        return false;
    }

    public byte[] s() {
        String str = null;
        if (this.f1767e == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Objects.requireNonNull(this.f1767e);
        g gVar = (g) this.f1767e;
        if (gVar.f1766j) {
            StringBuilder i2 = a.i("");
            i2.append(gVar.f1763g);
            str = i2.toString();
        }
        if (str != null) {
            sb.append(str);
        }
        if (sb.length() > 0) {
            sb.append(e.a);
        }
        return sb.toString().getBytes();
    }

    public void start() {
    }

    public void stop() {
    }

    public final void t(StringBuilder sb, String str) {
    }

    public final byte[] u(String str) {
        return str.getBytes();
    }
}
