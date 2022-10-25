package g.e.c;

import g.e.c.t.r;

public final class l extends j {
    public final r<String, j> a = new r<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
