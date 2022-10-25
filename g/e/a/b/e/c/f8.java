package g.e.a.b.e.c;

public final class f8 implements n8 {
    public final n8[] a;

    public f8(n8... n8VarArr) {
        this.a = n8VarArr;
    }

    public final l8 a(Class cls) {
        n8[] n8VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            n8 n8Var = n8VarArr[i2];
            if (n8Var.b(cls)) {
                return n8Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class cls) {
        n8[] n8VarArr = this.a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (n8VarArr[i2].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
