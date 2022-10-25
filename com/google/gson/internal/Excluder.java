package com.google.gson.internal;

import com.google.gson.Gson;
import g.e.c.a;
import g.e.c.q;
import g.e.c.r;
import g.e.c.s.d;
import g.e.c.s.e;
import g.e.c.v.c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public final class Excluder implements r, Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public static final Excluder f390h = new Excluder();
    public double b = -1.0d;
    public int c = 136;

    /* renamed from: d  reason: collision with root package name */
    public boolean f391d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f392e;

    /* renamed from: f  reason: collision with root package name */
    public List<a> f393f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public List<a> f394g = Collections.emptyList();

    public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        boolean b2 = b(cls);
        final boolean z = b2 || c(cls, true);
        final boolean z2 = b2 || c(cls, false);
        if (!z && !z2) {
            return null;
        }
        final Gson gson2 = gson;
        final g.e.c.u.a<T> aVar2 = aVar;
        return new q<T>() {
            public q<T> a;

            public T a(g.e.c.v.a aVar) throws IOException {
                if (z2) {
                    aVar.h0();
                    return null;
                }
                q<T> qVar = this.a;
                if (qVar == null) {
                    qVar = gson2.g(Excluder.this, aVar2);
                    this.a = qVar;
                }
                return qVar.a(aVar);
            }

            public void c(c cVar, T t) throws IOException {
                if (z) {
                    cVar.t();
                    return;
                }
                q<T> qVar = this.a;
                if (qVar == null) {
                    qVar = gson2.g(Excluder.this, aVar2);
                    this.a = qVar;
                }
                qVar.c(cVar, t);
            }
        };
    }

    public final boolean b(Class<?> cls) {
        if (this.b == -1.0d || g((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f391d && f(cls)) || e(cls);
        }
        return true;
    }

    public final boolean c(Class<?> cls, boolean z) {
        for (a a : z ? this.f393f : this.f394g) {
            if (a.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public Excluder d() {
        try {
            Excluder excluder = (Excluder) super.clone();
            excluder.f392e = true;
            return excluder;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean e(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean f(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(d dVar, e eVar) {
        if (!(dVar == null || dVar.value() <= this.b)) {
            return false;
        }
        if (eVar == null || eVar.value() > this.b) {
            return true;
        }
        return false;
    }
}
