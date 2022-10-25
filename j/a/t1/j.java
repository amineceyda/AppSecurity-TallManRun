package j.a.t1;

import g.c.b.b.f;
import j.a.f1;

public final class j {
    public static final boolean a;
    public static final f1 b;

    static {
        j jVar = new j();
        String n0 = f.n0("kotlinx.coroutines.fast.service.loader");
        a = n0 != null ? Boolean.parseBoolean(n0) : true;
        b = jVar.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final j.a.f1 a() {
        /*
            r7 = this;
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            java.util.Iterator r1 = defpackage.a.b()     // Catch:{ all -> 0x0059 }
            i.s.b r1 = g.c.b.b.f.e(r1)     // Catch:{ all -> 0x0059 }
            java.util.List r1 = g.c.b.b.f.s0(r1)     // Catch:{ all -> 0x0059 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0059 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0059 }
            if (r3 != 0) goto L_0x001a
            r2 = 0
            goto L_0x0043
        L_0x001a:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0059 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0059 }
            if (r4 != 0) goto L_0x0026
        L_0x0024:
            r2 = r3
            goto L_0x0043
        L_0x0026:
            r4 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch:{ all -> 0x0059 }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x0059 }
        L_0x002d:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0059 }
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch:{ all -> 0x0059 }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x0059 }
            if (r4 >= r6) goto L_0x003c
            r3 = r5
            r4 = r6
        L_0x003c:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0059 }
            if (r5 != 0) goto L_0x002d
            goto L_0x0024
        L_0x0043:
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0053
            j.a.f1 r1 = r2.createDispatcher(r1)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0053
            return r1
        L_0x004e:
            r0 = move-exception
            r2.hintOnError()     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0059 }
            r1.<init>(r0)     // Catch:{ all -> 0x0059 }
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            goto L_0x005c
        L_0x005b:
            throw r0
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: j.a.t1.j.a():j.a.f1");
    }
}
