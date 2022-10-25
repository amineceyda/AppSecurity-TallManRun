package g.e.c;

import g.e.c.t.q;
import java.math.BigInteger;
import java.util.Objects;

public final class m extends j {
    public final Object a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean i(m mVar) {
        Object obj = mVar.a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public boolean e() {
        Object obj = this.a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(h());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.a == null) {
            return mVar.a == null;
        }
        if (i(this) && i(mVar)) {
            return f().longValue() == mVar.f().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(mVar.a instanceof Number)) {
            return obj2.equals(mVar.a);
        }
        double doubleValue = f().doubleValue();
        double doubleValue2 = mVar.f().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public Number f() {
        Object obj = this.a;
        return obj instanceof String ? new q((String) this.a) : (Number) obj;
    }

    public String h() {
        Object obj = this.a;
        if (obj instanceof Number) {
            return f().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (i(this)) {
            doubleToLongBits = f().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
