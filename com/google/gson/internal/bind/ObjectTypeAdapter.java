package com.google.gson.internal.bind;

import com.google.gson.Gson;
import g.e.c.q;
import g.e.c.r;
import g.e.c.u.a;
import g.e.c.v.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public final class ObjectTypeAdapter extends q<Object> {
    public static final r b = new r() {
        public <T> q<T> a(Gson gson, a<T> aVar) {
            if (aVar.a == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };
    public final Gson a;

    public ObjectTypeAdapter(Gson gson) {
        this.a = gson;
    }

    public Object a(g.e.c.v.a aVar) throws IOException {
        int ordinal = aVar.X().ordinal();
        if (ordinal == 0) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.o()) {
                arrayList.add(a(aVar));
            }
            aVar.g();
            return arrayList;
        } else if (ordinal == 2) {
            g.e.c.t.r rVar = new g.e.c.t.r();
            aVar.b();
            while (aVar.o()) {
                rVar.put(aVar.F(), a(aVar));
            }
            aVar.j();
            return rVar;
        } else if (ordinal == 5) {
            return aVar.S();
        } else {
            if (ordinal == 6) {
                return Double.valueOf(aVar.u());
            }
            if (ordinal == 7) {
                return Boolean.valueOf(aVar.t());
            }
            if (ordinal == 8) {
                aVar.P();
                return null;
            }
            throw new IllegalStateException();
        }
    }

    public void c(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.t();
            return;
        }
        Gson gson = this.a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(gson);
        q f2 = gson.f(new a(cls));
        if (f2 instanceof ObjectTypeAdapter) {
            cVar.d();
            cVar.j();
            return;
        }
        f2.c(cVar, obj);
    }
}
