package g.e.b.l.j.j;

import g.a.a.a.a;
import g.e.b.l.j.l.a0;
import java.io.File;
import java.util.Objects;

public final class i extends e0 {
    public final a0 a;
    public final String b;
    public final File c;

    public i(a0 a0Var, String str, File file) {
        Objects.requireNonNull(a0Var, "Null report");
        this.a = a0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.c = file;
    }

    public a0 a() {
        return this.a;
    }

    public File b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.a.equals(e0Var.a()) && this.b.equals(e0Var.c()) && this.c.equals(e0Var.b());
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("CrashlyticsReportWithSessionId{report=");
        i2.append(this.a);
        i2.append(", sessionId=");
        i2.append(this.b);
        i2.append(", reportFile=");
        i2.append(this.c);
        i2.append("}");
        return i2.toString();
    }
}
