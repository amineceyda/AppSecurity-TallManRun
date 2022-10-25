package f.a.a.a.i;

import f.a.a.b.z.c;
import g.a.a.a.a;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    public c f1643g = null;

    public String h(Object obj) {
        return this.f1643g.a(((f.a.a.a.l.c) obj).getTimeStamp());
    }

    public void start() {
        String m2 = m();
        if (m2 == null) {
            m2 = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        if (m2.equals("ISO8601")) {
            m2 = "yyyy-MM-dd HH:mm:ss,SSS";
        }
        TimeZone timeZone = TimeZone.getDefault();
        Locale locale = Locale.ENGLISH;
        List<String> list = this.f1759e;
        if (list != null) {
            if (list.size() > 1) {
                timeZone = TimeZone.getTimeZone(list.get(1));
            }
            if (list.size() > 2) {
                String[] split = list.get(2).split(",");
                locale = split.length > 1 ? new Locale(split[0], split[1]) : new Locale(split[0]);
            }
        }
        try {
            this.f1643g = new c(m2, locale);
        } catch (IllegalArgumentException e2) {
            this.f1758d.q(a.w("Could not instantiate SimpleDateFormat with pattern ", m2), e2);
            this.f1643g = new c("yyyy-MM-dd HH:mm:ss,SSS", locale);
        }
        this.f1643g.c.setTimeZone(timeZone);
    }
}
