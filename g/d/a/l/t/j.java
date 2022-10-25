package g.d.a.l.t;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import e.e.i.c;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.v.h.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.MessageFormatter;

public class j<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends p<DataType, ResourceType>> b;
    public final e<ResourceType, Transcode> c;

    /* renamed from: d  reason: collision with root package name */
    public final c<List<Throwable>> f2492d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2493e;

    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends p<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, c<List<Throwable>> cVar) {
        this.a = cls;
        this.b = list;
        this.c = eVar;
        this.f2492d = cVar;
        StringBuilder i2 = g.a.a.a.a.i("Failed DecodePath{");
        i2.append(cls.getSimpleName());
        i2.append("->");
        i2.append(cls2.getSimpleName());
        i2.append("->");
        i2.append(cls3.getSimpleName());
        i2.append("}");
        this.f2493e = i2.toString();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: g.d.a.l.s.e<DataType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: g.d.a.l.t.v<ResourceType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: g.d.a.l.t.u<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: g.d.a.l.t.u<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: g.d.a.l.t.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: g.d.a.l.t.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: g.d.a.l.t.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: g.d.a.l.t.u<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: g.d.a.l.t.u<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: g.d.a.l.t.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: g.d.a.l.t.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g.d.a.l.t.v<Transcode> a(g.d.a.l.s.e<DataType> r11, int r12, int r13, g.d.a.l.n r14, g.d.a.l.t.j.a<ResourceType> r15) throws com.bumptech.glide.load.engine.GlideException {
        /*
            r10 = this;
            e.e.i.c<java.util.List<java.lang.Throwable>> r0 = r10.f2492d
            java.lang.Object r0 = r0.b()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            g.d.a.l.t.v r11 = r2.b(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x011e }
            e.e.i.c<java.util.List<java.lang.Throwable>> r12 = r10.f2492d
            r12.a(r0)
            g.d.a.l.t.i$b r15 = (g.d.a.l.t.i.b) r15
            g.d.a.l.t.i r12 = g.d.a.l.t.i.this
            g.d.a.l.a r13 = r15.a
            java.util.Objects.requireNonNull(r12)
            java.lang.Object r15 = r11.get()
            java.lang.Class r7 = r15.getClass()
            g.d.a.l.a r15 = g.d.a.l.a.RESOURCE_DISK_CACHE
            r0 = 0
            if (r13 == r15) goto L_0x0045
            g.d.a.l.t.h<R> r15 = r12.b
            g.d.a.l.r r15 = r15.f(r7)
            g.d.a.d r1 = r12.f2480i
            int r2 = r12.f2484m
            int r3 = r12.n
            g.d.a.l.t.v r1 = r15.a(r1, r11, r2, r3)
            r6 = r15
            r15 = r1
            goto L_0x0047
        L_0x0045:
            r15 = r11
            r6 = r0
        L_0x0047:
            boolean r1 = r11.equals(r15)
            if (r1 != 0) goto L_0x0050
            r11.d()
        L_0x0050:
            g.d.a.l.t.h<R> r11 = r12.b
            g.d.a.d r11 = r11.c
            com.bumptech.glide.Registry r11 = r11.b
            g.d.a.o.f r11 = r11.f346d
            java.lang.Class r1 = r15.c()
            g.d.a.l.q r11 = r11.a(r1)
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0066
            r11 = 1
            goto L_0x0067
        L_0x0066:
            r11 = 0
        L_0x0067:
            if (r11 == 0) goto L_0x008c
            g.d.a.l.t.h<R> r11 = r12.b
            g.d.a.d r11 = r11.c
            com.bumptech.glide.Registry r11 = r11.b
            g.d.a.o.f r11 = r11.f346d
            java.lang.Class r0 = r15.c()
            g.d.a.l.q r0 = r11.a(r0)
            if (r0 == 0) goto L_0x0082
            g.d.a.l.n r11 = r12.p
            g.d.a.l.c r11 = r0.b(r11)
            goto L_0x008e
        L_0x0082:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r11 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Class r12 = r15.c()
            r11.<init>(r12)
            throw r11
        L_0x008c:
            g.d.a.l.c r11 = g.d.a.l.c.f2409d
        L_0x008e:
            r9 = r0
            g.d.a.l.t.h<R> r0 = r12.b
            g.d.a.l.l r3 = r12.y
            java.util.List r0 = r0.c()
            int r4 = r0.size()
            r5 = 0
        L_0x009c:
            if (r5 >= r4) goto L_0x00b1
            java.lang.Object r8 = r0.get(r5)
            g.d.a.l.u.n$a r8 = (g.d.a.l.u.n.a) r8
            g.d.a.l.l r8 = r8.a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00ae
            r1 = 1
            goto L_0x00b1
        L_0x00ae:
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00b1:
            r0 = r1 ^ 1
            g.d.a.l.t.k r1 = r12.o
            boolean r13 = r1.d(r0, r13, r11)
            if (r13 == 0) goto L_0x0117
            if (r9 == 0) goto L_0x0109
            int r13 = r11.ordinal()
            if (r13 == 0) goto L_0x00f3
            if (r13 != r2) goto L_0x00dc
            g.d.a.l.t.x r11 = new g.d.a.l.t.x
            g.d.a.l.t.h<R> r13 = r12.b
            g.d.a.d r13 = r13.c
            g.d.a.l.t.b0.b r1 = r13.a
            g.d.a.l.l r2 = r12.y
            g.d.a.l.l r3 = r12.f2481j
            int r4 = r12.f2484m
            int r5 = r12.n
            g.d.a.l.n r8 = r12.p
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00fc
        L_0x00dc:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown strategy: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L_0x00f3:
            g.d.a.l.t.e r11 = new g.d.a.l.t.e
            g.d.a.l.l r13 = r12.y
            g.d.a.l.l r0 = r12.f2481j
            r11.<init>(r13, r0)
        L_0x00fc:
            g.d.a.l.t.u r15 = g.d.a.l.t.u.a(r15)
            g.d.a.l.t.i$c<?> r12 = r12.f2478g
            r12.a = r11
            r12.b = r9
            r12.c = r15
            goto L_0x0117
        L_0x0109:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r11 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r12 = r15.get()
            java.lang.Class r12 = r12.getClass()
            r11.<init>(r12)
            throw r11
        L_0x0117:
            g.d.a.l.v.h.e<ResourceType, Transcode> r11 = r10.c
            g.d.a.l.t.v r11 = r11.a(r15, r14)
            return r11
        L_0x011e:
            r11 = move-exception
            e.e.i.c<java.util.List<java.lang.Throwable>> r12 = r10.f2492d
            r12.a(r0)
            goto L_0x0126
        L_0x0125:
            throw r11
        L_0x0126:
            goto L_0x0125
        */
        throw new UnsupportedOperationException("Method not decompiled: g.d.a.l.t.j.a(g.d.a.l.s.e, int, int, g.d.a.l.n, g.d.a.l.t.j$a):g.d.a.l.t.v");
    }

    public final v<ResourceType> b(g.d.a.l.s.e<DataType> eVar, int i2, int i3, n nVar, List<Throwable> list) throws GlideException {
        int size = this.b.size();
        v<ResourceType> vVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            p pVar = (p) this.b.get(i4);
            try {
                if (pVar.b(eVar.a(), nVar)) {
                    vVar = pVar.a(eVar.a(), i2, i3, nVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + pVar, e2);
                }
                list.add(e2);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new GlideException(this.f2493e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("DecodePath{ dataClass=");
        i2.append(this.a);
        i2.append(", decoders=");
        i2.append(this.b);
        i2.append(", transcoder=");
        i2.append(this.c);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
