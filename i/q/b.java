package i.q;

import i.l.h;
import java.util.NoSuchElementException;

public final class b extends h {
    public final int b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f4579d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4580e;

    public b(int i2, int i3, int i4) {
        this.f4580e = i4;
        this.b = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.c = z;
        this.f4579d = !z ? i3 : i2;
    }

    public int a() {
        int i2 = this.f4579d;
        if (i2 != this.b) {
            this.f4579d = this.f4580e + i2;
        } else if (this.c) {
            this.c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public boolean hasNext() {
        return this.c;
    }
}
