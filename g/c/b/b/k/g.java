package g.c.b.b.k;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.apkpure.components.installer.ui.InstallApksActivity;
import i.o.c.h;
import java.util.Objects;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ LinearLayout c;

    public /* synthetic */ g(View view, LinearLayout linearLayout) {
        this.b = view;
        this.c = linearLayout;
    }

    public final void run() {
        View view = this.b;
        LinearLayout linearLayout = this.c;
        InstallApksActivity.a aVar = InstallApksActivity.r;
        h.e(view, "$adView");
        h.e(linearLayout, "$this_apply");
        if (view.getParent() != null) {
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(view);
        }
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        linearLayout.addView(view);
    }
}
