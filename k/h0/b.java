package k.h0;

public abstract class b implements Runnable {
    public final String b;

    public b(String str, Object... objArr) {
        this.b = c.n(str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
