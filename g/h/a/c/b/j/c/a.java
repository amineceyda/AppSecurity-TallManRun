package g.h.a.c.b.j.c;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.PopupWindow;
import g.h.a.c.b.j.b;
import i.o.c.h;
import java.util.ArrayList;
import java.util.Objects;

public final class a implements b {
    public final Context a;
    public final ArrayList<g.h.a.c.b.j.a> b = new ArrayList<>();
    public PopupWindow c;

    public a(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    public void a(View view) {
        h.e(view, "anchorView");
        Object systemService = this.a.getSystemService("layout_inflater");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View inflate = ((LayoutInflater) systemService).inflate(2131492942, (ViewGroup) null);
        ((ListView) inflate.findViewById(2131297430)).setAdapter(new b(this.a, this.b));
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2);
        popupWindow.setContentView(inflate);
        popupWindow.setFocusable(true);
        popupWindow.setWidth(-2);
        popupWindow.setHeight(-2);
        this.c = popupWindow;
        popupWindow.showAsDropDown(view, (-this.a.getResources().getDimensionPixelSize(2131165361)) * 12, (-this.a.getResources().getDimensionPixelSize(2131165361)) * 12);
        if (this.b.size() == 0) {
            Log.e(b.class.getName(), "The menu is empty");
        }
    }
}
