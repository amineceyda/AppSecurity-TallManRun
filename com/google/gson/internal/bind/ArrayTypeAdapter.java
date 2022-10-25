package com.google.gson.internal.bind;

import com.google.gson.Gson;
import g.e.c.q;
import g.e.c.r;
import g.e.c.u.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends q<Object> {
    public static final r c = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            Type type = aVar.b;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.f(new a(genericComponentType)), g.e.c.t.a.e(genericComponentType));
        }
    };
    public final Class<E> a;
    public final q<E> b;

    public ArrayTypeAdapter(Gson gson, q<E> qVar, Class<E> cls) {
        this.b = new TypeAdapterRuntimeTypeWrapper(gson, qVar, cls);
        this.a = cls;
    }

    public Object a(g.e.c.v.a aVar) throws IOException {
        if (aVar.X() == b.NULL) {
            aVar.P();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.o()) {
            arrayList.add(this.b.a(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.a, size);
        for (int i2 = 0; i2 < size; i2++) {
            Array.set(newInstance, i2, arrayList.get(i2));
        }
        return newInstance;
    }

    public void c(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.t();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i2 = 0; i2 < length; i2++) {
            this.b.c(cVar, Array.get(obj, i2));
        }
        cVar.g();
    }
}
