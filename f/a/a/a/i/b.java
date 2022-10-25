package f.a.a.a.i;

import ch.qos.logback.core.boolex.EvaluationException;
import f.a.a.a.l.c;
import f.a.a.b.d;
import f.a.a.b.e;
import f.a.a.b.l.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class b extends e {

    /* renamed from: g  reason: collision with root package name */
    public int f1635g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f1636h = 5;

    /* renamed from: i  reason: collision with root package name */
    public List<a<c>> f1637i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f1638j = 0;

    public String h(Object obj) {
        int i2;
        c cVar = (c) obj;
        StringBuilder sb = new StringBuilder();
        if (this.f1637i != null) {
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 >= this.f1637i.size()) {
                    break;
                }
                a aVar = this.f1637i.get(i3);
                try {
                    if (aVar.l(cVar)) {
                        z = true;
                        break;
                    }
                    i3++;
                } catch (EvaluationException e2) {
                    this.f1638j++;
                    if (this.f1638j < 4) {
                        StringBuilder i4 = g.a.a.a.a.i("Exception thrown for evaluator named [");
                        i4.append(aVar.getName());
                        i4.append("]");
                        this.f1758d.c(i4.toString(), e2);
                    } else if (this.f1638j == 4) {
                        StringBuilder i5 = g.a.a.a.a.i("Exception thrown for evaluator named [");
                        i5.append(aVar.getName());
                        i5.append("].");
                        f.a.a.b.x.a aVar2 = new f.a.a.b.x.a(i5.toString(), this, e2);
                        aVar2.c(new f.a.a.b.x.a("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        this.f1758d.o(aVar2);
                    }
                }
            }
            if (!z) {
                return "";
            }
        }
        StackTraceElement[] a = cVar.a();
        if (a == null || a.length <= (i2 = this.f1635g)) {
            return f.a.a.a.l.a.a;
        }
        int i6 = this.f1636h;
        if (i6 >= a.length) {
            i6 = a.length;
        }
        for (i2 = this.f1635g; i2 < i6; i2++) {
            sb.append("Caller+");
            sb.append(i2);
            sb.append("\t at ");
            sb.append(a[i2]);
            sb.append(e.a);
        }
        return sb.toString();
    }

    public final void n() {
        String str;
        StringBuilder sb;
        int i2;
        int i3 = this.f1635g;
        if (i3 < 0 || (i2 = this.f1636h) < 0) {
            sb = g.a.a.a.a.i("Invalid depthStart/depthEnd range [");
            sb.append(this.f1635g);
            sb.append(", ");
            sb.append(this.f1636h);
            str = "] (negative values are not allowed)";
        } else if (i3 >= i2) {
            sb = g.a.a.a.a.i("Invalid depthEnd range [");
            sb.append(this.f1635g);
            sb.append(", ");
            sb.append(this.f1636h);
            str = "] (start greater or equal to end)";
        } else {
            return;
        }
        sb.append(str);
        this.f1758d.m(sb.toString());
    }

    public void start() {
        a aVar;
        String m2 = m();
        if (m2 != null) {
            try {
                if (m2.contains("..")) {
                    String[] split = m2.split(Pattern.quote(".."), 2);
                    if (split.length == 2) {
                        this.f1635g = Integer.parseInt(split[0]);
                        this.f1636h = Integer.parseInt(split[1]);
                        n();
                    } else {
                        this.f1758d.m("Failed to parse depth option as range [" + m2 + "]");
                    }
                } else {
                    this.f1636h = Integer.parseInt(m2);
                }
            } catch (NumberFormatException e2) {
                this.f1758d.c(g.a.a.a.a.c("Failed to parse depth option [", m2, "]"), e2);
            }
            List<String> list = this.f1759e;
            if (list != null && list.size() > 1) {
                int size = list.size();
                for (int i2 = 1; i2 < size; i2++) {
                    String str = list.get(i2);
                    d r = this.f1758d.r();
                    if (!(r == null || (aVar = (a) ((Map) r.f1687f.get("EVALUATOR_MAP")).get(str)) == null)) {
                        if (this.f1637i == null) {
                            this.f1637i = new ArrayList();
                        }
                        this.f1637i.add(aVar);
                    }
                }
            }
        }
    }
}
