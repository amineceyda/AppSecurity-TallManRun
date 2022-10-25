package e.k;

import g.a.a.a.a;

public class w implements u {
    public static w a;

    public <T extends s> T a(Class<T> cls) {
        try {
            return (s) cls.newInstance();
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.v("Cannot create an instance of ", cls), e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(a.v("Cannot create an instance of ", cls), e3);
        }
    }
}
