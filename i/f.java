package i;

import i.o.c.h;
import java.io.Serializable;

public final class f<T> implements Serializable {
    private final Object value;

    public static final class a implements Serializable {
        public final Throwable exception;

        public a(Throwable th) {
            h.e(th, "exception");
            this.exception = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && h.a(this.exception, ((a) obj).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            StringBuilder i2 = g.a.a.a.a.i("Failure(");
            i2.append(this.exception);
            i2.append(')');
            return i2.toString();
        }
    }

    public /* synthetic */ f(Object obj) {
        this.value = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).exception;
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && h.a(this.value, ((f) obj).value);
    }

    public int hashCode() {
        Object obj = this.value;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.value;
        if (obj instanceof a) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
