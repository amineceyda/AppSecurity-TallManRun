package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.ActionException;
import f.a.a.b.q.d.i;
import f.a.a.b.w.d;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

public abstract class b extends d {
    public abstract void s(i iVar, String str, Attributes attributes) throws ActionException;

    public void t(i iVar, String str) throws ActionException {
    }

    public String toString() {
        return getClass().getName();
    }

    public abstract void u(i iVar, String str) throws ActionException;

    public int v(i iVar) {
        Locator locator = iVar.f1742h.f1748f;
        if (locator != null) {
            return locator.getLineNumber();
        }
        return -1;
    }
}
