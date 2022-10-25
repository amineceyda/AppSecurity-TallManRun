package g.f.a.d.l;

import g.f.a.d.b;
import g.f.a.d.i;
import g.f.a.d.k;
import java.lang.reflect.Field;
import java.sql.SQLException;

public abstract class a extends g.f.a.d.a implements b {
    public static final Class<?>[] c = new Class[0];
    public final k a;
    public final Class<?>[] b;

    public a(k kVar) {
        this.a = kVar;
        this.b = c;
    }

    public a(k kVar, Class<?>[] clsArr) {
        this.a = kVar;
        this.b = clsArr;
    }

    public k a() {
        return this.a;
    }

    public Object b(Number number) {
        return null;
    }

    public String c() {
        return null;
    }

    public String[] d() {
        return null;
    }

    public Class<?>[] f() {
        return this.b;
    }

    public Object g(i iVar) throws SQLException {
        return null;
    }

    public Class<?> i() {
        Class<?>[] clsArr = this.b;
        if (clsArr.length == 0) {
            return null;
        }
        return clsArr[0];
    }

    public boolean j() {
        return k();
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(Field field) {
        Class<?>[] clsArr = this.b;
        if (clsArr.length == 0) {
            return true;
        }
        for (Class<?> isAssignableFrom : clsArr) {
            if (isAssignableFrom.isAssignableFrom(field.getType())) {
                return true;
            }
        }
        return false;
    }

    public int p() {
        return 0;
    }

    public Object q(Object obj) throws SQLException {
        return null;
    }

    public boolean r() {
        return false;
    }

    public Object s() {
        throw new IllegalStateException("Should not have tried to generate this type");
    }

    public boolean t() {
        return true;
    }

    public boolean u() {
        return false;
    }

    public boolean v() {
        return true;
    }

    public boolean x() {
        return false;
    }
}
