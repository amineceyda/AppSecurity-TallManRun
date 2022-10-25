package g.c.a.b.a.l;

import android.view.View;
import com.apkpure.aegon.components.download.DownloadTask;
import g.c.a.b.a.l.d;
import g.i.c.a.a.i.b;
import i.j;
import i.o.b.q;
import i.o.c.h;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ d.a b;

    public /* synthetic */ a(d.a aVar) {
        this.b = aVar;
    }

    public final void onClick(View view) {
        d.a aVar = this.b;
        h.e(aVar, "this$0");
        aVar.f1902g.debug(h.j("setOnClickListener mPosition=", Integer.valueOf(aVar.f1904i)));
        DownloadTask downloadTask = aVar.f1903h;
        boolean z = false;
        if (downloadTask != null && (downloadTask.isSuccess() || downloadTask.isMissing())) {
            z = true;
        }
        q<Boolean, View, Integer, j> qVar = aVar.f1901f;
        Boolean valueOf = Boolean.valueOf(z);
        h.d(view, "view");
        qVar.c(valueOf, view, Integer.valueOf(aVar.f1904i));
        b.C0166b.a.j(view);
    }
}
