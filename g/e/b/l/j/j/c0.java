package g.e.b.l.j.j;

import g.a.a.a.a;
import g.e.b.l.j.n.f;
import java.io.File;
import java.io.IOException;

public class c0 {
    public final String a;
    public final f b;

    public c0(String str, f fVar) {
        this.a = str;
        this.b = fVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e2) {
            g.e.b.l.j.f fVar = g.e.b.l.j.f.a;
            StringBuilder i2 = a.i("Error creating marker: ");
            i2.append(this.a);
            fVar.d(i2.toString(), e2);
            return false;
        }
    }

    public final File b() {
        return this.b.a(this.a);
    }
}
