package g.e.a.b.e.c;

public final class t8 {
    public static final s8 a;
    public static final s8 b = new s8();

    static {
        s8 s8Var;
        try {
            s8Var = (s8) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            s8Var = null;
        }
        a = s8Var;
    }
}
