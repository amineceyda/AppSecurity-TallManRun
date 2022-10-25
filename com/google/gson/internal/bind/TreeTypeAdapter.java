package com.google.gson.internal.bind;

import com.google.gson.Gson;
import g.c.b.b.f;
import g.e.c.h;
import g.e.c.i;
import g.e.c.n;
import g.e.c.o;
import g.e.c.q;
import g.e.c.r;
import g.e.c.v.c;
import java.io.IOException;

public final class TreeTypeAdapter<T> extends q<T> {
    public final o<T> a;
    public final i<T> b;
    public final Gson c;

    /* renamed from: d  reason: collision with root package name */
    public final g.e.c.u.a<T> f402d;

    /* renamed from: e  reason: collision with root package name */
    public final r f403e;

    /* renamed from: f  reason: collision with root package name */
    public final TreeTypeAdapter<T>.defpackage.b f404f = new b(this, (a) null);

    /* renamed from: g  reason: collision with root package name */
    public q<T> f405g;

    public static final class SingleTypeFactory implements r {
        public final g.e.c.u.a<?> b;
        public final boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final Class<?> f406d;

        /* renamed from: e  reason: collision with root package name */
        public final o<?> f407e;

        /* renamed from: f  reason: collision with root package name */
        public final i<?> f408f;

        public SingleTypeFactory(Object obj, g.e.c.u.a<?> aVar, boolean z, Class<?> cls) {
            o<?> oVar = obj instanceof o ? (o) obj : null;
            this.f407e = oVar;
            i<?> iVar = obj instanceof i ? (i) obj : null;
            this.f408f = iVar;
            f.i((oVar == null && iVar == null) ? false : true);
            this.b = null;
            this.c = z;
            this.f406d = cls;
        }

        public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
            boolean z;
            g.e.c.u.a<?> aVar2 = this.b;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.c && this.b.b == aVar.a);
            } else {
                z = this.f406d.isAssignableFrom(aVar.a);
            }
            if (z) {
                return new TreeTypeAdapter(this.f407e, this.f408f, gson, aVar, this);
            }
            return null;
        }
    }

    public final class b implements n, h {
        public b(TreeTypeAdapter treeTypeAdapter, a aVar) {
        }
    }

    public TreeTypeAdapter(o<T> oVar, i<T> iVar, Gson gson, g.e.c.u.a<T> aVar, r rVar) {
        this.a = oVar;
        this.b = iVar;
        this.c = gson;
        this.f402d = aVar;
        this.f403e = rVar;
    }

    public static r d(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, (g.e.c.u.a<?>) null, false, cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: NumberFormatException (r4v9 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ExcHandler: IOException (r4v8 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[ExcHandler: MalformedJsonException (r4v7 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T a(g.e.c.v.a r4) throws java.io.IOException {
        /*
            r3 = this;
            g.e.c.i<T> r0 = r3.b
            if (r0 != 0) goto L_0x001a
            g.e.c.q<T> r0 = r3.f405g
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            com.google.gson.Gson r0 = r3.c
            g.e.c.r r1 = r3.f403e
            g.e.c.u.a<T> r2 = r3.f402d
            g.e.c.q r0 = r0.g(r1, r2)
            r3.f405g = r0
        L_0x0015:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L_0x001a:
            r4.X()     // Catch:{ EOFException -> 0x003e, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            r0 = 0
            g.e.c.q<g.e.c.j> r1 = com.google.gson.internal.bind.TypeAdapters.X     // Catch:{ EOFException -> 0x0027, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ EOFException -> 0x0027, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            g.e.c.j r4 = (g.e.c.j) r4     // Catch:{ EOFException -> 0x0027, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            goto L_0x0044
        L_0x0027:
            r4 = move-exception
            goto L_0x0040
        L_0x0029:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0030:
            r4 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0037:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x005a
            g.e.c.k r4 = g.e.c.k.a
        L_0x0044:
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof g.e.c.k
            if (r0 == 0) goto L_0x004d
            r4 = 0
            return r4
        L_0x004d:
            g.e.c.i<T> r0 = r3.b
            g.e.c.u.a<T> r1 = r3.f402d
            java.lang.reflect.Type r1 = r1.b
            com.google.gson.internal.bind.TreeTypeAdapter<T>$b r2 = r3.f404f
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L_0x005a:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.a(g.e.c.v.a):java.lang.Object");
    }

    public void c(c cVar, T t) throws IOException {
        o<T> oVar = this.a;
        if (oVar == null) {
            q<T> qVar = this.f405g;
            if (qVar == null) {
                qVar = this.c.g(this.f403e, this.f402d);
                this.f405g = qVar;
            }
            qVar.c(cVar, t);
        } else if (t == null) {
            cVar.t();
        } else {
            f.z0(oVar.a(t, this.f402d.b, this.f404f), cVar);
        }
    }
}
