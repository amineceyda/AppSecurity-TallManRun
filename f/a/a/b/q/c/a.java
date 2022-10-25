package f.a.a.b.q.c;

import org.xml.sax.Locator;

public class a extends d {

    /* renamed from: e  reason: collision with root package name */
    public String f1731e;

    public a(String str, Locator locator) {
        super((String) null, (String) null, (String) null, locator);
        this.f1731e = str;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("BodyEvent(");
        String str = this.f1731e;
        if (str != null) {
            str = str.trim();
        }
        i2.append(str);
        i2.append(")");
        i2.append(this.f1732d.getLineNumber());
        i2.append(",");
        i2.append(this.f1732d.getColumnNumber());
        return i2.toString();
    }
}
