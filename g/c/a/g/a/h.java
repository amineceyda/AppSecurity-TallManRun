package g.c.a.g.a;

import com.apkpure.aegon.main.activity.MainTabActivity;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ MainTabActivity b;

    public /* synthetic */ h(MainTabActivity mainTabActivity) {
        this.b = mainTabActivity;
    }

    public final void run() {
        this.b.s.setRefreshing(false);
    }
}
