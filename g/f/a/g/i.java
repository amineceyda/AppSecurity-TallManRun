package g.f.a.g;

import g.f.a.b.g;
import g.f.a.e.c;
import g.f.a.e.d;
import g.f.a.g.l.e;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class i<T, ID> {

    /* renamed from: h  reason: collision with root package name */
    public static c f3972h = d.a(i.class);
    public final g.f.a.i.c<T, ID> a;
    public final String b;
    public final g.f.a.c.c c;

    /* renamed from: d  reason: collision with root package name */
    public final g<T, ID> f3973d;

    /* renamed from: e  reason: collision with root package name */
    public a f3974e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3975f;

    /* renamed from: g  reason: collision with root package name */
    public k<T, ID> f3976g = null;

    public enum a {
        SELECT(true, true, false, false),
        SELECT_LONG(true, true, false, false),
        SELECT_RAW(true, true, false, false),
        UPDATE(true, false, true, false),
        DELETE(true, false, true, false),
        EXECUTE(false, false, false, true);
        
        private final boolean okForExecute;
        private final boolean okForQuery;
        private final boolean okForStatementBuilder;
        private final boolean okForUpdate;

        /* access modifiers changed from: public */
        a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.okForStatementBuilder = z;
            this.okForQuery = z2;
            this.okForUpdate = z3;
            this.okForExecute = z4;
        }

        public boolean a() {
            return this.okForExecute;
        }

        public boolean b() {
            return this.okForQuery;
        }

        public boolean d() {
            return this.okForStatementBuilder;
        }
    }

    public enum b {
        FIRST("WHERE ", (int) null),
        AND("AND (", ") "),
        OR("OR (", ") ");
        
        private final String after;
        private final String before;

        /* access modifiers changed from: public */
        b(String str, String str2) {
            this.before = str;
            this.after = str2;
        }

        public void a(StringBuilder sb) {
            String str = this.after;
            if (str != null) {
                sb.append(str);
            }
        }

        public void b(StringBuilder sb) {
            String str = this.before;
            if (str != null) {
                sb.append(str);
            }
        }
    }

    public i(g.f.a.c.c cVar, g.f.a.i.c<T, ID> cVar2, g<T, ID> gVar, a aVar) {
        this.c = cVar;
        this.a = cVar2;
        this.b = cVar2.f4017d;
        this.f3973d = gVar;
        this.f3974e = aVar;
        if (!aVar.d()) {
            throw new IllegalStateException("Building a statement from a " + aVar + " statement is not allowed");
        }
    }

    public abstract void a(StringBuilder sb, List<a> list) throws SQLException;

    public abstract void b(StringBuilder sb, List<a> list) throws SQLException;

    public boolean c(StringBuilder sb, List<a> list, b bVar) throws SQLException {
        if (this.f3976g == null) {
            return bVar == b.FIRST;
        }
        bVar.b(sb);
        k<T, ID> kVar = this.f3976g;
        String e2 = this.f3975f ? e() : null;
        int i2 = kVar.f3993f;
        if (i2 == 0) {
            throw new IllegalStateException("No where clauses defined.  Did you miss a where operation?");
        } else if (i2 == 1) {
            g.f.a.g.m.a aVar = kVar.f3992e[i2 - 1];
            g.f.a.c.c cVar = kVar.f3991d;
            g.f.a.g.m.c cVar2 = (g.f.a.g.m.c) aVar;
            Objects.requireNonNull(cVar2);
            if (e2 != null) {
                Objects.requireNonNull((g.f.a.c.d) cVar);
                sb.append('`');
                sb.append(e2);
                sb.append('`');
                sb.append('.');
            }
            g.f.a.c.d dVar = (g.f.a.c.d) cVar;
            dVar.b(sb, cVar2.a);
            sb.append(' ');
            sb.append(cVar2.f4012d);
            sb.append(' ');
            cVar2.a(dVar, cVar2.b, sb, list, cVar2.c);
            bVar.a(sb);
            return false;
        } else {
            throw new IllegalStateException("Both the \"left-hand\" and \"right-hand\" clauses have been defined.  Did you miss an AND or OR?");
        }
    }

    public g.f.a.d.i[] d() {
        return null;
    }

    public String e() {
        return this.b;
    }

    public e<T, ID> f(Long l2, boolean z) throws SQLException {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(128);
        b(sb, arrayList);
        c(sb, arrayList, b.FIRST);
        a(sb, arrayList);
        String sb2 = sb.toString();
        f3972h.b("built statement {}", sb2);
        a[] aVarArr = (a[]) arrayList.toArray(new a[arrayList.size()]);
        g.f.a.d.i[] d2 = d();
        g.f.a.d.i[] iVarArr = new g.f.a.d.i[arrayList.size()];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            iVarArr[i2] = aVarArr[i2].c();
        }
        if (this.f3974e.d()) {
            g.f.a.i.c<T, ID> cVar = this.a;
            Objects.requireNonNull(this.c);
            return new e(cVar, sb2, iVarArr, d2, aVarArr, (Long) null, this.f3974e, z);
        }
        StringBuilder i3 = g.a.a.a.a.i("Building a statement from a ");
        i3.append(this.f3974e);
        i3.append(" statement is not allowed");
        throw new IllegalStateException(i3.toString());
    }
}
