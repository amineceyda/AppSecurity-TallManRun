package f.a.a.b.s.k;

import g.a.a.a.a;
import java.util.List;

public class f extends c {

    /* renamed from: e  reason: collision with root package name */
    public List<String> f1781e;

    public f(int i2, Object obj) {
        super(i2, obj);
    }

    public f(Object obj) {
        super(1, obj);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof f)) {
            return false;
        }
        List<String> list = this.f1781e;
        List<String> list2 = ((f) obj).f1781e;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        Object obj;
        StringBuilder sb;
        StringBuilder sb2 = new StringBuilder();
        if (this.f1781e == null) {
            sb = a.i("KeyWord(");
            sb.append(this.b);
            sb.append(",");
            obj = this.f1777d;
        } else {
            sb = a.i("KeyWord(");
            sb.append(this.b);
            sb.append(", ");
            sb.append(this.f1777d);
            sb.append(",");
            obj = this.f1781e;
        }
        sb.append(obj);
        sb.append(")");
        sb2.append(sb.toString());
        sb2.append(a());
        return sb2.toString();
    }
}
