package f.a.a.a;

import com.tencent.raft.codegenmeta.utils.Constants;
import f.a.a.a.i.b;
import f.a.a.a.i.b0;
import f.a.a.a.i.f;
import f.a.a.a.i.h;
import f.a.a.a.i.i;
import f.a.a.a.i.j;
import f.a.a.a.i.k;
import f.a.a.a.i.l;
import f.a.a.a.i.m;
import f.a.a.a.i.n;
import f.a.a.a.i.o;
import f.a.a.a.i.p;
import f.a.a.a.i.q;
import f.a.a.a.i.r;
import f.a.a.a.i.s;
import f.a.a.a.i.u;
import f.a.a.a.i.v;
import f.a.a.a.i.w;
import f.a.a.a.i.x;
import f.a.a.a.i.z;
import f.a.a.a.l.c;
import f.a.a.b.s.g;
import f.a.a.b.s.k.e;
import java.util.HashMap;
import java.util.Map;

public class d extends g<c> {

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, String> f1623k;

    static {
        Class<x> cls = x.class;
        Class<p> cls2 = p.class;
        Class<j> cls3 = j.class;
        Class<l> cls4 = l.class;
        Class<s> cls5 = s.class;
        Class<f.a.a.a.i.d> cls6 = f.a.a.a.i.d.class;
        Class<z> cls7 = z.class;
        Class<w> cls8 = w.class;
        Class<f.a.a.a.i.g> cls9 = f.a.a.a.i.g.class;
        Class<b0> cls10 = b0.class;
        Class<r> cls11 = r.class;
        Class<o> cls12 = o.class;
        Class<k> cls13 = k.class;
        Class<f> cls14 = f.class;
        HashMap hashMap = new HashMap();
        f1623k = hashMap;
        Class<u> cls15 = u.class;
        hashMap.putAll(e.f1778g);
        Class<i> cls16 = i.class;
        hashMap.put("d", cls9.getName());
        hashMap.put("date", cls9.getName());
        hashMap.put("r", cls8.getName());
        hashMap.put("relative", cls8.getName());
        hashMap.put("level", cls13.getName());
        hashMap.put("le", cls13.getName());
        hashMap.put("p", cls13.getName());
        hashMap.put("t", cls7.getName());
        hashMap.put("thread", cls7.getName());
        hashMap.put("lo", cls12.getName());
        hashMap.put("logger", cls12.getName());
        hashMap.put("c", cls12.getName());
        hashMap.put("m", cls11.getName());
        hashMap.put("msg", cls11.getName());
        hashMap.put("message", cls11.getName());
        hashMap.put("C", cls6.getName());
        hashMap.put(Constants.Service.CLASS, cls6.getName());
        hashMap.put("M", cls5.getName());
        hashMap.put("method", cls5.getName());
        hashMap.put("L", cls4.getName());
        hashMap.put("line", cls4.getName());
        hashMap.put("F", cls3.getName());
        hashMap.put("file", cls3.getName());
        hashMap.put("X", cls2.getName());
        hashMap.put("mdc", cls2.getName());
        hashMap.put("ex", cls10.getName());
        hashMap.put("exception", cls10.getName());
        hashMap.put("rEx", cls.getName());
        hashMap.put("rootException", cls.getName());
        hashMap.put("throwable", cls10.getName());
        hashMap.put("xEx", cls16.getName());
        hashMap.put("xException", cls16.getName());
        hashMap.put("xThrowable", cls16.getName());
        hashMap.put("nopex", cls15.getName());
        hashMap.put("nopexception", cls15.getName());
        hashMap.put("cn", cls14.getName());
        hashMap.put("contextName", cls14.getName());
        hashMap.put("caller", b.class.getName());
        hashMap.put("marker", q.class.getName());
        hashMap.put("property", v.class.getName());
        hashMap.put("n", m.class.getName());
        hashMap.put("lsn", n.class.getName());
    }

    public d() {
        this.f1764h = new h();
    }

    public String s(Object obj) {
        c cVar = (c) obj;
        if (!this.f1693e) {
            return "";
        }
        StringBuilder sb = new StringBuilder(256);
        for (f.a.a.b.s.b<E> bVar = this.f1762f; bVar != null; bVar = bVar.b) {
            bVar.i(sb, cVar);
        }
        return sb.toString();
    }
}
