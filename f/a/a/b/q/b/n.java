package f.a.a.b.q.b;

import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.f.b;
import f.a.a.b.q.d.e;
import f.a.a.b.q.d.i;
import f.a.a.b.q.d.k;
import f.a.a.b.q.e.d;
import f.a.a.b.w.c;
import f.a.a.b.z.m;
import g.a.a.a.a;
import java.lang.reflect.Method;
import java.util.Stack;
import org.xml.sax.Attributes;

public class n extends j {

    /* renamed from: e  reason: collision with root package name */
    public Stack<i> f1724e = new Stack<>();

    public void s(i iVar, String str, Attributes attributes) {
        Class<?> cls;
        i peek = this.f1724e.peek();
        String w = iVar.w(attributes.getValue(Constants.Service.CLASS));
        try {
            if (!b.s(w)) {
                cls = m.a(this.c).loadClass(w);
            } else {
                cls = peek.a.w(peek.c, peek.b, iVar.f1744j);
            }
            if (cls == null) {
                peek.f1721e = true;
                m("Could not find an appropriate class for property [" + str + "]");
                return;
            }
            if (b.s(w)) {
                n("Assuming default type [" + cls.getName() + "] for [" + str + "] property");
            }
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            peek.f1720d = newInstance;
            if (newInstance instanceof c) {
                ((c) newInstance).g(this.c);
            }
            iVar.f1739e.push(peek.f1720d);
        } catch (Exception e2) {
            peek.f1721e = true;
            c(a.d("Could not create component [", str, "] of type [", w, "]"), e2);
        }
    }

    public void u(i iVar, String str) {
        String str2;
        i pop = this.f1724e.pop();
        if (!pop.f1721e) {
            d dVar = new d(pop.f1720d);
            dVar.g(this.c);
            if (dVar.t("parent") == f.a.a.b.z.a.AS_COMPLEX_PROPERTY) {
                dVar.C("parent", pop.a.f1753e);
            }
            Object obj = pop.f1720d;
            if (obj instanceof f.a.a.b.w.i) {
                boolean z = false;
                if (obj != null && ((k) obj.getClass().getAnnotation(k.class)) == null) {
                    z = true;
                }
                if (z) {
                    ((f.a.a.b.w.i) obj).start();
                }
            }
            if (iVar.u() != pop.f1720d) {
                str2 = "The object on the top the of the stack is not the component pushed earlier.";
            } else {
                iVar.v();
                int ordinal = pop.b.ordinal();
                if (ordinal == 2) {
                    pop.a.C(str, pop.f1720d);
                    return;
                } else if (ordinal != 4) {
                    StringBuilder i2 = a.i("Unexpected aggregationType ");
                    i2.append(pop.b);
                    str2 = i2.toString();
                } else {
                    d dVar2 = pop.a;
                    Object obj2 = pop.f1720d;
                    Method v = dVar2.v(str);
                    if (v == null) {
                        StringBuilder n = a.n("Could not find method [add", str, "] in class [");
                        n.append(dVar2.f1754f.getName());
                        n.append("].");
                        dVar2.m(n.toString());
                        return;
                    } else if (dVar2.B(str, v.getParameterTypes(), obj2)) {
                        dVar2.A(v, obj2);
                        return;
                    } else {
                        return;
                    }
                }
            }
            m(str2);
        }
    }

    public boolean w(e eVar, Attributes attributes, i iVar) {
        String c = eVar.c();
        if (iVar.t()) {
            return false;
        }
        d dVar = new d(iVar.u());
        dVar.g(this.c);
        f.a.a.b.z.a t = dVar.t(c);
        int ordinal = t.ordinal();
        if (!(ordinal == 0 || ordinal == 1)) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        m("PropertySetter.computeAggregationType returned " + t);
                        return false;
                    }
                }
            }
            this.f1724e.push(new i(dVar, t, c));
            return true;
        }
        return false;
    }
}
