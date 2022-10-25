package g.e.c.v;

import com.tencent.raft.codegenmeta.utils.Constants;
import g.a.a.a.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public class c implements Closeable, Flushable {

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f3809k = new String[128];

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f3810l;
    public final Writer b;
    public int[] c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    public int f3811d = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f3812e;

    /* renamed from: f  reason: collision with root package name */
    public String f3813f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3814g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3815h;

    /* renamed from: i  reason: collision with root package name */
    public String f3816i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3817j;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f3809k[i2] = String.format("\\u%04x", new Object[]{Integer.valueOf(i2)});
        }
        String[] strArr = f3809k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f3810l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        v(6);
        this.f3813f = Constants.KEY_INDEX_FILE_SEPARATOR;
        this.f3817j = true;
        Objects.requireNonNull(writer, "out == null");
        this.b = writer;
    }

    public final void F(boolean z) {
        this.f3815h = z;
    }

    public final void O(String str) {
        String str2;
        if (str.length() == 0) {
            this.f3812e = null;
            str2 = Constants.KEY_INDEX_FILE_SEPARATOR;
        } else {
            this.f3812e = str;
            str2 = ": ";
        }
        this.f3813f = str2;
    }

    public final void P(boolean z) {
        this.f3814g = z;
    }

    public final void Q(boolean z) {
        this.f3817j = z;
    }

    public final void S(String str) throws IOException {
        String str2;
        String[] strArr = this.f3815h ? f3810l : f3809k;
        this.b.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i2 < i3) {
                this.b.write(str, i2, i3 - i2);
            }
            this.b.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.b.write(str, i2, length - i2);
        }
        this.b.write(34);
    }

    public c V(long j2) throws IOException {
        g0();
        a();
        this.b.write(Long.toString(j2));
        return this;
    }

    public c X(Boolean bool) throws IOException {
        if (bool == null) {
            return t();
        }
        g0();
        a();
        this.b.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c Y(Number number) throws IOException {
        if (number == null) {
            return t();
        }
        g0();
        String obj = number.toString();
        if (this.f3814g || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            a();
            this.b.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public final void a() throws IOException {
        int u = u();
        if (u == 1) {
            x(2);
        } else if (u == 2) {
            this.b.append(',');
        } else if (u != 4) {
            if (u != 6) {
                if (u != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f3814g) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            x(7);
            return;
        } else {
            this.b.append(this.f3813f);
            x(5);
            return;
        }
        s();
    }

    public c b() throws IOException {
        g0();
        a();
        v(1);
        this.b.write(91);
        return this;
    }

    public void close() throws IOException {
        this.b.close();
        int i2 = this.f3811d;
        if (i2 > 1 || (i2 == 1 && this.c[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f3811d = 0;
    }

    public c d() throws IOException {
        g0();
        a();
        v(3);
        this.b.write(123);
        return this;
    }

    public c e0(String str) throws IOException {
        if (str == null) {
            return t();
        }
        g0();
        a();
        S(str);
        return this;
    }

    public final c f(int i2, int i3, char c2) throws IOException {
        int u = u();
        if (u != i3 && u != i2) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f3816i == null) {
            this.f3811d--;
            if (u == i3) {
                s();
            }
            this.b.write(c2);
            return this;
        } else {
            StringBuilder i4 = a.i("Dangling name: ");
            i4.append(this.f3816i);
            throw new IllegalStateException(i4.toString());
        }
    }

    public c f0(boolean z) throws IOException {
        g0();
        a();
        this.b.write(z ? "true" : "false");
        return this;
    }

    public void flush() throws IOException {
        if (this.f3811d != 0) {
            this.b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c g() throws IOException {
        f(1, 2, ']');
        return this;
    }

    public final void g0() throws IOException {
        if (this.f3816i != null) {
            int u = u();
            if (u == 5) {
                this.b.write(44);
            } else if (u != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            s();
            x(4);
            S(this.f3816i);
            this.f3816i = null;
        }
    }

    public c j() throws IOException {
        f(3, 5, MessageFormatter.DELIM_STOP);
        return this;
    }

    public final boolean k() {
        return this.f3817j;
    }

    public final boolean n() {
        return this.f3815h;
    }

    public boolean o() {
        return this.f3814g;
    }

    public c q(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f3816i != null) {
            throw new IllegalStateException();
        } else if (this.f3811d != 0) {
            this.f3816i = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public final void s() throws IOException {
        if (this.f3812e != null) {
            this.b.write(10);
            int i2 = this.f3811d;
            for (int i3 = 1; i3 < i2; i3++) {
                this.b.write(this.f3812e);
            }
        }
    }

    public c t() throws IOException {
        if (this.f3816i != null) {
            if (this.f3817j) {
                g0();
            } else {
                this.f3816i = null;
                return this;
            }
        }
        a();
        this.b.write("null");
        return this;
    }

    public final int u() {
        int i2 = this.f3811d;
        if (i2 != 0) {
            return this.c[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void v(int i2) {
        int i3 = this.f3811d;
        int[] iArr = this.c;
        if (i3 == iArr.length) {
            this.c = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.c;
        int i4 = this.f3811d;
        this.f3811d = i4 + 1;
        iArr2[i4] = i2;
    }

    public final void x(int i2) {
        this.c[this.f3811d - 1] = i2;
    }
}
