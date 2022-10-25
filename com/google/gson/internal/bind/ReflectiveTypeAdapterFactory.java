package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Excluder;
import g.e.c.d;
import g.e.c.q;
import g.e.c.r;
import g.e.c.s.e;
import g.e.c.t.a0.b;
import g.e.c.t.g;
import g.e.c.t.s;
import g.e.c.v.c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements r {
    public final g b;
    public final d c;

    /* renamed from: d  reason: collision with root package name */
    public final Excluder f399d;

    /* renamed from: e  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f400e;

    /* renamed from: f  reason: collision with root package name */
    public final b f401f = b.a;

    public static final class Adapter<T> extends q<T> {
        public final s<T> a;
        public final Map<String, a> b;

        public Adapter(s<T> sVar, Map<String, a> map) {
            this.a = sVar;
            this.b = map;
        }

        public T a(g.e.c.v.a aVar) throws IOException {
            if (aVar.X() == g.e.c.v.b.NULL) {
                aVar.P();
                return null;
            }
            T a2 = this.a.a();
            try {
                aVar.b();
                while (aVar.o()) {
                    a aVar2 = this.b.get(aVar.F());
                    if (aVar2 != null) {
                        if (aVar2.c) {
                            aVar2.a(aVar, a2);
                        }
                    }
                    aVar.h0();
                }
                aVar.j();
                return a2;
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException((Throwable) e2);
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public void c(c cVar, T t) throws IOException {
            if (t == null) {
                cVar.t();
                return;
            }
            cVar.d();
            try {
                for (a next : this.b.values()) {
                    if (next.c(t)) {
                        cVar.q(next.a);
                        next.b(cVar, t);
                    }
                }
                cVar.j();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public static abstract class a {
        public final String a;
        public final boolean b;
        public final boolean c;

        public a(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public abstract void a(g.e.c.v.a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void b(c cVar, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(g gVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.b = gVar;
        this.c = dVar;
        this.f399d = excluder;
        this.f400e = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0184 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> g.e.c.q<T> a(com.google.gson.Gson r35, g.e.c.u.a<T> r36) {
        /*
            r34 = this;
            r11 = r34
            r12 = r35
            r0 = r36
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            java.lang.Class<? super T> r1 = r0.a
            boolean r2 = r13.isAssignableFrom(r1)
            r14 = 0
            if (r2 != 0) goto L_0x0012
            return r14
        L_0x0012:
            g.e.c.t.g r2 = r11.b
            g.e.c.t.s r15 = r2.a(r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L_0x002c
        L_0x0025:
            r14 = r9
            r33 = r10
            r28 = r15
            goto L_0x01e1
        L_0x002c:
            java.lang.reflect.Type r8 = r0.b
            r7 = r0
            r6 = r1
        L_0x0030:
            if (r6 == r13) goto L_0x0025
            java.lang.reflect.Field[] r5 = r6.getDeclaredFields()
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L_0x0039:
            if (r2 >= r4) goto L_0x01ba
            r1 = r5[r2]
            r0 = 1
            boolean r16 = r11.b(r1, r0)
            boolean r17 = r11.b(r1, r3)
            if (r16 != 0) goto L_0x0060
            if (r17 != 0) goto L_0x0060
            r19 = r2
            r20 = r4
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            goto L_0x0184
        L_0x0060:
            g.e.c.t.a0.b r3 = r11.f401f
            r3.a(r1)
            java.lang.reflect.Type r3 = r7.b
            java.lang.reflect.Type r14 = r1.getGenericType()
            java.lang.reflect.Type r14 = g.e.c.t.a.g(r3, r6, r14)
            java.lang.Class<g.e.c.s.c> r3 = g.e.c.s.c.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r3)
            g.e.c.s.c r3 = (g.e.c.s.c) r3
            if (r3 != 0) goto L_0x0086
            g.e.c.d r3 = r11.c
            java.lang.String r3 = r3.a(r1)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r19 = r2
            goto L_0x0097
        L_0x0086:
            java.lang.String r0 = r3.value()
            java.lang.String[] r3 = r3.alternate()
            r19 = r2
            int r2 = r3.length
            if (r2 != 0) goto L_0x009d
            java.util.List r3 = java.util.Collections.singletonList(r0)
        L_0x0097:
            r20 = r4
            r18 = 1
            r4 = r3
            goto L_0x00bd
        L_0x009d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r20 = r4
            int r4 = r3.length
            r18 = 1
            int r4 = r4 + 1
            r2.<init>(r4)
            r2.add(r0)
            int r0 = r3.length
            r4 = 0
        L_0x00ae:
            if (r4 >= r0) goto L_0x00bc
            r21 = r0
            r0 = r3[r4]
            r2.add(r0)
            int r4 = r4 + 1
            r0 = r21
            goto L_0x00ae
        L_0x00bc:
            r4 = r2
        L_0x00bd:
            int r3 = r4.size()
            r0 = 0
            r2 = 0
        L_0x00c3:
            if (r2 >= r3) goto L_0x0171
            java.lang.Object r21 = r4.get(r2)
            r22 = r13
            r13 = r21
            java.lang.String r13 = (java.lang.String) r13
            r21 = r9
            if (r2 == 0) goto L_0x00d5
            r16 = 0
        L_0x00d5:
            g.e.c.u.a r9 = new g.e.c.u.a
            r9.<init>(r14)
            r23 = r0
            java.lang.Class<? super T> r0 = r9.a
            r24 = r2
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x00ed
            boolean r0 = r0.isPrimitive()
            if (r0 == 0) goto L_0x00ed
            r25 = 1
            goto L_0x00ef
        L_0x00ed:
            r25 = 0
        L_0x00ef:
            java.lang.Class<g.e.c.s.b> r0 = g.e.c.s.b.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            g.e.c.s.b r0 = (g.e.c.s.b) r0
            if (r0 == 0) goto L_0x0104
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r2 = r11.f400e
            r26 = r1
            g.e.c.t.g r1 = r11.b
            g.e.c.q r0 = r2.b(r1, r12, r9, r0)
            goto L_0x0107
        L_0x0104:
            r26 = r1
            r0 = 0
        L_0x0107:
            if (r0 == 0) goto L_0x010c
            r27 = 1
            goto L_0x010e
        L_0x010c:
            r27 = 0
        L_0x010e:
            if (r0 != 0) goto L_0x0114
            g.e.c.q r0 = r12.f(r9)
        L_0x0114:
            r28 = r0
            g.e.c.t.z.c r2 = new g.e.c.t.z.c
            r1 = r23
            r0 = r2
            r11 = r1
            r23 = r26
            r1 = r34
            r12 = r2
            r2 = r13
            r26 = r3
            r29 = 0
            r3 = r16
            r30 = r4
            r4 = r17
            r31 = r5
            r5 = r23
            r36 = r6
            r6 = r27
            r27 = r14
            r14 = r7
            r7 = r28
            r28 = r15
            r15 = r8
            r8 = r35
            r32 = r14
            r14 = r21
            r33 = r10
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r14.put(r13, r12)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a) r0
            if (r11 != 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r0 = r11
        L_0x0153:
            int r2 = r24 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r13 = r22
            r1 = r23
            r3 = r26
            r14 = r27
            r15 = r28
            r4 = r30
            r5 = r31
            r7 = r32
            r10 = r33
            goto L_0x00c3
        L_0x0171:
            r11 = r0
            r31 = r5
            r36 = r6
            r32 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r29 = 0
            r15 = r8
            if (r11 != 0) goto L_0x019e
        L_0x0184:
            int r2 = r19 + 1
            r11 = r34
            r12 = r35
            r6 = r36
            r9 = r14
            r8 = r15
            r4 = r20
            r13 = r22
            r15 = r28
            r5 = r31
            r7 = r32
            r10 = r33
            r3 = 0
            r14 = 0
            goto L_0x0039
        L_0x019e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r11.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01ba:
            r36 = r6
            r0 = r7
            r14 = r9
            r33 = r10
            r22 = r13
            r28 = r15
            r15 = r8
            java.lang.reflect.Type r0 = r0.b
            java.lang.reflect.Type r1 = r36.getGenericSuperclass()
            r2 = r36
            java.lang.reflect.Type r0 = g.e.c.t.a.g(r0, r2, r1)
            g.e.c.u.a r7 = new g.e.c.u.a
            r7.<init>(r0)
            java.lang.Class<? super T> r6 = r7.a
            r11 = r34
            r12 = r35
            r15 = r28
            r14 = 0
            goto L_0x0030
        L_0x01e1:
            r0 = r28
            r1 = r33
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a(com.google.gson.Gson, g.e.c.u.a):g.e.c.q");
    }

    public boolean b(Field field, boolean z) {
        boolean z2;
        g.e.c.s.a aVar;
        Excluder excluder = this.f399d;
        Class<?> type = field.getType();
        if (!(excluder.b(type) || excluder.c(type, z))) {
            if ((excluder.c & field.getModifiers()) == 0 && ((excluder.b == -1.0d || excluder.g((g.e.c.s.d) field.getAnnotation(g.e.c.s.d.class), (e) field.getAnnotation(e.class))) && !field.isSynthetic() && ((!excluder.f392e || ((aVar = (g.e.c.s.a) field.getAnnotation(g.e.c.s.a.class)) != null && (!z ? aVar.deserialize() : aVar.serialize()))) && ((excluder.f391d || !excluder.f(field.getType())) && !excluder.e(field.getType()))))) {
                List<g.e.c.a> list = z ? excluder.f393f : excluder.f394g;
                if (!list.isEmpty()) {
                    g.e.c.b bVar = new g.e.c.b(field);
                    Iterator<g.e.c.a> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().b(bVar)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return true;
            }
        }
        return false;
    }
}
