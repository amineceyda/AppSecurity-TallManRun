package f.a.a.b.z;

import e.e.f.b;
import f.a.a.b.c;
import f.a.a.b.e;
import f.a.a.b.x.d;
import f.a.a.b.x.g;
import g.a.a.a.a;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public class n {
    public static PrintStream a = System.out;
    public static c b = new c("HH:mm:ss,SSS", Locale.US);

    public static void a(StringBuilder sb, String str, d dVar) {
        String str2;
        StringBuilder sb2;
        if (dVar.hasChildren()) {
            sb2 = a.i(str);
            str2 = "+ ";
        } else {
            sb2 = a.i(str);
            str2 = "|-";
        }
        sb2.append(str2);
        String sb3 = sb2.toString();
        c cVar = b;
        if (cVar != null) {
            sb.append(cVar.a(dVar.b().longValue()));
            sb.append(" ");
        }
        sb.append(sb3);
        sb.append(dVar);
        sb.append(e.a);
        if (dVar.getThrowable() != null) {
            Throwable throwable = dVar.getThrowable();
            LinkedList linkedList = new LinkedList();
            b.f(linkedList, throwable, (StackTraceElement[]) null);
            for (String str3 : (String[]) linkedList.toArray(new String[0])) {
                if (!str3.startsWith("Caused by: ")) {
                    sb.append(Character.isDigit(str3.charAt(0)) ? "\t... " : "\tat ");
                }
                sb.append(str3);
                sb.append(e.a);
            }
        }
        if (dVar.hasChildren()) {
            Iterator<d> it = dVar.iterator();
            while (it.hasNext()) {
                a(sb, str + "  ", it.next());
            }
        }
    }

    public static void b(c cVar, long j2) {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) g.a(cVar.c(), j2)).iterator();
        while (it.hasNext()) {
            a(sb, "", (d) it.next());
        }
        a.println(sb.toString());
    }

    public static void c(f.a.a.b.d dVar) {
        c cVar = dVar.f1685d;
        if (cVar == null) {
            PrintStream printStream = a;
            StringBuilder i2 = a.i("WARN: Context named \"");
            i2.append(dVar.c);
            i2.append("\" has no status manager");
            printStream.println(i2.toString());
            return;
        }
        b(cVar, 0);
    }

    public static void d(f.a.a.b.d dVar) {
        if (dVar != null) {
            c cVar = dVar.f1685d;
            if (cVar == null) {
                PrintStream printStream = a;
                StringBuilder i2 = a.i("WARN: Context named \"");
                i2.append(dVar.c);
                i2.append("\" has no status manager");
                printStream.println(i2.toString());
                return;
            }
            Iterator it = ((ArrayList) g.a(cVar.c(), 0)).iterator();
            int i3 = 0;
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                if (dVar2.getLevel() > i3) {
                    i3 = dVar2.getLevel();
                }
            }
            if (i3 >= 1) {
                b(cVar, 0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Context argument cannot be null");
    }
}
