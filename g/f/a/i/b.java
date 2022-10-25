package g.f.a.i;

import g.a.a.a.a;
import g.f.a.c.c;
import g.f.a.d.e;
import g.f.a.d.f;
import g.f.a.d.i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class b<T> {

    /* renamed from: f  reason: collision with root package name */
    public static g.f.a.f.b f4013f;
    public Class<T> a;
    public String b;
    public List<f> c;

    /* renamed from: d  reason: collision with root package name */
    public i[] f4014d;

    /* renamed from: e  reason: collision with root package name */
    public Constructor<T> f4015e;

    static {
        try {
            Class.forName("javax.persistence.Entity");
            f4013f = (g.f.a.f.b) Class.forName("g.f.a.f.c").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            f4013f = null;
        }
    }

    public b() {
    }

    public b(c cVar, Class<T> cls, String str, i[] iVarArr) {
        this.a = cls;
        this.b = str;
        this.f4014d = iVarArr;
    }

    public b(Class<T> cls, String str, List<f> list) {
        this.a = cls;
        this.b = str;
        this.c = list;
    }

    public static <T> i[] b(g.f.a.h.c cVar, Class<T> cls, String str) throws SQLException {
        ArrayList arrayList = new ArrayList();
        for (Class<T> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Field field : cls2.getDeclaredFields()) {
                ThreadLocal<i.a> threadLocal = i.v;
                f f2 = f.f(((g.f.a.a.b) cVar).f3835e, str, field);
                i iVar = f2 == null ? null : new i(cVar, str, field, f2, cls);
                if (iVar != null) {
                    arrayList.add(iVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return (i[]) arrayList.toArray(new i[arrayList.size()]);
        }
        StringBuilder i2 = a.i("No fields have a ");
        i2.append(e.class.getSimpleName());
        i2.append(" annotation in ");
        i2.append(cls);
        throw new IllegalArgumentException(i2.toString());
    }

    public static <T> String c(c cVar, Class<T> cls) {
        g.f.a.f.b bVar;
        a aVar = (a) cls.getAnnotation(a.class);
        String tableName = (aVar == null || aVar.tableName() == null || aVar.tableName().length() <= 0) ? null : aVar.tableName();
        if (tableName == null && (bVar = f4013f) != null) {
            tableName = bVar.a(cls);
        }
        if (tableName != null) {
            return tableName;
        }
        if (cVar == null) {
            return cls.getSimpleName().toLowerCase(Locale.ENGLISH);
        }
        return ((g.f.a.c.a) cVar).a(cls.getSimpleName(), true);
    }

    public void a(g.f.a.h.c cVar) throws SQLException {
        if (this.f4014d == null) {
            List<f> list = this.c;
            if (list == null) {
                this.f4014d = b(cVar, this.a, this.b);
                return;
            }
            String str = this.b;
            ArrayList arrayList = new ArrayList();
            for (f next : list) {
                i iVar = null;
                Class cls = this.a;
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    try {
                        Field declaredField = cls.getDeclaredField(next.a);
                        if (declaredField != null) {
                            iVar = new i(cVar, str, declaredField, next, this.a);
                            break;
                        }
                        cls = cls.getSuperclass();
                    } catch (NoSuchFieldException unused) {
                    }
                }
                if (iVar != null) {
                    arrayList.add(iVar);
                } else {
                    StringBuilder i2 = a.i("Could not find declared field with name '");
                    i2.append(next.a);
                    i2.append("' for ");
                    i2.append(this.a);
                    throw new SQLException(i2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                this.f4014d = (i[]) arrayList.toArray(new i[arrayList.size()]);
                return;
            }
            StringBuilder i3 = a.i("No fields were configured for class ");
            i3.append(this.a);
            throw new SQLException(i3.toString());
        }
    }
}
