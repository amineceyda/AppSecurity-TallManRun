package f.a.a.b.y;

import ch.qos.logback.core.spi.ScanException;
import f.a.a.b.e;
import f.a.a.b.y.a;
import f.a.a.b.y.d;
import java.util.List;

public class c {
    public final List<d> a;
    public int b = 0;

    public c(List<d> list) {
        this.a = list;
    }

    public final a a() throws ScanException {
        a aVar;
        d.a aVar2 = d.a.DEFAULT;
        d e2 = e();
        int ordinal = e2.a.ordinal();
        a aVar3 = null;
        if (ordinal != 0) {
            boolean z = false;
            if (ordinal == 1) {
                b();
                a aVar4 = new a(a.C0057a.VARIABLE, a());
                d e3 = e();
                if (e3 != null && e3.a == aVar2) {
                    z = true;
                }
                if (z) {
                    b();
                    aVar4.c = a();
                }
                c(e());
                b();
                aVar = aVar4;
            } else if (ordinal != 2) {
                aVar = null;
            } else {
                b();
                a a2 = a();
                d e4 = e();
                if (e4 != null && e4.a == aVar2) {
                    z = true;
                }
                if (z) {
                    b();
                    a2.a(d(":-"));
                    a2.a(a());
                }
                c(e());
                b();
                aVar = d(e.b);
                aVar.a(a2);
                aVar.a(d(e.c));
            }
        } else {
            b();
            aVar = d(e2.b);
        }
        if (aVar == null) {
            return null;
        }
        if (e() != null) {
            aVar3 = a();
        }
        if (aVar3 != null) {
            aVar.a(aVar3);
        }
        return aVar;
    }

    public void b() {
        this.b++;
    }

    public void c(d dVar) throws ScanException {
        if (dVar == null) {
            throw new IllegalArgumentException("All tokens consumed but was expecting \"}\"");
        } else if (dVar.a != d.a.CURLY_RIGHT) {
            throw new ScanException("Expecting }");
        }
    }

    public final a d(String str) {
        return new a(a.C0057a.LITERAL, str);
    }

    public d e() {
        if (this.b < this.a.size()) {
            return this.a.get(this.b);
        }
        return null;
    }
}
