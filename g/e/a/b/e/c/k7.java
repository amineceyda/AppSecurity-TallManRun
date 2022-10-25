package g.e.a.b.e.c;

public final class k7 implements n8 {
    public static final k7 a = new k7();

    public final l8 a(Class cls) {
        Class<o7> cls2 = o7.class;
        if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (l8) o7.o(cls.asSubclass(cls2)).r(3, (Object) null, (Object) null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }

    public final boolean b(Class cls) {
        return o7.class.isAssignableFrom(cls);
    }
}
