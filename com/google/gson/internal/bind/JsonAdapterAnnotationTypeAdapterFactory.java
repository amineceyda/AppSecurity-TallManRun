package com.google.gson.internal.bind;

import com.google.gson.Gson;
import g.e.c.q;
import g.e.c.r;
import g.e.c.s.b;
import g.e.c.t.g;
import g.e.c.u.a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements r {
    public final g b;

    public JsonAdapterAnnotationTypeAdapterFactory(g gVar) {
        this.b = gVar;
    }

    public <T> q<T> a(Gson gson, a<T> aVar) {
        b bVar = (b) aVar.a.getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.b, gson, aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: g.e.c.q<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: g.e.c.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: com.google.gson.internal.bind.TreeTypeAdapter} */
    /* JADX WARNING: type inference failed for: r9v3, types: [g.e.c.q, g.e.c.q<?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.e.c.q<?> b(g.e.c.t.g r9, com.google.gson.Gson r10, g.e.c.u.a<?> r11, g.e.c.s.b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            g.e.c.u.a r1 = new g.e.c.u.a
            r1.<init>(r0)
            g.e.c.t.s r9 = r9.a(r1)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof g.e.c.q
            if (r0 == 0) goto L_0x0018
            g.e.c.q r9 = (g.e.c.q) r9
            goto L_0x0072
        L_0x0018:
            boolean r0 = r9 instanceof g.e.c.r
            if (r0 == 0) goto L_0x0023
            g.e.c.r r9 = (g.e.c.r) r9
            g.e.c.q r9 = r9.a(r10, r11)
            goto L_0x0072
        L_0x0023:
            boolean r0 = r9 instanceof g.e.c.o
            if (r0 != 0) goto L_0x0058
            boolean r1 = r9 instanceof g.e.c.i
            if (r1 == 0) goto L_0x002c
            goto L_0x0058
        L_0x002c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r12 = g.a.a.a.a.i(r12)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x0058:
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0 = r9
            g.e.c.o r0 = (g.e.c.o) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r9 instanceof g.e.c.i
            if (r0 == 0) goto L_0x0068
            r1 = r9
            g.e.c.i r1 = (g.e.c.i) r1
        L_0x0068:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r9 == 0) goto L_0x0080
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0080
            com.google.gson.TypeAdapter$1 r10 = new com.google.gson.TypeAdapter$1
            r10.<init>(r9)
            r9 = r10
        L_0x0080:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.b(g.e.c.t.g, com.google.gson.Gson, g.e.c.u.a, g.e.c.s.b):g.e.c.q");
    }
}
