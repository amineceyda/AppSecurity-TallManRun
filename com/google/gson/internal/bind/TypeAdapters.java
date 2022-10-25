package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter$1;
import g.e.c.g;
import g.e.c.j;
import g.e.c.k;
import g.e.c.l;
import g.e.c.m;
import g.e.c.q;
import g.e.c.r;
import g.e.c.t.r;
import g.e.c.v.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;

public final class TypeAdapters {
    public static final q<String> A;
    public static final q<BigDecimal> B = new q<BigDecimal>() {
        public Object a(a aVar) throws IOException {
            if (aVar.X() == b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return new BigDecimal(aVar.S());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: d */
        public void c(c cVar, BigDecimal bigDecimal) throws IOException {
            cVar.Y(bigDecimal);
        }
    };
    public static final q<BigInteger> C = new q<BigInteger>() {
        public Object a(a aVar) throws IOException {
            if (aVar.X() == b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return new BigInteger(aVar.S());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: d */
        public void c(c cVar, BigInteger bigInteger) throws IOException {
            cVar.Y(bigInteger);
        }
    };
    public static final r D;
    public static final q<StringBuilder> E;
    public static final r F;
    public static final q<StringBuffer> G;
    public static final r H;
    public static final q<URL> I;
    public static final r J;
    public static final q<URI> K;
    public static final r L;
    public static final q<InetAddress> M;
    public static final r N;
    public static final q<UUID> O;
    public static final r P;
    public static final q<Currency> Q;
    public static final r R;
    public static final r S = new r() {
        public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
            if (aVar.a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(gson);
            final q f2 = gson.f(new g.e.c.u.a(Date.class));
            return new q<Timestamp>(this) {
                public Object a(a aVar) throws IOException {
                    Date date = (Date) f2.a(aVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                /* renamed from: d */
                public void c(c cVar, Timestamp timestamp) throws IOException {
                    f2.c(cVar, timestamp);
                }
            };
        }
    };
    public static final q<Calendar> T;
    public static final r U;
    public static final q<Locale> V;
    public static final r W;
    public static final q<j> X;
    public static final r Y;
    public static final r Z = new r() {
        public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
            Class<Enum> cls = Enum.class;
            Class cls2 = aVar.a;
            if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                return null;
            }
            if (!cls2.isEnum()) {
                cls2 = cls2.getSuperclass();
            }
            return new EnumTypeAdapter(cls2);
        }
    };
    public static final q<Class> a;
    public static final r b;
    public static final q<BitSet> c;

    /* renamed from: d  reason: collision with root package name */
    public static final r f409d;

    /* renamed from: e  reason: collision with root package name */
    public static final q<Boolean> f410e;

    /* renamed from: f  reason: collision with root package name */
    public static final q<Boolean> f411f = new q<Boolean>() {
        public Object a(a aVar) throws IOException {
            if (aVar.X() != b.NULL) {
                return Boolean.valueOf(aVar.S());
            }
            aVar.P();
            return null;
        }

        /* renamed from: d */
        public void c(c cVar, Boolean bool) throws IOException {
            cVar.e0(bool == null ? "null" : bool.toString());
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final r f412g;

    /* renamed from: h  reason: collision with root package name */
    public static final q<Number> f413h;

    /* renamed from: i  reason: collision with root package name */
    public static final r f414i;

    /* renamed from: j  reason: collision with root package name */
    public static final q<Number> f415j;

    /* renamed from: k  reason: collision with root package name */
    public static final r f416k;

    /* renamed from: l  reason: collision with root package name */
    public static final q<Number> f417l;

    /* renamed from: m  reason: collision with root package name */
    public static final r f418m;
    public static final q<AtomicInteger> n;
    public static final r o;
    public static final q<AtomicBoolean> p;
    public static final r q;
    public static final q<AtomicIntegerArray> r;
    public static final r s;
    public static final q<Number> t = new q<Number>() {
        public Object a(a aVar) throws IOException {
            if (aVar.X() == b.NULL) {
                aVar.P();
                return null;
            }
            try {
                return Long.valueOf(aVar.x());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            }
        }

        /* renamed from: d */
        public void c(c cVar, Number number) throws IOException {
            cVar.Y(number);
        }
    };
    public static final q<Number> u = new q<Number>() {
        public Object a(a aVar) throws IOException {
            if (aVar.X() != b.NULL) {
                return Float.valueOf((float) aVar.u());
            }
            aVar.P();
            return null;
        }

        /* renamed from: d */
        public void c(c cVar, Number number) throws IOException {
            cVar.Y(number);
        }
    };
    public static final q<Number> v = new q<Number>() {
        public Object a(a aVar) throws IOException {
            if (aVar.X() != b.NULL) {
                return Double.valueOf(aVar.u());
            }
            aVar.P();
            return null;
        }

        /* renamed from: d */
        public void c(c cVar, Number number) throws IOException {
            cVar.Y(number);
        }
    };
    public static final q<Number> w;
    public static final r x;
    public static final q<Character> y;
    public static final r z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31  reason: invalid class name */
    public class AnonymousClass31 implements r {
        public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
            boolean equals = aVar.equals((Object) null);
            return null;
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends q<T> {
        public final Map<String, T> a = new HashMap();
        public final Map<T, String> b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    g.e.c.s.c cVar = (g.e.c.s.c) cls.getField(name).getAnnotation(g.e.c.s.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.a.put(put, enumR);
                        }
                    }
                    this.a.put(name, enumR);
                    this.b.put(enumR, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        public Object a(a aVar) throws IOException {
            if (aVar.X() != b.NULL) {
                return (Enum) this.a.get(aVar.S());
            }
            aVar.P();
            return null;
        }

        /* renamed from: d */
        public void c(c cVar, T t) throws IOException {
            cVar.e0(t == null ? null : this.b.get(t));
        }
    }

    static {
        final TypeAdapter$1 typeAdapter$1 = new TypeAdapter$1(new q<Class>() {
            public /* bridge */ /* synthetic */ Object a(a aVar) throws IOException {
                return d();
            }

            public /* bridge */ /* synthetic */ void c(c cVar, Object obj) throws IOException {
                e((Class) obj);
            }

            public Class d() throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            public void e(Class cls) throws IOException {
                StringBuilder i2 = g.a.a.a.a.i("Attempted to serialize java.lang.Class: ");
                i2.append(cls.getName());
                i2.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(i2.toString());
            }
        });
        a = typeAdapter$1;
        final Class<Class> cls = Class.class;
        b = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$12 = new TypeAdapter$1(new q<BitSet>() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
                if (r6.v() != 0) goto L_0x004b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
                r1 = false;
             */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(g.e.c.v.a r6) throws java.io.IOException {
                /*
                    r5 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r6.a()
                    g.e.c.v.b r1 = r6.X()
                    r2 = 0
                L_0x000d:
                    g.e.c.v.b r3 = g.e.c.v.b.END_ARRAY
                    if (r1 == r3) goto L_0x0066
                    int r3 = r1.ordinal()
                    r4 = 5
                    if (r3 == r4) goto L_0x0041
                    r4 = 6
                    if (r3 == r4) goto L_0x003a
                    r4 = 7
                    if (r3 != r4) goto L_0x0023
                    boolean r1 = r6.t()
                    goto L_0x004e
                L_0x0023:
                    com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r6.<init>((java.lang.String) r0)
                    throw r6
                L_0x003a:
                    int r1 = r6.v()
                    if (r1 == 0) goto L_0x004d
                    goto L_0x004b
                L_0x0041:
                    java.lang.String r1 = r6.S()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005a }
                    if (r1 == 0) goto L_0x004d
                L_0x004b:
                    r1 = 1
                    goto L_0x004e
                L_0x004d:
                    r1 = 0
                L_0x004e:
                    if (r1 == 0) goto L_0x0053
                    r0.set(r2)
                L_0x0053:
                    int r2 = r2 + 1
                    g.e.c.v.b r1 = r6.X()
                    goto L_0x000d
                L_0x005a:
                    com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                    java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = g.a.a.a.a.w(r0, r1)
                    r6.<init>((java.lang.String) r0)
                    throw r6
                L_0x0066:
                    r6.g()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.a(g.e.c.v.a):java.lang.Object");
            }

            /* renamed from: d */
            public void c(c cVar, BitSet bitSet) throws IOException {
                cVar.b();
                int length = bitSet.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.V(bitSet.get(i2) ? 1 : 0);
                }
                cVar.g();
            }
        });
        c = typeAdapter$12;
        final Class<BitSet> cls2 = BitSet.class;
        f409d = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass3 r0 = new q<Boolean>() {
            public Object a(a aVar) throws IOException {
                b X = aVar.X();
                if (X == b.NULL) {
                    aVar.P();
                    return null;
                }
                return Boolean.valueOf(X == b.STRING ? Boolean.parseBoolean(aVar.S()) : aVar.t());
            }

            /* renamed from: d */
            public void c(c cVar, Boolean bool) throws IOException {
                cVar.X(bool);
            }
        };
        f410e = r0;
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        f412g = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass5 r02 = new q<Number>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) aVar.v());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: d */
            public void c(c cVar, Number number) throws IOException {
                cVar.Y(number);
            }
        };
        f413h = r02;
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        f414i = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass6 r03 = new q<Number>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                try {
                    return Short.valueOf((short) aVar.v());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: d */
            public void c(c cVar, Number number) throws IOException {
                cVar.Y(number);
            }
        };
        f415j = r03;
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        f416k = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass7 r04 = new q<Number>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.v());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: d */
            public void c(c cVar, Number number) throws IOException {
                cVar.Y(number);
            }
        };
        f417l = r04;
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        f418m = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$13 = new TypeAdapter$1(new q<AtomicInteger>() {
            public Object a(a aVar) throws IOException {
                try {
                    return new AtomicInteger(aVar.v());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException((Throwable) e2);
                }
            }

            /* renamed from: d */
            public void c(c cVar, AtomicInteger atomicInteger) throws IOException {
                cVar.V((long) atomicInteger.get());
            }
        });
        n = typeAdapter$13;
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        o = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$14 = new TypeAdapter$1(new q<AtomicBoolean>() {
            public Object a(a aVar) throws IOException {
                return new AtomicBoolean(aVar.t());
            }

            /* renamed from: d */
            public void c(c cVar, AtomicBoolean atomicBoolean) throws IOException {
                cVar.f0(atomicBoolean.get());
            }
        });
        p = typeAdapter$14;
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        q = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$15 = new TypeAdapter$1(new q<AtomicIntegerArray>() {
            public Object a(a aVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.o()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.v()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException((Throwable) e2);
                    }
                }
                aVar.g();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            /* renamed from: d */
            public void c(c cVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                cVar.b();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.V((long) atomicIntegerArray.get(i2));
                }
                cVar.g();
            }
        });
        r = typeAdapter$15;
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        s = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass14 r05 = new q<Number>() {
            public Object a(a aVar) throws IOException {
                b X = aVar.X();
                int ordinal = X.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    return new g.e.c.t.q(aVar.S());
                }
                if (ordinal == 8) {
                    aVar.P();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + X);
            }

            /* renamed from: d */
            public void c(c cVar, Number number) throws IOException {
                cVar.Y(number);
            }
        };
        w = r05;
        final Class<Number> cls14 = Number.class;
        x = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass15 r06 = new q<Character>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                String S = aVar.S();
                if (S.length() == 1) {
                    return Character.valueOf(S.charAt(0));
                }
                throw new JsonSyntaxException(g.a.a.a.a.w("Expecting character, got: ", S));
            }

            /* renamed from: d */
            public void c(c cVar, Character ch2) throws IOException {
                cVar.e0(ch2 == null ? null : String.valueOf(ch2));
            }
        };
        y = r06;
        final Class cls15 = Character.TYPE;
        final Class<Character> cls16 = Character.class;
        z = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
                Class<? super T> cls = aVar.a;
                if (cls == cls15 || cls == cls16) {
                    return r06;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(cls16.getName());
                i2.append(Marker.ANY_NON_NULL_MARKER);
                i2.append(cls15.getName());
                i2.append(",adapter=");
                i2.append(r06);
                i2.append("]");
                return i2.toString();
            }
        };
        final AnonymousClass16 r07 = new q<String>() {
            public Object a(a aVar) throws IOException {
                b X = aVar.X();
                if (X != b.NULL) {
                    return X == b.BOOLEAN ? Boolean.toString(aVar.t()) : aVar.S();
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, String str) throws IOException {
                cVar.e0(str);
            }
        };
        A = r07;
        final Class<String> cls17 = String.class;
        D = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass19 r08 = new q<StringBuilder>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() != b.NULL) {
                    return new StringBuilder(aVar.S());
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, StringBuilder sb) throws IOException {
                cVar.e0(sb == null ? null : sb.toString());
            }
        };
        E = r08;
        final Class<StringBuilder> cls18 = StringBuilder.class;
        F = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass20 r09 = new q<StringBuffer>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() != b.NULL) {
                    return new StringBuffer(aVar.S());
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, StringBuffer stringBuffer) throws IOException {
                cVar.e0(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        G = r09;
        final Class<StringBuffer> cls19 = StringBuffer.class;
        H = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass21 r010 = new q<URL>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                String S = aVar.S();
                if ("null".equals(S)) {
                    return null;
                }
                return new URL(S);
            }

            /* renamed from: d */
            public void c(c cVar, URL url) throws IOException {
                cVar.e0(url == null ? null : url.toExternalForm());
            }
        };
        I = r010;
        final Class<URL> cls20 = URL.class;
        J = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass22 r011 = new q<URI>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                try {
                    String S = aVar.S();
                    if ("null".equals(S)) {
                        return null;
                    }
                    return new URI(S);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException((Throwable) e2);
                }
            }

            /* renamed from: d */
            public void c(c cVar, URI uri) throws IOException {
                cVar.e0(uri == null ? null : uri.toASCIIString());
            }
        };
        K = r011;
        final Class<URI> cls21 = URI.class;
        L = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass23 r012 = new q<InetAddress>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() != b.NULL) {
                    return InetAddress.getByName(aVar.S());
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, InetAddress inetAddress) throws IOException {
                cVar.e0(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        M = r012;
        final Class<InetAddress> cls22 = InetAddress.class;
        N = new r() {
            public <T2> q<T2> a(Gson gson, g.e.c.u.a<T2> aVar) {
                final Class<? super T> cls = aVar.a;
                if (!r1.isAssignableFrom(cls)) {
                    return null;
                }
                return new q<T1>() {
                    public T1 a(a aVar) throws IOException {
                        T1 a2 = r0.a(aVar);
                        if (a2 == null || cls.isInstance(a2)) {
                            return a2;
                        }
                        StringBuilder i2 = g.a.a.a.a.i("Expected a ");
                        i2.append(cls.getName());
                        i2.append(" but was ");
                        i2.append(a2.getClass().getName());
                        throw new JsonSyntaxException(i2.toString());
                    }

                    public void c(c cVar, T1 t1) throws IOException {
                        r0.c(cVar, t1);
                    }
                };
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[typeHierarchy=");
                i2.append(r1.getName());
                i2.append(",adapter=");
                i2.append(r0);
                i2.append("]");
                return i2.toString();
            }
        };
        final AnonymousClass24 r013 = new q<UUID>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() != b.NULL) {
                    return UUID.fromString(aVar.S());
                }
                aVar.P();
                return null;
            }

            /* renamed from: d */
            public void c(c cVar, UUID uuid) throws IOException {
                cVar.e0(uuid == null ? null : uuid.toString());
            }
        };
        O = r013;
        final Class<UUID> cls23 = UUID.class;
        P = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$16 = new TypeAdapter$1(new q<Currency>() {
            public Object a(a aVar) throws IOException {
                return Currency.getInstance(aVar.S());
            }

            /* renamed from: d */
            public void c(c cVar, Currency currency) throws IOException {
                cVar.e0(currency.getCurrencyCode());
            }
        });
        Q = typeAdapter$16;
        final Class<Currency> cls24 = Currency.class;
        R = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
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
        };
        final AnonymousClass27 r014 = new q<Calendar>() {
            public Object a(a aVar) throws IOException {
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                aVar.b();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (aVar.X() != b.END_OBJECT) {
                    String F = aVar.F();
                    int v = aVar.v();
                    if ("year".equals(F)) {
                        i2 = v;
                    } else if ("month".equals(F)) {
                        i3 = v;
                    } else if ("dayOfMonth".equals(F)) {
                        i4 = v;
                    } else if ("hourOfDay".equals(F)) {
                        i5 = v;
                    } else if ("minute".equals(F)) {
                        i6 = v;
                    } else if ("second".equals(F)) {
                        i7 = v;
                    }
                }
                aVar.j();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            /* renamed from: d */
            public void c(c cVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    cVar.t();
                    return;
                }
                cVar.d();
                cVar.q("year");
                cVar.V((long) calendar.get(1));
                cVar.q("month");
                cVar.V((long) calendar.get(2));
                cVar.q("dayOfMonth");
                cVar.V((long) calendar.get(5));
                cVar.q("hourOfDay");
                cVar.V((long) calendar.get(11));
                cVar.q("minute");
                cVar.V((long) calendar.get(12));
                cVar.q("second");
                cVar.V((long) calendar.get(13));
                cVar.j();
            }
        };
        T = r014;
        final Class<Calendar> cls25 = Calendar.class;
        final Class<GregorianCalendar> cls26 = GregorianCalendar.class;
        U = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
                Class<? super T> cls = aVar.a;
                if (cls == cls25 || cls == cls26) {
                    return r014;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(cls25.getName());
                i2.append(Marker.ANY_NON_NULL_MARKER);
                i2.append(cls26.getName());
                i2.append(",adapter=");
                i2.append(r014);
                i2.append("]");
                return i2.toString();
            }
        };
        final AnonymousClass28 r015 = new q<Locale>() {
            public Object a(a aVar) throws IOException {
                Locale locale;
                String str = null;
                if (aVar.X() == b.NULL) {
                    aVar.P();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.S(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str != null) {
                    locale = new Locale(nextToken, nextToken2, str);
                }
                return locale;
            }

            /* renamed from: d */
            public void c(c cVar, Locale locale) throws IOException {
                cVar.e0(locale == null ? null : locale.toString());
            }
        };
        V = r015;
        final Class<Locale> cls27 = Locale.class;
        W = new r() {
            public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
                if (aVar.a == cls27) {
                    return r015;
                }
                return null;
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[type=");
                i2.append(cls27.getName());
                i2.append(",adapter=");
                i2.append(r015);
                i2.append("]");
                return i2.toString();
            }
        };
        final AnonymousClass29 r016 = new q<j>() {
            /* renamed from: d */
            public j a(a aVar) throws IOException {
                int ordinal = aVar.X().ordinal();
                if (ordinal == 0) {
                    g gVar = new g();
                    aVar.a();
                    while (aVar.o()) {
                        gVar.b.add(a(aVar));
                    }
                    aVar.g();
                    return gVar;
                } else if (ordinal == 2) {
                    l lVar = new l();
                    aVar.b();
                    while (aVar.o()) {
                        lVar.a.put(aVar.F(), a(aVar));
                    }
                    aVar.j();
                    return lVar;
                } else if (ordinal == 5) {
                    return new m(aVar.S());
                } else {
                    if (ordinal == 6) {
                        return new m((Number) new g.e.c.t.q(aVar.S()));
                    }
                    if (ordinal == 7) {
                        return new m(Boolean.valueOf(aVar.t()));
                    }
                    if (ordinal == 8) {
                        aVar.P();
                        return k.a;
                    }
                    throw new IllegalArgumentException();
                }
            }

            /* renamed from: e */
            public void c(c cVar, j jVar) throws IOException {
                if (jVar == null || (jVar instanceof k)) {
                    cVar.t();
                } else if (jVar instanceof m) {
                    m c = jVar.c();
                    Object obj = c.a;
                    if (obj instanceof Number) {
                        cVar.Y(c.f());
                    } else if (obj instanceof Boolean) {
                        cVar.f0(c.e());
                    } else {
                        cVar.e0(c.h());
                    }
                } else {
                    boolean z = jVar instanceof g;
                    if (z) {
                        cVar.b();
                        if (z) {
                            Iterator<j> it = ((g) jVar).iterator();
                            while (it.hasNext()) {
                                c(cVar, it.next());
                            }
                            cVar.g();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Array: " + jVar);
                    }
                    boolean z2 = jVar instanceof l;
                    if (z2) {
                        cVar.d();
                        if (z2) {
                            Iterator it2 = ((r.b) ((l) jVar).a.entrySet()).iterator();
                            while (true) {
                                r.d dVar = (r.d) it2;
                                if (dVar.hasNext()) {
                                    Map.Entry entry = (Map.Entry) dVar.next();
                                    cVar.q((String) entry.getKey());
                                    c(cVar, (j) entry.getValue());
                                } else {
                                    cVar.j();
                                    return;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Not a JSON Object: " + jVar);
                        }
                    } else {
                        StringBuilder i2 = g.a.a.a.a.i("Couldn't write ");
                        i2.append(jVar.getClass());
                        throw new IllegalArgumentException(i2.toString());
                    }
                }
            }
        };
        X = r016;
        final Class<j> cls28 = j.class;
        Y = new g.e.c.r() {
            public <T2> q<T2> a(Gson gson, g.e.c.u.a<T2> aVar) {
                final Class<? super T> cls = aVar.a;
                if (!cls28.isAssignableFrom(cls)) {
                    return null;
                }
                return new q<T1>() {
                    public T1 a(a aVar) throws IOException {
                        T1 a2 = r016.a(aVar);
                        if (a2 == null || cls.isInstance(a2)) {
                            return a2;
                        }
                        StringBuilder i2 = g.a.a.a.a.i("Expected a ");
                        i2.append(cls.getName());
                        i2.append(" but was ");
                        i2.append(a2.getClass().getName());
                        throw new JsonSyntaxException(i2.toString());
                    }

                    public void c(c cVar, T1 t1) throws IOException {
                        r016.c(cVar, t1);
                    }
                };
            }

            public String toString() {
                StringBuilder i2 = g.a.a.a.a.i("Factory[typeHierarchy=");
                i2.append(cls28.getName());
                i2.append(",adapter=");
                i2.append(r016);
                i2.append("]");
                return i2.toString();
            }
        };
    }
}
