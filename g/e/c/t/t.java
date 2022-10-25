package g.e.c.t;

import java.io.IOException;
import java.io.Writer;

public final class t extends Writer {
    public final Appendable b;
    public final a c = new a();

    public static class a implements CharSequence {
        public char[] b;

        public char charAt(int i2) {
            return this.b[i2];
        }

        public int length() {
            return this.b.length;
        }

        public CharSequence subSequence(int i2, int i3) {
            return new String(this.b, i2, i3 - i2);
        }
    }

    public t(Appendable appendable) {
        this.b = appendable;
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(int i2) throws IOException {
        this.b.append((char) i2);
    }

    public void write(char[] cArr, int i2, int i3) throws IOException {
        a aVar = this.c;
        aVar.b = cArr;
        this.b.append(aVar, i2, i3 + i2);
    }
}
