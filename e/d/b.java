package e.d;

import e.d.f;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.slf4j.helpers.MessageFormatter;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1234f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f1235g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f1236h;

    /* renamed from: i  reason: collision with root package name */
    public static int f1237i;

    /* renamed from: j  reason: collision with root package name */
    public static Object[] f1238j;

    /* renamed from: k  reason: collision with root package name */
    public static int f1239k;
    public int[] b;
    public Object[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f1240d;

    /* renamed from: e  reason: collision with root package name */
    public f<E, E> f1241e;

    public class a extends f<E, E> {
        public a() {
        }

        public void a() {
            b.this.clear();
        }

        public Object b(int i2, int i3) {
            return b.this.c[i2];
        }

        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        public int d() {
            return b.this.f1240d;
        }

        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        public void g(E e2, E e3) {
            b.this.add(e2);
        }

        public void h(int i2) {
            b.this.l(i2);
        }

        public E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        if (i2 == 0) {
            this.b = f1234f;
            this.c = f1235g;
        } else {
            c(i2);
        }
        this.f1240d = 0;
    }

    public static void e(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f1239k < 10) {
                    objArr[0] = f1238j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1238j = objArr;
                    f1239k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f1237i < 10) {
                    objArr[0] = f1236h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1236h = objArr;
                    f1237i++;
                }
            }
        }
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = i();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = h(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = i3 ^ -1;
        int i5 = this.f1240d;
        int[] iArr = this.b;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.c;
            c(i6);
            int[] iArr2 = this.b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.c, 0, objArr.length);
            }
            e(iArr, objArr, this.f1240d);
        }
        int i7 = this.f1240d;
        if (i4 < i7) {
            int[] iArr3 = this.b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f1240d - i4);
        }
        this.b[i4] = i2;
        this.c[i4] = e2;
        this.f1240d++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f1240d;
        int[] iArr = this.b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.c;
            c(size);
            int i2 = this.f1240d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.b, 0, i2);
                System.arraycopy(objArr, 0, this.c, 0, this.f1240d);
            }
            e(iArr, objArr, this.f1240d);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final void c(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f1238j;
                if (objArr != null) {
                    this.c = objArr;
                    f1238j = (Object[]) objArr[0];
                    this.b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1239k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f1236h;
                if (objArr2 != null) {
                    this.c = objArr2;
                    f1236h = (Object[]) objArr2[0];
                    this.b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1237i--;
                    return;
                }
            }
        }
        this.b = new int[i2];
        this.c = new Object[i2];
    }

    public void clear() {
        int i2 = this.f1240d;
        if (i2 != 0) {
            e(this.b, this.c, i2);
            this.b = f1234f;
            this.c = f1235g;
            this.f1240d = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1240d != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f1240d) {
                try {
                    if (!set.contains(this.c[i2])) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final f<E, E> f() {
        if (this.f1241e == null) {
            this.f1241e = new a();
        }
        return this.f1241e;
    }

    public final int h(Object obj, int i2) {
        int i3 = this.f1240d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = c.a(this.b, i3, i2);
        if (a2 < 0 || obj.equals(this.c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.b[i4] == i2) {
            if (obj.equals(this.c[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.b[i5] == i2) {
            if (obj.equals(this.c[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    public int hashCode() {
        int[] iArr = this.b;
        int i2 = this.f1240d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int i() {
        int i2 = this.f1240d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = c.a(this.b, i2, 0);
        if (a2 < 0 || this.c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.b[i3] == 0) {
            if (this.c[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.b[i4] == 0) {
            if (this.c[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public int indexOf(Object obj) {
        return obj == null ? i() : h(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f1240d <= 0;
    }

    public Iterator<E> iterator() {
        f f2 = f();
        if (f2.b == null) {
            f2.b = new f.c();
        }
        return f2.b.iterator();
    }

    public E l(int i2) {
        E[] eArr = this.c;
        E e2 = eArr[i2];
        int i3 = this.f1240d;
        if (i3 <= 1) {
            e(this.b, eArr, i3);
            this.b = f1234f;
            this.c = f1235g;
            this.f1240d = 0;
        } else {
            int[] iArr = this.b;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f1240d = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr = this.c;
                    System.arraycopy(objArr, i6, objArr, i2, this.f1240d - i2);
                }
                this.c[this.f1240d] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                c(i4);
                this.f1240d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.b, 0, i2);
                    System.arraycopy(eArr, 0, this.c, 0, i2);
                }
                int i7 = this.f1240d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.b, i2, i7 - i2);
                    System.arraycopy(eArr, i8, this.c, i2, this.f1240d - i2);
                }
            }
        }
        return e2;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        l(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1240d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.c[i2])) {
                l(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f1240d;
    }

    public Object[] toArray() {
        int i2 = this.f1240d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.c, 0, objArr, 0, i2);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f1240d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1240d);
        }
        System.arraycopy(this.c, 0, tArr, 0, this.f1240d);
        int length = tArr.length;
        int i2 = this.f1240d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb = new StringBuilder(this.f1240d * 14);
        sb.append(MessageFormatter.DELIM_START);
        for (int i2 = 0; i2 < this.f1240d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(MessageFormatter.DELIM_STOP);
        return sb.toString();
    }
}
