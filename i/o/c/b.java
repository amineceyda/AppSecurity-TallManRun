package i.o.c;

import i.r.c;
import java.io.ObjectStreamException;
import java.io.Serializable;

public abstract class b implements i.r.a, Serializable {
    public transient i.r.a b;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    public final Object receiver;
    private final String signature;

    public static class a implements Serializable {
        public static final a b = new a();

        private Object readResolve() throws ObjectStreamException {
            return b;
        }
    }

    public b() {
        this.receiver = a.b;
        this.owner = null;
        this.name = null;
        this.signature = null;
        this.isTopLevel = false;
    }

    public b(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public i.r.a b() {
        i.r.a aVar = this.b;
        if (aVar != null) {
            return aVar;
        }
        i.r.a c = c();
        this.b = c;
        return c;
    }

    public abstract i.r.a c();

    public c d() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return p.a.a(cls, "");
        }
        return p.a(cls);
    }

    public String getName() {
        return this.name;
    }

    public String h() {
        return this.signature;
    }
}
