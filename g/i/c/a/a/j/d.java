package g.i.c.a.a.j;

import g.a.a.a.a;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public final class d {
    public final Object a;
    public final String b;
    public final Map<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Object> f4443d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4444e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4445f;

    public d(Object obj, String str, Map<String, String> map, Map<String, Object> map2, a aVar, String str2) {
        this.a = obj;
        this.b = str;
        this.c = map;
        this.f4443d = map2;
        this.f4444e = aVar;
        this.f4445f = str2;
    }

    public String toString() {
        StringBuilder i2 = a.i("ReportEvent{source=");
        i2.append(this.a);
        i2.append(", key='");
        a.p(i2, this.b, '\'', ", params=");
        i2.append(this.c);
        i2.append(", rawParams=");
        i2.append(this.f4443d);
        i2.append(", type=");
        i2.append(this.f4444e);
        i2.append(", appKey='");
        i2.append(this.f4445f);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
