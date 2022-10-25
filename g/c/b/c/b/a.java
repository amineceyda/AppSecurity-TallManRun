package g.c.b.c.b;

import i.o.b.l;
import i.o.c.h;
import java.io.InputStream;
import java.util.List;

public final class a {
    public final l<String, InputStream> a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f2308d;

    /* renamed from: e  reason: collision with root package name */
    public String f2309e;

    /* renamed from: f  reason: collision with root package name */
    public String f2310f;

    /* renamed from: g  reason: collision with root package name */
    public List<C0077a> f2311g;

    /* renamed from: h  reason: collision with root package name */
    public List<b> f2312h;

    /* renamed from: g.c.b.c.b.a$a  reason: collision with other inner class name */
    public static final class C0077a {
        public String a;
        public long b;
    }

    public static final class b {
        public String a;
        public long b;
        public String c;
    }

    public a(l<? super String, ? extends InputStream> lVar) {
        h.e(lVar, "getFileInputStreamFunc");
        this.a = lVar;
    }

    public final InputStream a(String str) {
        return this.a.g(str);
    }
}
