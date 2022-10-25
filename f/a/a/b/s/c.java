package f.a.a.b.s;

import f.a.a.b.w.d;
import f.a.a.b.w.i;
import java.util.List;

public abstract class c<E> extends c<E> implements i, f.a.a.b.w.c {
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public d f1758d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    public List<String> f1759e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1760f = false;

    public void c(String str, Throwable th) {
        this.f1758d.c(str, th);
    }

    public void g(f.a.a.b.d dVar) {
        this.f1758d.g(dVar);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [f.a.a.b.s.b, f.a.a.b.s.c] */
    public final void i(StringBuilder sb, Object obj) {
        String h2 = h(obj);
        d dVar = this.c;
        if (dVar != null) {
            int i2 = dVar.a;
            int i3 = dVar.b;
            if (h2 != null) {
                int length = h2.length();
                if (length > i3) {
                    h2 = this.c.f1761d ? h2.substring(length - i3) : h2.substring(0, i3);
                } else if (length < i2) {
                    if (this.c.c) {
                        int length2 = h2.length();
                        if (length2 < i2) {
                            j.a(sb, i2 - length2);
                        }
                        sb.append(h2);
                        return;
                    }
                    int length3 = h2.length();
                    sb.append(h2);
                    if (length3 < i2) {
                        j.a(sb, i2 - length3);
                        return;
                    }
                    return;
                }
            } else if (i2 > 0) {
                j.a(sb, i2);
                return;
            } else {
                return;
            }
        }
        sb.append(h2);
    }

    public boolean k() {
        return this.f1760f;
    }

    public String m() {
        List<String> list = this.f1759e;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f1759e.get(0);
    }

    public void start() {
        this.f1760f = true;
    }

    public void stop() {
        this.f1760f = false;
    }
}
