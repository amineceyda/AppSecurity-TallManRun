package g.f.a.d;

import g.a.a.a.a;
import g.f.a.c.c;
import g.f.a.d.l.r0;
import g.f.a.f.b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Objects;

public class f {
    public static final d L = d.UNKNOWN;
    public static b M;
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H = 1;
    public String I;
    public boolean J = true;
    public String K;
    public String a;
    public String b;
    public d c = L;

    /* renamed from: d  reason: collision with root package name */
    public b f3865d;

    /* renamed from: e  reason: collision with root package name */
    public String f3866e;

    /* renamed from: f  reason: collision with root package name */
    public int f3867f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3868g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3869h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f3870i;

    /* renamed from: j  reason: collision with root package name */
    public String f3871j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3872k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3873l;

    /* renamed from: m  reason: collision with root package name */
    public Enum<?> f3874m;
    public boolean n;
    public boolean o = true;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public String t;
    public boolean u;
    public String v;
    public boolean w;
    public int x = -1;
    public Class<? extends b> y = r0.class;
    public boolean z;

    static {
        try {
            Class.forName("javax.persistence.Entity");
            M = (b) Class.forName("g.f.a.f.c").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            M = null;
        }
    }

    public static Method a(Field field, c cVar, boolean z2) throws IllegalArgumentException {
        Method d2 = d(field, true, z2, h(field, "get", cVar, true), h(field, "get", cVar, false), h(field, "is", cVar, true), h(field, "is", cVar, false));
        if (d2 == null) {
            return null;
        }
        if (d2.getReturnType() == field.getType()) {
            return d2;
        }
        if (!z2) {
            return null;
        }
        StringBuilder i2 = a.i("Return type of get method ");
        i2.append(d2.getName());
        i2.append(" does not return ");
        i2.append(field.getType());
        throw new IllegalArgumentException(i2.toString());
    }

    public static Enum<?> c(Field field, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (Enum<?> enumR : (Enum[]) field.getType().getEnumConstants()) {
            if (enumR.name().equals(str)) {
                return enumR;
            }
        }
        throw new IllegalArgumentException("Unknwown enum unknown name " + str + " for field " + field);
    }

    public static Method d(Field field, boolean z2, boolean z3, String... strArr) {
        int length = strArr.length;
        int i2 = 0;
        NoSuchMethodException noSuchMethodException = null;
        while (i2 < length) {
            String str = strArr[i2];
            if (z2) {
                try {
                    return field.getDeclaringClass().getMethod(str, new Class[0]);
                } catch (NoSuchMethodException e2) {
                    if (noSuchMethodException == null) {
                        noSuchMethodException = e2;
                    }
                    i2++;
                }
            } else {
                return field.getDeclaringClass().getMethod(str, new Class[]{field.getType()});
            }
        }
        if (!z3) {
            return null;
        }
        StringBuilder i3 = a.i("Could not find appropriate ");
        i3.append(z2 ? "get" : "set");
        i3.append(" method for ");
        i3.append(field);
        throw new IllegalArgumentException(i3.toString(), noSuchMethodException);
    }

    public static Method e(Field field, c cVar, boolean z2) throws IllegalArgumentException {
        Method d2 = d(field, false, z2, h(field, "set", cVar, true), h(field, "set", cVar, false));
        if (d2 == null) {
            return null;
        }
        if (d2.getReturnType() == Void.TYPE) {
            return d2;
        }
        if (!z2) {
            return null;
        }
        StringBuilder i2 = a.i("Return type of set method ");
        i2.append(d2.getName());
        i2.append(" returns ");
        i2.append(d2.getReturnType());
        i2.append(" instead of void");
        throw new IllegalArgumentException(i2.toString());
    }

    public static f f(c cVar, String str, Field field) throws SQLException {
        e eVar = (e) field.getAnnotation(e.class);
        f fVar = null;
        if (eVar != null) {
            if (eVar.persisted()) {
                fVar = new f();
                fVar.a = field.getName();
                Objects.requireNonNull(cVar);
                fVar.b = i(eVar.columnName());
                fVar.c = eVar.dataType();
                String defaultValue = eVar.defaultValue();
                if (!defaultValue.equals("__ormlite__ no default value string was specified")) {
                    fVar.f3866e = defaultValue;
                }
                fVar.f3867f = eVar.width();
                fVar.f3868g = eVar.canBeNull();
                fVar.f3869h = eVar.id();
                fVar.f3870i = eVar.generatedId();
                fVar.f3871j = i(eVar.generatedIdSequence());
                fVar.f3872k = eVar.foreign();
                fVar.f3873l = eVar.useGetSet();
                fVar.f3874m = c(field, eVar.unknownEnumName());
                fVar.n = eVar.throwIfNull();
                fVar.p = i(eVar.format());
                fVar.q = eVar.unique();
                fVar.r = eVar.uniqueCombo();
                fVar.s = eVar.index();
                fVar.t = i(eVar.indexName());
                fVar.u = eVar.uniqueIndex();
                fVar.v = i(eVar.uniqueIndexName());
                boolean foreignAutoRefresh = eVar.foreignAutoRefresh();
                fVar.w = foreignAutoRefresh;
                fVar.x = (foreignAutoRefresh || eVar.maxForeignAutoRefreshLevel() != 2) ? eVar.maxForeignAutoRefreshLevel() : -1;
                fVar.y = eVar.persisterClass();
                fVar.z = eVar.allowGeneratedIdInsert();
                fVar.A = i(eVar.columnDefinition());
                fVar.B = eVar.foreignAutoCreate();
                fVar.C = eVar.version();
                fVar.D = i(eVar.foreignColumnName());
                fVar.E = eVar.readOnly();
                i(eVar.fullColumnDefinition());
            }
            return fVar;
        }
        j jVar = (j) field.getAnnotation(j.class);
        if (jVar != null) {
            f fVar2 = new f();
            fVar2.a = field.getName();
            if (jVar.columnName().length() > 0) {
                fVar2.b = jVar.columnName();
            }
            fVar2.F = true;
            fVar2.G = jVar.eager();
            fVar2.H = jVar.maxEagerLevel();
            fVar2.I = i(jVar.orderColumnName());
            fVar2.J = jVar.orderAscending();
            i(jVar.columnName());
            fVar2.K = i(jVar.foreignFieldName());
            return fVar2;
        }
        b bVar = M;
        if (bVar == null) {
            return null;
        }
        return bVar.b(cVar, field);
    }

    public static String h(Field field, String str, c cVar, boolean z2) {
        String name = field.getName();
        String substring = name.substring(0, 1);
        Objects.requireNonNull((g.f.a.c.a) cVar);
        StringBuilder l2 = a.l(str, z2 ? substring.toUpperCase(Locale.ENGLISH) : substring.toUpperCase());
        l2.append(name, 1, name.length());
        return l2.toString();
    }

    public static String i(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final String b(String str) {
        return a.f(a.l(str, "_"), this.b == null ? this.a : this.b, "_idx");
    }

    public b g() {
        b bVar = this.f3865d;
        return bVar == null ? this.c.a() : bVar;
    }
}
