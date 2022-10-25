package e.a;

import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {
    public boolean a;
    public CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();

    public b(boolean z) {
        this.a = z;
    }

    public abstract void a();
}
