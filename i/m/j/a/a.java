package i.m.j.a;

import i.j;
import i.m.d;
import i.o.c.h;
import java.io.Serializable;

public abstract class a implements d<Object>, d, Serializable {
    private final d<Object> completion;

    public a(d<Object> dVar) {
        this.completion = dVar;
    }

    public d<j> a(Object obj, d<?> dVar) {
        h.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [i.m.d, java.lang.Object, i.m.d<java.lang.Object>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
        L_0x0001:
            java.lang.String r1 = "frame"
            i.o.c.h.e(r0, r1)
            i.m.d<java.lang.Object> r1 = r0.completion
            i.o.c.h.c(r1)
            java.lang.Object r4 = r0.l(r4)     // Catch:{ all -> 0x0014 }
            i.m.i.a r2 = i.m.i.a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0014 }
            if (r4 != r2) goto L_0x0019
            return
        L_0x0014:
            r4 = move-exception
            java.lang.Object r4 = g.c.b.b.f.v(r4)
        L_0x0019:
            r0.m()
            boolean r0 = r1 instanceof i.m.j.a.a
            if (r0 == 0) goto L_0x0024
            r0 = r1
            i.m.j.a.a r0 = (i.m.j.a.a) r0
            goto L_0x0001
        L_0x0024:
            r1.g(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.m.j.a.a.g(java.lang.Object):void");
    }

    public final d<Object> j() {
        return this.completion;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StackTraceElement k() {
        /*
            r9 = this;
            java.lang.String r0 = "$this$getStackTraceElementImpl"
            i.o.c.h.e(r9, r0)
            java.lang.Class r0 = r9.getClass()
            java.lang.Class<i.m.j.a.e> r1 = i.m.j.a.e.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            i.m.j.a.e r0 = (i.m.j.a.e) r0
            r1 = 0
            if (r0 == 0) goto L_0x0126
            int r2 = r0.v()
            r3 = 1
            if (r2 > r3) goto L_0x00fe
            r2 = -1
            r4 = 0
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "field"
            i.o.c.h.d(r5, r6)     // Catch:{ Exception -> 0x0044 }
            r5.setAccessible(r3)     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x0044 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0044 }
            if (r6 != 0) goto L_0x0038
            r5 = r1
        L_0x0038:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0044 }
            if (r5 == 0) goto L_0x0041
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            int r5 = r5 - r3
            goto L_0x0045
        L_0x0044:
            r5 = -1
        L_0x0045:
            if (r5 >= 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            int[] r2 = r0.l()
            r2 = r2[r5]
        L_0x004e:
            java.lang.String r3 = "continuation"
            i.o.c.h.e(r9, r3)
            i.m.j.a.f$a r3 = i.m.j.a.f.b
            if (r3 == 0) goto L_0x0058
            goto L_0x009b
        L_0x0058:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.String r5 = "getModule"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "java.lang.Module"
            java.lang.Class r5 = r5.loadClass(r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "getDescriptor"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.Class r6 = r9.getClass()     // Catch:{ Exception -> 0x0097 }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r7 = "name"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0097 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r8)     // Catch:{ Exception -> 0x0097 }
            i.m.j.a.f$a r7 = new i.m.j.a.f$a     // Catch:{ Exception -> 0x0097 }
            r7.<init>(r3, r5, r6)     // Catch:{ Exception -> 0x0097 }
            i.m.j.a.f.b = r7     // Catch:{ Exception -> 0x0097 }
            r3 = r7
            goto L_0x009b
        L_0x0097:
            i.m.j.a.f$a r3 = i.m.j.a.f.a
            i.m.j.a.f.b = r3
        L_0x009b:
            i.m.j.a.f$a r5 = i.m.j.a.f.a
            if (r3 != r5) goto L_0x00a0
            goto L_0x00d0
        L_0x00a0:
            java.lang.reflect.Method r5 = r3.a
            if (r5 == 0) goto L_0x00d0
            java.lang.Class r6 = r9.getClass()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r5 = r5.invoke(r6, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r6 = r3.b
            if (r6 == 0) goto L_0x00d0
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Object r5 = r6.invoke(r5, r7)
            if (r5 == 0) goto L_0x00d0
            java.lang.reflect.Method r3 = r3.c
            if (r3 == 0) goto L_0x00c7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r3 = r3.invoke(r5, r4)
            goto L_0x00c8
        L_0x00c7:
            r3 = r1
        L_0x00c8:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r1 = r3
        L_0x00ce:
            java.lang.String r1 = (java.lang.String) r1
        L_0x00d0:
            if (r1 != 0) goto L_0x00d7
            java.lang.String r1 = r0.c()
            goto L_0x00ef
        L_0x00d7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            java.lang.String r1 = r0.c()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x00ef:
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = r0.m()
            java.lang.String r0 = r0.f()
            r3.<init>(r1, r4, r0, r2)
            r1 = r3
            goto L_0x0126
        L_0x00fe:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Debug metadata version mismatch. Expected: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please update the Kotlin standard library."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0126:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.m.j.a.a.k():java.lang.StackTraceElement");
    }

    public abstract Object l(Object obj);

    public void m() {
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("Continuation at ");
        Object k2 = k();
        if (k2 == null) {
            k2 = getClass().getName();
        }
        i2.append(k2);
        return i2.toString();
    }
}
