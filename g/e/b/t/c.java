package g.e.b.t;

import g.a.a.a.a;
import java.util.Objects;
import javax.annotation.Nonnull;

public final class c extends f {
    public final String a;
    public final String b;

    public c(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.a = str;
        Objects.requireNonNull(str2, "Null version");
        this.b = str2;
    }

    @Nonnull
    public String a() {
        return this.a;
    }

    @Nonnull
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a()) && this.b.equals(fVar.b());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("LibraryVersion{libraryName=");
        i2.append(this.a);
        i2.append(", version=");
        return a.f(i2, this.b, "}");
    }
}
