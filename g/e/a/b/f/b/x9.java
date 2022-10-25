package g.e.a.b.f.b;

import e.d.a;
import e.d.f;
import e.d.g;
import g.e.a.b.e.c.jb;
import g.e.a.b.e.c.k4;
import g.e.a.b.e.c.l4;
import g.e.a.b.e.c.m4;
import g.e.a.b.e.c.n4;
import g.e.a.b.e.c.q3;
import g.e.a.b.e.c.r3;
import g.e.a.b.e.c.s3;
import g.e.a.b.e.c.t3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class x9 {
    public String a;
    public boolean b;
    public l4 c;

    /* renamed from: d  reason: collision with root package name */
    public BitSet f3404d;

    /* renamed from: e  reason: collision with root package name */
    public BitSet f3405e;

    /* renamed from: f  reason: collision with root package name */
    public Map f3406f;

    /* renamed from: g  reason: collision with root package name */
    public Map f3407g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ca f3408h;

    public /* synthetic */ x9(ca caVar, String str) {
        this.f3408h = caVar;
        this.a = str;
        this.b = true;
        this.f3404d = new BitSet();
        this.f3405e = new BitSet();
        this.f3406f = new a();
        this.f3407g = new a();
    }

    public /* synthetic */ x9(ca caVar, String str, l4 l4Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f3408h = caVar;
        this.a = str;
        this.f3404d = bitSet;
        this.f3405e = bitSet2;
        this.f3406f = map;
        this.f3407g = new a();
        Iterator it = ((f.c) ((a) map2).keySet()).iterator();
        while (true) {
            f.a aVar = (f.a) it;
            if (aVar.hasNext()) {
                Integer num = (Integer) aVar.next();
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) ((g) map2).get(num));
                this.f3407g.put(num, arrayList);
            } else {
                this.b = false;
                this.c = l4Var;
                return;
            }
        }
    }

    public final r3 a(int i2) {
        ArrayList arrayList;
        List list;
        q3 t = r3.t();
        if (t.f2990d) {
            t.f();
            t.f2990d = false;
        }
        r3.x((r3) t.c, i2);
        boolean z = this.b;
        if (t.f2990d) {
            t.f();
            t.f2990d = false;
        }
        r3.A((r3) t.c, z);
        l4 l4Var = this.c;
        if (l4Var != null) {
            if (t.f2990d) {
                t.f();
                t.f2990d = false;
            }
            r3.z((r3) t.c, l4Var);
        }
        k4 x = l4.x();
        List F = m9.F(this.f3404d);
        if (x.f2990d) {
            x.f();
            x.f2990d = false;
        }
        l4.H((l4) x.c, F);
        List F2 = m9.F(this.f3405e);
        if (x.f2990d) {
            x.f();
            x.f2990d = false;
        }
        l4.F((l4) x.c, F2);
        Map map = this.f3406f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.f3406f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l2 = (Long) this.f3406f.get(Integer.valueOf(intValue2));
                if (l2 != null) {
                    s3 u = t3.u();
                    if (u.f2990d) {
                        u.f();
                        u.f2990d = false;
                    }
                    t3.w((t3) u.c, intValue2);
                    long longValue = l2.longValue();
                    if (u.f2990d) {
                        u.f();
                        u.f2990d = false;
                    }
                    t3.x((t3) u.c, longValue);
                    arrayList2.add((t3) u.j());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            if (x.f2990d) {
                x.f();
                x.f2990d = false;
            }
            l4.J((l4) x.c, arrayList);
        }
        Map map2 = this.f3407g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num : this.f3407g.keySet()) {
                m4 v = n4.v();
                int intValue3 = num.intValue();
                if (v.f2990d) {
                    v.f();
                    v.f2990d = false;
                }
                n4.y((n4) v.c, intValue3);
                List list2 = (List) this.f3407g.get(num);
                if (list2 != null) {
                    Collections.sort(list2);
                    if (v.f2990d) {
                        v.f();
                        v.f2990d = false;
                    }
                    n4.z((n4) v.c, list2);
                }
                arrayList3.add((n4) v.j());
            }
            list = arrayList3;
        }
        if (x.f2990d) {
            x.f();
            x.f2990d = false;
        }
        l4.L((l4) x.c, list);
        if (t.f2990d) {
            t.f();
            t.f2990d = false;
        }
        r3.y((r3) t.c, (l4) x.j());
        return (r3) t.j();
    }

    public final void b(aa aaVar) {
        int a2 = aaVar.a();
        Boolean bool = aaVar.c;
        if (bool != null) {
            this.f3405e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = aaVar.f3110d;
        if (bool2 != null) {
            this.f3404d.set(a2, bool2.booleanValue());
        }
        if (aaVar.f3111e != null) {
            Map map = this.f3406f;
            Integer valueOf = Integer.valueOf(a2);
            Long l2 = (Long) map.get(valueOf);
            long longValue = aaVar.f3111e.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.f3406f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (aaVar.f3112f != null) {
            Map map2 = this.f3407g;
            Integer valueOf2 = Integer.valueOf(a2);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f3407g.put(valueOf2, list);
            }
            if (aaVar.c()) {
                list.clear();
            }
            jb.b();
            f fVar = this.f3408h.a.f3258g;
            String str = this.a;
            r2 r2Var = s2.X;
            if (fVar.u(str, r2Var) && aaVar.b()) {
                list.clear();
            }
            jb.b();
            boolean u = this.f3408h.a.f3258g.u(this.a, r2Var);
            Long valueOf3 = Long.valueOf(aaVar.f3112f.longValue() / 1000);
            if (!u) {
                list.add(valueOf3);
            } else if (!list.contains(valueOf3)) {
                list.add(valueOf3);
            }
        }
    }
}
