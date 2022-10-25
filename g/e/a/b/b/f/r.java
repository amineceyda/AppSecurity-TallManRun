package g.e.a.b.b.f;

public abstract class r<TListener> {
    public TListener a;
    public boolean b = false;
    public final /* synthetic */ b c;

    public r(b bVar, TListener tlistener) {
        this.c = bVar;
        this.a = tlistener;
    }

    public abstract void a(TListener tlistener);

    public abstract void b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.f2854k) {
            this.c.f2854k.remove(this);
        }
    }
}
