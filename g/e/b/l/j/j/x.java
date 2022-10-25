package g.e.b.l.j.j;

import java.util.concurrent.Callable;

public class x implements Callable<Void> {
    public final /* synthetic */ String a;
    public final /* synthetic */ v b;

    public x(v vVar, String str) {
        this.b = vVar;
        this.a = str;
    }

    public Object call() throws Exception {
        v.a(this.b, this.a);
        return null;
    }
}
