package g.d.a.l.t;

import g.a.a.a.a;
import g.d.a.l.l;
import g.d.a.l.n;
import g.d.a.l.r;
import g.d.a.l.t.b0.b;
import g.d.a.r.g;
import g.d.a.r.j;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import org.slf4j.helpers.MessageFormatter;

public final class x implements l {

    /* renamed from: j  reason: collision with root package name */
    public static final g<Class<?>, byte[]> f2538j = new g<>(50);
    public final b b;
    public final l c;

    /* renamed from: d  reason: collision with root package name */
    public final l f2539d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2540e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2541f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f2542g;

    /* renamed from: h  reason: collision with root package name */
    public final n f2543h;

    /* renamed from: i  reason: collision with root package name */
    public final r<?> f2544i;

    public x(b bVar, l lVar, l lVar2, int i2, int i3, r<?> rVar, Class<?> cls, n nVar) {
        this.b = bVar;
        this.c = lVar;
        this.f2539d = lVar2;
        this.f2540e = i2;
        this.f2541f = i3;
        this.f2544i = rVar;
        this.f2542g = cls;
        this.f2543h = nVar;
    }

    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f2540e).putInt(this.f2541f).array();
        this.f2539d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        r<?> rVar = this.f2544i;
        if (rVar != null) {
            rVar.b(messageDigest);
        }
        this.f2543h.b(messageDigest);
        g<Class<?>, byte[]> gVar = f2538j;
        byte[] a = gVar.a(this.f2542g);
        if (a == null) {
            a = this.f2542g.getName().getBytes(l.a);
            gVar.d(this.f2542g, a);
        }
        messageDigest.update(a);
        this.b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2541f == xVar.f2541f && this.f2540e == xVar.f2540e && j.b(this.f2544i, xVar.f2544i) && this.f2542g.equals(xVar.f2542g) && this.c.equals(xVar.c) && this.f2539d.equals(xVar.f2539d) && this.f2543h.equals(xVar.f2543h);
    }

    public int hashCode() {
        int hashCode = ((((this.f2539d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.f2540e) * 31) + this.f2541f;
        r<?> rVar = this.f2544i;
        if (rVar != null) {
            hashCode = (hashCode * 31) + rVar.hashCode();
        }
        int hashCode2 = this.f2542g.hashCode();
        return this.f2543h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder i2 = a.i("ResourceCacheKey{sourceKey=");
        i2.append(this.c);
        i2.append(", signature=");
        i2.append(this.f2539d);
        i2.append(", width=");
        i2.append(this.f2540e);
        i2.append(", height=");
        i2.append(this.f2541f);
        i2.append(", decodedResourceClass=");
        i2.append(this.f2542g);
        i2.append(", transformation='");
        i2.append(this.f2544i);
        i2.append('\'');
        i2.append(", options=");
        i2.append(this.f2543h);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
