package e.b.c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
import g.i.c.a.a.i.b;

public class f implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController b;
    public final /* synthetic */ AlertController.b c;

    public f(AlertController.b bVar, AlertController alertController) {
        this.c = bVar;
        this.b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.c.q.onClick(this.b.b, i2);
        if (!this.c.s) {
            this.b.b.dismiss();
        }
        b.C0166b.a.g(adapterView, view, i2);
    }
}
