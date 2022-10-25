package l;

import java.io.IOException;

public abstract class j implements x {
    public final x b;

    public j(x xVar) {
        if (xVar != null) {
            this.b = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.b.close();
    }

    public void flush() throws IOException {
        this.b.flush();
    }

    public z i() {
        return this.b.i();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.b.toString() + ")";
    }
}
