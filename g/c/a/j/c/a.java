package g.c.a.j.c;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.apkpure.aegon.person.activity.InnerFeedBackActivity;
import g.i.c.a.a.i.b;
import i.o.c.h;
import i.o.c.n;
import org.slf4j.Logger;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ n b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ a(n nVar, Runnable runnable) {
        this.b = nVar;
        this.c = runnable;
    }

    public final void onClick(View view) {
        n nVar = this.b;
        Runnable runnable = this.c;
        h.e(nVar, "$clickCount");
        h.e(runnable, "$runnable");
        int i2 = nVar.element + 1;
        nVar.element = i2;
        if (i2 >= 5) {
            Context context = view.getContext();
            Logger logger = g.c.a.g.d.a.a;
            context.startActivity(new Intent(context, InnerFeedBackActivity.class));
            nVar.element = 0;
        } else {
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, 3000);
        }
        b.C0166b.a.j(view);
    }
}
