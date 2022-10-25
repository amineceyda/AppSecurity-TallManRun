package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import g.c.b.b.f;
import g.e.c.j;
import g.e.c.k;
import g.e.c.l;
import g.e.c.m;
import g.e.c.q;
import g.e.c.r;
import g.e.c.t.g;
import g.e.c.t.p;
import g.e.c.t.s;
import g.e.c.v.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class MapTypeAdapterFactory implements r {
    public final g b;
    public final boolean c;

    public final class Adapter<K, V> extends q<Map<K, V>> {
        public final q<K> a;
        public final q<V> b;
        public final s<? extends Map<K, V>> c;

        public Adapter(Gson gson, Type type, q<K> qVar, Type type2, q<V> qVar2, s<? extends Map<K, V>> sVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, qVar, type);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, qVar2, type2);
            this.c = sVar;
        }

        public Object a(a aVar) throws IOException {
            int i2;
            b X = aVar.X();
            if (X == b.NULL) {
                aVar.P();
                return null;
            }
            Map map = (Map) this.c.a();
            if (X == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.o()) {
                    aVar.a();
                    K a2 = this.a.a(aVar);
                    if (map.put(a2, this.b.a(aVar)) == null) {
                        aVar.g();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + a2);
                    }
                }
                aVar.g();
            } else {
                aVar.b();
                while (aVar.o()) {
                    Objects.requireNonNull((a.C0131a) p.a);
                    if (aVar instanceof g.e.c.t.z.a) {
                        g.e.c.t.z.a aVar2 = (g.e.c.t.z.a) aVar;
                        aVar2.j0(b.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) aVar2.k0()).next();
                        aVar2.m0(entry.getValue());
                        aVar2.m0(new m((String) entry.getKey()));
                    } else {
                        int i3 = aVar.f3795i;
                        if (i3 == 0) {
                            i3 = aVar.f();
                        }
                        if (i3 == 13) {
                            i2 = 9;
                        } else if (i3 == 12) {
                            i2 = 8;
                        } else if (i3 == 14) {
                            i2 = 10;
                        } else {
                            StringBuilder i4 = g.a.a.a.a.i("Expected a name but was ");
                            i4.append(aVar.X());
                            i4.append(aVar.s());
                            throw new IllegalStateException(i4.toString());
                        }
                        aVar.f3795i = i2;
                    }
                    K a3 = this.a.a(aVar);
                    if (map.put(a3, this.b.a(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + a3);
                    }
                }
                aVar.j();
            }
            return map;
        }

        /* renamed from: d */
        public void c(c cVar, Map<K, V> map) throws IOException {
            String str;
            if (map == null) {
                cVar.t();
            } else if (!MapTypeAdapterFactory.this.c) {
                cVar.d();
                for (Map.Entry next : map.entrySet()) {
                    cVar.q(String.valueOf(next.getKey()));
                    this.b.c(cVar, next.getValue());
                }
                cVar.j();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    j b2 = this.a.b(next2.getKey());
                    arrayList.add(b2);
                    arrayList2.add(next2.getValue());
                    Objects.requireNonNull(b2);
                    z |= (b2 instanceof g.e.c.g) || (b2 instanceof l);
                }
                if (z) {
                    cVar.b();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.b();
                        f.z0((j) arrayList.get(i2), cVar);
                        this.b.c(cVar, arrayList2.get(i2));
                        cVar.g();
                        i2++;
                    }
                    cVar.g();
                    return;
                }
                cVar.d();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    j jVar = (j) arrayList.get(i2);
                    Objects.requireNonNull(jVar);
                    if (jVar instanceof m) {
                        m c2 = jVar.c();
                        Object obj = c2.a;
                        if (obj instanceof Number) {
                            str = String.valueOf(c2.f());
                        } else if (obj instanceof Boolean) {
                            str = Boolean.toString(c2.e());
                        } else if (obj instanceof String) {
                            str = c2.h();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (jVar instanceof k) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.q(str);
                    this.b.c(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.j();
            }
        }
    }

    public MapTypeAdapterFactory(g gVar, boolean z) {
        this.b = gVar;
        this.c = z;
    }

    public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.b;
        if (!Map.class.isAssignableFrom(aVar.a)) {
            return null;
        }
        Class<?> e2 = g.e.c.t.a.e(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type f2 = g.e.c.t.a.f(type, e2, Map.class);
            typeArr = f2 instanceof ParameterizedType ? ((ParameterizedType) f2).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        return new Adapter(gson, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f411f : gson.f(new g.e.c.u.a(type2)), typeArr[1], gson.f(new g.e.c.u.a(typeArr[1])), this.b.a(aVar));
    }
}
