package g.f.a.d.l;

import g.f.a.d.i;
import g.f.a.d.k;
import java.lang.reflect.Field;
import java.sql.SQLException;

public abstract class c extends a {
    public c(k kVar) {
        super(kVar);
    }

    public c(k kVar, Class<?>[] clsArr) {
        super(kVar, clsArr);
    }

    public static Enum<?> A(i iVar, Object obj, Enum<?> enumR, Enum<?> enumR2) throws SQLException {
        if (enumR != null) {
            return enumR;
        }
        if (enumR2 != null) {
            return enumR2;
        }
        throw new SQLException("Cannot get enum value of '" + obj + "' for field " + iVar);
    }

    public boolean o(Field field) {
        return field.getType().isEnum();
    }
}
