package k.h0.i;

import com.tencent.raft.codegenmeta.utils.Constants;
import k.h0.c;
import l.h;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final h f4797d = h.g(Constants.KEY_INDEX_FILE_SEPARATOR);

    /* renamed from: e  reason: collision with root package name */
    public static final h f4798e = h.g(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final h f4799f = h.g(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final h f4800g = h.g(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final h f4801h = h.g(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final h f4802i = h.g(":authority");
    public final h a;
    public final h b;
    public final int c;

    public b(String str, String str2) {
        this(h.g(str), h.g(str2));
    }

    public b(h hVar, String str) {
        this(hVar, h.g(str));
    }

    public b(h hVar, h hVar2) {
        this.a = hVar;
        this.b = hVar2;
        this.c = hVar2.p() + hVar.p() + 32;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + 527) * 31);
    }

    public String toString() {
        return c.n("%s: %s", this.a.t(), this.b.t());
    }
}
