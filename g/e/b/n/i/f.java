package g.e.b.n.i;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import g.e.b.n.c;
import g.e.b.n.d;
import g.e.b.n.e;
import g.e.b.n.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public final class f implements e, g {
    public boolean a = true;
    public final JsonWriter b;
    public final Map<Class<?>, d<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, g.e.b.n.f<?>> f3713d;

    /* renamed from: e  reason: collision with root package name */
    public final d<Object> f3714e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3715f;

    public f(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, g.e.b.n.f<?>> map2, d<Object> dVar, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.f3713d = map2;
        this.f3714e = dVar;
        this.f3715f = z;
    }

    public e a(c cVar, boolean z) throws IOException {
        String str = cVar.a;
        i();
        this.b.name(str);
        i();
        this.b.value(z);
        return this;
    }

    public e b(c cVar, long j2) throws IOException {
        String str = cVar.a;
        i();
        this.b.name(str);
        i();
        this.b.value(j2);
        return this;
    }

    public e c(c cVar, int i2) throws IOException {
        String str = cVar.a;
        i();
        this.b.name(str);
        i();
        this.b.value((long) i2);
        return this;
    }

    public g d(String str) throws IOException {
        i();
        this.b.value(str);
        return this;
    }

    public g e(boolean z) throws IOException {
        i();
        this.b.value(z);
        return this;
    }

    public e f(c cVar, Object obj) throws IOException {
        return h(cVar.a, obj);
    }

    public f g(Object obj, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.b.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                i();
                this.b.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.b.beginArray();
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i2 < length) {
                    this.b.value((long) iArr[i2]);
                    i2++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i2 < length2) {
                    long j2 = jArr[i2];
                    i();
                    this.b.value(j2);
                    i2++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i2 < length3) {
                    this.b.value(dArr[i2]);
                    i2++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i2 < length4) {
                    this.b.value(zArr[i2]);
                    i2++;
                }
            } else if (obj instanceof Number[]) {
                for (Number g2 : (Number[]) obj) {
                    g(g2, false);
                }
            } else {
                for (Object g3 : (Object[]) obj) {
                    g(g3, false);
                }
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.b.beginArray();
            for (Object g4 : (Collection) obj) {
                g(g4, false);
            }
            this.b.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.b.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    h((String) key, entry.getValue());
                } catch (ClassCastException e2) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                }
            }
            this.b.endObject();
            return this;
        } else {
            d dVar = this.c.get(obj.getClass());
            if (dVar != null) {
                if (!z) {
                    this.b.beginObject();
                }
                dVar.a(obj, this);
                if (!z) {
                    this.b.endObject();
                }
                return this;
            }
            g.e.b.n.f fVar = this.f3713d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                String name = ((Enum) obj).name();
                i();
                this.b.value(name);
                return this;
            } else {
                d<Object> dVar2 = this.f3714e;
                if (!z) {
                    this.b.beginObject();
                }
                dVar2.a(obj, this);
                if (!z) {
                    this.b.endObject();
                }
                return this;
            }
        }
    }

    public f h(String str, Object obj) throws IOException {
        if (!this.f3715f) {
            i();
            this.b.name(str);
            if (obj != null) {
                return g(obj, false);
            }
            this.b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            i();
            this.b.name(str);
            return g(obj, false);
        }
    }

    public final void i() throws IOException {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
