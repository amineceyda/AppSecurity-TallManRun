package e.h.b;

import android.util.Log;
import java.io.Writer;

public final class p0 extends Writer {
    public final String b;
    public StringBuilder c = new StringBuilder(128);

    public p0(String str) {
        this.b = str;
    }

    public final void a() {
        if (this.c.length() > 0) {
            Log.d(this.b, this.c.toString());
            StringBuilder sb = this.c;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == 10) {
                a();
            } else {
                this.c.append(c2);
            }
        }
    }
}
