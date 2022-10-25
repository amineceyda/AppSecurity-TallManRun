package f.a.a.b.s.k;

import f.a.a.b.s.d;

public class c extends d {

    /* renamed from: d  reason: collision with root package name */
    public d f1777d;

    public c(int i2, Object obj) {
        super(i2, obj);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof c)) {
            return false;
        }
        d dVar = this.f1777d;
        d dVar2 = ((c) obj).f1777d;
        return dVar != null ? dVar.equals(dVar2) : dVar2 == null;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        d dVar = this.f1777d;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
