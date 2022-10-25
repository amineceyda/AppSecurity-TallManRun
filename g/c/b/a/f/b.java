package g.c.b.a.f;

import com.jakewharton.disklrucache.DiskLruCache;
import g.c.b.a.j.c;
import g.c.b.a.l.e;
import g.c.b.b.f;
import i.d;
import i.o.c.h;
import i.o.c.i;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;

public final class b {
    public static final b b = null;
    public static c c;

    /* renamed from: d  reason: collision with root package name */
    public static final i.c<b> f2217d = f.T(d.SYNCHRONIZED, a.b);
    public final DiskLruCache a;

    public static final class a extends i implements i.o.b.a<b> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        /* renamed from: h */
        public final b a() {
            c cVar = b.c;
            if (cVar != null) {
                File b2 = cVar.b();
                c cVar2 = b.c;
                if (cVar2 != null) {
                    DiskLruCache open = DiskLruCache.open(b2, 1, 1, cVar2.i());
                    h.d(open, "cache");
                    return new b(open, (i.o.c.f) null);
                }
                h.k("config");
                throw null;
            }
            h.k("config");
            throw null;
        }
    }

    public b(DiskLruCache diskLruCache, i.o.c.f fVar) {
        this.a = diskLruCache;
    }

    public final void a(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public final g.c.b.a.d<Object> b(g.c.b.a.c cVar) {
        String str;
        h.e(cVar, "request");
        String str2 = cVar.f2197f;
        if (str2 == null) {
            str = "";
        } else {
            str = e.a(str2);
        }
        try {
            DiskLruCache.Snapshot snapshot = this.a.get(str);
            if (snapshot == null) {
                return null;
            }
            Object readObject = new ObjectInputStream(snapshot.getInputStream(0)).readObject();
            if (readObject != null) {
                return ((c) readObject).a(cVar);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.apkpure.components.clientchannel.cache.Entry");
        } catch (IOException | ClassCastException | ClassNotFoundException | IllegalArgumentException unused) {
            d(str);
            return null;
        }
    }

    public final boolean c(g.c.b.a.d<Object> dVar) {
        String str;
        h.e(dVar, "response");
        String str2 = dVar.a.f2197f;
        DiskLruCache.Editor editor = null;
        if (str2 == null) {
            str = null;
        } else {
            str = e.a(str2);
        }
        try {
            editor = this.a.edit(str);
            new c(dVar).b(editor);
            return true;
        } catch (IOException unused) {
            a(editor);
            return false;
        }
    }

    public final boolean d(String str) {
        h.e(str, "key");
        return this.a.remove(str);
    }
}
