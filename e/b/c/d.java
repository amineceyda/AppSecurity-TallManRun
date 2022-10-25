package e.b.c;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;
import g.i.c.a.a.i.b;

public class d implements AbsListView.OnScrollListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public d(AlertController alertController, View view, View view2) {
        this.b = view;
        this.c = view2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        AlertController.c(absListView, this.b, this.c);
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        b.C0166b.a.i(absListView, i2);
    }
}
