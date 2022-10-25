package f.a.a.a.i;

import f.a.a.a.l.c;

public class s extends e {
    public String h(Object obj) {
        StackTraceElement[] a = ((c) obj).a();
        return (a == null || a.length <= 0) ? "?" : a[0].getMethodName();
    }
}
