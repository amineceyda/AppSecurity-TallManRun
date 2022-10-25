package f.a.a.b.q.c;

import f.a.a.b.q.d.e;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;

public class f extends d {

    /* renamed from: e  reason: collision with root package name */
    public final Attributes f1735e;

    public f(e eVar, String str, String str2, String str3, Attributes attributes, Locator locator) {
        super(str, str2, str3, locator);
        this.f1735e = new AttributesImpl(attributes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StartEvent(");
        sb.append(this.c);
        if (this.f1735e != null) {
            for (int i2 = 0; i2 < this.f1735e.getLength(); i2++) {
                if (i2 > 0) {
                    sb.append(' ');
                }
                sb.append(this.f1735e.getLocalName(i2));
                sb.append("=\"");
                sb.append(this.f1735e.getValue(i2));
                sb.append("\"");
            }
        }
        sb.append(")  [");
        sb.append(this.f1732d.getLineNumber());
        sb.append(",");
        sb.append(this.f1732d.getColumnNumber());
        sb.append("]");
        return sb.toString();
    }
}
