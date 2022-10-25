package g.c.a.b.a.k.j;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import g.c.a.o.b.a;
import g.c.a.o.b.b;
import java.util.List;

public class m extends b<g.c.a.b.a.k.i.b> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ o f1880d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(o oVar, List list) {
        super(list);
        this.f1880d = oVar;
    }

    public View a(a aVar, int i2, Object obj) {
        Activity activity;
        int i3;
        g.c.a.b.a.k.i.b bVar = (g.c.a.b.a.k.i.b) obj;
        TextView textView = (TextView) View.inflate(this.f1880d.b, 2131493096, (ViewGroup) null);
        if (bVar.a) {
            activity = this.f1880d.a;
            i3 = 2131231145;
        } else {
            activity = this.f1880d.a;
            i3 = 2131231278;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(e.e.c.a.c(activity, i3), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(bVar.b);
        return textView;
    }
}
