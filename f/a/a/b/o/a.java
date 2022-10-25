package f.a.a.b.o;

public class a<E> {
    public E[] a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f1704d;

    /* renamed from: e  reason: collision with root package name */
    public int f1705e;

    public a(int i2) throws IllegalArgumentException {
        if (i2 >= 1) {
            this.f1705e = i2;
            this.a = new Object[i2];
            this.b = 0;
            this.c = 0;
            this.f1704d = 0;
            return;
        }
        throw new IllegalArgumentException(g.a.a.a.a.r("The maxSize argument (", i2, ") is not a positive integer."));
    }
}
