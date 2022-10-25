package g.d.a.l.t.b0;

public final class h implements a<int[]> {
    public String a() {
        return "IntegerArrayPool";
    }

    public int b(Object obj) {
        return ((int[]) obj).length;
    }

    public int c() {
        return 4;
    }

    public Object newArray(int i2) {
        return new int[i2];
    }
}
