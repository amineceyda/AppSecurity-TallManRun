package g.f.a.b;

import g.a.a.a.a;
import java.sql.SQLException;

public class i implements f<T> {
    public int b = -1;
    public final /* synthetic */ j c;

    public i(j jVar) {
        this.c = jVar;
    }

    public void G() {
        this.b++;
    }

    public void close() {
    }

    public boolean hasNext() {
        return this.b + 1 < this.c.results.size();
    }

    public T next() {
        this.b++;
        return this.c.results.get(this.b);
    }

    public void remove() {
        int i2 = this.b;
        if (i2 < 0) {
            throw new IllegalStateException("next() must be called before remove()");
        } else if (i2 < this.c.results.size()) {
            Object remove = this.c.results.remove(this.b);
            this.b--;
            g<T, ID> gVar = this.c.b;
            if (gVar != null) {
                try {
                    gVar.S(remove);
                } catch (SQLException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } else {
            throw new IllegalStateException(a.e(a.i("current results position ("), this.b, ") is out of bounds"));
        }
    }
}
