package i.o.c;

import i.r.c;

public class q {
    public c a(Class cls, String str) {
        return new j(cls, str);
    }

    public String b(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
