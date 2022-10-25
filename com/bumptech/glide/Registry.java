package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import g.d.a.l.q;
import g.d.a.l.s.e;
import g.d.a.l.u.n;
import g.d.a.l.u.o;
import g.d.a.l.u.p;
import g.d.a.l.v.h.f;
import g.d.a.o.a;
import g.d.a.o.b;
import g.d.a.o.c;
import g.d.a.o.d;
import g.d.a.o.e;
import g.d.a.o.f;
import g.d.a.r.k.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Registry {
    public final p a;
    public final a b;
    public final e c;

    /* renamed from: d  reason: collision with root package name */
    public final f f346d;

    /* renamed from: e  reason: collision with root package name */
    public final g.d.a.l.s.f f347e;

    /* renamed from: f  reason: collision with root package name */
    public final g.d.a.l.v.h.f f348f;

    /* renamed from: g  reason: collision with root package name */
    public final b f349g;

    /* renamed from: h  reason: collision with root package name */
    public final d f350h = new d();

    /* renamed from: i  reason: collision with root package name */
    public final c f351i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final e.e.i.c<List<Throwable>> f352j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public NoModelLoaderAvailableException(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        public <M> NoModelLoaderAvailableException(M m2, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super(g.a.a.a.a.v("Failed to find source encoder for data class: ", cls));
        }
    }

    public Registry() {
        a.c cVar = new a.c(new e.e.i.d(20), new g.d.a.r.k.b(), new g.d.a.r.k.c());
        this.f352j = cVar;
        this.a = new p(cVar);
        this.b = new g.d.a.o.a();
        e eVar = new e();
        this.c = eVar;
        this.f346d = new f();
        this.f347e = new g.d.a.l.s.f();
        this.f348f = new g.d.a.l.v.h.f();
        this.f349g = new b();
        List asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.a);
            eVar.a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    eVar.a.add(str);
                }
            }
        }
    }

    public <Data> Registry a(Class<Data> cls, g.d.a.l.d<Data> dVar) {
        g.d.a.o.a aVar = this.b;
        synchronized (aVar) {
            aVar.a.add(new a.C0097a(cls, dVar));
        }
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, q<TResource> qVar) {
        f fVar = this.f346d;
        synchronized (fVar) {
            fVar.a.add(new f.a(cls, qVar));
        }
        return this;
    }

    public <Model, Data> Registry c(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        p pVar = this.a;
        synchronized (pVar) {
            pVar.a.a(cls, cls2, oVar);
            pVar.b.a.clear();
        }
        return this;
    }

    public <Data, TResource> Registry d(String str, Class<Data> cls, Class<TResource> cls2, g.d.a.l.p<Data, TResource> pVar) {
        e eVar = this.c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a(cls, cls2, pVar));
        }
        return this;
    }

    public List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        b bVar = this.f349g;
        synchronized (bVar) {
            list = bVar.a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new NoImageHeaderParserException();
    }

    public <Model> List<n<Model, ?>> f(Model model) {
        List<n<Model, ?>> list;
        p pVar = this.a;
        Objects.requireNonNull(pVar);
        Class cls = model.getClass();
        synchronized (pVar) {
            p.a.C0091a aVar = pVar.b.a.get(cls);
            list = aVar == null ? null : aVar.a;
            if (list == null) {
                list = Collections.unmodifiableList(pVar.a.d(cls));
                if (pVar.b.a.put(cls, new p.a.C0091a(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<n<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i2 = 0; i2 < size; i2++) {
                n nVar = list.get(i2);
                if (nVar.b(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i2);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new NoModelLoaderAvailableException(model, list);
        }
        throw new NoModelLoaderAvailableException(model);
    }

    public Registry g(e.a<?> aVar) {
        g.d.a.l.s.f fVar = this.f347e;
        synchronized (fVar) {
            fVar.a.put(aVar.a(), aVar);
        }
        return this;
    }

    public <TResource, Transcode> Registry h(Class<TResource> cls, Class<Transcode> cls2, g.d.a.l.v.h.e<TResource, Transcode> eVar) {
        g.d.a.l.v.h.f fVar = this.f348f;
        synchronized (fVar) {
            fVar.a.add(new f.a(cls, cls2, eVar));
        }
        return this;
    }
}
