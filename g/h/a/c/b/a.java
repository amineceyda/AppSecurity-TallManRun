package g.h.a.c.b;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import g.i.c.a.a.i.b;
import i.o.c.h;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ String b;
    public final /* synthetic */ h c;

    public /* synthetic */ a(String str, h hVar) {
        this.b = str;
        this.c = hVar;
    }

    public final void onClick(View view) {
        String str = this.b;
        h hVar = this.c;
        h.e(str, "$videoId");
        h.e(hVar, "this$0");
        StringBuilder n = g.a.a.a.a.n("http://www.youtube.com/watch?v=", str, "#t=");
        n.append(hVar.o.getSeekBar().getProgress());
        try {
            hVar.f4073k.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(n.toString())));
        } catch (Exception e2) {
            String simpleName = h.class.getSimpleName();
            String message = e2.getMessage();
            if (message == null) {
                message = "Can't open url to YouTube";
            }
            Log.e(simpleName, message);
        }
        b.C0166b.a.j(view);
    }
}
