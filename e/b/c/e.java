package e.b.c;

import android.view.View;
import androidx.appcompat.app.AlertController;

public class e implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AlertController f940d;

    public e(AlertController alertController, View view, View view2) {
        this.f940d = alertController;
        this.b = view;
        this.c = view2;
    }

    public void run() {
        AlertController.c(this.f940d.f28g, this.b, this.c);
    }
}
