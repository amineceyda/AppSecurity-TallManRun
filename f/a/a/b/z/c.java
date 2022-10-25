package f.a.a.b.z;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class c {
    public long a = -1;
    public String b = null;
    public final SimpleDateFormat c;

    public c(String str, Locale locale) {
        this.c = new SimpleDateFormat(str, locale);
    }

    public final String a(long j2) {
        String str;
        synchronized (this) {
            if (j2 != this.a) {
                this.a = j2;
                this.b = this.c.format(new Date(j2));
            }
            str = this.b;
        }
        return str;
    }
}
