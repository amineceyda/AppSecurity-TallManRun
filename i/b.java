package i;

import i.o.c.h;

public final class b implements Comparable<b> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f4570f = new b(1, 5, 10);
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4571d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4572e;

    public b(int i2, int i3, int i4) {
        this.c = i2;
        this.f4571d = i3;
        this.f4572e = i4;
        if (i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3 && i4 >= 0 && 255 >= i4) {
            this.b = (i2 << 16) + (i3 << 8) + i4;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public int compareTo(Object obj) {
        b bVar = (b) obj;
        h.e(bVar, "other");
        return this.b - bVar.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            obj = null;
        }
        b bVar = (b) obj;
        return bVar != null && this.b == bVar.b;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.c);
        sb.append('.');
        sb.append(this.f4571d);
        sb.append('.');
        sb.append(this.f4572e);
        return sb.toString();
    }
}
