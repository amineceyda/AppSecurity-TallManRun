package g.e.c;

import g.c.b.b.f;
import g.e.c.v.c;
import java.io.IOException;
import java.io.StringWriter;

public abstract class j {
    public m c() {
        if (this instanceof m) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.P(true);
            f.z0(this, cVar);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
