package g.e.a.b.e.c;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class y7 extends i6 implements RandomAccess, z7 {

    /* renamed from: d  reason: collision with root package name */
    public static final y7 f3089d;
    public final List c;

    static {
        y7 y7Var = new y7(10);
        f3089d = y7Var;
        y7Var.b = false;
    }

    public y7() {
        this(10);
    }

    public y7(int i2) {
        this.c = new ArrayList(i2);
    }

    public y7(ArrayList arrayList) {
        this.c = arrayList;
    }

    public static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof s6) {
            s6 s6Var = (s6) obj;
            return s6Var.h() == 0 ? "" : s6Var.m(v7.a);
        }
        Charset charset = v7.a;
        return new String((byte[]) obj, v7.a);
    }

    public final Object F(int i2) {
        return this.c.get(i2);
    }

    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        c();
        this.c.add(i2, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i2, Collection collection) {
        c();
        if (collection instanceof z7) {
            collection = ((z7) collection).d();
        }
        boolean addAll = this.c.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final z7 b() {
        return this.b ? new q9(this) : this;
    }

    public final void clear() {
        c();
        this.c.clear();
        this.modCount++;
    }

    public final List d() {
        return Collections.unmodifiableList(this.c);
    }

    /* renamed from: e */
    public final String get(int i2) {
        Object obj = this.c.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof s6) {
            s6 s6Var = (s6) obj;
            String m2 = s6Var.h() == 0 ? "" : s6Var.m(v7.a);
            if (s6Var.r()) {
                this.c.set(i2, m2);
            }
            return m2;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = v7.a;
        String str = new String(bArr, v7.a);
        if (y9.a.a(bArr, 0, bArr.length)) {
            this.c.set(i2, str);
        }
        return str;
    }

    public final void n(s6 s6Var) {
        c();
        this.c.add(s6Var);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ u7 o(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.c);
            return new y7(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        c();
        Object remove = this.c.remove(i2);
        this.modCount++;
        return f(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        c();
        return f(this.c.set(i2, (String) obj));
    }

    public final int size() {
        return this.c.size();
    }
}
