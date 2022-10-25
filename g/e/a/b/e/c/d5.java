package g.e.a.b.e.c;

import android.content.Context;
import javax.annotation.Nullable;

public final class d5 extends w5 {
    public final Context a;
    public final c6 b;

    public d5(Context context, @Nullable c6 c6Var) {
        this.a = context;
        this.b = c6Var;
    }

    public final Context a() {
        return this.a;
    }

    @Nullable
    public final c6 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w5) {
            w5 w5Var = (w5) obj;
            if (this.a.equals(w5Var.a())) {
                c6 c6Var = this.b;
                c6 b2 = w5Var.b();
                if (c6Var != null ? c6Var.equals(b2) : b2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        c6 c6Var = this.b;
        return hashCode ^ (c6Var == null ? 0 : c6Var.hashCode());
    }

    public final String toString() {
        String obj = this.a.toString();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(obj.length() + 46 + valueOf.length());
        sb.append("FlagsContext{context=");
        sb.append(obj);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
