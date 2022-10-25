package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class g7 {

    /* renamed from: d  reason: collision with root package name */
    public static final g7 f2938d = new g7(true);
    public final i9 a;
    public boolean b;
    public boolean c;

    public g7() {
        this.a = new b9(16);
    }

    public g7(boolean z) {
        b9 b9Var = new b9(0);
        this.a = b9Var;
        if (!this.b) {
            b9Var.a();
            this.b = true;
        }
        if (!this.b) {
            b9Var.a();
            this.b = true;
        }
    }

    public static final void b(f7 f7Var, Object obj) {
        boolean z;
        z9 j2 = f7Var.j();
        Charset charset = v7.a;
        Objects.requireNonNull(obj);
        z9 z9Var = z9.DOUBLE;
        aa aaVar = aa.INT;
        switch (j2.a().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof s6) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof o8) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(f7Var.c()), f7Var.j().a(), obj.getClass().getName()}));
    }

    public final void a(f7 f7Var, Object obj) {
        if (!f7Var.k()) {
            b(f7Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(f7Var, arrayList.get(i2));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.a.put(f7Var, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        g7 g7Var = new g7();
        for (int i2 = 0; i2 < this.a.b(); i2++) {
            Map.Entry d2 = this.a.d(i2);
            g7Var.a((f7) d2.getKey(), d2.getValue());
        }
        i9 i9Var = this.a;
        for (Map.Entry entry : i9Var.f2957d.isEmpty() ? e9.b : i9Var.f2957d.entrySet()) {
            g7Var.a((f7) entry.getKey(), entry.getValue());
        }
        g7Var.c = this.c;
        return g7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        return this.a.equals(((g7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
