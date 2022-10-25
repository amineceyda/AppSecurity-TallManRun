package f.a.a.b.q.b;

import e.e.f.b;
import f.a.a.b.q.d.i;
import java.util.HashMap;
import java.util.Map;
import org.xml.sax.Attributes;

public class f extends b {
    public void s(i iVar, String str, Attributes attributes) {
        String value = attributes.getValue("conversionWord");
        String value2 = attributes.getValue("converterClass");
        if (b.s(value)) {
            m("No 'conversionWord' attribute in <conversionRule>");
        } else if (b.s(value2)) {
            iVar.m("No 'converterClass' attribute in <conversionRule>");
        } else {
            try {
                Map map = (Map) this.c.f1687f.get("PATTERN_RULE_REGISTRY");
                if (map == null) {
                    map = new HashMap();
                    this.c.f1687f.put("PATTERN_RULE_REGISTRY", map);
                }
                n("registering conversion word " + value + " with class [" + value2 + "]");
                map.put(value, value2);
            } catch (Exception unused) {
                m("Could not add conversion rule to PatternLayout.");
            }
        }
    }

    public void u(i iVar, String str) {
    }
}
