package g.c.b.a.h;

import g.c.b.a.e;
import i.o.c.h;
import java.io.IOException;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ e b;
    public final /* synthetic */ IOException c;

    public /* synthetic */ c(e eVar, IOException iOException) {
        this.b = eVar;
        this.c = iOException;
    }

    public final void run() {
        e eVar = this.b;
        IOException iOException = this.c;
        h.e(eVar, "this$0");
        h.e(iOException, "$e");
        e eVar2 = eVar.b;
        String message = iOException.getMessage();
        if (message == null) {
            message = "unknown exception";
        }
        eVar2.a(1, message);
    }
}
