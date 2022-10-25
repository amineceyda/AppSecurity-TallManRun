package g.c.b.a.l;

import com.google.gson.Gson;
import g.c.b.b.f;
import g.e.c.e;
import i.c;
import i.o.c.h;
import i.o.c.i;
import org.slf4j.helpers.MessageFormatter;

public final class a {
    public static final a a = null;
    public static final c b = f.U(C0074a.b);

    /* renamed from: g.c.b.a.l.a$a  reason: collision with other inner class name */
    public static final class C0074a extends i implements i.o.b.a<Gson> {
        public static final C0074a b = new C0074a();

        public C0074a() {
            super(0);
        }

        public Object a() {
            e eVar = new e();
            eVar.c = g.e.c.c.LOWER_CASE_WITH_UNDERSCORES;
            return eVar.a();
        }
    }

    public static final <T> T a(String str, Class<T> cls) {
        h.e(str, "json");
        h.e(cls, "classOfT");
        try {
            return f.y0(cls).cast(((Gson) b.getValue()).e(str, cls));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String b(Object obj) {
        String str;
        h.e(obj, "src");
        try {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = ((Gson) b.getValue()).i(obj);
            }
            h.d(str, "{\n            when (src)…)\n            }\n        }");
            return str;
        } catch (Throwable unused) {
            return MessageFormatter.DELIM_STR;
        }
    }
}
