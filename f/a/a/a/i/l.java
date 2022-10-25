package f.a.a.a.i;

import f.a.a.a.l.c;

public class l extends e {
    public String h(Object obj) {
        StackTraceElement[] a = ((c) obj).a();
        return (a == null || a.length <= 0) ? "?" : Integer.toString(a[0].getLineNumber());
    }
}
