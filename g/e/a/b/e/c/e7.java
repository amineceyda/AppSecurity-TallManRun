package g.e.a.b.e.c;

public final class e7 {
    public static final c7 a = new d7();
    public static final c7 b;

    static {
        c7 c7Var;
        try {
            c7Var = (c7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c7Var = null;
        }
        b = c7Var;
    }
}
