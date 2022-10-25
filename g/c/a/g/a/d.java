package g.c.a.g.a;

import android.view.View;
import com.apkpure.aegon.main.activity.MainTabActivity;
import g.i.c.a.a.i.b;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ MainTabActivity b;

    public /* synthetic */ d(MainTabActivity mainTabActivity) {
        this.b = mainTabActivity;
    }

    public final void onClick(View view) {
        MainTabActivity mainTabActivity = this.b;
        mainTabActivity.s.setRefreshing(true);
        mainTabActivity.z();
        b.C0166b.a.j(view);
    }
}
