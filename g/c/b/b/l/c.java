package g.c.b.b.l;

import g.c.b.b.h.b;
import i.o.c.h;
import java.util.Arrays;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ i b;

    public /* synthetic */ c(i iVar) {
        this.b = iVar;
    }

    public final void run() {
        i iVar = this.b;
        h.e(iVar, "this$0");
        b bVar = new b(iVar.a, true);
        bVar.f(2131821028);
        String string = iVar.a.getString(2131821027);
        h.d(string, "activity.getString(R.string.installer_version_conflict_msg)");
        String format = String.format(string, Arrays.copyOf(new Object[]{iVar.f2301e.f2271d}, 1));
        h.d(format, "java.lang.String.format(format, *args)");
        bVar.c(format);
        bVar.e(17039370, new a(iVar));
        bVar.d(17039360, new b(iVar));
        bVar.a(false);
        bVar.f2263k = true;
        bVar.f2264l = false;
        bVar.show();
    }
}
