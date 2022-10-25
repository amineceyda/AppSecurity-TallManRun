package f.a.a.a.l;

import f.a.a.a.c;
import g.a.a.a.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class f implements Serializable {
    private static final long serialVersionUID = 5488023392483144387L;
    public final long birthTime;
    public final String name;
    public final Map<String, String> propertyMap;

    public f(c cVar) {
        this.name = cVar.c;
        this.propertyMap = new HashMap(cVar.f1686e);
        this.birthTime = cVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.birthTime != fVar.birthTime) {
            return false;
        }
        String str = this.name;
        if (str == null ? fVar.name != null : !str.equals(fVar.name)) {
            return false;
        }
        Map<String, String> map = this.propertyMap;
        Map<String, String> map2 = fVar.propertyMap;
        return map == null ? map2 == null : map.equals(map2);
    }

    public int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, String> map = this.propertyMap;
        if (map != null) {
            i2 = map.hashCode();
        }
        long j2 = this.birthTime;
        return ((hashCode + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder i2 = a.i("LoggerContextVO{name='");
        a.p(i2, this.name, '\'', ", propertyMap=");
        i2.append(this.propertyMap);
        i2.append(", birthTime=");
        i2.append(this.birthTime);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
