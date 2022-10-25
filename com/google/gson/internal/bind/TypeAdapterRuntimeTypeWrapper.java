package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import g.e.c.q;
import g.e.c.v.a;
import g.e.c.v.c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public final class TypeAdapterRuntimeTypeWrapper<T> extends q<T> {
    public final Gson a;
    public final q<T> b;
    public final Type c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, q<T> qVar, Type type) {
        this.a = gson;
        this.b = qVar;
        this.c = type;
    }

    public T a(a aVar) throws IOException {
        return this.b.a(aVar);
    }

    public void c(c cVar, T t) throws IOException {
        q<T> qVar = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            qVar = this.a.f(new g.e.c.u.a(type));
            if (qVar instanceof ReflectiveTypeAdapterFactory.Adapter) {
                q<T> qVar2 = this.b;
                if (!(qVar2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    qVar = qVar2;
                }
            }
        }
        qVar.c(cVar, t);
    }
}
