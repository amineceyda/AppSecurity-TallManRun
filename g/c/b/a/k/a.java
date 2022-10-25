package g.c.b.a.k;

import android.util.Log;
import com.google.gson.Gson;
import g.c.b.a.d;
import g.c.b.a.j.g;
import g.c.b.a.j.h;
import g.e.c.e;
import i.c;
import i.o.c.f;
import i.o.c.i;
import java.util.Objects;
import k.e0;

public final class a implements h {
    public static final b a = new b((f) null);
    public static final c<Gson> b = g.c.b.b.f.U(C0073a.b);

    /* renamed from: g.c.b.a.k.a$a  reason: collision with other inner class name */
    public static final class C0073a extends i implements i.o.b.a<Gson> {
        public static final C0073a b = new C0073a();

        public C0073a() {
            super(0);
        }

        public Object a() {
            e eVar = new e();
            eVar.c = g.e.c.c.LOWER_CASE_WITH_UNDERSCORES;
            return eVar.a();
        }
    }

    public static final class b {
        public b(f fVar) {
        }
    }

    public d<Object> a(g.c.b.a.c cVar, d<Object> dVar) {
        i.o.c.h.e(cVar, "request");
        i.o.c.h.e(dVar, "response");
        if (!dVar.d()) {
            StringBuilder i2 = g.a.a.a.a.i("The request failed, could not be parsed,code[");
            i2.append(dVar.a());
            i2.append("], message[");
            i2.append(dVar.c());
            i2.append(']');
            String sb = i2.toString();
            i.o.c.h.e("JsonParser", "tag");
            i.o.c.h.e(sb, "message");
            g gVar = g.c.b.a.l.c.b;
            if (gVar != null) {
                gVar.i(i.o.c.h.j("ClientChannel|", "JsonParser"), sb);
            } else {
                Log.i(i.o.c.h.j("ClientChannel|", "JsonParser"), sb);
            }
            return dVar;
        } else if (cVar.b() == null) {
            i.o.c.h.e("JsonParser", "tag");
            i.o.c.h.e("Parse failed,the data class type is null.", "message");
            g gVar2 = g.c.b.a.l.c.b;
            if (gVar2 != null) {
                gVar2.i(i.o.c.h.j("ClientChannel|", "JsonParser"), "Parse failed,the data class type is null.");
            } else {
                Log.i(i.o.c.h.j("ClientChannel|", "JsonParser"), "Parse failed,the data class type is null.");
            }
            return dVar;
        } else if (dVar.b() instanceof e0) {
            return b(cVar, dVar);
        } else {
            StringBuilder i3 = g.a.a.a.a.i("Parsing of this data type[");
            Object b2 = dVar.b();
            i3.append(b2 == null ? null : b2.getClass());
            i3.append("] is not currently supported.response code[");
            i3.append(dVar.a());
            i3.append("], message[");
            i3.append(dVar.c());
            i3.append(']');
            String sb2 = i3.toString();
            i.o.c.h.e("JsonParser", "tag");
            i.o.c.h.e(sb2, "message");
            g gVar3 = g.c.b.a.l.c.b;
            if (gVar3 != null) {
                gVar3.i(i.o.c.h.j("ClientChannel|", "JsonParser"), sb2);
            } else {
                Log.i(i.o.c.h.j("ClientChannel|", "JsonParser"), sb2);
            }
            return new d<>(cVar, null, 1, sb2);
        }
    }

    public final d<Object> b(g.c.b.a.c cVar, d<Object> dVar) {
        String str;
        Object b2 = dVar.b();
        Objects.requireNonNull(b2, "null cannot be cast to non-null type okhttp3.ResponseBody");
        e0 e0Var = (e0) b2;
        Object obj = null;
        int i2 = 1;
        if (i.o.c.h.a(String.valueOf(e0Var.b()), "application/json")) {
            String f2 = e0Var.f();
            String str2 = "The  parsed json[" + f2 + "].";
            i.o.c.h.e("JsonParser", "tag");
            i.o.c.h.e(str2, "message");
            g gVar = g.c.b.a.l.c.b;
            String j2 = i.o.c.h.j("ClientChannel|", "JsonParser");
            if (gVar != null) {
                gVar.d(j2, str2);
            } else {
                Log.d(j2, str2);
            }
            try {
                str = "Parse success, response code[" + dVar.a() + "], message[" + dVar.c() + ']';
                obj = b.getValue().e(f2, cVar.b());
                i2 = 0;
            } catch (Exception e2) {
                StringBuilder i3 = g.a.a.a.a.i("error: ");
                i3.append(e2.getMessage());
                i3.append(". response data string: [");
                i3.append(f2);
                i3.append("], response code[");
                i3.append(dVar.a());
                i3.append("], message[");
                i3.append(dVar.c());
                i3.append(']');
                str = i3.toString();
            }
        } else {
            StringBuilder i4 = g.a.a.a.a.i("Can't parsed from json, response data content type is not 'application/json', response code[");
            i4.append(dVar.a());
            i4.append("], message[");
            i4.append(dVar.c());
            i4.append("] data[");
            i4.append(e0Var.f());
            i4.append("] ");
            String sb = i4.toString();
            i.o.c.h.e("JsonParser", "tag");
            i.o.c.h.e(sb, "message");
            g gVar2 = g.c.b.a.l.c.b;
            if (gVar2 != null) {
                gVar2.i(i.o.c.h.j("ClientChannel|", "JsonParser"), sb);
            } else {
                Log.i(i.o.c.h.j("ClientChannel|", "JsonParser"), sb);
            }
            str = sb;
        }
        return new d<>(cVar, obj, i2, str);
    }
}
