package g.f.a.g;

import g.f.a.b.g;
import g.f.a.c.c;
import g.f.a.c.d;
import g.f.a.d.i;
import g.f.a.g.i;
import g.f.a.g.m.b;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

public class f<T, ID> extends i<T, ID> {

    /* renamed from: i  reason: collision with root package name */
    public final i f3957i;

    /* renamed from: j  reason: collision with root package name */
    public i[] f3958j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3959k;

    /* renamed from: l  reason: collision with root package name */
    public List<b> f3960l;

    public f(c cVar, g.f.a.i.c<T, ID> cVar2, g<T, ID> gVar) {
        super(cVar, cVar2, gVar, i.a.SELECT);
        g.f.a.d.i iVar = cVar2.f4020g;
        this.f3957i = iVar;
        this.f3959k = iVar != null;
    }

    public void a(StringBuilder sb, List<a> list) throws SQLException {
        h(sb, list, true);
        Objects.requireNonNull(this.c);
        this.f3975f = false;
    }

    public void b(StringBuilder sb, List<a> list) {
        this.f3975f = false;
        sb.append("SELECT ");
        Objects.requireNonNull(this.c);
        this.f3974e = i.a.SELECT;
        if (this.f3975f) {
            ((d) this.c).b(sb, this.b);
            sb.append('.');
        }
        sb.append("* ");
        this.f3958j = this.a.f4018e;
        sb.append("FROM ");
        ((d) this.c).b(sb, this.b);
        sb.append(' ');
    }

    public boolean c(StringBuilder sb, List<a> list, i.b bVar) throws SQLException {
        return this.f3976g != null ? super.c(sb, list, bVar) : bVar == i.b.FIRST;
    }

    public g.f.a.d.i[] d() {
        return this.f3958j;
    }

    public String e() {
        return this.b;
    }

    public final void g(StringBuilder sb, String str) {
        if (this.f3975f) {
            ((d) this.c).b(sb, this.b);
            sb.append('.');
        }
        Objects.requireNonNull((d) this.c);
        sb.append('`');
        sb.append(str);
        sb.append('`');
    }

    public final boolean h(StringBuilder sb, List<a> list, boolean z) {
        List<b> list2 = this.f3960l;
        if (list2 == null || list2.isEmpty()) {
            return z;
        }
        if (z) {
            sb.append("ORDER BY ");
        }
        for (b next : this.f3960l) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            Objects.requireNonNull(next);
            g(sb, next.a);
            if (!next.b) {
                sb.append(" DESC");
            }
        }
        sb.append(' ');
        return false;
    }
}
