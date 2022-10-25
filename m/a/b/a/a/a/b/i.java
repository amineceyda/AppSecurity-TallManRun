package m.a.b.a.a.a.b;

public final class i implements Cloneable {
    public boolean b = false;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5163d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5164e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f5165f;

    /* renamed from: g  reason: collision with root package name */
    public int f5166g;

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.f5163d == this.f5163d && iVar.f5164e == this.f5164e && iVar.b == this.b && iVar.c == this.c;
    }

    public int hashCode() {
        return (((((((this.f5163d ? 1 : 0) * true) + (this.f5164e ? 1 : 0)) * 13) + (this.b ? 1 : 0)) * 7) + (this.c ? 1 : 0)) * 3;
    }
}
