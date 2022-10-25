package g.c.a.b.a;

import android.content.Intent;
import com.apkpure.aegon.app.activity.RestartActivity;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.main.activity.MainTabActivity;
import g.c.a.e.j.a;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ RestartActivity b;

    public /* synthetic */ h(RestartActivity restartActivity) {
        this.b = restartActivity;
    }

    public final void run() {
        RestartActivity restartActivity = this.b;
        int i2 = RestartActivity.b;
        i.o.c.h.e(restartActivity, "this$0");
        restartActivity.startActivity(new Intent(AegonApplication.getContext(), MainTabActivity.class));
        a.c().postDelayed(i.b, 1000);
    }
}
