package g.c.a.b.a.k.j;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import g.i.c.a.a.i.b;

public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ o b;

    public /* synthetic */ a(o oVar) {
        this.b = oVar;
    }

    public final void onClick(View view) {
        int i2;
        Context context;
        ImageView imageView;
        o oVar = this.b;
        int maxLines = oVar.A.getMaxLines();
        int i3 = oVar.F;
        if (maxLines == i3) {
            oVar.A.setMaxLines(Integer.MAX_VALUE);
            oVar.D.setText(2131821239);
            imageView = oVar.E;
            context = oVar.b;
            i2 = 2131231133;
        } else {
            oVar.A.setMaxLines(i3);
            oVar.A.setLines(oVar.F);
            oVar.D.setText(2131821179);
            imageView = oVar.E;
            context = oVar.b;
            i2 = 2131231132;
        }
        imageView.setImageDrawable(e.e.c.a.c(context, i2));
        TextView textView = oVar.A;
        textView.setText(textView.getText());
        b.C0166b.a.j(view);
    }
}
