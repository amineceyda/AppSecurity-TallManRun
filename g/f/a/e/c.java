package g.f.a.e;

import g.f.a.e.b;
import java.lang.reflect.Array;
import org.slf4j.helpers.MessageFormatter;

public class c {
    public static final Object b = new Object();
    public final b a;

    public c(b bVar) {
        this.a = bVar;
    }

    public final void a(StringBuilder sb, Object obj) {
        String obj2;
        if (obj != b) {
            if (obj == null) {
                obj2 = "null";
            } else if (obj.getClass().isArray()) {
                sb.append('[');
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(Array.get(obj, i2));
                }
                sb.append(']');
                return;
            } else {
                obj2 = obj.toString();
            }
            sb.append(obj2);
        }
    }

    public void b(String str, Object obj) {
        b.a aVar = b.a.DEBUG;
        Object obj2 = b;
        g(aVar, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void c(String str, Object obj, Object obj2) {
        g(b.a.DEBUG, (Throwable) null, str, obj, obj2, b, (Object[]) null);
    }

    public void d(String str, Object obj, Object obj2, Object obj3) {
        g(b.a.DEBUG, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }

    public void e(String str, Object obj) {
        b.a aVar = b.a.INFO;
        Object obj2 = b;
        g(aVar, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void f(String str, Object obj, Object obj2) {
        g(b.a.INFO, (Throwable) null, str, obj, obj2, b, (Object[]) null);
    }

    public final void g(b.a aVar, Throwable th, String str, Object obj, Object obj2, Object obj3, Object[] objArr) {
        if (this.a.a(aVar)) {
            StringBuilder sb = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int indexOf = str.indexOf(MessageFormatter.DELIM_STR, i2);
                if (indexOf == -1) {
                    break;
                }
                if (sb == null) {
                    sb = new StringBuilder(128);
                }
                sb.append(str, i2, indexOf);
                i2 = indexOf + 2;
                if (objArr == null) {
                    if (i3 == 0) {
                        a(sb, obj);
                    } else if (i3 == 1) {
                        a(sb, obj2);
                    } else if (i3 == 2) {
                        a(sb, obj3);
                    }
                } else if (i3 < objArr.length) {
                    a(sb, objArr[i3]);
                }
                i3++;
            }
            if (sb != null) {
                sb.append(str, i2, str.length());
                str = sb.toString();
            }
            if (th == null) {
                this.a.c(aVar, str);
            } else {
                this.a.b(aVar, str, th);
            }
        }
    }

    public void h(String str, Object obj) {
        b.a aVar = b.a.TRACE;
        Object obj2 = b;
        g(aVar, (Throwable) null, str, obj, obj2, obj2, (Object[]) null);
    }

    public void i(String str, Object obj, Object obj2) {
        g(b.a.TRACE, (Throwable) null, str, obj, obj2, b, (Object[]) null);
    }

    public void j(String str, Object obj, Object obj2, Object obj3) {
        g(b.a.TRACE, (Throwable) null, str, obj, obj2, obj3, (Object[]) null);
    }
}
