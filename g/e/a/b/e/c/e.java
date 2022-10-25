package g.e.a.b.e.c;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator {
    public int b = 0;
    public final /* synthetic */ f c;

    public e(f fVar) {
        this.c = fVar;
    }

    public final boolean hasNext() {
        return this.b < this.c.r();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b < this.c.r()) {
            f fVar = this.c;
            int i2 = this.b;
            this.b = i2 + 1;
            return fVar.v(i2);
        }
        int i3 = this.b;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Out of bounds index: ");
        sb.append(i3);
        throw new NoSuchElementException(sb.toString());
    }
}
