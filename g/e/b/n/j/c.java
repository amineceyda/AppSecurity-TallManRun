package g.e.b.n.j;

import g.e.b.n.j.f;
import java.lang.annotation.Annotation;
import java.util.Objects;

public final class c implements f {
    public final int a;

    public c(int i2, f.a aVar) {
        this.a = i2;
    }

    public Class<? extends Annotation> annotationType() {
        return f.class;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        c cVar = (c) ((f) obj);
        if (this.a == cVar.a) {
            f.a aVar = f.a.DEFAULT;
            Objects.requireNonNull(cVar);
            if (aVar.equals(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a ^ 14552422) + (f.a.DEFAULT.hashCode() ^ 2041407134);
    }

    public String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.a + "intEncoding=" + f.a.DEFAULT + ')';
    }
}
