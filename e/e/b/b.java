package e.e.b;

import android.app.Activity;

public class b implements Runnable {
    public final /* synthetic */ Activity b;

    public b(Activity activity) {
        this.b = activity;
    }

    public void run() {
        if (!this.b.isFinishing() && !d.b(this.b)) {
            this.b.recreate();
        }
    }
}
