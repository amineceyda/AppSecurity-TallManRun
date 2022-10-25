package g.c.a.n.a;

import android.content.Context;
import android.view.View;
import com.apkpure.aegon.view.button.AppDetailDownloadButton;
import g.i.c.a.a.i.b;
import i.o.c.h;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ AppDetailDownloadButton b;

    public /* synthetic */ b(AppDetailDownloadButton appDetailDownloadButton) {
        this.b = appDetailDownloadButton;
    }

    public final void onClick(View view) {
        AppDetailDownloadButton appDetailDownloadButton = this.b;
        int i2 = AppDetailDownloadButton.u;
        h.e(appDetailDownloadButton, "this$0");
        i downloadButtonManager = appDetailDownloadButton.getDownloadButtonManager();
        Context context = appDetailDownloadButton.getContext();
        h.d(context, "context");
        downloadButtonManager.e(context, appDetailDownloadButton.getDownloadButtonStateInfo());
        b.C0166b.a.j(view);
    }
}
