package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import g.e.c.d;
import g.e.c.f;
import g.e.c.j;
import g.e.c.k;
import g.e.c.p;
import g.e.c.q;
import g.e.c.r;
import g.e.c.t.g;
import g.e.c.u.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import org.slf4j.Marker;

public final class Gson {

    /* renamed from: m  reason: collision with root package name */
    public static final a<?> f380m = new a<>(Object.class);
    public final ThreadLocal<Map<a<?>, FutureTypeAdapter<?>>> a;
    public final Map<a<?>, q<?>> b;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f381d;

    /* renamed from: e  reason: collision with root package name */
    public final List<r> f382e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f383f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f384g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f385h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f386i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f387j;

    /* renamed from: k  reason: collision with root package name */
    public final List<r> f388k;

    /* renamed from: l  reason: collision with root package name */
    public final List<r> f389l;

    public static class FutureTypeAdapter<T> extends q<T> {
        public q<T> a;

        public T a(g.e.c.v.a aVar) throws IOException {
            q<T> qVar = this.a;
            if (qVar != null) {
                return qVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        public void c(c cVar, T t) throws IOException {
            q<T> qVar = this.a;
            if (qVar != null) {
                qVar.c(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        this(Excluder.f390h, g.e.c.c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, p.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public Gson(Excluder excluder, d dVar, Map<Type, f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, p pVar, String str, int i2, int i3, List<r> list, List<r> list2, List<r> list3) {
        Excluder excluder2 = excluder;
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        Map<Type, f<?>> map2 = map;
        g gVar = new g(map);
        this.c = gVar;
        this.f383f = z;
        this.f384g = z3;
        this.f385h = z4;
        this.f386i = z5;
        this.f387j = z6;
        this.f388k = list;
        this.f389l = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f418m);
        arrayList.add(TypeAdapters.f412g);
        arrayList.add(TypeAdapters.f414i);
        arrayList.add(TypeAdapters.f416k);
        final q r4 = pVar == p.DEFAULT ? TypeAdapters.t : new q<Number>() {
            public Object a(g.e.c.v.a aVar) throws IOException {
                if (aVar.X() != b.NULL) {
                    return Long.valueOf(aVar.x());
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.t();
                } else {
                    cVar.e0(number.toString());
                }
            }
        };
        arrayList.add(new r(Long.TYPE, Long.class, r4) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.a;
                if (cls == r1 || cls == r2) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(r2.getName());
                i2.append(Marker.ANY_NON_NULL_MARKER);
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        });
        arrayList.add(new r(Double.TYPE, Double.class, z7 ? TypeAdapters.v : new q<Number>(this) {
            public Object a(g.e.c.v.a aVar) throws IOException {
                if (aVar.X() != b.NULL) {
                    return Double.valueOf(aVar.u());
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.t();
                    return;
                }
                Gson.b(number.doubleValue());
                cVar.Y(number);
            }
        }) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.a;
                if (cls == r1 || cls == r2) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(r2.getName());
                i2.append(Marker.ANY_NON_NULL_MARKER);
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        });
        arrayList.add(new r(Float.TYPE, Float.class, z7 ? TypeAdapters.u : new q<Number>(this) {
            public Object a(g.e.c.v.a aVar) throws IOException {
                if (aVar.X() != b.NULL) {
                    return Float.valueOf((float) aVar.u());
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, Number number) throws IOException {
                if (number == null) {
                    cVar.t();
                    return;
                }
                Gson.b((double) number.floatValue());
                cVar.Y(number);
            }
        }) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                Class<? super T> cls = aVar.a;
                if (cls == r1 || cls == r2) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(r2.getName());
                i2.append(Marker.ANY_NON_NULL_MARKER);
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        });
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.o);
        arrayList.add(TypeAdapters.q);
        arrayList.add(new r(AtomicLong.class, new TypeAdapter$1(new q<AtomicLong>() {
            public Object a(g.e.c.v.a aVar) throws IOException {
                return new AtomicLong(((Number) q.this.a(aVar)).longValue());
            }

            /* renamed from: d */
            public void c(c cVar, AtomicLong atomicLong) throws IOException {
                q.this.c(cVar, Long.valueOf(atomicLong.get()));
            }
        })) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.a == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        });
        arrayList.add(new r(AtomicLongArray.class, new TypeAdapter$1(new q<AtomicLongArray>() {
            public Object a(g.e.c.v.a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.o()) {
                    arrayList.add(Long.valueOf(((Number) q.this.a(aVar)).longValue()));
                }
                aVar.g();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: d */
            public void c(c cVar, AtomicLongArray atomicLongArray) throws IOException {
                cVar.b();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    q.this.c(cVar, Long.valueOf(atomicLongArray.get(i2)));
                }
                cVar.g();
            }
        })) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.a == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        });
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(new r(BigDecimal.class, TypeAdapters.B) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.a == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        });
        arrayList.add(new r(BigInteger.class, TypeAdapters.C) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.a == r1) {
                    return r0;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        });
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f409d);
        arrayList.add(DateTypeAdapter.b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.b);
        arrayList.add(SqlDateTypeAdapter.b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.b);
        arrayList.add(new CollectionTypeAdapterFactory(gVar));
        boolean z8 = z2;
        arrayList.add(new MapTypeAdapterFactory(gVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(gVar);
        this.f381d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        d dVar2 = dVar;
        arrayList.add(new ReflectiveTypeAdapterFactory(gVar, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f382e = Collections.unmodifiableList(arrayList);
    }

    public static void a(Object obj, g.e.c.v.a aVar) {
        if (obj != null) {
            try {
                if (aVar.X() != b.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            }
        }
    }

    public static void b(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> T c(g.e.c.v.a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean z = aVar.c;
        aVar.c = true;
        try {
            aVar.X();
            T a2 = f(new a(type)).a(aVar);
            aVar.c = z;
            return a2;
        } catch (EOFException e2) {
            if (1 != 0) {
                aVar.c = z;
                return null;
            }
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IllegalStateException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (IOException e4) {
            throw new JsonSyntaxException((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            aVar.c = z;
            throw th;
        }
    }

    public <T> T d(String str, Class<T> cls) throws JsonSyntaxException {
        return g.c.b.b.f.y0(cls).cast(e(str, cls));
    }

    public <T> T e(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        g.e.c.v.a aVar = new g.e.c.v.a(new StringReader(str));
        aVar.c = this.f387j;
        T c2 = c(aVar, type);
        a(c2, aVar);
        return c2;
    }

    public <T> q<T> f(a<T> aVar) {
        q<T> qVar = this.b.get(aVar);
        if (qVar != null) {
            return qVar;
        }
        Map map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.a.set(map);
            z = true;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(aVar, futureTypeAdapter2);
            for (r a2 : this.f382e) {
                q<T> a3 = a2.a(this, aVar);
                if (a3 != null) {
                    if (futureTypeAdapter2.a == null) {
                        futureTypeAdapter2.a = a3;
                        this.b.put(aVar, a3);
                        return a3;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> q<T> g(r rVar, a<T> aVar) {
        if (!this.f382e.contains(rVar)) {
            rVar = this.f381d;
        }
        boolean z = false;
        for (r next : this.f382e) {
            if (z) {
                q<T> a2 = next.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (next == rVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public c h(Writer writer) throws IOException {
        if (this.f384g) {
            writer.write(")]}'\n");
        }
        c cVar = new c(writer);
        if (this.f386i) {
            cVar.O("  ");
        }
        cVar.Q(this.f383f);
        return cVar;
    }

    public String i(Object obj) {
        if (obj == null) {
            k kVar = k.a;
            StringWriter stringWriter = new StringWriter();
            k(kVar, stringWriter);
            return stringWriter.toString();
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        m(obj, cls, stringWriter2);
        return stringWriter2.toString();
    }

    public void j(j jVar, c cVar) throws JsonIOException {
        boolean o = cVar.o();
        cVar.P(true);
        boolean n = cVar.n();
        cVar.F(this.f385h);
        boolean k2 = cVar.k();
        cVar.Q(this.f383f);
        try {
            g.c.b.b.f.z0(jVar, cVar);
            cVar.P(o);
            cVar.F(n);
            cVar.Q(k2);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.P(o);
            cVar.F(n);
            cVar.Q(k2);
            throw th;
        }
    }

    public void k(j jVar, Appendable appendable) throws JsonIOException {
        try {
            j(jVar, h(g.c.b.b.f.A0(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public void l(Object obj, Type type, c cVar) throws JsonIOException {
        q f2 = f(new a(type));
        boolean o = cVar.o();
        cVar.P(true);
        boolean n = cVar.n();
        cVar.F(this.f385h);
        boolean k2 = cVar.k();
        cVar.Q(this.f383f);
        try {
            f2.c(cVar, obj);
            cVar.P(o);
            cVar.F(n);
            cVar.Q(k2);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.P(o);
            cVar.F(n);
            cVar.Q(k2);
            throw th;
        }
    }

    public void m(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            l(obj, type, h(g.c.b.b.f.A0(appendable)));
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f383f + ",factories:" + this.f382e + ",instanceCreators:" + this.c + "}";
    }
}
