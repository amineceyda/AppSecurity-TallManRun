package i.o.c;

import i.o.b.a;
import i.o.b.c;
import i.o.b.e;
import i.o.b.f;
import i.o.b.g;
import i.o.b.h;
import i.o.b.i;
import i.o.b.j;
import i.o.b.k;
import i.o.b.l;
import i.o.b.m;
import i.o.b.n;
import i.o.b.o;
import i.o.b.p;
import i.o.b.q;
import i.o.b.r;
import i.o.b.s;
import i.o.b.t;
import i.o.b.u;
import i.o.b.v;
import i.o.b.w;
import i.r.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d implements b<Object>, c {
    public static final Map<Class<? extends Object<?>>, Integer> b;
    public static final HashMap<String, String> c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, String> f4575d;

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f4576e;
    public final Class<?> a;

    static {
        Map<Class<? extends Object<?>>, Integer> map;
        Class[] clsArr = {a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, i.o.b.b.class, c.class, i.o.b.d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class};
        h.e(clsArr, "elements");
        List d2 = g.c.b.b.f.d(clsArr);
        h.e(d2, "$this$collectionSizeOrDefault");
        ArrayList arrayList = new ArrayList(d2.size());
        int i2 = 0;
        for (Object next : d2) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new i.e((Class) next, Integer.valueOf(i2)));
                i2 = i3;
            } else {
                i.l.c.g();
                throw null;
            }
        }
        h.e(arrayList, "$this$toMap");
        int size = arrayList.size();
        if (size == 0) {
            map = i.l.f.b;
        } else if (size != 1) {
            map = new LinkedHashMap<>(g.c.b.b.f.W(arrayList.size()));
            i.l.c.i(arrayList, map);
        } else {
            i.e eVar = (i.e) arrayList.get(0);
            h.e(eVar, "pair");
            map = Collections.singletonMap(eVar.c(), eVar.d());
            h.d(map, "java.util.Collections.si…(pair.first, pair.second)");
        }
        b = map;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        c = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f4575d = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            h.d(str, "kotlinName");
            sb.append(i.t.e.n(str, '.', (String) null, 2));
            sb.append("CompanionObject");
            i.e eVar2 = new i.e(sb.toString(), g.a.a.a.a.w(str, ".Companion"));
            hashMap3.put(eVar2.c(), eVar2.d());
        }
        for (Map.Entry next2 : b.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f4576e = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g.c.b.b.f.W(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), i.t.e.n((String) entry.getValue(), '.', (String) null, 2));
        }
    }

    public d(Class<?> cls) {
        h.e(cls, "jClass");
        this.a = cls;
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && h.a(g.c.b.b.f.F(this), g.c.b.b.f.F((b) obj));
    }

    public int hashCode() {
        return g.c.b.b.f.F(this).hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
