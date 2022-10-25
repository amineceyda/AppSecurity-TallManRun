package g.i.c.a.a.j;

import g.a.a.a.a;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class b {
    public final Object a;
    public final String b;
    public final Map<String, Object> c;

    /* renamed from: d  reason: collision with root package name */
    public final a f4441d = null;

    /* renamed from: e  reason: collision with root package name */
    public final String f4442e = null;

    public b(Object obj, String str, Map<String, Object> map, a aVar, String str2) {
        this.a = obj;
        this.b = str;
        this.c = map;
    }

    public String a() {
        return this.b;
    }

    public Map<String, Object> b() {
        return this.c;
    }

    public Object c() {
        return this.a;
    }

    public a d() {
        return this.f4441d;
    }

    public String toString() {
        StringBuilder i2 = a.i("EventData{source=");
        i2.append(this.a);
        i2.append(", id='");
        a.p(i2, this.b, '\'', ", params=");
        i2.append(this.c);
        i2.append(", type=");
        i2.append(this.f4441d);
        i2.append(", appKey='");
        i2.append(this.f4442e);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
