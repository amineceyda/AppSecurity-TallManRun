package g.d.a.l.t;

import g.a.a.a.a;
import g.d.a.l.l;
import g.d.a.l.n;
import g.d.a.l.r;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class o implements l {
    public final Object b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2515d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f2516e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f2517f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2518g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, r<?>> f2519h;

    /* renamed from: i  reason: collision with root package name */
    public final n f2520i;

    /* renamed from: j  reason: collision with root package name */
    public int f2521j;

    public o(Object obj, l lVar, int i2, int i3, Map<Class<?>, r<?>> map, Class<?> cls, Class<?> cls2, n nVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.b = obj;
        Objects.requireNonNull(lVar, "Signature must not be null");
        this.f2518g = lVar;
        this.c = i2;
        this.f2515d = i3;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f2519h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f2516e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f2517f = cls2;
        Objects.requireNonNull(nVar, "Argument must not be null");
        this.f2520i = nVar;
    }

    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.b.equals(oVar.b) && this.f2518g.equals(oVar.f2518g) && this.f2515d == oVar.f2515d && this.c == oVar.c && this.f2519h.equals(oVar.f2519h) && this.f2516e.equals(oVar.f2516e) && this.f2517f.equals(oVar.f2517f) && this.f2520i.equals(oVar.f2520i);
    }

    public int hashCode() {
        if (this.f2521j == 0) {
            int hashCode = this.b.hashCode();
            this.f2521j = hashCode;
            int hashCode2 = this.f2518g.hashCode() + (hashCode * 31);
            this.f2521j = hashCode2;
            int i2 = (hashCode2 * 31) + this.c;
            this.f2521j = i2;
            int i3 = (i2 * 31) + this.f2515d;
            this.f2521j = i3;
            int hashCode3 = this.f2519h.hashCode() + (i3 * 31);
            this.f2521j = hashCode3;
            int hashCode4 = this.f2516e.hashCode() + (hashCode3 * 31);
            this.f2521j = hashCode4;
            int hashCode5 = this.f2517f.hashCode() + (hashCode4 * 31);
            this.f2521j = hashCode5;
            this.f2521j = this.f2520i.hashCode() + (hashCode5 * 31);
        }
        return this.f2521j;
    }

    public String toString() {
        StringBuilder i2 = a.i("EngineKey{model=");
        i2.append(this.b);
        i2.append(", width=");
        i2.append(this.c);
        i2.append(", height=");
        i2.append(this.f2515d);
        i2.append(", resourceClass=");
        i2.append(this.f2516e);
        i2.append(", transcodeClass=");
        i2.append(this.f2517f);
        i2.append(", signature=");
        i2.append(this.f2518g);
        i2.append(", hashCode=");
        i2.append(this.f2521j);
        i2.append(", transformations=");
        i2.append(this.f2519h);
        i2.append(", options=");
        i2.append(this.f2520i);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
