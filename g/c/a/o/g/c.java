package g.c.a.o.g;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import i.o.c.h;

public class c {
    public final View b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f2189d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2190e;

    public c(View view, int i2, int i3) {
        h.e(view, "itemView");
        this.b = view;
        this.c = i2;
        this.f2189d = i3;
        Context context = view.getContext();
        h.d(context, "itemView.context");
        this.f2190e = context;
        view.setTag(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(View view, int i2, int i3, int i4) {
        this(view, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final <T extends View> T a(int i2) {
        return this.b.findViewById(i2);
    }

    public final c b(int i2, CharSequence charSequence) {
        TextView textView = (TextView) this.b.findViewById(i2);
        if (textView != null) {
            textView.setText(charSequence);
        }
        return this;
    }
}
