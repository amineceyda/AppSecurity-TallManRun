package g.e.b.l.j.l;

import g.a.a.a.a;
import g.e.b.l.j.l.c0;
import java.util.Objects;

public final class z extends c0.c {
    public final String a;
    public final String b;
    public final boolean c;

    public z(String str, String str2, boolean z) {
        Objects.requireNonNull(str, "Null osRelease");
        this.a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.b = str2;
        this.c = z;
    }

    public boolean a() {
        return this.c;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.c)) {
            return false;
        }
        c0.c cVar = (c0.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder i2 = a.i("OsData{osRelease=");
        i2.append(this.a);
        i2.append(", osCodeName=");
        i2.append(this.b);
        i2.append(", isRooted=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
