package com.google.gson.internal.bind;

import com.google.gson.Gson;
import g.e.c.q;
import g.e.c.r;
import g.e.c.t.g;
import g.e.c.t.s;
import g.e.c.v.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements r {
    public final g b;

    public static final class Adapter<E> extends q<Collection<E>> {
        public final q<E> a;
        public final s<? extends Collection<E>> b;

        public Adapter(Gson gson, Type type, q<E> qVar, s<? extends Collection<E>> sVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, qVar, type);
            this.b = sVar;
        }

        public Object a(a aVar) throws IOException {
            if (aVar.X() == b.NULL) {
                aVar.P();
                return null;
            }
            Collection collection = (Collection) this.b.a();
            aVar.a();
            while (aVar.o()) {
                collection.add(this.a.a(aVar));
            }
            aVar.g();
            return collection;
        }

        /* renamed from: d */
        public void c(c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.t();
                return;
            }
            cVar.b();
            for (E c : collection) {
                this.a.c(cVar, c);
            }
            cVar.g();
        }
    }

    public CollectionTypeAdapterFactory(g gVar) {
        this.b = gVar;
    }

    public <T> q<T> a(Gson gson, g.e.c.u.a<T> aVar) {
        Type type = aVar.b;
        Class<? super T> cls = aVar.a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        Type f2 = g.e.c.t.a.f(type, cls, Collection.class);
        if (f2 instanceof WildcardType) {
            f2 = ((WildcardType) f2).getUpperBounds()[0];
        }
        Class cls2 = f2 instanceof ParameterizedType ? ((ParameterizedType) f2).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, cls2, gson.f(new g.e.c.u.a(cls2)), this.b.a(aVar));
    }
}
