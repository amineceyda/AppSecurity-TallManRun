package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class i8 extends LinkedHashMap {
    public static final i8 b;
    private boolean zzb = true;

    static {
        i8 i8Var = new i8();
        b = i8Var;
        i8Var.zzb = false;
    }

    public i8() {
    }

    public i8(Map map) {
        super(map);
    }

    public static int c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        Charset charset = v7.a;
        int i2 = r0;
        for (byte b2 : (byte[]) obj) {
            i2 = (i2 * 31) + b2;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final void a() {
        this.zzb = false;
    }

    public final boolean b() {
        return this.zzb;
    }

    public final void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            i2 += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i2;
    }

    public final Object put(Object obj, Object obj2) {
        d();
        Charset charset = v7.a;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        d();
        for (Object next : map.keySet()) {
            Charset charset = v7.a;
            Objects.requireNonNull(next);
            Objects.requireNonNull(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        d();
        return super.remove(obj);
    }
}
