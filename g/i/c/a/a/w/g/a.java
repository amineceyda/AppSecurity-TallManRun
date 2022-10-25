package g.i.c.a.a.w.g;

import g.i.c.a.a.x.b.b;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

@b("stash_event")
public class a {
    public String a;
    public Map<String, Object> b;
    public String c;

    public a(String str, Map<String, Object> map, String str2) {
        this.a = str;
        this.b = map;
        this.c = str2;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("StashEvent{mEventKey='");
        g.a.a.a.a.p(i2, this.a, '\'', ", mEventParams=");
        i2.append(this.b);
        i2.append(", mAppKey='");
        i2.append(this.c);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
