package g.c.b.a.g.c;

import android.util.Log;
import g.a.a.a.a;
import g.c.b.a.j.g;
import g.c.b.a.l.c;
import i.o.c.h;
import java.io.IOException;
import k.c0;
import k.e;

public final class d implements e {
    public final /* synthetic */ c b;

    public d(c cVar) {
        this.b = cVar;
    }

    public void onFailure(k.d dVar, IOException iOException) {
        h.e(dVar, "call");
        h.e(iOException, g.d.a.j.e.u);
        String str = this.b.b;
        String j2 = h.j("request failure, exception: ", iOException.getMessage());
        h.e(str, "tag");
        h.e(j2, "message");
        g gVar = c.b;
        String j3 = h.j("ClientChannel|", str);
        if (gVar != null) {
            gVar.e(j3, j2);
        } else {
            Log.e(j3, j2);
        }
        e eVar = this.b.a.b;
        if (eVar != null) {
            eVar.onFailure(dVar, iOException);
        }
    }

    public void onResponse(k.d dVar, c0 c0Var) {
        h.e(dVar, "call");
        h.e(c0Var, "response");
        c cVar = this.b;
        String str = cVar.b;
        StringBuilder i2 = a.i("request had response,code: ");
        i2.append(c0Var.f4688d);
        i2.append(", message: ");
        i2.append(c0Var.f4689e);
        i2.append(", ");
        String sb = i2.toString();
        h.e(str, "tag");
        h.e(sb, "message");
        g gVar = c.b;
        String j2 = h.j("ClientChannel|", str);
        if (gVar != null) {
            gVar.i(j2, sb);
        } else {
            Log.i(j2, sb);
        }
        String str2 = cVar.b;
        StringBuilder i3 = a.i("request had response,header: ");
        i3.append(c0Var.f4691g);
        i3.append("], \n");
        String sb2 = i3.toString();
        h.e(str2, "tag");
        h.e(sb2, "message");
        g gVar2 = c.b;
        String j3 = h.j("ClientChannel|", str2);
        if (gVar2 != null) {
            gVar2.d(j3, sb2);
        } else {
            Log.d(j3, sb2);
        }
        e eVar = this.b.a.b;
        if (eVar != null) {
            eVar.onResponse(dVar, c0Var);
        }
    }
}
