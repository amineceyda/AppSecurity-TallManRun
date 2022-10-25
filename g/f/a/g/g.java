package g.f.a.g;

import g.a.a.a.a;
import g.f.a.d.i;
import g.f.a.d.k;
import java.sql.SQLException;

public class g implements a {
    public String a = null;
    public i b = null;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public Object f3961d = null;

    public k a() {
        return null;
    }

    public Object b() {
        if (this.c) {
            Object obj = this.f3961d;
            if (obj == null) {
                return null;
            }
            i iVar = this.b;
            if (iVar == null) {
                return obj;
            }
            return (!iVar.f3876e.f3872k || iVar.l() != obj.getClass()) ? this.b.d(obj) : this.b.q.e(obj);
        }
        StringBuilder i2 = a.i("Column value has not been set for ");
        i2.append(this.a);
        throw new SQLException(i2.toString());
    }

    public i c() {
        return this.b;
    }

    public void d(String str, i iVar) {
        String str2 = this.a;
        if (str2 != null && !str2.equals(str)) {
            StringBuilder i2 = a.i("Column name cannot be set twice from ");
            i2.append(this.a);
            i2.append(" to ");
            i2.append(str);
            i2.append(".  Using a SelectArg twice in query with different columns?");
            throw new IllegalArgumentException(i2.toString());
        }
        this.a = str;
        i iVar2 = this.b;
        if (iVar2 == null || iVar2 == iVar) {
            this.b = iVar;
            return;
        }
        StringBuilder i3 = a.i("FieldType name cannot be set twice from ");
        i3.append(this.b);
        i3.append(" to ");
        i3.append(iVar);
        i3.append(".  Using a SelectArg twice in query with different columns?");
        throw new IllegalArgumentException(i3.toString());
    }

    public String toString() {
        if (!this.c) {
            return "[unset]";
        }
        try {
            Object b2 = b();
            return b2 == null ? "[null]" : b2.toString();
        } catch (SQLException e2) {
            return "[could not get value: " + e2 + "]";
        }
    }
}
