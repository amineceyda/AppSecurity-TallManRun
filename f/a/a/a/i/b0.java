package f.a.a.a.i;

import ch.qos.logback.core.boolex.EvaluationException;
import e.e.f.b;
import f.a.a.a.l.c;
import f.a.a.a.l.d;
import f.a.a.a.l.i;
import f.a.a.a.l.j;
import f.a.a.b.e;
import f.a.a.b.l.a;
import java.util.Iterator;
import java.util.List;

public class b0 extends a0 {

    /* renamed from: g  reason: collision with root package name */
    public int f1639g;

    /* renamed from: h  reason: collision with root package name */
    public List<a<c>> f1640h = null;

    /* renamed from: i  reason: collision with root package name */
    public List<String> f1641i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f1642j = 0;

    public String h(Object obj) {
        c cVar = (c) obj;
        d f2 = cVar.f();
        if (f2 == null) {
            return "";
        }
        if (this.f1640h != null) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f1640h.size()) {
                    z = true;
                    break;
                }
                a aVar = this.f1640h.get(i2);
                try {
                    if (aVar.l(cVar)) {
                        break;
                    }
                    i2++;
                } catch (EvaluationException e2) {
                    this.f1642j++;
                    if (this.f1642j < 4) {
                        StringBuilder i3 = g.a.a.a.a.i("Exception thrown for evaluator named [");
                        i3.append(aVar.getName());
                        i3.append("]");
                        this.f1758d.c(i3.toString(), e2);
                    } else if (this.f1642j == 4) {
                        StringBuilder i4 = g.a.a.a.a.i("Exception thrown for evaluator named [");
                        i4.append(aVar.getName());
                        i4.append("].");
                        f.a.a.b.x.a aVar2 = new f.a.a.b.x.a(i4.toString(), this, e2);
                        aVar2.c(new f.a.a.b.x.a("This was the last warning about this evaluator's errors.We don't want the StatusManager to get flooded.", this));
                        this.f1758d.o(aVar2);
                    }
                }
            }
            if (!z) {
                return "";
            }
        }
        return q(f2);
    }

    public void n(StringBuilder sb, i iVar) {
    }

    public final void o(StringBuilder sb, String str, int i2, d dVar) {
        if (dVar != null) {
            b.q(sb, i2 - 1);
            if (str != null) {
                sb.append(str);
            }
            j jVar = (j) dVar;
            sb.append(jVar.b);
            sb.append(": ");
            sb.append(jVar.c);
            sb.append(e.a);
            p(sb, i2, dVar);
            j[] jVarArr = jVar.f1671g;
            if (jVarArr != null) {
                for (j o : jVarArr) {
                    o(sb, "Suppressed: ", i2 + 1, o);
                }
            }
            o(sb, "Caused by: ", i2, jVar.f1670f);
        }
    }

    public void p(StringBuilder sb, int i2, d dVar) {
        boolean z;
        StringBuilder sb2 = sb;
        j jVar = (j) dVar;
        i[] iVarArr = jVar.f1668d;
        int i3 = jVar.f1669e;
        int i4 = this.f1639g;
        boolean z2 = i4 > iVarArr.length;
        if (z2) {
            i4 = iVarArr.length;
        }
        if (i3 > 0 && z2) {
            i4 -= i3;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i iVar = iVarArr[i6];
            String iVar2 = iVar.toString();
            List<String> list = this.f1641i;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (iVar2.contains(it.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                b.q(sb, i2);
                sb2.append(iVar);
                n(sb2, iVar);
                if (i5 > 0) {
                    sb2.append(" [");
                    sb2.append(i5);
                    sb2.append(" skipped]");
                }
                sb2.append(e.a);
                i5 = 0;
            } else {
                i5++;
                if (i4 < iVarArr.length) {
                    i4++;
                }
            }
        }
        if (i5 > 0) {
            sb2.append(" [");
            sb2.append(i5);
            sb2.append(" skipped]");
            sb2.append(e.a);
        }
        if (i3 > 0 && z2) {
            b.q(sb, i2);
            sb2.append("... ");
            sb2.append(jVar.f1669e);
            sb2.append(" common frames omitted");
            sb2.append(e.a);
        }
    }

    public String q(d dVar) {
        StringBuilder sb = new StringBuilder(2048);
        o(sb, (String) null, 1, dVar);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r7 = this;
            java.lang.String r0 = r7.m()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            goto L_0x0036
        L_0x0008:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r2 = "full"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            java.lang.String r2 = "short"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0022
            r7.f1639g = r1
            goto L_0x003b
        L_0x0022:
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0029 }
            r7.f1639g = r2     // Catch:{ NumberFormatException -> 0x0029 }
            goto L_0x003b
        L_0x0029:
            java.lang.String r2 = "Could not parse ["
            java.lang.String r3 = "] as an integer"
            java.lang.String r0 = g.a.a.a.a.c(r2, r0, r3)
            f.a.a.b.w.d r2 = r7.f1758d
            r2.m(r0)
        L_0x0036:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.f1639g = r0
        L_0x003b:
            java.util.List<java.lang.String> r0 = r7.f1759e
            if (r0 == 0) goto L_0x008e
            int r2 = r0.size()
            if (r2 <= r1) goto L_0x008e
            int r2 = r0.size()
            r3 = 1
        L_0x004a:
            if (r3 >= r2) goto L_0x008e
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            f.a.a.b.w.d r5 = r7.f1758d
            f.a.a.b.d r5 = r5.r()
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f1687f
            java.lang.String r6 = "EVALUATOR_MAP"
            java.lang.Object r5 = r5.get(r6)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r5.get(r4)
            f.a.a.b.l.a r5 = (f.a.a.b.l.a) r5
            if (r5 == 0) goto L_0x007b
            java.util.List<f.a.a.b.l.a<f.a.a.a.l.c>> r4 = r7.f1640h
            if (r4 != 0) goto L_0x0075
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f1640h = r4
        L_0x0075:
            java.util.List<f.a.a.b.l.a<f.a.a.a.l.c>> r4 = r7.f1640h
            r4.add(r5)
            goto L_0x008b
        L_0x007b:
            java.util.List<java.lang.String> r5 = r7.f1641i
            if (r5 != 0) goto L_0x0086
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r7.f1641i = r5
        L_0x0086:
            java.util.List<java.lang.String> r5 = r7.f1641i
            r5.add(r4)
        L_0x008b:
            int r3 = r3 + 1
            goto L_0x004a
        L_0x008e:
            r7.f1760f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.a.i.b0.start():void");
    }

    public void stop() {
        this.f1640h = null;
        this.f1760f = false;
    }
}
