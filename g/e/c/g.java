package g.e.c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g extends j implements Iterable<j> {
    public final List<j> b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof g) && ((g) obj).b.equals(this.b));
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Iterator<j> iterator() {
        return this.b.iterator();
    }
}
