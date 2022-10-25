package g.e.c.t.z;

import g.e.c.g;
import g.e.c.k;
import g.e.c.l;
import g.e.c.m;
import g.e.c.t.r;
import g.e.c.v.b;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class a extends g.e.c.v.a {
    public static final Object v = new Object();
    public Object[] r;
    public int s;
    public String[] t;
    public int[] u;

    /* renamed from: g.e.c.t.z.a$a  reason: collision with other inner class name */
    public class C0130a extends Reader {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i2, int i3) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C0130a();
    }

    private String s() {
        StringBuilder i2 = g.a.a.a.a.i(" at path ");
        i2.append(n());
        return i2.toString();
    }

    public String F() throws IOException {
        j0(b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) k0()).next();
        String str = (String) entry.getKey();
        this.t[this.s - 1] = str;
        m0(entry.getValue());
        return str;
    }

    public void P() throws IOException {
        j0(b.NULL);
        l0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String S() throws IOException {
        b X = X();
        b bVar = b.STRING;
        if (X == bVar || X == b.NUMBER) {
            String h2 = ((m) l0()).h();
            int i2 = this.s;
            if (i2 > 0) {
                int[] iArr = this.u;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return h2;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + X + s());
    }

    public b X() throws IOException {
        if (this.s == 0) {
            return b.END_DOCUMENT;
        }
        Object k0 = k0();
        if (k0 instanceof Iterator) {
            boolean z = this.r[this.s - 2] instanceof l;
            Iterator it = (Iterator) k0;
            if (!it.hasNext()) {
                return z ? b.END_OBJECT : b.END_ARRAY;
            }
            if (z) {
                return b.NAME;
            }
            m0(it.next());
            return X();
        } else if (k0 instanceof l) {
            return b.BEGIN_OBJECT;
        } else {
            if (k0 instanceof g) {
                return b.BEGIN_ARRAY;
            }
            if (k0 instanceof m) {
                Object obj = ((m) k0).a;
                if (obj instanceof String) {
                    return b.STRING;
                }
                if (obj instanceof Boolean) {
                    return b.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return b.NUMBER;
                }
                throw new AssertionError();
            } else if (k0 instanceof k) {
                return b.NULL;
            } else {
                if (k0 == v) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    public void a() throws IOException {
        j0(b.BEGIN_ARRAY);
        m0(((g) k0()).iterator());
        this.u[this.s - 1] = 0;
    }

    public void b() throws IOException {
        j0(b.BEGIN_OBJECT);
        m0(((r.b) ((l) k0()).a.entrySet()).iterator());
    }

    public void close() throws IOException {
        this.r = new Object[]{v};
        this.s = 1;
    }

    public void g() throws IOException {
        j0(b.END_ARRAY);
        l0();
        l0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void h0() throws IOException {
        if (X() == b.NAME) {
            F();
            this.t[this.s - 2] = "null";
        } else {
            l0();
            int i2 = this.s;
            if (i2 > 0) {
                this.t[i2 - 1] = "null";
            }
        }
        int i3 = this.s;
        if (i3 > 0) {
            int[] iArr = this.u;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public void j() throws IOException {
        j0(b.END_OBJECT);
        l0();
        l0();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void j0(b bVar) throws IOException {
        if (X() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + X() + s());
        }
    }

    public final Object k0() {
        return this.r[this.s - 1];
    }

    public final Object l0() {
        Object[] objArr = this.r;
        int i2 = this.s - 1;
        this.s = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void m0(Object obj) {
        int i2 = this.s;
        Object[] objArr = this.r;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.r = Arrays.copyOf(objArr, i3);
            this.u = Arrays.copyOf(this.u, i3);
            this.t = (String[]) Arrays.copyOf(this.t, i3);
        }
        Object[] objArr2 = this.r;
        int i4 = this.s;
        this.s = i4 + 1;
        objArr2[i4] = obj;
    }

    public String n() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.s) {
            Object[] objArr = this.r;
            if (objArr[i2] instanceof g) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.u[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof l) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.t;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    public boolean o() throws IOException {
        b X = X();
        return (X == b.END_OBJECT || X == b.END_ARRAY) ? false : true;
    }

    public boolean t() throws IOException {
        j0(b.BOOLEAN);
        boolean e2 = ((m) l0()).e();
        int i2 = this.s;
        if (i2 > 0) {
            int[] iArr = this.u;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return e2;
    }

    public String toString() {
        return a.class.getSimpleName();
    }

    public double u() throws IOException {
        b X = X();
        b bVar = b.NUMBER;
        if (X == bVar || X == b.STRING) {
            m mVar = (m) k0();
            double doubleValue = mVar.a instanceof Number ? mVar.f().doubleValue() : Double.parseDouble(mVar.h());
            if (this.c || (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue))) {
                l0();
                int i2 = this.s;
                if (i2 > 0) {
                    int[] iArr = this.u;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return doubleValue;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + X + s());
    }

    public int v() throws IOException {
        b X = X();
        b bVar = b.NUMBER;
        if (X == bVar || X == b.STRING) {
            m mVar = (m) k0();
            int intValue = mVar.a instanceof Number ? mVar.f().intValue() : Integer.parseInt(mVar.h());
            l0();
            int i2 = this.s;
            if (i2 > 0) {
                int[] iArr = this.u;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return intValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + X + s());
    }

    public long x() throws IOException {
        b X = X();
        b bVar = b.NUMBER;
        if (X == bVar || X == b.STRING) {
            m mVar = (m) k0();
            long longValue = mVar.a instanceof Number ? mVar.f().longValue() : Long.parseLong(mVar.h());
            l0();
            int i2 = this.s;
            if (i2 > 0) {
                int[] iArr = this.u;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return longValue;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + X + s());
    }
}
