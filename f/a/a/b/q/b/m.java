package f.a.a.b.q.b;

import f.a.a.b.q.d.i;
import f.a.a.b.q.e.d;
import f.a.a.b.q.e.e;
import g.a.a.a.a;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Stack;
import org.xml.sax.Attributes;

public class m extends j {

    /* renamed from: e  reason: collision with root package name */
    public Stack<h> f1723e = new Stack<>();

    public void s(i iVar, String str, Attributes attributes) {
    }

    public void t(i iVar, String str) {
        String w = iVar.w(str);
        h peek = this.f1723e.peek();
        int ordinal = peek.b.ordinal();
        if (ordinal == 1) {
            peek.a.E(peek.c, w);
        } else if (ordinal != 3) {
            StringBuilder i2 = a.i("Unexpected aggregationType ");
            i2.append(peek.b);
            m(i2.toString());
        } else {
            d dVar = peek.a;
            String str2 = peek.c;
            Objects.requireNonNull(dVar);
            if (w != null) {
                String s = dVar.s(str2);
                Method v = dVar.v(s);
                if (v == null) {
                    dVar.m("No adder for property [" + s + "].");
                    return;
                }
                Class[] parameterTypes = v.getParameterTypes();
                dVar.B(s, parameterTypes, w);
                try {
                    if (e.a(dVar, w, parameterTypes[0]) != null) {
                        dVar.A(v, w);
                    }
                } catch (Throwable th) {
                    StringBuilder i3 = a.i("Conversion to type [");
                    i3.append(parameterTypes[0]);
                    i3.append("] failed. ");
                    dVar.c(i3.toString(), th);
                }
            }
        }
    }

    public void u(i iVar, String str) {
        this.f1723e.pop();
    }

    public boolean w(f.a.a.b.q.d.e eVar, Attributes attributes, i iVar) {
        String c = eVar.c();
        if (iVar.t()) {
            return false;
        }
        d dVar = new d(iVar.u());
        dVar.g(this.c);
        f.a.a.b.z.a t = dVar.t(c);
        int ordinal = t.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            m("PropertySetter.canContainComponent returned " + t);
                            return false;
                        }
                    }
                }
            }
            this.f1723e.push(new h(dVar, t, c));
            return true;
        }
        return false;
    }
}
