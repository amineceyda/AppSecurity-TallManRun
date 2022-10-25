package f.a.a.b.s.k;

import g.a.a.a.a;

public class b extends f {

    /* renamed from: f  reason: collision with root package name */
    public d f1776f;

    public b(String str) {
        super(2, str);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof b)) {
            return false;
        }
        d dVar = this.f1776f;
        d dVar2 = ((b) obj).f1776f;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f1776f != null) {
            StringBuilder i2 = a.i("CompositeNode(");
            i2.append(this.f1776f);
            i2.append(")");
            str = i2.toString();
        } else {
            str = "CompositeNode(no child)";
        }
        sb.append(str);
        sb.append(a());
        return sb.toString();
    }
}
