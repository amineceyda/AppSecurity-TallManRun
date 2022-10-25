package com.google.gson;

import g.e.c.q;
import g.e.c.v.a;
import g.e.c.v.b;
import g.e.c.v.c;
import java.io.IOException;

public class TypeAdapter$1 extends q<T> {
    public final /* synthetic */ q a;

    public TypeAdapter$1(q qVar) {
        this.a = qVar;
    }

    public T a(a aVar) throws IOException {
        if (aVar.X() != b.NULL) {
            return this.a.a(aVar);
        }
        aVar.P();
        return null;
    }

    public void c(c cVar, T t) throws IOException {
        if (t == null) {
            cVar.t();
        } else {
            this.a.c(cVar, t);
        }
    }
}
