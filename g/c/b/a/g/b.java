package g.c.b.a.g;

import android.util.Log;
import g.c.b.a.d;
import g.c.b.a.g.c.c;
import g.c.b.a.h.f;
import g.c.b.a.j.a;
import g.c.b.a.j.b;
import g.c.b.a.j.g;
import i.o.c.h;
import i.t.e;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import k.a0;
import k.b0;
import k.t;
import k.w;
import k.x;
import k.y;

public final class b extends a {
    public void a(b.a aVar, d<Object> dVar) {
        h.e(dVar, "response");
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    public void b(b.a aVar) {
        k.d dVar;
        h.e(aVar, "nextChain");
        h.e(aVar, "nextChain");
        f fVar = (f) aVar;
        String str = fVar.f2220d.b;
        if (h.a(str, "https://")) {
            c.a aVar2 = new c.a();
            g.c.b.a.c cVar = fVar.f2220d;
            h.e(cVar, "request");
            aVar2.a = cVar;
            a aVar3 = new a(this, aVar);
            h.e(aVar3, "callback");
            aVar2.b = aVar3;
            c cVar2 = new c(aVar2);
            String str2 = cVar2.a.a().f2199h;
            if (str2 == null) {
                str2 = "";
            }
            String upperCase = str2.toUpperCase(Locale.ROOT);
            h.d(upperCase, "(this as java.lang.Strin….toUpperCase(Locale.ROOT)");
            if (h.a(upperCase, "GET")) {
                cVar2.b();
                g.c.b.a.c a = cVar2.a.a();
                Object obj = cVar2.a.a().f2200i;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(a.f2197f);
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (map.size() > 0) {
                        stringBuffer.append("?");
                        for (Object next : map.keySet()) {
                            if (next == null) {
                                String str3 = cVar2.b;
                                h.e(str3, "tag");
                                h.e("get params key is null.", "message");
                                g gVar = g.c.b.a.l.c.b;
                                String j2 = h.j("ClientChannel|", str3);
                                if (gVar != null) {
                                    gVar.d(j2, "get params key is null.");
                                } else {
                                    Log.d(j2, "get params key is null.");
                                }
                            } else {
                                stringBuffer.append(next);
                                stringBuffer.append("=");
                                Object obj2 = map.get(next);
                                if (obj2 == null) {
                                    obj2 = "";
                                }
                                stringBuffer.append(obj2);
                                stringBuffer.append("&");
                            }
                        }
                    }
                }
                String stringBuffer2 = stringBuffer.toString();
                h.d(stringBuffer2, "sb.toString()");
                if (e.b(stringBuffer2, "&", false, 2) || e.b(stringBuffer2, "?", false, 2)) {
                    h.e(stringBuffer2, "$this$dropLast");
                    boolean z = true;
                    int length = stringBuffer2.length() - 1;
                    if (length < 0) {
                        length = 0;
                    }
                    h.e(stringBuffer2, "$this$take");
                    if (length < 0) {
                        z = false;
                    }
                    if (z) {
                        int length2 = stringBuffer2.length();
                        if (length > length2) {
                            length = length2;
                        }
                        stringBuffer2 = stringBuffer2.substring(0, length);
                        h.d(stringBuffer2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new IllegalArgumentException(g.a.a.a.a.r("Requested character count ", length, " is less than zero.").toString());
                    }
                }
                String str4 = cVar2.b;
                String j3 = h.j("request url: ", stringBuffer2);
                h.e(str4, "tag");
                h.e(j3, "message");
                g gVar2 = g.c.b.a.l.c.b;
                String j4 = h.j("ClientChannel|", str4);
                if (gVar2 != null) {
                    gVar2.d(j4, j3);
                } else {
                    Log.d(j4, j3);
                }
                x.a aVar4 = new x.a();
                aVar4.g(stringBuffer2);
                aVar4.e("GET", (b0) null);
                Map<String, String> map2 = cVar2.a.a().c;
                if (map2 != null) {
                    for (Map.Entry next2 : map2.entrySet()) {
                        aVar4.c.a(cVar2.a((String) next2.getKey()), cVar2.a((String) next2.getValue()));
                    }
                }
                dVar = c.c.a(aVar4.a());
                h.d(dVar, "client.newCall(request)");
            } else {
                b0 b0Var = null;
                cVar2.b();
                g.c.b.a.c a2 = cVar2.a.a();
                t a3 = t.a(a2.f2198g);
                Object obj3 = cVar2.a.a().f2200i;
                if (obj3 instanceof String) {
                    b0Var = b0.c(a3, (String) obj3);
                } else if (obj3 instanceof l.h) {
                    b0Var = new y(a3, (l.h) obj3);
                } else if (obj3 instanceof byte[]) {
                    b0Var = b0.d(a3, (byte[]) obj3);
                } else if (obj3 instanceof File) {
                    File file = (File) obj3;
                    Objects.requireNonNull(file, "file == null");
                    b0Var = new a0(a3, file);
                }
                x.a aVar5 = new x.a();
                aVar5.g(a2.f2197f);
                aVar5.e(a2.f2199h, b0Var);
                Map<String, String> map3 = cVar2.a.a().c;
                if (map3 != null) {
                    for (Map.Entry next3 : map3.entrySet()) {
                        aVar5.c.a(cVar2.a((String) next3.getKey()), cVar2.a((String) next3.getValue()));
                    }
                }
                dVar = c.c.a(aVar5.a());
                h.d(dVar, "client.newCall(request)");
            }
            ((w) dVar).x(new g.c.b.a.g.c.d(cVar2));
            return;
        }
        h.a(str, "trpc://");
    }
}
