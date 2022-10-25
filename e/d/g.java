package e.d;

import java.util.ConcurrentModificationException;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public class g<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static Object[] f1256e;

    /* renamed from: f  reason: collision with root package name */
    public static int f1257f;

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f1258g;

    /* renamed from: h  reason: collision with root package name */
    public static int f1259h;
    public int[] b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f1260d;

    public g() {
        this.b = c.a;
        this.c = c.c;
        this.f1260d = 0;
    }

    public g(int i2) {
        if (i2 == 0) {
            this.b = c.a;
            this.c = c.c;
        } else {
            a(i2);
        }
        this.f1260d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        Class<g> cls = g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f1259h < 10) {
                    objArr[0] = f1258g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1258g = objArr;
                    f1259h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f1257f < 10) {
                    objArr[0] = f1256e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1256e = objArr;
                    f1257f++;
                }
            }
        }
    }

    public final void a(int i2) {
        Class<g> cls = g.class;
        if (i2 == 8) {
            synchronized (cls) {
                Object[] objArr = f1258g;
                if (objArr != null) {
                    this.c = objArr;
                    f1258g = (Object[]) objArr[0];
                    this.b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1259h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f1256e;
                if (objArr2 != null) {
                    this.c = objArr2;
                    f1256e = (Object[]) objArr2[0];
                    this.b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1257f--;
                    return;
                }
            }
        }
        this.b = new int[i2];
        this.c = new Object[(i2 << 1)];
    }

    public void b(int i2) {
        int i3 = this.f1260d;
        int[] iArr = this.b;
        if (iArr.length < i2) {
            Object[] objArr = this.c;
            a(i2);
            if (this.f1260d > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i3);
                System.arraycopy(objArr, 0, this.c, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.f1260d != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f1260d;
        if (i2 > 0) {
            int[] iArr = this.b;
            Object[] objArr = this.c;
            this.b = c.a;
            this.c = c.c;
            this.f1260d = 0;
            c(iArr, objArr, i2);
        }
        if (this.f1260d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i2) {
        int i3 = this.f1260d;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a = c.a(this.b, i3, i2);
            if (a < 0 || obj.equals(this.c[a << 1])) {
                return a;
            }
            int i4 = a + 1;
            while (i4 < i3 && this.b[i4] == i2) {
                if (obj.equals(this.c[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            int i5 = a - 1;
            while (i5 >= 0 && this.b[i5] == i2) {
                if (obj.equals(this.c[i5 << 1])) {
                    return i5;
                }
                i5--;
            }
            return i4 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f1260d != gVar.f1260d) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1260d) {
                try {
                    Object h2 = h(i2);
                    Object l2 = l(i2);
                    Object obj2 = gVar.get(h2);
                    if (l2 == null) {
                        if (obj2 != null || !gVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!l2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f1260d != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f1260d) {
                try {
                    Object h3 = h(i3);
                    Object l3 = l(i3);
                    Object obj3 = map.get(h3);
                    if (l3 == null) {
                        if (obj3 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!l3.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i2 = this.f1260d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = c.a(this.b, i2, 0);
            if (a < 0 || this.c[a << 1] == null) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.b[i3] == 0) {
                if (this.c[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.b[i4] == 0) {
                if (this.c[i4 << 1] == null) {
                    return i4;
                }
                i4--;
            }
            return i3 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i2 = this.f1260d * 2;
        Object[] objArr = this.c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int e2 = e(obj);
        return e2 >= 0 ? this.c[(e2 << 1) + 1] : v;
    }

    public K h(int i2) {
        return this.c[i2 << 1];
    }

    public int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
        int i2 = this.f1260d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public void i(g<? extends K, ? extends V> gVar) {
        int i2 = gVar.f1260d;
        b(this.f1260d + i2);
        if (this.f1260d != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(gVar.h(i3), gVar.l(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(gVar.b, 0, this.b, 0, i2);
            System.arraycopy(gVar.c, 0, this.c, 0, i2 << 1);
            this.f1260d = i2;
        }
    }

    public boolean isEmpty() {
        return this.f1260d <= 0;
    }

    public V j(int i2) {
        V[] vArr = this.c;
        int i3 = i2 << 1;
        V v = vArr[i3 + 1];
        int i4 = this.f1260d;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.b, vArr, i4);
            this.b = c.a;
            this.c = c.c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.b;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr = this.c;
                    System.arraycopy(objArr, i8 << 1, objArr, i3, i9 << 1);
                }
                Object[] objArr2 = this.c;
                int i10 = i6 << 1;
                objArr2[i10] = null;
                objArr2[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                a(i7);
                if (i4 == this.f1260d) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.b, 0, i2);
                        System.arraycopy(vArr, 0, this.c, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.b, i2, i12);
                        System.arraycopy(vArr, i11 << 1, this.c, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f1260d) {
            this.f1260d = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.c;
        V v2 = vArr[i3];
        vArr[i3] = v;
        return v2;
    }

    public V l(int i2) {
        return this.c[(i2 << 1) + 1];
    }

    public V put(K k2, V v) {
        int i2;
        int i3;
        int i4 = this.f1260d;
        if (k2 == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = d(k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            V[] vArr = this.c;
            V v2 = vArr[i5];
            vArr[i5] = v;
            return v2;
        }
        int i6 = i3 ^ -1;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            Object[] objArr = this.c;
            a(i7);
            if (i4 == this.f1260d) {
                int[] iArr2 = this.b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.c, 0, objArr.length);
                }
                c(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.b;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i6 << 1, objArr2, i8 << 1, (this.f1260d - i6) << 1);
        }
        int i9 = this.f1260d;
        if (i4 == i9) {
            int[] iArr4 = this.b;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr3 = this.c;
                int i10 = i6 << 1;
                objArr3[i10] = k2;
                objArr3[i10 + 1] = v;
                this.f1260d = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v) {
        V orDefault = getOrDefault(k2, (Object) null);
        return orDefault == null ? put(k2, v) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return j(e2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object l2 = l(e2);
        if (obj2 != l2 && (obj2 == null || !obj2.equals(l2))) {
            return false;
        }
        j(e2);
        return true;
    }

    public V replace(K k2, V v) {
        int e2 = e(k2);
        if (e2 >= 0) {
            return k(e2, v);
        }
        return null;
    }

    public boolean replace(K k2, V v, V v2) {
        int e2 = e(k2);
        if (e2 < 0) {
            return false;
        }
        V l2 = l(e2);
        if (l2 != v && (v == null || !v.equals(l2))) {
            return false;
        }
        k(e2, v2);
        return true;
    }

    public int size() {
        return this.f1260d;
    }

    public String toString() {
        if (isEmpty()) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb = new StringBuilder(this.f1260d * 28);
        sb.append(MessageFormatter.DELIM_START);
        for (int i2 = 0; i2 < this.f1260d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l2 = l(i2);
            if (l2 != this) {
                sb.append(l2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
