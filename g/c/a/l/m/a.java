package g.c.a.l.m;

import android.content.Context;
import g.c.a.l.k;
import g.c.a.l.o.j;
import i.o.c.f;
import i.o.c.h;
import i.t.e;
import java.io.File;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class a {
    public static final C0064a c = new C0064a((f) null);

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f2078d = LoggerFactory.getLogger("Comment");

    /* renamed from: e  reason: collision with root package name */
    public static a f2079e;
    public final j a = new j((f) null);
    public List<String> b;

    /* renamed from: g.c.a.l.m.a$a  reason: collision with other inner class name */
    public static final class C0064a {
        public C0064a(f fVar) {
        }

        public final synchronized a a() {
            a aVar;
            if (a.f2079e == null) {
                a.f2079e = new a((f) null);
            }
            aVar = a.f2079e;
            h.c(aVar);
            return aVar;
        }
    }

    public a(f fVar) {
        j jVar = j.a;
    }

    public final synchronized String a(Context context) {
        String str;
        h.e(context, "context");
        k kVar = k.a;
        File file = new File(k.b(context));
        try {
            j jVar = this.a;
            int f2 = g.c.a.l.j.V1_COMMENT.f();
            Objects.requireNonNull(jVar);
            h.e(file, "inFile");
            try {
                str = jVar.a(file, f2);
            } catch (Exception unused) {
                str = "";
            }
        } catch (Exception e2) {
            f2078d.warn("Get comment exception: ", (Throwable) e2);
            str = "";
        }
        boolean z = true;
        if (str.length() == 0) {
            String a2 = b.a(context);
            if (a2 == null) {
                a2 = "";
            }
            str = a2;
        }
        if (str.length() != 0) {
            z = false;
        }
        if (!z) {
            str = e.l(str, "\r\n", "", false, 4);
        }
        f2078d.debug(h.j("comment:", str));
        return str;
    }
}
