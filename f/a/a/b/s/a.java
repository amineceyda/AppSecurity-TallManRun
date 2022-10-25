package f.a.a.b.s;

public abstract class a<E> extends c<E> {

    /* renamed from: g  reason: collision with root package name */
    public b<E> f1757g;

    public String h(E e2) {
        StringBuilder sb = new StringBuilder();
        for (b<E> bVar = this.f1757g; bVar != null; bVar = bVar.b) {
            bVar.i(sb, e2);
        }
        return n(e2, sb.toString());
    }

    public abstract String n(E e2, String str);

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("CompositeConverter<");
        d dVar = this.c;
        if (dVar != null) {
            i2.append(dVar);
        }
        if (this.f1757g != null) {
            i2.append(", children: ");
            i2.append(this.f1757g);
        }
        i2.append(">");
        return i2.toString();
    }
}
