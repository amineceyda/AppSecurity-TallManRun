package f.a.a.b.q.d;

import ch.qos.logback.core.spi.ScanException;
import f.a.a.b.q.c.c;
import f.a.a.b.w.d;
import f.a.a.b.w.k;
import f.a.a.b.y.b;
import g.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class i extends d implements k {

    /* renamed from: e  reason: collision with root package name */
    public Stack<Object> f1739e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, Object> f1740f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f1741g;

    /* renamed from: h  reason: collision with root package name */
    public j f1742h;

    /* renamed from: i  reason: collision with root package name */
    public final List<c> f1743i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public d f1744j = new d();

    public i(f.a.a.b.d dVar, j jVar) {
        this.c = dVar;
        this.f1742h = jVar;
        this.f1739e = new Stack<>();
        this.f1740f = new HashMap(5);
        this.f1741g = new HashMap(5);
    }

    public String b(String str) {
        String str2 = this.f1741g.get(str);
        return str2 != null ? str2 : this.c.b(str);
    }

    public void s(f.a.a.b.q.c.d dVar) {
        for (c h2 : this.f1743i) {
            h2.h(dVar);
        }
    }

    public boolean t() {
        return this.f1739e.isEmpty();
    }

    public Object u() {
        return this.f1739e.peek();
    }

    public Object v() {
        return this.f1739e.pop();
    }

    public String w(String str) {
        if (str == null) {
            return null;
        }
        try {
            b bVar = new b(b.b(str), this, this.c);
            StringBuilder sb = new StringBuilder();
            bVar.a(bVar.a, sb, new Stack());
            return sb.toString();
        } catch (ScanException e2) {
            throw new IllegalArgumentException(a.c("Failed to parse input [", str, "]"), e2);
        }
    }
}
