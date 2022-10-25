package g.c.a.b.a.k.j;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import g.c.a.b.a.k.h;

public class n extends DataSetObserver {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ h b;

    public n(o oVar, LinearLayout linearLayout, h hVar) {
        this.a = linearLayout;
        this.b = hVar;
    }

    public void onChanged() {
        this.a.removeAllViews();
        for (int i2 = 0; i2 < this.b.getCount(); i2++) {
            this.a.addView(this.b.getView(i2, (View) null, (ViewGroup) null));
        }
    }
}
