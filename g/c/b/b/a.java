package g.c.b.b;

import android.content.Context;
import com.apkpure.components.installer.ui.InstallApksActivity;
import g.c.b.b.i.c;
import i.o.c.h;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ c c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g.c.b.b.j.a f2222d;

    public /* synthetic */ a(Context context, c cVar, g.c.b.b.j.a aVar) {
        this.b = context;
        this.c = cVar;
        this.f2222d = aVar;
    }

    public final void run() {
        Context context = this.b;
        c cVar = this.c;
        g.c.b.b.j.a aVar = this.f2222d;
        h.e(context, "$ctx");
        h.e(cVar, "this$0");
        h.e(aVar, "$installTask");
        if (context instanceof InstallApksActivity) {
            c cVar2 = cVar.c;
            if (cVar2 != null) {
                cVar2.f(aVar);
                ((InstallApksActivity) context).finish();
                return;
            }
            h.k("installListener");
            throw null;
        }
    }
}
