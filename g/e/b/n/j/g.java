package g.e.b.n.j;

import com.google.firebase.encoders.EncodingException;
import com.tencent.raft.measure.utils.MeasureConst;
import g.e.b.n.c;
import g.e.b.n.d;
import g.e.b.n.e;
import g.e.b.n.f;
import g.e.b.n.j.f;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class g implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f3718f = Charset.forName(MeasureConst.CHARSET_UTF8);

    /* renamed from: g  reason: collision with root package name */
    public static final c f3719g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f3720h;

    /* renamed from: i  reason: collision with root package name */
    public static final d<Map.Entry<Object, Object>> f3721i = a.a;
    public OutputStream a;
    public final Map<Class<?>, d<?>> b;
    public final Map<Class<?>, f<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final d<Object> f3722d;

    /* renamed from: e  reason: collision with root package name */
    public final i f3723e = new i(this);

    static {
        f.a aVar = f.a.DEFAULT;
        c cVar = new c(1, aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(cVar.annotationType(), cVar);
        f3719g = new c("key", hashMap == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap)), (c.a) null);
        c cVar2 = new c(2, aVar);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(cVar2.annotationType(), cVar2);
        f3720h = new c("value", hashMap2 == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(hashMap2)), (c.a) null);
    }

    public g(OutputStream outputStream, Map<Class<?>, d<?>> map, Map<Class<?>, g.e.b.n.f<?>> map2, d<Object> dVar) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.f3722d = dVar;
    }

    public static ByteBuffer h(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static f j(c cVar) {
        f fVar = (f) ((Annotation) cVar.b.get(f.class));
        if (fVar != null) {
            return fVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static int k(c cVar) {
        f fVar = (f) ((Annotation) cVar.b.get(f.class));
        if (fVar != null) {
            return ((c) fVar).a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public e a(c cVar, boolean z) throws IOException {
        e(cVar, z ? 1 : 0, true);
        return this;
    }

    public e b(c cVar, long j2) throws IOException {
        g(cVar, j2, true);
        return this;
    }

    public e c(c cVar, int i2) throws IOException {
        e(cVar, i2, true);
        return this;
    }

    public e d(c cVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3718f);
            l(bytes.length);
            this.a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object d2 : (Collection) obj) {
                d(cVar, d2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry i2 : ((Map) obj).entrySet()) {
                i(f3721i, cVar, i2, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z || doubleValue != 0.0d) {
                l((k(cVar) << 3) | 1);
                this.a.write(h(8).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z || floatValue != 0.0f) {
                l((k(cVar) << 3) | 5);
                this.a.write(h(4).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            g(cVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            e(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.a.write(bArr);
            return this;
        } else {
            d dVar = this.b.get(obj.getClass());
            if (dVar != null) {
                i(dVar, cVar, obj, z);
                return this;
            }
            g.e.b.n.f fVar = this.c.get(obj.getClass());
            if (fVar != null) {
                i iVar = this.f3723e;
                iVar.a = false;
                iVar.c = cVar;
                iVar.b = z;
                fVar.a(obj, iVar);
                return this;
            } else if (obj instanceof e) {
                e(cVar, ((e) obj).a(), true);
                return this;
            } else if (obj instanceof Enum) {
                e(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                i(this.f3722d, cVar, obj, z);
                return this;
            }
        }
    }

    public g e(c cVar, int i2, boolean z) throws IOException {
        if (z && i2 == 0) {
            return this;
        }
        l(((c) j(cVar)).a << 3);
        l(i2);
        return this;
    }

    public e f(c cVar, Object obj) throws IOException {
        return d(cVar, obj, true);
    }

    public g g(c cVar, long j2, boolean z) throws IOException {
        if (z && j2 == 0) {
            return this;
        }
        l(((c) j(cVar)).a << 3);
        m(j2);
        return this;
    }

    public final <T> g i(d<T> dVar, c cVar, T t, boolean z) throws IOException {
        OutputStream outputStream;
        d dVar2 = new d();
        try {
            outputStream = this.a;
            this.a = dVar2;
            dVar.a(t, this);
            this.a = outputStream;
            long j2 = dVar2.b;
            dVar2.close();
            if (z && j2 == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            m(j2);
            dVar.a(t, this);
            return this;
        } catch (Throwable th) {
            try {
                dVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(int i2) throws IOException {
        while (true) {
            int i3 = (((long) (i2 & -128)) > 0 ? 1 : (((long) (i2 & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i3 != 0) {
                outputStream.write((i2 & 127) | 128);
                i2 >>>= 7;
            } else {
                outputStream.write(i2 & 127);
                return;
            }
        }
    }

    public final void m(long j2) throws IOException {
        while (true) {
            int i2 = ((-128 & j2) > 0 ? 1 : ((-128 & j2) == 0 ? 0 : -1));
            OutputStream outputStream = this.a;
            if (i2 != 0) {
                outputStream.write((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } else {
                outputStream.write(((int) j2) & 127);
                return;
            }
        }
    }
}
