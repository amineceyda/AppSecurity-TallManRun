package g.c.b.a.g.c;

import i.o.c.h;
import java.io.File;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k.e;
import k.u;

public final class c {
    @Deprecated
    public static final u c;
    public final a a;
    public final String b;

    public static final class a {
        public g.c.b.a.c a;
        public e b;

        public final g.c.b.a.c a() {
            g.c.b.a.c cVar = this.a;
            if (cVar != null) {
                return cVar;
            }
            h.k("request");
            throw null;
        }
    }

    static {
        u.b bVar = new u.b();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        bVar.b(1, timeUnit);
        bVar.c(1, timeUnit);
        bVar.u = k.h0.c.d("timeout", 1, timeUnit);
        bVar.f4934d.add(new b());
        bVar.n = new k.h(10, 60, TimeUnit.SECONDS);
        c = new u(bVar);
    }

    public c(a aVar) {
        h.e(aVar, "builder");
        this.a = aVar;
        this.b = h.j("HttpClientChannel|", aVar.a().e());
    }

    public final String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (h.g(charAt, 31) <= 0 || h.g(charAt, 127) >= 0) {
                String format = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(charAt)}, 1));
                h.d(format, "java.lang.String.format(format, *args)");
                stringBuffer.append(format);
            } else {
                stringBuffer.append(charAt);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        h.d(stringBuffer2, "stringBuffer.toString()");
        return stringBuffer2;
    }

    public final void b() {
        g.c.b.a.c a2 = this.a.a();
        String str = a2.f2200i;
        g.c.b.a.l.c cVar = g.c.b.a.l.c.a;
        cVar.d(this.b, h.j("url: ", a2.f2197f));
        cVar.d(this.b, h.j("contentType: ", a2.f2198g));
        cVar.d(this.b, h.j("method: ", a2.f2199h));
        cVar.d(this.b, h.j("headers: ", a2.c));
        boolean z = true;
        if (!(str instanceof String ? true : str instanceof l.h)) {
            z = str instanceof byte[];
        }
        if (!z) {
            if (str instanceof File) {
                cVar.d(this.b, h.j("argument: file://", ((File) str).getAbsolutePath()));
                return;
            } else if (!(str instanceof Map)) {
                str = str == null ? "argument is null." : "argument type must be String,ByteString,ByteArray,File,Map";
            }
        }
        cVar.d(this.b, h.j("argument: ", str));
    }
}
