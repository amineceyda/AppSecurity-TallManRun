package g.e.b.n.i;

import g.e.b.n.d;
import g.e.b.n.f;
import g.e.b.n.g;
import g.e.b.n.h.b;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class e implements b<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f3711e = new a((d) null);
    public final Map<Class<?>, d<?>> a;
    public final Map<Class<?>, f<?>> b;
    public d<Object> c = a.a;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3712d = false;

    public static final class a implements f<Date> {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public a(d dVar) {
        }

        public void a(Object obj, Object obj2) throws IOException {
            ((g) obj2).d(a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, b.a);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, c.a);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, f3711e);
        hashMap.remove(cls3);
    }

    public b a(Class cls, d dVar) {
        this.a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
