package g.e.a.b.e.c;

public final class x8 implements l8 {
    public final o8 a;
    public final String b;
    public final Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3085d;

    public x8(o8 o8Var, String str, Object[] objArr) {
        this.a = o8Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3085d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f3085d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    public final o8 c() {
        return this.a;
    }

    public final boolean j() {
        return (this.f3085d & 2) == 2;
    }

    public final int k() {
        return (this.f3085d & 1) == 1 ? 1 : 2;
    }
}
