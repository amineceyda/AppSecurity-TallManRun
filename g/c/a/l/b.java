package g.c.a.l;

import com.apkpure.aegon.application.AegonApplication;
import g.c.a.l.l.o;
import g.c.a.l.o.a;
import g.c.a.l.o.h;
import g.c.a.l.o.k;
import java.io.File;

public final /* synthetic */ class b implements Runnable {
    public static final /* synthetic */ b b = new b();

    public final void run() {
        d dVar = d.a;
        o h2 = dVar.h();
        d.f2041d = h2;
        if (h2 != null) {
            d.b.debug(String.valueOf(h2));
            dVar.j(d.f2041d);
            return;
        }
        e eVar = e.b;
        d.b.info("Get XApk Info From Config.");
        i.b(i.a, 10, 204, (String) null, "", "", 4);
        k kVar = k.a;
        File file = new File(k.b(AegonApplication.getContext()));
        h hVar = h.c;
        a c = h.c();
        int f2 = j.CONFIG.f();
        f fVar = new f(eVar);
        h hVar2 = (h) c;
        i.o.c.h.e(file, "inFile");
        i.o.c.h.e(fVar, "listener");
        h.f2080d.debug("getStringById ifFile:{} , chooseId:{} ", (Object) file, (Object) Integer.valueOf(f2));
        try {
            hVar2.b = fVar;
            hVar2.d(file, f2, (String) null, k.STRING);
        } catch (Exception e2) {
            fVar.d(e2);
        }
    }
}
